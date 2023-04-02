package CalcAndConv.TestClass;
import junit.framework.TestCase;
import org.junit.Test;

public class TestNumberSystemConverterTest extends TestCase {

    @Test
    public void testDecimalToBinary() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        String result = tnsc.decimalToBinary("73");
        assertEquals("1001001", result);
    }

    @Test
    public void testDecimalToOctal() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        String result = tnsc.decimalToOctal("73");
        assertEquals("111", result);
    }

    @Test
    public void testDecimalToHex() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        String result = tnsc.decimalToHex("73");
        assertEquals("49", result);
    }

    @Test
    public void testBinaryToDecimal() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        int result = tnsc.binaryToDecimal("111000111");
        assertEquals(455, result);
    }

    @Test
    public void testBinaryToOctal() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        String result = tnsc.binaryToOctal("111000111");
    }

    @Test
    public void testBinaryToHex() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        String result = String.valueOf(tnsc.binaryToHex("111000111"));
        assertEquals("1c7", result);
    }

    @Test
    public void testOctalToDecimal() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        int result = tnsc.octalToDecimal("435");
        assertEquals(285, result);
    }

    @Test
    public void testOctalToBinary() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        int result = tnsc.octalToBinary("435");
        assertEquals(100011101, result);
    }

    @Test
    public void testOctalToHex() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        String result = tnsc.octalToHex("435");
        assertEquals("11d", result);
    }

    @Test
    public void testHexToDecimal() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        int result = tnsc.hexToDecimal("12A");
        assertEquals(298, result);
    }

    @Test
    public void testHexToBinary() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        int result = tnsc.hexToBinary("12A");
        assertEquals(100101010, result);
    }

    @Test
    public void testHexToOctal() {
        TestNumberSystemConverter tnsc = new TestNumberSystemConverter();
        String result = tnsc.hexToOctal("12A");
        assertEquals("452", result);
    }
}