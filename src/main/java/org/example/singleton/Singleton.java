package org.example.singleton;


/*
* in case of create an object that only we need one instance from it,
* we must think in case of two processes try to create the same object in same time or
* threads work with this object without the last state object variables.
* there are three solutions we can think about:
*
* 1- use synchronizing and Do nothing if the performance of getInstance() isn’t critical to
your application
*
* 2- Move to an eagerly created instance rather than a lazily
created one
*
* 3- Use “double-checked locking” to reduce the use of
synchronization in getInstance() by 'volatile'
*
*  */
public class Singleton {
    private volatile static Singleton instance;

    private Singleton() {
    }

    public static Singleton getInstance() {
        if (instance == null)
            synchronized (Singleton.class) {
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        return instance;
    }
}
