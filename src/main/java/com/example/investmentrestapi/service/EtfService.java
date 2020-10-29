package com.example.investmentrestapi.service;

import com.example.investmentrestapi.model.Etf;
import com.example.investmentrestapi.repository.EtfRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EtfService {

    @Autowired
    EtfRepository etfRepository;

    public List<Etf> getAllEtfs(String portfolioName) {
        List<Etf> resultList = new ArrayList<>();
        etfRepository.findAllByPortfolioName(portfolioName).forEach(resultList::add);
        return resultList;
    }

    public void addEtf(Etf etf) {
        etfRepository.save(etf);
    }

}
