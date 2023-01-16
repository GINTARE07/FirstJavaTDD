import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestCalculator {
    Calculator calculator;

    @Before
    public void before(){

        calculator = new Calculator();
    }
    @Test
    public void canAdd(){
        assertEquals( 4, calculator.add(1, 3));

    }
    @Test
    public void canSubtract(){
        assertEquals(5, calculator.subtract(6, 1));
    }
    @Test
    public void canMultiply(){
        assertEquals( 8, calculator.multiply(2, 4));
    }
    @Test
    public void canDivide(){
        assertEquals(3.5, calculator.divide(7, 2), 0.0);

    }
}
