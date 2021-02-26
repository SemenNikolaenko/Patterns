package Bridge;

public class Honda extends Transport {
    public Honda(Color color){
        super(color);
    }
    @Override
    public void start() {
        color.color();
        System.out.println( "honda started");
    }
}
