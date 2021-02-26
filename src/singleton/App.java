package singleton;

public class App {
    public static void main(String[] args) {
        Singleton singleton = Singleton.getSingleton();
        Singleton singleton1 =Singleton.getSingleton();
        singleton.age=1;
        System.out.println(singleton1.age);

    }
}
