package adapter;

public class PowerAdapter implements Device{
    private final PowerSupplier powerSupplier;

    public PowerAdapter(PowerSupplier powerSupplier) {
        this.powerSupplier = powerSupplier;
    }

    @Override
    public void charge() {
        int volt = powerSupplier.providePower();
        if (volt != 5) {
            System.out.println("Adapter: converting " + volt + "v to 5v");
        }
        System.out.println("Device charging...");
    }
}
