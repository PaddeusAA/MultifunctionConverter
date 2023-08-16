package CalcAndConv;

import java.util.Scanner;

/**
 * Данный класс объединяет и реалирует все другие для более удобного
 * использования и внесения последующих правок
 * <p>
 * Он имеет единственную функцию {@link #start()} которая нужна для запуска всей программы
 */
public class StartClass {
    Calculator calculator = new Calculator();
    NumberSystemConverter nsc = new NumberSystemConverter();

    public void start() {
        Scanner in = new Scanner(System.in);

        // Позволяет выйти из программы если равен true
        boolean exit = false;

        while (!exit) {

            // Позволяет выйти из конкретного функционального блока
            boolean exitConverter = false;

            System.out.println("\n\tМногофункциональный конвертер запущен" +
                    "\n\t      Какие функции вам нужны?" +
                    "\n1) Обычный калькулятор\n" +
                    "\n2) Конвертер систем счисления\n");

            int actionForApp = in.nextInt();


            while (!exitConverter) {
                switch (actionForApp) {

                    // Блок с Калькулятором
                    case 1 -> {
                        //regionКалькулятор

                        int firstValue;
                        int secondValue;
                        System.out.println("\nЧто вы хотите сделать?\n" +
                                "1) Сложение\n" +
                                "2) Вычитание\n" +
                                "3) Умножение\n" +
                                "4) Деление\n" +
                                "5) Закрыть калькулятор\n");
                        int actionForCalculator = in.nextInt();
                        if (actionForCalculator == 1) { // сложение
                            System.out.println("Введите 2 числа");
                            firstValue = in.nextInt();
                            secondValue = in.nextInt();

                            calculator.addition(firstValue, secondValue);

                        } else if (actionForCalculator == 2) { // вычитание
                            System.out.println("Введите 2 числа");
                            firstValue = in.nextInt();
                            secondValue = in.nextInt();

                            calculator.subtraction(firstValue, secondValue);

                        } else if (actionForCalculator == 3) { // умножение
                            System.out.println("Введите 2 числа");
                            firstValue = in.nextInt();
                            secondValue = in.nextInt();

                            calculator.multiplication(firstValue, secondValue);

                        } else if (actionForCalculator == 4) { // деление
                            System.out.println("Введите 2 числа");
                            firstValue = in.nextInt();
                            secondValue = in.nextInt();

                            if (firstValue == 0 || secondValue == 0) {
                                System.err.println("Был введен 0");

                            } else {
                                calculator.division(firstValue, secondValue);
                            }

                        } else if (actionForCalculator == 5) {
                            exitConverter = true;

                        } else {
                            System.err.println("Некорректный ввод");
                        }
                    }
                    //endregion
                    case 2 -> {
                        //region Системы счисления

                        String number;
                        System.out.println("\nИз какой системы счисления вы переводите?\n" +
                                "1) Десятичная\n" +
                                "2) Двоичная\n" +
                                "3) Восьмеричная\n" +
                                "4) Шестнадцатеричная\n" +
                                "5) Закрыть калькулятор\n");
                        String firstAction = in.next();
                        if (firstAction.equals("5")) {
                            exitConverter = true;
                            break;
                        }
                        System.out.println("\nВ какую систему счисления вы переводите?\n" +
                                "1) Десятичная\n" +
                                "2) Двоичная\n" +
                                "3) Восьмеричная\n" +
                                "4) Шестнадцатеричная\n");
                        int actionForConverter = Integer.parseInt((firstAction + in.next()));
                        switch (actionForConverter) {
                            case 12 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.decimalToBinary(number);
                            }
                            case 13 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.decimalToOctal(number);
                            }
                            case 14 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.decimalToHex(number);
                            }
                            case 21 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.binaryToDecimal(number);
                            }
                            case 23 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.binaryToOctal(number);
                            }
                            case 24 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.binaryToHex(number);
                            }
                            case 31 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.octalToDecimal(number);
                            }
                            case 32 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.octalToBinary(number);
                            }
                            case 34 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.octalToHex(number);
                            }
                            case 41 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.hexToDecimal(number);
                            }
                            case 42 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.hexToBinary(number);
                            }
                            case 43 -> {
                                System.out.println("Введите число");
                                number = in.next();
                                nsc.hexToOctal(number);
                            }
                            default -> System.err.println("Вы ввели некорректное число");
                        }
                    }

                    //endregion
                    default -> {
                        System.err.println("Вы ввели некорректное число");
                        exitConverter = true;
                    }
                }
            }

        }
    }

}
