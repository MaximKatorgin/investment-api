package com.example.investmentrestapi.service;

import com.example.investmentrestapi.model.Etf;
import com.example.investmentrestapi.model.Portfolio;
import com.example.investmentrestapi.repository.EtfRepository;
import com.example.investmentrestapi.repository.PortfolioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtfService {

    @Autowired
    EtfRepository etfRepository;

    @Autowired
    PortfolioRepository portfolioRepository;

    public List<Etf> getAllEtfs(int portfolioId) {
        List<Etf> resultList = new ArrayList<>();
        etfRepository.findAllByPortfolioId(portfolioId).forEach(resultList::add);
        return resultList;
    }

    public void addEtf(Etf etf, int portfolioId) {
        Portfolio portfolio = portfolioRepository.findById(portfolioId).orElse(null);
        if (portfolio != null) {
            etf.setPortfolio(portfolio);
            etfRepository.save(etf);
        }

    }

    public void delete(Etf etf, int portfolioId) {
        etfRepository.delete(etfRepository.findByPortfolioIdAndTicker(portfolioId, etf.getTicker()));
    }

    public void update(Etf etf, int portfolioId) {
        etf.setPortfolio(portfolioRepository.findById(portfolioId).get());
        etfRepository.save(etf);
    }
}
