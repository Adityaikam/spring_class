package com.example.demo.service;

import com.example.demo.entity.MarketEntity;
import com.example.demo.model.Market;
import com.example.demo.repo.MarketJPARepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MarketServiceImpl implements MarketService{
    //private final MarketRepoImpl repository;
    private final MarketJPARepository repository;
    public MarketServiceImpl(MarketJPARepository repository) {
        this.repository = repository;
    }

    public Market toModel(MarketEntity marketEntity) {
        return new Market(marketEntity.id, marketEntity.equity, (long) marketEntity.price);
    }

    @Override
    public List<Market> getAllEquities() {
        List<MarketEntity>  marketEntities = repository.findAll();
        List<Market> markets = new ArrayList<>();
        for (MarketEntity marketEntity : marketEntities) {
            markets.add(toModel(marketEntity));
        }
        return markets;
    }

    @Override
    public Market getEquityById(long id) {
        return toModel(repository.findById(id).orElseThrow());
    }

    @Override
    public Market saveEquity(Market equity) {
        MarketEntity marketEntity = new MarketEntity();
        marketEntity.setId(null);
        marketEntity.setEquity(equity.getEquity());
        marketEntity.setPrice(equity.getPrice());
        return toModel(repository.save(marketEntity));
    }
}
