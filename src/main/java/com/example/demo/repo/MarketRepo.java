package com.example.demo.repo;

import com.example.demo.model.Market;

import java.util.List;

public interface MarketRepo {
    List<Market> getAllEquities();
    Market getEquityById(long id);
    Market saveEquity(Market equity);
}
