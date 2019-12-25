package com.java.factory.factorymethod;

import com.java.factory.pizza.Pizza;

public class Main {
    public static void main(String[] args) {
        PizzaStore nyPizzaStore = new NYStylePizzaStore();
        PizzaStore chicagoPizzaStore = new ChicagoStylePizzaStore();

        Pizza nyPizza = nyPizzaStore.orderPizza("NYtype1");
        System.out.println(nyPizza.getType());

        Pizza chicagoPizza = chicagoPizzaStore.orderPizza("CHtype2");
        System.out.println(chicagoPizza.getType());
    }
}
