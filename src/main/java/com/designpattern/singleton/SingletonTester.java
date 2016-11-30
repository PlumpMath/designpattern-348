package com.designpattern.singleton;

/**
 * Created by pradeep on 30/11/16.
 */
public class SingletonTester {

    public static void main(String[] args) {
        EnumSingleton instance_1 = EnumSingleton.INSTANCE;
        EnumSingleton instance_2 = EnumSingleton.INSTANCE;

        System.out.println("Instance_1 = " + instance_1.getClass().hashCode());
        System.out.println("Instance_2 = " + instance_2.getClass().hashCode());
        instance_1.print("Print this message");
    }
}
