package com.java.adapter.headfirstexample;

public class TurkeyAdapter implements Duck {

    //Lets say you are short on Duck object and you'd like to use some Turkey objects in their place.

    private Turkey turkey;

    public TurkeyAdapter(Turkey turkey) {
        this.turkey = turkey;
    }

    @Override
    public void quack() {
        turkey.gobble();
    }

    @Override
    public void fly() {
        turkey.fly();
    }
}
