package com.designpattern.singleton;

/**
 * Created by pradeep on 29/11/16.
 */
public class ThreadSafeSingleton {

    private static ThreadSafeSingleton instance;

    private ThreadSafeSingleton() {
    }

    public static synchronized ThreadSafeSingleton getInstance() {
        if (instance == null) {
            synchronized (ThreadSafeSingleton.class) {
                if (instance == null) {
                    instance = new ThreadSafeSingleton();
                }
            }
        }
        return instance;
    }

    public static void main(String[] args) {
        ThreadSafeSingleton instance_1 = ThreadSafeSingleton.getInstance();
        ThreadSafeSingleton instance_2 = ThreadSafeSingleton.getInstance();

        System.out.println("Instance_1 = " + instance_1.getClass().hashCode());
        System.out.println("Instance_2 = " + instance_2.getClass().hashCode());
    }

}
