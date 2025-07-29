package org.example.command;

public class SimpleRemoteControl {
    Command slot;

    public SimpleRemoteControl() {}

    public void setCommand(Command command) {
        slot = command;
    }

    public String buttonWasPressed() {
        return slot.execute();
    }

}
