package templatemethod;

public class Latte extends Coffee {

    public Latte() {
    }

    @Override
    protected void brew() {
        System.out.println("Pouring steamed milk");
    }

    @Override
    protected void service() {
        System.out.println("Latte is ready!");
    }
}
