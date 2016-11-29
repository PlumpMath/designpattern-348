package designpattern.strategy;

/**
 * Created by pradeep on 12/11/16.
 */
public class FlyNoWay implements FlyBehavior {
    public void fly() {
        System.out.println("I can't fly");
    }
}
