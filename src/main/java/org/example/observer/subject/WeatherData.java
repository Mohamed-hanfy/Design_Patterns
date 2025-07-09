package org.example.observer.subject;
import org.example.observer.Observer.Observer;

import java.util.ArrayList;

public class WeatherData implements Subject {
    private ArrayList<Observer> observers;
    private int temperature;
    private int humidity;
    private int pressure;

    public WeatherData(){
        observers = new ArrayList();
    }

    public void registerObserver(Observer observer){
       observers.add(observer);
    }

    public void notifyObservers(){
        for(Observer observer : observers){
            observer.update(temperature, humidity, pressure);
        }
    }

    public void removeObserver(Observer observer){
        observers.remove(observer);
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(int temperature, int humidity, int pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
