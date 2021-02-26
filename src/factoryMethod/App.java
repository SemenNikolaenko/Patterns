package factoryMethod;

import factoryMethod.cars.Car;

import factoryMethod.factory.AbstractCarFactory;
import factoryMethod.factory.FactoryAllCar;
import factoryMethod.factory.MercedesFactory;

public class App {

    public static void main(String[] args) {
        AbstractCarFactory factory = FactoryAllCar.getHondaFactory();

        Car car = factory.createCar();
       car.accelerate();


    }
}
