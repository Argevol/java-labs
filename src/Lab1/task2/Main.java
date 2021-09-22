package Lab1.task2;

public class Main {
    public static void main(final String[] args) {
        final String[] strArray = {"Learn", "on", "your", "mistakes"};

        print(strArray);

        System.out.println(searchCount(strArray, 'r'));
    }

    public static void print(final String[] strArray) {
        for (final String str : strArray) {
            System.out.println(str);
        }
    }

    public static int searchCount(final String[] strArray, final char ch) {
        int count = 0;
        for (int i = 0; i < strArray.length; i++) {
            for (int j = 0; j < strArray[i].length(); j++) {
                if (strArray[i].charAt(j) == ch)
                    count++;
            }
        }
        return count;
    }
}
