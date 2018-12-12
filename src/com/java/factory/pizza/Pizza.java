package com.java.factory.pizza;

public interface Pizza {
    void prepare();
    void bake();
    void cut();
    void box();
    String getType();
}
