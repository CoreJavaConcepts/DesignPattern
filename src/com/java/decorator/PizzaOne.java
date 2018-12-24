package com.java.decorator;

public class PizzaOne extends Pizza {

    public PizzaOne() {
        setDescription("Pizza one");
    }

    @Override
    public double getCost() {
        return 20;
    }
}
