package factoryMethod.factory;

import factoryMethod.cars.Car;
import factoryMethod.cars.Honda;

public class HondaFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new Honda();
    }
}
