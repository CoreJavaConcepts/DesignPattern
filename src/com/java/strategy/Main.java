package com.java.strategy;

public class Main {
    public static void main(String[] args) {
        //Strategy design pattern is one of the behavioral design pattern.
        // Strategy pattern is used when we have multiple algorithm for a specific task and
        // client decides the actual implementation to be used at runtime.

        Duck mallardDuck = new MallardDuck();
        mallardDuck.performQuack();
        mallardDuck.performFly();

        Duck modelDuck = new ModelDuck();
        modelDuck.performQuack();
        modelDuck.performFly();
    }
}
