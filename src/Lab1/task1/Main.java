package Lab1.task1;

public class Main {
    public static void main(final String[] args) {
        final String[] strArray = {"Confidence", "Italy", "Football", "Chocolate", "Friday"};

        print(strArray);

        sorting(strArray);

        print(strArray);
    }

    public static void print(final String[] strArray) {
        for (final String str : strArray) {
            System.out.println(str);
        }
    }

    public static void sorting(final String[] strArray) {
        for (int i = 1; i < strArray.length; i++) {
            final String tmp = strArray[i];

            int j = i - 1;
            while (j >= 0 && tmp.length() > strArray[j].length()) {
                strArray[j + 1] = strArray[j];
                j--;
            }
            strArray[j + 1] = tmp;
        }
    }
}

