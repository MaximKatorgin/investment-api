package com.example.investmentrestapi.controller;

import com.example.investmentrestapi.model.Portfolio;
import com.example.investmentrestapi.service.PortfolioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PortfolioController {

    @Autowired
    PortfolioService portfolioService;

    @GetMapping()
    public List<Portfolio> getAllPortfolios() {
        return portfolioService.getAllPortfolios();
    }

    @PostMapping()
    public void addPortfolio(@RequestBody Portfolio portfolio) {
        portfolioService.addPortfolio(portfolio);
    }

    @PutMapping("/{portfolioId}")
    public void updatePortfolio(@PathVariable int portfolioId, @RequestBody Portfolio portfolio) {
        portfolioService.updatePortfolio(portfolioId, portfolio);
    }

    @DeleteMapping("/{portfolioId}")
    public void deletePortfolio(@PathVariable int portfolioId) {
        portfolioService.deletePortfolio(portfolioId);
    }
}
