package Lab1.task9;

import Lab1.task8.CustomDouble;

public class Calculator extends CustomDouble {

    public Calculator() {
    }

    public Calculator(final boolean status, final int integer, final double fraction) {
        super(status, integer, fraction);
    }

    public Calculator(final boolean status, final int integer) {
        super(status, integer, 0);
    }

    public double adding(final Calculator a) {
        return this.add(a).toDouble();
    }

    public double subtract(final Calculator a) { return this.differ(a).toDouble(); }

    public Calculator multi(final Calculator a) {
        final Calculator result = new Calculator();

        final double product = this.toDouble() * a.toDouble();

        result.setInteger((int) product);
        result.setFraction(product % 1);

        return result;
    }

    public Calculator divide(final Calculator a) {
        final Calculator result = new Calculator();

        if (a.toDouble() == 0) { throw new ArithmeticException("You can't divide by zero!"); }
        final double division = this.toDouble() / a.toDouble();

        result.setInteger((int) division);
        result.setFraction(division % 1);

        return result;
    }
}
