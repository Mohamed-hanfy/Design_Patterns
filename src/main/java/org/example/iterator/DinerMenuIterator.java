package org.example.iterator;
import java.util.Iterator;

public class DinerMenuIterator implements Iterator {

    MenuItem[] items;
    private int position = 0;

    public DinerMenuIterator(MenuItem[] items) {
        this.items = items;
    }

    public Object next() {
        MenuItem menuItem = items[position];
        position++;
        return menuItem;
    }

    public boolean hasNext() {
        if (position >= items.length || items[position] == null) {
            return false;
        } else {
            return true;
        }
    }

    public void remove(){
        throw new UnsupportedOperationException("remove is not supported");
    }
}
