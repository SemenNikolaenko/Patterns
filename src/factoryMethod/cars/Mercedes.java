package factoryMethod.cars;

public class Mercedes implements Car {
    @Override
    public void accelerate() {
        System.out.println("Mercedes do wrrrrrrrrrrr");
    }

    @Override
    public void beeeeep() {
        System.out.println("Mercedes do beeeeeeeeeep");
    }
    public void showCar(){
        System.out.println("zzz");
    }
}
