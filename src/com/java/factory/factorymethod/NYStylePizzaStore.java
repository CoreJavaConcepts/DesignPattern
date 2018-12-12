package com.java.factory.factorymethod;

import com.java.factory.pizza.*;

public class NYStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("NYtype1")){
            pizza = new NYType1Pizza();
        }else if(type.equals("NYtype2")){
            pizza = new NYType2Pizza();
        }

        return pizza;
    }
}
