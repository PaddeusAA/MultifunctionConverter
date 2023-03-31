package CalcAndConv;
import java.util.Scanner;

/**
 *  Данный класс объединяет и реалирует все другие для более удобного
 *  использования и внесения последующих правок
 *  <p>
 *  Он имеет единственную функцию {@link #start()} которая нужна для запуска всей программы
 */
public class StartClass {
    Calculator calculator = new Calculator();

    public void start() {
        Scanner in = new Scanner(System.in);

        // Позволяет выйти из программы если равен true
        boolean exit = false;

        int firstValue;
        int secondValue;

        while (!exit) {

            // Позволяет выйти из конкретного функционального блока
            boolean exitCalculator = false;

            System.out.println("\n\tМногофункциональный конвертер запущен" +
                    "\n\t      Какие функции вам нужны?" +
                    "\n\n1) Обычный калькулятор\n");

            int actionForConverter = in.nextInt();


            while (!exitCalculator) {
                switch (actionForConverter) {

                    // Блок с Калькулятором
                    case 1:
                        //regionКалькулятор
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
                            exitCalculator = true;

                        } else {
                            System.err.println("Некорректный ввод");
                        }
                        //endregion
                        break;

                    case 2:
                        break;

                    default:
                        System.err.println("Вы ввели некорректное число");
                        exitCalculator = true;
                        break;
                }
            }

        }
    }

}
