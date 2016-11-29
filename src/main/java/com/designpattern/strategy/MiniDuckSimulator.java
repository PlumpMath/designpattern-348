package designpattern.strategy;

/**
 * Created by pradeep on 12/11/16.
 */
public class MiniDuckSimulator {

    public static void main(String[] args) {
        Duck mallard = new MallardDuck();
        mallard.setFlyBehavior(new FlyWithWings());
        mallard.setQuackBehavior(new Squeak());

        mallard.display();
        mallard.performFly();
        mallard.performQuack();
    }
}
