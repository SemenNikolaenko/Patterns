package factoryMethod.factory;

import factoryMethod.cars.Car;
import factoryMethod.cars.Toyota;

public class ToyotaFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new Toyota();
    }
}
