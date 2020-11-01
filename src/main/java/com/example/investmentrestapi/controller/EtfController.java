package com.example.investmentrestapi.controller;

import com.example.investmentrestapi.model.Etf;
import com.example.investmentrestapi.service.EtfService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/{ portfolioId }/etf")
public class EtfController {

    @Autowired
    EtfService etfService;

    @GetMapping
    public List<Etf> getEtfs(@PathVariable int portfolioId ) {
        return etfService.getAllEtfs(portfolioId);
    }

    @PostMapping
    public void addEtf(@RequestBody Etf etf) {
        etfService.addEtf(etf);
    }


}
