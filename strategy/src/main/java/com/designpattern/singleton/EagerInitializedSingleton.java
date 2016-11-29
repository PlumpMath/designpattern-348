package com.designpattern.singleton;

/**
 * Created by pradeep on 29/11/16.
 */
public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        EagerInitializedSingleton instance_1 = EagerInitializedSingleton.getInstance();
        EagerInitializedSingleton instance_2 = EagerInitializedSingleton.getInstance();

        System.out.println("Instance_1 = " + instance_1.getClass().hashCode());
        System.out.println("Instance_2 = " + instance_2.getClass().hashCode());
    }
}
