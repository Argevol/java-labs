package Lab1.task6;

public class Main {
    public static void main(final String[] args) {
        try {
            final Matrix mat1 = new Matrix(3, 2);
            final Matrix mat2 = new Matrix(3, 3);

            mat1.Random(1, 9);
            mat2.Random(1, 9);

            mat1.PrintMatrix();
            mat2.PrintMatrix();

            (mat1.Multi(mat2)).PrintMatrix();
        } catch (final RuntimeException e) {
            System.out.println("Error");
        }
    }
}

