package Lab1.task8;

public class CustomDouble {
    private int integer;
    private double fraction;
    private boolean isPositive;

    public CustomDouble() {
        this(true, 0, 0.0);
    }

    public CustomDouble(final boolean status, final int integer, final double fraction) {
        setIsPositive(status);
        setInteger(integer);
        setFraction(fraction);
    }

    public int getInteger() {
        return integer;
    }

    public double getFraction() {
        return fraction;
    }

    public boolean isPositive() {
        return isPositive;
    }

    public void setInteger(final int integer) {
        this.isPositive = integer < 0 ? false : true;

        this.integer = Math.abs(integer);
    }

    public void setFraction(final double fraction) {
        if (this.isPositive() == false) {
            final int tmp = -this.integer;
            this.isPositive = fraction < 0 || tmp < 0 ? false : true;
        } else {
            this.isPositive = fraction < 0 ? false : true;
        }


        if (Math.abs(fraction) >= 1) {
            this.fraction = Math.abs(fraction) % 1;
            this.integer += (int) Math.abs(fraction);
        } else {
            this.fraction = Math.abs(fraction);
        }
    }

    public void setIsPositive(final boolean positive) {
        this.isPositive = positive;
    }

    public CustomDouble add(final CustomDouble a) {
        final CustomDouble result = new CustomDouble();

        final double sum = this.toDouble() + a.toDouble();

        result.integer = (int) sum;
        result.fraction = sum % 1;

        return result;
    }

    public CustomDouble differ(final CustomDouble a) {
        final CustomDouble result = new CustomDouble();

        final double minus = this.toDouble() - a.toDouble();

        result.integer = (int) minus;
        result.fraction = minus % 1;

        return result;
    }

    public boolean greaterAndEqual(final CustomDouble a) {
        return this.toDouble() >= a.toDouble();
    }

    public boolean smallerAndEqual(final CustomDouble a) {
        return this.toDouble() <= a.toDouble();
    }

    public boolean greater(final CustomDouble a) {
        return !this.smallerAndEqual(a);
    }

    public boolean smaller(final CustomDouble a) {
        return !this.greaterAndEqual(a);
    }

    public boolean notEqual(final CustomDouble a) {
        return !this.equals(a);
    }

    @Override
    public boolean equals(final Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        final CustomDouble number = (CustomDouble) o;
        return this.integer == number.integer && this.fraction == number.fraction;
    }

    @Override
    public int hashCode() {
        return 31 * this.integer +
                31 * Double.hashCode(this.fraction);
    }

    @Override
    public String toString() {
        return String.valueOf(this.toDouble());
    }

    public double toDouble() {
        double res = this.integer + this.fraction;
        return res *= isPositive() ? 1 : -1;
    }
}