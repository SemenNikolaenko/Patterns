package Bridge;

public class Toyota extends Transport{
    public Toyota(Color color){
        super(color);
    }
    @Override
    public void start() {
        color.color();
        System.out.println( "Toyota started");
    }
}
