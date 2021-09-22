package Lab1.task5;

public class Matrix {
    private final int rows;
    private final int columns;
    private final int[][] array;

    public Matrix(final int rows, final int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];
    }

    public Matrix random(final int min, final int max) {
        for (int i = 0; i < this.rows; i++) {
            for (int j = 0; j < this.columns; j++) {
                this.array[i][j] = (int) ((Math.random() * (max - min)) + min);
            }
        }
        return this;
    }

    public void printMatrix() {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public Matrix transposition() {
        final Matrix tMatrix = new Matrix(this.columns, this.rows);

        for (int i = 0; i < tMatrix.rows; i++) {
            for (int j = 0; j < tMatrix.columns; j++) {
                tMatrix.array[i][j] = this.array[j][i];
            }
        }
        return tMatrix;
    }

}