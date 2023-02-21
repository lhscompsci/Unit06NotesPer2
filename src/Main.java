import java.util.Arrays;

import static java.lang.System.out;
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Arrays
        // an array of ints named dave numbered 0..22
        int[] dave = new int[23];

        out.println(dave[10]);      // direct access
        out.println(dave);      // memory where the array starts

        for (int index = 0; index < dave.length; index+=2 )
            dave[index] = index * 12;

        for (int index = 1; index < dave.length; index+=2 )
            dave[index] = index * 4;

        out.println(dave[11]);

        out.println(Arrays.toString(dave));     //pretty prints the array

    }
}