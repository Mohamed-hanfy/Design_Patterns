package org.example;

import org.example.decorator.Beverage;
import org.example.decorator.Espresso;
import org.example.decorator.HouseBlend;
import org.example.decorator.Mocha;

public class Main {
    public static void main(String[] args) {
        Beverage beverage = new Espresso();

        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new HouseBlend();
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}