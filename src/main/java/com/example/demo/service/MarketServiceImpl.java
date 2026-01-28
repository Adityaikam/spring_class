package com.example.demo.service;

import com.example.demo.entity.Market;
import com.example.demo.repo.MarketRepoImpl;

import java.util.List;

public class MarketServiceImpl implements MarketService{
    private final MarketRepoImpl repository;

    public MarketServiceImpl(MarketRepoImpl repository) {
        this.repository = repository;
    }

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
