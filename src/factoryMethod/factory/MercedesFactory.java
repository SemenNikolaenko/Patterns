package factoryMethod.factory;

import factoryMethod.cars.Car;
import factoryMethod.cars.Mercedes;

public class MercedesFactory extends AbstractCarFactory {
    @Override
    public Car createCar() {
        return new Mercedes();
    }
}
