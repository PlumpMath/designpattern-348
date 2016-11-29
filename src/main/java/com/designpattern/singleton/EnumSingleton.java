package designpattern.singleton;

/**
 * Created by pradeep on 29/11/16.
 */
public enum EnumSingleton {
    INSTANCE;

    private static void print(String value) {
        System.out.println(value);
    }

}
