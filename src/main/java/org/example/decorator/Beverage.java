package org.example.decorator;

public abstract class Beverage {
    String description = "none";

    public String getDescription() {
        return description;
    }

    public abstract double cost();
}
