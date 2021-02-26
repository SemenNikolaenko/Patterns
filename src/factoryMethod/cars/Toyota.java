package factoryMethod.cars;

public class Toyota implements Car {
    @Override
    public void accelerate() {
        System.out.println("Toyota do wrrrrrrrrrrrr");
    }

    @Override
    public void beeeeep() {
        System.out.println("Toyota do  beeeeeeeeeep");
    }
}
