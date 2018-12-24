package com.java.decorator;

public class PizzaVeggies extends PizzaDecorator {
    private Pizza pizza;

    public PizzaVeggies(Pizza pizza) {
        this.pizza = pizza;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription()+"with Veggies Decorator";
    }

    @Override
    public double getCost() {
        return pizza.getCost()+3;
    }
}
