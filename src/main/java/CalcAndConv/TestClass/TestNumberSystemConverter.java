package CalcAndConv.TestClass;
import CalcAndConv.NumberSystemConverter;

/**
 * Класс нужен для переопределения методов класса {@link NumberSystemConverter} и последующего
 * использования этих методов в тестировании через JUnit
 */

public class TestNumberSystemConverter extends NumberSystemConverter {

    @Override
    protected String decimalToBinary(String value) {
        return super.decimalToBinary(value);
    }

    @Override
    protected String decimalToOctal(String value) {
        return super.decimalToOctal(value);
    }

    @Override
    protected String decimalToHex(String value) {
        return super.decimalToHex(value);
    }

    @Override
    public int binaryToDecimal(String value) {
        return super.binaryToDecimal(value);
    }

    @Override
    public String binaryToOctal(String value) {
        return super.binaryToOctal(value);
    }

    @Override
    public String binaryToHex(String value) {
        return super.binaryToHex(value);
    }

    @Override
    protected int octalToDecimal(String value) {
        return super.octalToDecimal(value);
    }

    @Override
    protected int octalToBinary(String value) {
        return super.octalToBinary(value);
    }

    @Override
    protected String octalToHex(String value) {
        return super.octalToHex(value);
    }

    @Override
    protected int hexToDecimal(String value) {
        return super.hexToDecimal(value);
    }

    @Override
    protected int hexToBinary(String value) {
        return super.hexToBinary(value);
    }

    @Override
    protected String hexToOctal(String value) {
        return super.hexToOctal(value);
    }
}
