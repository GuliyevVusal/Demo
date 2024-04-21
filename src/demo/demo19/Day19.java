package demo.demo19;

import java.util.Arrays;

public class Day19 {
    public static void main(String[] args) {

        int[] arr = {3, 6, 9};
        int add = 12;
        System.out.println(Arrays.toString(method(arr, add)));

    }

    public static int[] method(int[] array, int additional) {

        int[] newArray = new int[array.length + 1];

        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        newArray[newArray.length - 1] = additional;

        return newArray;
    }
}
