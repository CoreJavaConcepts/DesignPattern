package com.java.factory.simplefactory;

import com.java.factory.pizza.Pizza;
import com.java.factory.pizza.Type1Pizza;
import com.java.factory.pizza.Type2Pizza;

public class SimplePizzaFactory {

    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("type1")){
            pizza = new Type1Pizza();
        }else if(type.equals("type2")){
            pizza = new Type2Pizza();
        }

        return pizza;
    }
}
