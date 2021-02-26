package factoryMethod.cars;

public class Honda implements Car {
    @Override
    public void accelerate() {
        System.out.println("Honda do wrrrrrrrrr");
    }

    @Override
    public void beeeeep() {
        System.out.println("Honda do beeeeeeeeeeeeep");
    }
}
