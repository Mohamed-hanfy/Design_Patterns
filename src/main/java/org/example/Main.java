package org.example;

import org.example.strategy.MallardDuck;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        MallardDuck duck = new MallardDuck();
        duck.display();
        duck.run();
        duck.swim();
        duck.fly();
        duck.quack();
    }
}