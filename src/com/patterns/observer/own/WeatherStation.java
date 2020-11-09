package com.patterns.observer.own;

public class WeatherStation {
    public static void main(String[] args)
    {

        WeatherData weatherData = new WeatherData();
        CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);

        weatherData.setMeasurements(10,11,12);
        weatherData.setMeasurements(13,14,15);




    }
}
