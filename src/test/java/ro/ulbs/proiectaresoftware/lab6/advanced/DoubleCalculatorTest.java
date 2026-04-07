package ro.ulbs.proiectaresoftware.lab6.advanced;


import org.junit.jupiter.api.*;

public class DoubleCalculatorTest {
    private DoubleCalculator calculator;
    @BeforeEach
    void setUp() {
        calculator = new DoubleCalculator();
    }
    @Test
    void testAdd() {
        calculator.add(1.4);
        Assertions.assertEquals(1.4, calculator.result());
    }
    @Test
    void testSubtract() {
        calculator.subtract(1.4);
        Assertions.assertEquals(-1.4, calculator.result());
    }
    @Test
    void testMultiply() {
        calculator.multiply(1.4);
        Assertions.assertEquals(1.4, calculator.result());
    }
    @Test
    void testDivide() {
        calculator.add(4.2).divide(2.0);
        Assertions.assertEquals(2.1, calculator.result());
    }
    @Test
    void testDivideByZero() {
        calculator.add(10.0);
        Exception exception = Assertions.assertThrows(ArithmeticException.class, () -> {
            calculator.divide(0.0);
        });
        Assertions.assertEquals("Division by zero", exception.getMessage());
    }
    @AfterEach
    public void tearDown() {
        calculator = null;
    }
}
