package org.example.state;

public class winnerState implements State{
    GumballMachine gumballMachine;

    public winnerState(GumballMachine gumballMachine){
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("please wait, we already give you a gumball");
    }
    @Override
    public void ejectQuarter() {
        System.out.println("thank you, you turned the crank");
    }
    @Override
    public void turnQuarter() {
        System.out.println("turning twice doesn't get you another gumball!");
    }
    @Override
    public void dispense() {
        System.out.println("YOU'RE A WINNER! YOU GOT TWO GUMBALLS FOR YOUR QUARTER");
        gumballMachine.releaseBall();
        if(gumballMachine.getCount() == 0){
            gumballMachine.setState(gumballMachine.getSoldOutState());
        }else{
            gumballMachine.releaseBall();
            if(gumballMachine.getCount() > 0){
                gumballMachine.setState(gumballMachine.getNoQuarterState());
            }else{
                System.out.println("Oops, out of gumballs!");
                gumballMachine.setState(gumballMachine.getSoldOutState());
            }
        }
    }
}
