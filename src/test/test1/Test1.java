package test.test1;

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Metn daxil edin..");
        String metn = sc.nextLine();

        String character = "";

        while (character.length() != 1) {
            System.out.println("Zehmet olmasa Herf daxil edin");
            character = sc.nextLine();
        }
        String[] yeniMetn = metn.split(""); // [Q, a, r, a, b, a, g,  , A, z, e, r, b, a, y, c, a, n, d, i, r];
        int count = 0;

        for (String w : yeniMetn) {
            if (character.equalsIgnoreCase(w)) {
                count++;

            }
        }
        if (count == 0) {
            System.out.println("Daxil olunan Herf Cumlede tapilmadi...");
        } else {
            System.out.println("Daxil olunan: " + character + " Herf cumlede " + count + " defe istifade olunub...");
        }
    }
}
