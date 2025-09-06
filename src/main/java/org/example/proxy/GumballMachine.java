package org.example.proxy;

public class GumballMachine {

    State soldOutState;
    State noQuarterState;
    State hasQuarterState;
    State soldState;
    State winnerState;

    State state = soldOutState;
    private int count = 0;

    String location;

    public GumballMachine(String location, int count){
        this.count = count;
        this.location = location;
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new winnerState(this);
        if(count > 0){
            state = noQuarterState;
        }else{
            state = soldOutState;
        }
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        state.turnQuarter();

    }
    public void dispense(){
        state.dispense();
    }


    public void setState(State newState){
        state = newState;
    }

    public void releaseBall() {
        if(count > 0){
            count--;
            System.out.println("A gumball comes rolling out the slot...");
        }else{
            System.out.println("Oops, out of gumballs!");
        }
    }

    public int getCount(){
        return count;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getState() {
        return state;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public String getLocation(){
        return location;
    }
}
