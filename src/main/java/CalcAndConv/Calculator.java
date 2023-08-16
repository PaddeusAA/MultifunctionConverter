package CalcAndConv;

/**
 * Это класс Калькулятор с стандартными методами такими как
 * <p>
 * сложение, вычитание, умножение, деление
 * <p>
 * Реализуется в {@link StartClass}
 */

public class Calculator {


    /**
     * @param x - первый параметр
     * @param y - второй параметр
     * @return ретернит результат сложения который нужен для Unit-теста
     */
    protected double addition(double x, double y) {

        double result = x + y;
        System.out.println(result);

        return result;
    }

    /**
     * @param x - первый параметр
     * @param y - второй параметр
     * @return ретернит результат вычитания который нужен для Unit-теста
     */
    protected double subtraction(double x, double y) {

        double result = x - y;
        System.out.println(result);

        return result;
    }

    /**
     * @param x - первый параметр
     * @param y - второй параметр
     * @return ретернит результат умножения который нужен для Unit-теста
     */
    protected double multiplication(double x, double y) {

        double result = x * y;
        System.out.println(result);

        return result;
    }

    /**
     * @param x - первый параметр
     * @param y - второй параметр
     * @return ретернит результат сложения который нужен для Unit-теста
     * <p>
     * {@link StartClass#start()}
     * <p>
     * в  методе start класса StartClass есть проверка на ввод нуля и выкидыване сообщения ошибки при его ввод
     */

    protected double division(double x, double y) {

        double result = x / y;
        System.out.println(result);

        return result;
    }
}
