package templatemethod;

public class Main {
    public static void main(String[] args) {
        Coffee americano = new Americano();
        americano.makeCoffee();
        System.out.println();
        Coffee latte = new Latte();
        latte.makeCoffee();
    }
}
