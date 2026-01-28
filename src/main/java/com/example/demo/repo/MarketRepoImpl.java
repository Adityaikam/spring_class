package com.example.demo.repo;

import com.example.demo.entity.Market;

import java.util.ArrayList;
import java.util.List;

public class MarketRepoImpl implements MarketRepo {
    private static final List<Market> equities = new ArrayList<>(
            List.of(new Market(1, "Infosys", 1200),
                    new Market(2, "HSBC", 1200),
                    new Market(3, "HSSC", 1200))
    );

    public MarketRepoImpl() {}

    @Override
    public List<Market> getAllEquities() {
        return List.of();
    }

    @Override
    public Market getEquityById(long id) {
        return null;
    }

    @Override
    public Market saveEquity(Market equity) {
        return null;
    }
}
