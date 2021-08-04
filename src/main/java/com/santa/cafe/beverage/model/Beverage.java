package com.santa.cafe.beverage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Beverage {

    @Id
    @GeneratedValue
    private int Id;

    @Column
    private String name;

    @Column
    private int cost;

    @Column
    private BeverageSize size;

    public Beverage() {
    }

    public Beverage(String name, int cost, BeverageSize size) {
        this.name = name;
        this.cost = cost;
        this.size = size;
    }

    public Beverage(int id, String name, int cost, BeverageSize size) {
        Id = id;
        this.name = name;
        this.cost = cost;
        this.size = size;
    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public BeverageSize getSize() {
        return size;
    }
}
