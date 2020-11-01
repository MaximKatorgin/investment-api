package com.example.investmentrestapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String name;

    public Portfolio() {
    }

    public Portfolio(String name) {
        this.name = name;
    }
}
