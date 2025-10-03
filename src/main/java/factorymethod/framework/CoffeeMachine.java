package factorymethod.framework;

public abstract class CoffeeMachine {
    protected abstract Coffee brew();

    public void orderService() {
        Coffee coffee = brew();
        coffee.serve();
    }
}
