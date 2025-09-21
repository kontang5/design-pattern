package templatemethod;

public abstract class Coffee {

    protected abstract void brew();
    protected abstract void service();

    private void prepareShot() {
        System.out.println("Espresso is prepared");
    }

    public final void makeCoffee() {
        prepareShot();
        brew();
        service();
    }
}
