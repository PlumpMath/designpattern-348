package com.designpattern.singleton;

/**
 * Created by pradeep on 29/11/16.
 */
public enum EnumSingleton {
    INSTANCE;

    public void print(String value) {
        System.out.println(value);
    }

}
