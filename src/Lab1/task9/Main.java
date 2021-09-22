package Lab1.task9;

public class Main {
    public static void main(final String[] args) {
        try {
            final Calculator a1 = new Calculator(true, -3, 0.5);
            final Calculator a2 = new Calculator(true, -1, 0.5);

            System.out.println(a1.adding(a2));
            System.out.println(a1.subtract(a2));
            System.out.println(a1.multi(a2));
            System.out.println(a1.divide(a2));

        } catch (final ArithmeticException e) {
            System.err.println(e.getMessage());
        }
    }
}
