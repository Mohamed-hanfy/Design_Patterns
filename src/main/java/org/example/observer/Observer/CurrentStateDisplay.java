package org.example.observer.Observer;

import org.example.observer.subject.Subject;

public class CurrentStateDisplay implements Observer, DisplayElement {
    private int temperature;
    private int humidity;
    private int pressure;
    private Subject weatherData;

    public CurrentStateDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    public void update(int temperature, int humidity, int pressure) {
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        display();
    }
    public void display() {
        System.out.println("Current State Display");
        System.out.println("Temperature: " + temperature);
        System.out.println("Humidity: " + humidity);
        System.out.println("Pressure: " + pressure);
    }
}
