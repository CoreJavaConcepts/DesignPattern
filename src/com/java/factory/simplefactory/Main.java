package com.java.factory.simplefactory;

public class Main {
    public static void main(String[] args) {
        SimplePizzaFactory simplePizzaFactory = new SimplePizzaFactory();
        PizzaStore pizzaStore = new PizzaStore(simplePizzaFactory);

        Pizza pizza = pizzaStore.orderPizza("type1");
        System.out.println(pizza.getType());
    }
}
