import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd(){
        assertEquals( 4, calculator.add(2,2) );
    }

    @Test
    public void canSubtract(){
        assertEquals(4, calculator.subtract(5,1) );
    }

    @Test
    public void canMultiply(){
        assertEquals( 6, calculator.multiply(3, 2) );
    }

    @Test
    public void canDivide(){
        assertEquals(3, calculator.divide(15, 5), 0.01);
    }

}
