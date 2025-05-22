package OOP.VehicleManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CarTest {
    
    @Test
    void testCarProperties() {
        Car car = new Car("Honda", "Civic", 2022, 4);

        assertEquals("Honda", car.getBrand());
        assertEquals("Civic", car.getModel());
        assertEquals(2022, car.getYear());
    }

    @Test
    void testRentMethodOutput() {
        Car car = new Car("Honda", "Civic", 2022, 4);
        // No return value, so just ensure no exception
        assertDoesNotThrow(() -> car.rent(3));
    }
}
