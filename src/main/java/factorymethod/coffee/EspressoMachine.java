package factorymethod.coffee;

import factorymethod.framework.Coffee;
import factorymethod.framework.CoffeeMachine;

public class EspressoMachine extends CoffeeMachine {
    @Override
    protected Coffee brew() {
        return new Espresso();
    }
}
