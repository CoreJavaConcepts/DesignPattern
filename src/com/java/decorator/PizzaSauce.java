package com.java.decorator;

public class PizzaSauce extends PizzaDecorator {
    private Pizza pizza;

    public PizzaSauce(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+" with Pizza sauce decorator";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+2;
    }
}
