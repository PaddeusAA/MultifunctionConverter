package CalcAndConv.TestClass;

import org.junit.Test;
import org.junit.Assert;

public class CalculatorTest {

    @Test
    public void add() {

        TestCalculator tc = new TestCalculator();
        double result = tc.addition(5,5);
        Assert.assertEquals(10, result, 0.01);
    }

    @Test
    public void sub() {

        TestCalculator tc = new TestCalculator();
        double result = tc.subtraction(10,5);
        Assert.assertEquals(5, result, 0.01);
    }

    @Test
    public void mul() {

        TestCalculator tc = new TestCalculator();
        double result = tc.multiplication(10,2);
        Assert.assertEquals(20, result, 0.01);
    }

    @Test
    public void div() {

        TestCalculator tc = new TestCalculator();
        double result = tc.division(10,2);
        Assert.assertEquals(5, result, 0.01);
    }

}
