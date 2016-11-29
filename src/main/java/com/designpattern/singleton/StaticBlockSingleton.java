package designpattern.singleton;

/**
 * Created by pradeep on 29/11/16.
 */
public class StaticBlockSingleton {
    private static StaticBlockSingleton instance;

    static {
        try {
            instance = new StaticBlockSingleton();
        } catch (Exception e) {
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }

    private StaticBlockSingleton() {
    }

    public static StaticBlockSingleton getInstance() {
        return instance;
    }

    public static void main(String[] args) {
        StaticBlockSingleton instance_1 = StaticBlockSingleton.getInstance();
        StaticBlockSingleton instance_2 = StaticBlockSingleton.getInstance();

        System.out.println("Instance_1 = " + instance_1.getClass().hashCode());
        System.out.println("Instance_2 = " + instance_2.getClass().hashCode());
    }

}
