package com.java.decorator;

public class MainPizzaStore {
    public static void main(String[] args) {
        Pizza pizza = new PizzaOne();

        System.out.println(pizza.getDescription()+" with cost: "+pizza.getCost());

        Pizza pizza1 = new PizzaOne();
        pizza1 = new PizzaSauce(pizza1); //** giving same reference to new decorated object object
        pizza1 = new PizzaVeggies(pizza1);

        System.out.println(pizza1.getDescription()+" with cost:"+pizza1.getCost());

        Pizza pizza2 = new PizzaTwo();
        pizza2 = new PizzaSauce(pizza2); //** giving same reference to new decorated object object
        pizza2 = new PizzaVeggies(pizza2);

        System.out.println(pizza2.getDescription()+" with cost:"+pizza2.getCost());


    }
}
