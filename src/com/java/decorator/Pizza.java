package com.java.decorator;

public abstract class Pizza {
    private String description = "Unknown Pizza";

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public abstract double getCost();
}
