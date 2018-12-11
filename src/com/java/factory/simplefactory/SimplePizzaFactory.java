package com.java.factory.simplefactory;

public class SimplePizzaFactory {

    public Pizza createPizza( String type){
        Pizza pizza = null;
        if(type.equals("type1")){
            pizza = new Type1Pizza();
        }else if(type.equals("type2")){
            pizza = new Type2Pizza();
        }

        return pizza;
    }
}
