package Main;

import CalcAndConv.Calculator;
import CalcAndConv.NumberSystemConverter;
import CalcAndConv.StartClass;

public class Main {
    public static void main(String[] args) {
       //new StartClass().start();

        new NumberSystemConverter().binaryToDecimal("111000111");
        new NumberSystemConverter().binaryToHex("111000111");
        new NumberSystemConverter().binaryToOctal("111000111");
    }
}
