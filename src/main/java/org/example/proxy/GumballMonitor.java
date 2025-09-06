package org.example.proxy;

public class GumballMonitor {
    GumballMachine machine;

    public GumballMonitor(GumballMachine machine){
        this.machine = machine;
    }

    public void report(){
        System.out.println("Gumball Machine: " + machine.getLocation());
        System.out.println("Current State: " + machine.getState().toString());
        System.out.println("Current Inventory: " + machine.getCount());
    }

}
