package demo.demo1;

public class Day1 {

    public static void main(String[] args) {

        int num1 = 9;

        int num2 = num1++; // Post-Increment num1 = 10; && num2 = 9;

        if (num2 < 10) {
            System.out.println(num2 + " Hello "); // 9 Hello
        } else {
            System.out.println(num1 + " Hello World ");

        }
        /*
           int num1 = 9;

        int num2 = ++num1; // Pre-Increment  num1 = 10; && num2 = 10;

        if (num2 < 10) {
            System.out.println(num2 + " Hello ");
        } else {
            System.out.println(num1 + " Hello World "); // 10 Hello World

        /
         */

    }
}

