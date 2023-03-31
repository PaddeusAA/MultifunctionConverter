package CalcAndConv.TestClass;
import CalcAndConv.Calculator;

/**
 * Класс нужен для переопределения методов класса {@link Calculator} и последующего
 * использования этих методов в тестировании через JUnit
 */
public class TestCalculator extends Calculator {

    @Override
    public double addition(double x, double y) {
        return super.addition(x, y);
    }

    @Override
    public double subtraction(double x, double y) {
        return super.subtraction(x, y);
    }

    @Override
    public double multiplication(double x, double y) {
        return super.multiplication(x, y);
    }

    @Override
    public double division(double x, double y) {
        return super.division(x, y);
    }
}
