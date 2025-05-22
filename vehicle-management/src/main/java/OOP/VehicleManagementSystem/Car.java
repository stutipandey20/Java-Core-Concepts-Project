package OOP.VehicleManagementSystem;

public class Car extends Vehicle implements Rentable {
    private int doors;

    public Car(String brand, String model, int year, int doors) {
        super(brand, model, year);
        this.doors = doors;
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Type: Car | Doors: " + doors);
    }

    @Override
    public void rent(int days) {
        System.out.println("Car rented for " + days + " days.");
    }
}
