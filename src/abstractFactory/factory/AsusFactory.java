package abstractFactory.factory;

import abstractFactory.model.AsusMonitor;
import abstractFactory.model.AsusMouse;
import abstractFactory.model.Monitor;
import abstractFactory.model.Mouse;

public class AsusFactory implements AbstractFactory {
    @Override
    public Monitor createMonitor() {
        return new AsusMonitor();
    }

    @Override
    public Mouse createMouse() {
        return new AsusMouse();
    }
}
