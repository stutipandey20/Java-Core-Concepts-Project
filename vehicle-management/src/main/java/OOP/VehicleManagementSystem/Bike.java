package OOP.VehicleManagementSystem;

public class Bike extends Vehicle {
    private boolean hasCarrier;

    public Bike(String brand, String model, int year, boolean hasCarrier) {
        super(brand, model, year);
        this.hasCarrier = hasCarrier;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Bike | Carrier: " + (hasCarrier ? "Yes" : "No"));
    }
}
