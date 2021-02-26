package Bridge;

public abstract class Transport {
    Color color;
    public Transport(Color color){
        this.color=color;
    }
    public abstract void start();
}
