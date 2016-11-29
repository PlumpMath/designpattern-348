package designpattern.strategy;

/**
 * Created by pradeep on 12/11/16.
 */
public class Squeak implements QuackBehavior {
    public void quack() {
        System.out.println("Squeak");
    }
}
