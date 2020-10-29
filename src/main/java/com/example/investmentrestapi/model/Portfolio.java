package com.example.investmentrestapi.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Portfolio {

    @Id
    private String name;

    public Portfolio() {
    }

    public Portfolio(String name) {
        this.name = name;
    }
}
