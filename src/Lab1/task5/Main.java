package Lab1.task5;

public class Main {
    public static void main(final String[] args) {
        final Matrix mat = new Matrix(3, 2);

        mat.Random(1, 9);

        mat.PrintMatrix();

        (mat.Transposition()).PrintMatrix();
    }
}

