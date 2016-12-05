package com.designpattern.abstractfactory;

/**
 * Created by pradeep on 3/12/16.
 */

public class ComputerFactory {

    private ComputerFactory() {

    }

    public static Computer getComputer(ComputerAbstractFactory computerAbstractFactory) {
        return computerAbstractFactory.createComputer();
    }
}
