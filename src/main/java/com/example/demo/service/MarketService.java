package com.example.demo.service;

import com.example.demo.entity.Market;

import java.util.List;

public interface MarketService {
    List<Market> getAllEquities();
    Market getEquityById(long id);
    Market saveEquity(Market equity);
}
