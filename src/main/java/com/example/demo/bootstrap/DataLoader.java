package com.example.demo.bootstrap;

import com.example.demo.entity.MarketEntity;
import com.example.demo.repo.MarketJPARepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class DataLoader implements CommandLineRunner {
    private final MarketJPARepository marketJPARepository;

    public DataLoader(MarketJPARepository marketJPARepository) {
        this.marketJPARepository = marketJPARepository;
    }


    @Override
    public void run(String... args) throws Exception {
        if(marketJPARepository.count() > 0) return;

        marketJPARepository.saveAll(List.of(
                new MarketEntity(null, "DFA", 1200),
                new MarketEntity(null, "YUN", 1400),
                new MarketEntity(null, "VER", 1600)
        ));
    }
}
