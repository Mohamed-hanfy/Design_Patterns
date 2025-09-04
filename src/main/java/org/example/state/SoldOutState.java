package org.example.state;

public class SoldOutState implements State{
    GumballMachine gumballMachine;
    
    public SoldOutState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }


    @Override
    public void insertQuarter() {
        System.out.println("we're sold out, please wait");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("you haven't inserted a quarter");
    }

    @Override
    public void turnQuarter() {
        System.out.println("you turned, but there are no gumballs");
    }

    @Override
    public void dispense() {
        System.out.println("no gumball dispensed");
    }

}
