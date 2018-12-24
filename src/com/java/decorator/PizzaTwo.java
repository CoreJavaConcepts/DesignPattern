package com.java.decorator;

public class PizzaTwo extends Pizza {
    public PizzaTwo() {
        setDescription("Pizza one");
    }

    @Override
    public double getCost() {
        return 30;
    }
}
