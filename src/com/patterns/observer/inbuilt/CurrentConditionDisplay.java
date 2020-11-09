package com.patterns.observer.inbuilt;

import com.patterns.observer.own.DisplayElement;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements DisplayElement, Observer
{
    Observable observable;
    private float temperature;
    private float humidity;


    public CurrentConditionDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Temperature : "+ temperature +" humidity : "+humidity);

    }

    @Override
    public void update(Observable observable, Object o)
    {
        if (observable instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) observable;
            temperature = weatherData.getTemperature();
            humidity = weatherData.getHumidity();
            display();

        }


    }
}
