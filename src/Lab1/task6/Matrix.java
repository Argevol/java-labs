package Lab1.task6;

public class Matrix {
    private final int rows;
    private final int columns;
    private final int[][] array;

    public Matrix(final int rows, final int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new int[rows][columns];
    }

    public Matrix(final int rows, final int columns, final int[][] array) {
        this.rows = rows;
        this.columns = columns;
        this.array = array;
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

    public Matrix multi(final Matrix matrix) {
        if (this.columns != matrix.rows) {throw new IndexOutOfBoundsException("Wrong matrix dimensions!");}

        final Matrix result = new Matrix(this.rows, matrix.columns);

        for (int i = 0; i < this.rows; i++) //Цикл рядків
            for (int j = 0; j < matrix.columns; j++) //Цикл стовпчиків
                for (int k = 0; k < matrix.rows; k++) //Допоміжний цикл для обчислення добутку
                    result.array[i][j] += (this.array[i][k] * matrix.array[k][j]);
        return result;
    }
}