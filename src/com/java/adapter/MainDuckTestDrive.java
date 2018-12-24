package com.java.adapter;

public class MainDuckTestDrive {
    public static void main(String[] args) {
        //Can change other adapter exaple using https://www.geeksforgeeks.org/adapter-pattern/
        // Bird (Interface) fly() makeNoice()
        // Sparrow implements bird
        // ToyDuck (Interface) squeak()
        // PlasticToyduck implements ToyDuck
        // BirdAdapter implements ToyDuck

        MallardDuck duck = new MallardDuck();
        WildTurkey turkey = new WildTurkey();

        Duck turkeyAdapter = new TurkeyAdapter(turkey);

        System.out.println("-----Turkey says");
        turkey.gobble();
        turkey.fly();

        System.out.println("----------Duck says");
        testDuck(duck);

        System.out.println("---------TurkeyAdapter says");
        testDuck(turkeyAdapter);

    }

    static void testDuck(Duck duck){
        duck.quack();
        duck.fly();
    }
}
