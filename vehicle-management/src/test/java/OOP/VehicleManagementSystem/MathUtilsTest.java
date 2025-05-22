package OOP.VehicleManagementSystem;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {
    
    @Test
    void testAddIntegers() {
        MathUtils mathUtil = new MathUtils();
        assertEquals(15, mathUtil.add(10, 5));
    }

    @Test
    void testAddDouble() {
        MathUtils mathUtil = new MathUtils();
        assertEquals(6.8, mathUtil.add(2.5, 4.3), 0.0001);
    }
}
