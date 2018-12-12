package com.java.factory.factorymethod;

import com.java.factory.pizza.ChicagoType1Pizza;
import com.java.factory.pizza.ChicagoType2Pizza;
import com.java.factory.pizza.Pizza;

public class ChicagoStylePizzaStore extends PizzaStore {
    @Override
    public Pizza createPizza(String type) {
        Pizza pizza = null;
        if(type.equals("CHtype1")){
            pizza = new ChicagoType1Pizza();
        }else if(type.equals("CHtype2")){
            pizza = new ChicagoType2Pizza();
        }

        return pizza;
    }
}
