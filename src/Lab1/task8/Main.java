package Lab1.task8;

public class Main {
    public static void main(final String[] args) {
        final CustomDouble num1 = new CustomDouble(false, 0, -0.5);
        final CustomDouble num2 = new CustomDouble(true, 4, 2.6);

        System.out.println("Number 1 = " + num1);
        System.out.println("Number 2 = " + num2);

        System.out.println("Sum of two numbers: " + num1.add(num2));
        System.out.println("Difference of two numbers: " + num1.differ(num2));

        System.out.println("Number 1 is bigger than Number 2? " + num1.greater(num2));
        System.out.println("Number 1 is smaller than Number 2? " + num1.smaller(num2));
        System.out.println("Number 1 is bigger than/equal to Number 2? " + num1.greaterAndEqual(num2));
        System.out.println("Number 1 is smaller than/equal to Number 2? " + num1.smallerAndEqual(num2));
        System.out.println("Number 1 is equal to Number 2? " + num1.equals(num2));
        System.out.println("Number 1 is not equal to Number 2? " + num1.notEqual(num2));
    }
}
