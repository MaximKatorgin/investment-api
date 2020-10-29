package com.example.investmentrestapi.controller;

import com.example.investmentrestapi.model.Etf;
import com.example.investmentrestapi.service.EtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/{ portfolioName }/etf")
public class EtfController {

    @Autowired
    EtfService etfService;

    @GetMapping
    public List<Etf> getEtfs(@PathVariable String portfolioName) {
        return etfService.getAllEtfs(portfolioName);
    }

    @PostMapping
    public void addEtf(@RequestBody Etf etf) {
        etfService.addEtf(etf);
    }


}
