package demo.demo17;

import java.util.Arrays;
import java.util.Scanner;

public class Day17 {

    public static void main(String[] args) {

        System.out.println(Arrays.toString(method()));

    }

    public static int[] method() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Array nece elementli olsun ? ");
        int length = sc.nextInt();

        int[] arr = new int[length];

        for (int i = 0; i < arr.length; i++) {
            System.out.println(i + ". indexdeki elementi daxil edin: ");

            arr[i] = sc.nextInt();
        }
        return arr;
    }
}
