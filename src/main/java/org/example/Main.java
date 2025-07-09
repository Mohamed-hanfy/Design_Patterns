package org.example;

import org.example.observer.Observer.CurrentStateDisplay;
import org.example.observer.subject.WeatherData;

import java.util.Currency;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();

        CurrentStateDisplay currentStateDisplay = new CurrentStateDisplay(weatherData);

        weatherData.setMeasurements(1,2,3);
        weatherData.setMeasurements(4,5,6);
        weatherData.setMeasurements(7,8,9);
    }
}