package org.example.state;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    void turnQuarter();
    void dispense();
}
