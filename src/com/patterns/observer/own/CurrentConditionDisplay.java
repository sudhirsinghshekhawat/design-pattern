package com.patterns.observer.own;

public class CurrentConditionDisplay implements Observer, DisplayElement {
    private float temperature;
    private float pressure;
    private float humidity;
    private Subject weatherData;

    public CurrentConditionDisplay(Subject weatherData)
    {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current temprature : " + temperature + " humidity : " + humidity + " pressure : " + pressure);


    }

    @Override
    public void update(float temp, float humidity, float pressure)
    {
        this.temperature = temp;
        this.humidity = humidity;
        this.pressure = pressure;
        display();

    }
}
