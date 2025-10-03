package factorymethod;

import factorymethod.coffee.EspressoMachine;
import factorymethod.framework.CoffeeMachine;

public class Client {
    public static void main(String[] args) {
        CoffeeMachine machine = new EspressoMachine();
        machine.orderService();
    }
}
