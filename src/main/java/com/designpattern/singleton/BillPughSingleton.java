package com.designpattern.singleton;

/**
 * Created by pradeep on 29/11/16.
 */
public class BillPughSingleton {
    private BillPughSingleton() {
    }

    public static BillPughSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public static void main(String[] args) {
        BillPughSingleton instance_1 = SingletonHelper.INSTANCE;
        BillPughSingleton instance_2 = SingletonHelper.INSTANCE;

        System.out.println("Instance_1 = " + instance_1.getClass().hashCode());
        System.out.println("Instance_2 = " + instance_2.getClass().hashCode());
    }

    private static class SingletonHelper {
        private static final BillPughSingleton INSTANCE = new BillPughSingleton();
    }

}
