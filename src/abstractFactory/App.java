package abstractFactory;

import abstractFactory.factory.AOCFactory;
import abstractFactory.factory.AbstractFactory;
import abstractFactory.factory.AsusFactory;
import abstractFactory.model.Monitor;
import abstractFactory.model.Mouse;

public class App {
    Monitor  monitor;
    Mouse mouse;

    public App(AbstractFactory af) {
        this.monitor = af.createMonitor();
        this.mouse = af.createMouse();
    }

    public static void main(String[] args) {


      App a = new App(new AOCFactory());
      a.mouse.doClick();
    }
}
