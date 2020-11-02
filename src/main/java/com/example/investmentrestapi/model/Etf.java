package com.example.investmentrestapi.model;

import javax.persistence.*;

@Entity
public class Etf {


    //Change to ticker? instead of int id, beacuse still gonna be unique
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String ticker;
    private double price;


    //To ManyToMany
    @ManyToOne
    private Portfolio portfolio;


    public Etf() {
    }

    public Etf(String ticker, double price) {
        this.ticker = ticker;
        this.price = price;
    }

    public String getTicker() {
        return ticker;
    }

    public void setTicker(String ticker) {
        this.ticker = ticker;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Portfolio getPortfolio() {
        return portfolio;
    }

    public void setPortfolio(Portfolio portfolio) {
        this.portfolio = portfolio;
    }

}

