package org.example.iterator;

import java.util.ArrayList;

public class PancakeIterator implements Iterator{
    ArrayList<MenuItem> items;
    private int position = 0;

    public PancakeIterator(ArrayList items){
        this.items = items;
    }

    public Object next(){
        MenuItem menuItem = items.get(position);
        position++;
        return menuItem;
    }

    public boolean hasNext(){
        if(position >= items.size() || items.get(position) == null){
            return false;
        }else{
            return true;
        }
    }
}
