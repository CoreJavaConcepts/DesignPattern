package com.java.observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
    private float temp;
    private float humidity;
    private float pressure;

    @Override
    public void display() {
        System.out.println("temp:"+temp+" pressure:"+pressure+" humidity:"+humidity);

    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temp = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
}
