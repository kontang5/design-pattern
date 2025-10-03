package factorymethod.coffee;

import factorymethod.framework.Coffee;

public class Espresso extends Coffee {
    @Override
    public void serve() {
        System.out.println("Serving espresso");
    }
}
