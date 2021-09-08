package Lab1.task3;

import java.lang.Math;

public class Main {
    public static void main(final String[] args) {
        final int[] num = {3, 9, 2, 0, 4, 6, 8, 7, 5};
        final char[] ch = {'d', 'f', 'k', 's', 't', 'o', 'l'};

        System.out.println(Combine(num, ch));
    }

    public static String Combine(final int[] num, final char[] ch){
        String str = "";
        final int size = Math.max(num.length, ch.length);
        for(int i = 0; i < size; i++){
            if( i < num.length)
                str += "" + num[i];
            if(i < ch.length)
                str += "" + ch[i];
        }
        return str;
    }
}