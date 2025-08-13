package org.example.template;

public abstract class CaffeineBeverage {
   public final void prepareRecipe(){
        boilWater();
        brew();
        pourInCup();
        if(CustomerWantsCondiments()){
            addCondiments();
        }else{
            System.out.println("No Condiments added");
        }
    }

    abstract void brew();

    abstract void addCondiments();

    void boilWater(){
        System.out.println("Boiling water");
    }

    void pourInCup(){
        System.out.println("Pouring into cup");
    }

    boolean CustomerWantsCondiments(){
        return true;
    }
}
