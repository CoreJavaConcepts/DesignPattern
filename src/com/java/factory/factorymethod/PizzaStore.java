package com.java.factory.factorymethod;

import com.java.factory.pizza.Pizza;

public abstract class PizzaStore {
    public Pizza orderPizza (String type){
        Pizza pizza = null;
        pizza = createPizza(type); // This method is acting like factory

        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();

        return pizza;
    }

    public abstract Pizza createPizza(String type);
}
