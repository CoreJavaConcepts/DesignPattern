package com.java.composit;

public class MenuItem extends MenuComponent {
    private String name;
    private String description;
    private double price;
    private boolean vegiterian;

    public MenuItem(String name, String description, double price, boolean vegiterian) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.vegiterian = vegiterian;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String getDescription() {
        return this.description;
    }

    @Override
    public double getPrice() {
        return this.price;
    }

    @Override
    public boolean isVegiterian() {
        return this.vegiterian;
    }

    @Override
    public void print() {
        System.out.println("--"+getName()+" "+isVegiterian()+" "+getPrice()+" "+getDescription());
    }
}
