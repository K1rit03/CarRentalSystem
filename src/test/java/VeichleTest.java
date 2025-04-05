import model.Veichle;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class VeichleTest {
    @Test
    public void testCostWithoutDiscount() {
        Veichle veichle = new Veichle("Fusca", 100.0);
        int days = 5;
        double expectedCost = 500.0;
        double actualCost = veichle.calculateCost(days);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testCostWithDiscount() {
        Veichle veichle = new Veichle("Fusca", 100.0);
        int days = 10;
        double expectedCost = 900.0; // 1000 - 100 (10% discount)
        double actualCost = veichle.calculateCost(days) - veichle.descount(days);
        assertEquals(expectedCost, actualCost);
    }

    @Test
    public void testZeroDays() {
        Veichle veichle = new Veichle("Fusca", 100.0);
        int days = 0;
        double expectedCost = 0.0;
        double actualCost = veichle.calculateCost(days);
        assertEquals(expectedCost, actualCost);
    }


    @Test
    public void testNegativeDays() {
        Veichle veichle = new Veichle("Fusca", 100.0);
        int days = -5;
        double expectedCost = 0.0;
        double actualCost = veichle.calculateCost(days);
        assertEquals(expectedCost, actualCost);
    }
}
