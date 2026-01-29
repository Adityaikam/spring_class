package com.example.demo.restController;

import com.example.demo.model.Market;
import com.example.demo.service.MarketServiceImpl;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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
        return ResponseEntity.ok(marketService.getAllEquities());
    }

    @GetMapping("/equity/{id}")
    public ResponseEntity<Market> getEquity(@PathVariable long id) {
            return ResponseEntity.ok(marketService.getEquityById(id));
    }

    @PostMapping("/addEquity")
    public ResponseEntity<Market> addEquity(@RequestBody Market equity) {
        ResponseEntity.ok(marketService.saveEquity(equity));
        return null;
    }

}
