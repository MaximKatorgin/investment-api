package com.example.investmentrestapi.repository;

import com.example.investmentrestapi.model.Etf;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


public interface EtfRepository extends CrudRepository<Etf, Integer> {
    List<Etf> findAllByPortfolioName(String name);
}
