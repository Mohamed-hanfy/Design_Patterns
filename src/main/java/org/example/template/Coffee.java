package org.example.template;

public class Coffee extends CaffeineBeverage {

    public void brew() {
        System.out.println("Dripping Coffee through filter");
    }

    public void addCondiments() {
        System.out.println("Adding Sugar and Milk");
    }

    public boolean CustomerWantsCondiments() {
        String answer = getUserInput();
        if (answer.equals("y")) {
            return true;
        } else {
            return false;
        }
    }

    public String getUserInput() {
        System.out.println("Would you like milk and sugar with your coffee?");
        System.out.println("Enter y or n");
        String answer = System.console().readLine();

        if (answer == null) {
            return "no";
        }

        return answer;
    }
}
