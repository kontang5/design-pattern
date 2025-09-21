package adapter;

public class Client {
    public static void main(String[] args) {
        PowerSupplier supplier = new PowerSupplier();
        Device device = new PowerAdapter(supplier);
        device.charge();
    }
}
