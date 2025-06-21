package org.example.strategy;

public class Duc {

    FlyBehavior flyBehavior;
    QuacBehavior quacBehavior;

    public String swim(){
         return "Duc swimming func";
    }

    public String run(){
        return "Duc running func";
    }

    public String fly(){
        return flyBehavior.fly();
    }

    public String quack(){
        return quacBehavior.quack();
    }

    public void display(){
        System.out.println("I am a Duc");
    }

}
