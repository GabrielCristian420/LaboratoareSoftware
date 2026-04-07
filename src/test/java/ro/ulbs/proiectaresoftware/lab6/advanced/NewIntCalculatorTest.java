package ro.ulbs.proiectaresoftware.lab6.advanced;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class NewIntCalculatorTest {
    private NewIntCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new NewIntCalculator();
    }
    @Test
    void testAdd() {
        calculator.add(2);
        Assertions.assertEquals(2, calculator.result());
    }
    @Test
    void testSubtract() {
        calculator.subtract(2);
        Assertions.assertEquals(-2, calculator.result());
    }
    @Test
    void testMultiply() {
        calculator.add(1).multiply(2);
        Assertions.assertEquals(2, calculator.result());
    }
    @Test
    void testDivide() {
        calculator.add(2).divide(2);
        Assertions.assertEquals(1, calculator.result());
    }
    @Test
    void testDivideByZero() {
        calculator.add(10);
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0);
        });
        Assertions.assertEquals("Division by zero", exception.getMessage());
    }

    @AfterEach
    void tearDown() {
        calculator = null;
    }

}
