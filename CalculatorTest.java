import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

class CalculatorTest {
    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void shouldReturnSumWhenAddingTwoNumbers() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.add(first, second);
        assertEquals(3.0, result, 0.1);
    }

    @Test
    public void shouldReturnDifferenceWhenSubtractingTwoNumbers() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.subtract(first, second);
        assertEquals(-1.0, result, 0.1);
    }

    @Test
    public void shouldReturnProductWhenMultiplyingTwoNumbers() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.multiply(first, second);
        assertEquals(2.0, result, 0.1);
    }

    @Test
    public void shouldReturnQuotientWhenDividingTwoNumbers() {
        double first = 1.0;
        double second = 2.0;
        double result = calculator.divide(first, second);
        assertEquals(0.5, result, 0.1);
    }
}
