package Lab1.task9;

import Lab1.task8.CustomDouble;

public class Main {
    public static void main(final String[] args) {
        try {
            final CustomDouble a = new CustomDouble(false, 3, -0.5);
            final CustomDouble b = new CustomDouble(true, 5, 1.7);

            final Calculator calculator = new Calculator();

            System.out.println(calculator.operations(a, '+', b));
            System.out.println(calculator.operations(a, '-', b));
            System.out.println(calculator.operations(a, '*', b));
            System.out.println(calculator.operations(a, '/', b));
        } catch (final UnsupportedOperationException e) {
            System.err.println(e.getMessage());
        } catch (final ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
