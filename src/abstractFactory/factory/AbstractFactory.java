package abstractFactory.factory;

import abstractFactory.model.Monitor;
import abstractFactory.model.Mouse;

public interface AbstractFactory {
    Monitor createMonitor();
    Mouse createMouse();

}
