package org.example.strategy;

public class MallardDuck extends Duc {
    public MallardDuck() {
        quacBehavior = new Quack();
        flyBehavior = new fly();
    }

    public void display(){
        System.out.println("I am a Mallard Duck");
    }

}
