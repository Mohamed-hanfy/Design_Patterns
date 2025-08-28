package org.example.composite;

public abstract class MenuComponent {
    public void add(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("not support add");
    }

    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException("not support remove");
    }

    public MenuComponent getChild(int i) {
        throw new UnsupportedOperationException("not support getChild");
    }

    public String getName() {
        throw new UnsupportedOperationException("not support getName");
    }

    public String getDescription() {
        throw new UnsupportedOperationException("not support getDescription");
    }

    public double getPrice() {
        throw new UnsupportedOperationException("not support getPrice");
    }

    public boolean isVegetarian() {
        throw new UnsupportedOperationException("not support isVegetarian");
    }

    public void print(){
        throw new UnsupportedOperationException("not support print");
    }
}
