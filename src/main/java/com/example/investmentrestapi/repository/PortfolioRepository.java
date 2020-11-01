package com.example.investmentrestapi.repository;


import com.example.investmentrestapi.model.Portfolio;
import org.springframework.data.repository.CrudRepository;

public interface PortfolioRepository extends CrudRepository<Portfolio, Integer> {

}
