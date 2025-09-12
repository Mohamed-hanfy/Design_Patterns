package org.example.iterator;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;

public class Waitress {
    ArrayList<Menu> menus;

    public Waitress(ArrayList<Menu> menus){
        this.menus = menus;
    }

    public void printMenu(){
        Iterator menuIterator = menus.iterator();

        while(menuIterator.hasNext()){
            Menu menu =(Menu) menuIterator.next();
            printMenu(menu.createIterator());
        }
    }
    private void printMenu(Iterator iterator){
        while(iterator.hasNext()){
            MenuItem menuItem = (MenuItem) iterator.next();
            System.out.println(menuItem.getName() + " " + menuItem.getPrice() + " " + menuItem.getDescription());
        }
    }
}
