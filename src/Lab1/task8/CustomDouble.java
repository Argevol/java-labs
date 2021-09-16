package Lab1.task8;

public class CustomDouble {
    private int integer;
    private double fraction;
    boolean status;

    public CustomDouble() {
        this(true, 0, 0.0);
    }

    public CustomDouble(final boolean status, final int integer, final double fraction) {
        setStatus(status);
        setInteger(integer);
        setFraction(fraction);
    }

    public int getInteger() {
        return integer;
    }

    public double getFraction() {
        return fraction;
    }

    public boolean getStatus() {
        return status;
    }

    public void setInteger(final int integer) {
        this.status = integer < 0 ? false : true;

        this.integer = Math.abs(integer);
    }

    public void setFraction(final double fraction) {
        this.status = fraction < 0 ? false : true;

        if (Math.abs(fraction) >= 1) {
            this.fraction = Math.abs(fraction) % 1;
            this.integer += (int) Math.abs(fraction);
        } else {
            this.fraction = Math.abs(fraction);
        }
    }

    public void setStatus(final boolean status) {
        this.status = status;
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
        return this.toDouble() + "";
    }

    public double toDouble() {
        double res = this.integer + this.fraction;
        return res *= this.status == false ? -1 : 1;
    }
}