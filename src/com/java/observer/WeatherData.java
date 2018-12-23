package com.java.observer;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject {

    private List<Observer> observerList;
    private float temp;
    private float humidity;
    private float pressure;

    public WeatherData() {
        observerList = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observerList.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        int i = observerList.indexOf(o);
        if (i >=0){
            observerList.remove(o);
        }

    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observerList) {
            observer.update(temp, humidity, pressure);
        }
    }

    public void measurementChanged(){
        notifyObservers();
    }

    public void setMeasurement(float temperature, float humidity, float pressure){
        this.temp = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementChanged();
    }
}
