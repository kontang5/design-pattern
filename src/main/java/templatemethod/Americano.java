package templatemethod;

public class Americano extends Coffee {

    public Americano() {
    }

    @Override
    protected void brew() {
        System.out.println( "Pouring hot water");
    }

    @Override
    protected void service() {
        System.out.println("Americano is ready!");
    }
}
