package com.java.observer;

public class MainWeatherStation {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        Observer currenConditionObserver = new CurrentConditionDisplay();
        weatherData.registerObserver(currenConditionObserver);

        // or can do
        //Observer currenConditionObserver = new CurrentConditionDisplay(weatherdata);

        weatherData.setMeasurement(1,2,3);
        weatherData.setMeasurement(4,5,6);
        weatherData.setMeasurement(7,8,9);

    }
}
