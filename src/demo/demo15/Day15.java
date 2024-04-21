package demo.demo15;

import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);

        System.out.println("Enter positive numbers: ");

        int input;
        int sumPositiveNums = 0;
        int count = 0;
        while ((input = Integer.parseInt(sc.nextLine())) != 0) {

            if (input > 0) {
                sumPositiveNums += input;
                count++;
            } else if (input < 0) {
                System.out.println("Negative number !!!!\n Please enter Positive numbers...");
                continue;
            }
            System.out.println("input--> " + input + ": sum = " + sumPositiveNums + " count = " + count);
        }

    }
}
