package com.example.demo.restController;

import com.example.demo.entity.Market;
import com.example.demo.service.MarketService;
import com.example.demo.service.MarketServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/market")
public class MarketRestController {
    private final MarketServiceImpl marketService;

    public MarketRestController(MarketServiceImpl marketService) {
        this.marketService = marketService;
    }

    @GetMapping("/")
    public String index() {
        return "Hello World";
    }

    @GetMapping("/equities")
    public ResponseEntity<List<Market>> getEquities() {
        return ResponseEntity.ok(equities);
    }

    @GetMapping("/equity/{id}")
    public ResponseEntity<Market> getEquity(@PathVariable long id) {
        if(id <= equities.size() &&  id > 0) {
            return ResponseEntity.ok(equities.get((int) (id - 1)));
        }
        return ResponseEntity.noContent().build();
    }

    @PostMapping("/addEquity")
    public ResponseEntity<Market> addEquity(@RequestBody Market equity) {
        ResponseEntity.ok(equities.add(equity));
        return null;
    }

}
