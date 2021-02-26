package factoryMethod.factory;

public class FactoryAllCar {
    public static AbstractCarFactory getToyotaFactory(){
        return new ToyotaFactory();
    }
    public static AbstractCarFactory getMercedesFactory (){
        return new MercedesFactory();
    }
    public static AbstractCarFactory getHondaFactory(){
        return new HondaFactory();
    }
}
