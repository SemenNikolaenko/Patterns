package adapter.thoughInterface;

public class Toyota implements Car {

    public Toyota(Toyota toyota){
        doBee();
    }

    @Override
    public void doBee() {
        System.out.println("beeee");
    }
}
