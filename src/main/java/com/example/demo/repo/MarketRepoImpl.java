package com.example.demo.repo;

import com.example.demo.model.Market;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class MarketRepoImpl implements MarketRepo {
    private static final List<Market> equities = new ArrayList<>();
    private long idSequence = 0;

    public MarketRepoImpl() {
        saveEquity(new Market(1, "HSBC", 1200));
        saveEquity(new Market(1, "TATA", 400));
        saveEquity(new Market(1, "JIO", 800));
    }

    @Override
    public List<Market> getAllEquities() {
        return equities;
    }

    @Override
    public Market getEquityById(long id) {
        for (int i = 0; i < equities.size(); i++) {
            if(equities.get(i).getId() == id){
                return equities.get(i);
            }
        }
        return null;
    }

    @Override
    public Market saveEquity(Market equity) {
        idSequence++;
        Market market = new Market(idSequence, equity.getEquity(), equity.getPrice());
        equities.add(market);
        return market;
    }
}
