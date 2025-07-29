package org.example;

import org.example.command.Light;
import org.example.command.LightOnCommand;
import org.example.command.SimpleRemoteControl;



public class Main {
    public static void main(String[] args) {
        SimpleRemoteControl remote = new SimpleRemoteControl();
        Light light = new Light();
        LightOnCommand lightOn = new LightOnCommand(light);
        remote.setCommand(lightOn);
        System.out.println(remote.buttonWasPressed());
    }
}