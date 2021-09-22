package Lab1.task9;

import Lab1.task8.CustomDouble;

public class Calculator {

    public double operations(final CustomDouble a, final char symbol, final CustomDouble b) {
        switch (symbol) {
            case '+':
                return a.add(b).toDouble();
            case '-':
                return a.differ(b).toDouble();
            case '*':
                return a.multi(b).toDouble();
            case '/':
                return a.divide(b).toDouble();
            default:
                throw new UnsupportedOperationException("Wrong symbol! Enter one of operations(+, -, *, /)");
        }
    }
}
