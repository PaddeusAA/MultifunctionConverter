package Calc;

import java.util.Scanner;

public class Calculator {

    public void start(){
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        int firstValue;
        int secondValue;

        while (!exit) {
            System.out.println("\nЧто вы хотите сделать?\n" +
                    "1) Сложение\n" +
                    "2) Вычитание\n" +
                    "3) Умножение\n" +
                    "4) Деление\n" +
                    "5) Закончить\n");

            int action = in.nextInt();

            if (action == 1) { // сложение
                System.out.println("Введите 2 числа");
                firstValue = in.nextInt();
                secondValue = in.nextInt();

                addition(firstValue, secondValue);

            } else if (action == 2) { // вычитание
                System.out.println("Введите 2 числа");
                firstValue = in.nextInt();
                secondValue = in.nextInt();

                subtraction(firstValue, secondValue);

            } else if (action == 3) { // умножение
                System.out.println("Введите 2 числа");
                firstValue = in.nextInt();
                secondValue = in.nextInt();

                multiplication(firstValue, secondValue);

            } else if (action == 4) { // деление
                System.out.println("Введите 2 числа");
                firstValue = in.nextInt();
                secondValue = in.nextInt();

                if(firstValue == 0 || secondValue ==0){
                    System.err.println("Был введен 0");

                }else {
                    division(firstValue, secondValue);
                }

            } else if (action == 5) {
                exit = true;

            } else {
                System.err.println("Некорректный ввод");
            }
        }
    }

    protected double addition(double x, double y) {

        double result = x + y;
        System.out.println(result);

        return result;
    }

    protected double subtraction(double x, double y) {

        double result = x - y;
        System.out.println(result);

        return result;
    }

    protected double multiplication(double x, double y) {

        double result = x * y;
        System.out.println(result);

        return result;
    }

    protected double division(double x, double y) {

        double result = x / y;
        System.out.println(result);

        return result;
    }
}
