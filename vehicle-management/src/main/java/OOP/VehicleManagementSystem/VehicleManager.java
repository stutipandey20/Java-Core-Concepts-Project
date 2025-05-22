package OOP.VehicleManagementSystem;

import OOP.VehicleManagementSystem.*;
public class VehicleManager {
    public static void main(String[] args) {
        Vehicle car = new Car("Hyundai", "H195", 2022, 4);
        Vehicle bike = new Bike("Yamaha", "R15", 2021, false);
        Vehicle truck = new Truck("TATA", "T198H", 2017, 15000);

        System.out.println("\n======= Vehicle Info =========");
        car.displayInfo();
        bike.displayInfo();
        truck.displayInfo();

        System.out.println("\n======== Rentable Actions =============");
        ((Rentable) car).rent(4);
        ((Rentable) truck).rent(8);

        System.out.println("\n=== Method Overloading Demo ===");
        MathUtils utils = new MathUtils();
        System.out.println("add(int, int): " + utils.add(5, 10));
        System.out.println("add(double, double): " + utils.add(2.5, 4.3));
    }
}
