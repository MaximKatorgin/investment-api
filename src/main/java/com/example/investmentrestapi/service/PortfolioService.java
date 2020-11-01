package com.example.investmentrestapi.service;

import com.example.investmentrestapi.model.Portfolio;
import com.example.investmentrestapi.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PortfolioService {

    @Autowired
    PortfolioRepository portfolioRepository;

    public List<Portfolio> getAllPortfolios() {
        List<Portfolio> portfolioList = new ArrayList<>();
        portfolioRepository.findAll().forEach(portfolioList::add);
        return portfolioList;
    }

    public void addPortfolio(Portfolio portfolio) {
        portfolioRepository.save(portfolio);
    }

    public void deletePortfolio(int portfolioId) {
        Portfolio portfolio = portfolioRepository.findById(portfolioId).orElse(null);
        if (portfolio != null) {
            portfolioRepository.delete(portfolio);
        }

    }

    public void updatePortfolio(int portfolioId, Portfolio portfolio) {
        portfolio.setId(portfolioId);
        portfolioRepository.save(portfolio);
    }
}
