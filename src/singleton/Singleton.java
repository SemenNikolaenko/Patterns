package singleton;

public class Singleton {
    private static Singleton singleton;
    String name;
    int age;

    private Singleton() {
    }

    public static Singleton getSingleton() {
        if (singleton==null) singleton=new Singleton();
        return singleton;
    }
}
