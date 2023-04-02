package CalcAndConv;

/**
 *  Это класс перевода чисел из одной системы счисления в другую
 *  : 2-ая, 8-ая,  10-ая, 16-ая
 *  <p>
 * Реализуется в {@link StartClass}
 */

public class NumberSystemConverter {

    //region Из десятичной системы

    // В двоичную
    protected String decimalToBinary(String value){

        String result = Integer.toBinaryString(Integer.parseInt(value));
        System.out.println(result);

        return result;
    }

    // В восьмеричную
    protected String decimalToOctal(String value){

        String result = Integer.toOctalString(Integer.parseInt(value));
        System.out.println(result);

        return result;
    }

    // В шестнадцатеричную
    protected String decimalToHex(String value){

        String result = Integer.toHexString(Integer.parseInt(value));
        System.out.println(result);

        return result;
    }

    //endregion

    //region Из двочиной системы

    // В десятичную
    public int binaryToDecimal(String value){

        int result = Integer.parseInt(value, 2);
        System.out.println(result);

        return result;
    }

    // В восьмеричную
    public String binaryToOctal(String value){

        int tempResult = Integer.parseInt(value, 2);
        return decimalToOctal(String.valueOf(tempResult));
    }

    // В шестнадцатеричную
    public String binaryToHex(String value){

        int tempResult = Integer.parseInt(value, 2);
        return decimalToHex(String.valueOf(tempResult));
    }


    //endregion

    //region Из восьмеричной системы

    // В десятичную
    protected int octalToDecimal(String value){

        int result = Integer.parseInt(value, 8);
        System.out.println(result);

        return result;
    }

    // В двочиную
    protected int octalToBinary(String value){

        int result = Integer.parseInt(value, 8);
        return Integer.parseInt(decimalToBinary(String.valueOf(result)));
    }

    // В шестнадцатеричную
    protected String octalToHex(String value){

        int tempResult = Integer.parseInt(value, 8);
        return decimalToHex(String.valueOf(tempResult));
    }

    //endregion

    //region Из шестнадцатеричной системы

    // В десятичную
    protected int hexToDecimal(String value){

        int result = Integer.parseInt(value, 16);
        System.out.println(result);

        return result;
    }

    // В двочиную
    protected int hexToBinary(String value){

        int result = Integer.parseInt(value, 16);
        return Integer.parseInt(decimalToBinary(String.valueOf(result)));
    }

    // В шестнадцатеричную
    protected String hexToOctal(String value){

        int tempResult = Integer.parseInt(value, 16);
        return decimalToOctal(String.valueOf(tempResult));
    }

    //endregion

}
