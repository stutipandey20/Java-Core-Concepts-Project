package OOP.VehicleManagementSystem;

public class Truck extends Vehicle implements Rentable{
    private int loadCapacity;

    public Truck(String brand, String model, int year, int loadCapacity) {
        super(brand, model, year);
        this.loadCapacity = loadCapacity;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Truck | Load Capacity: " + loadCapacity + " kg.");
    }

    @Override
    public void rent(int days) {
        System.out.println("Truck rented for " + days + " days");
    }

}
