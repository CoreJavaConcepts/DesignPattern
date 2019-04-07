package com.java.decorator;

public class PizzaTwo extends Pizza {
    public PizzaTwo() {
        setDescription("Pizza two");
    }

    @Override
    public double getCost() {
        return 30;
    }
}
