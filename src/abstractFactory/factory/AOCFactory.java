package abstractFactory.factory;

import abstractFactory.model.AOCMonitor;
import abstractFactory.model.AOCMouse;
import abstractFactory.model.Monitor;
import abstractFactory.model.Mouse;

public class AOCFactory implements AbstractFactory {
    @Override
    public Monitor createMonitor() {
        return new AOCMonitor();
    }

    @Override
    public Mouse createMouse() {
        return new AOCMouse();
    }
}
