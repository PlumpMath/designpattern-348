package com.designpattern.strategy;

/**
 * Created by pradeep on 12/11/16.
 */
public class MuteQuack implements QuackBehavior {
    public void quack() {
        System.out.println("<< Silence >>");
    }
}
