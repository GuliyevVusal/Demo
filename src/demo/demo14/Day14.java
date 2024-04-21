package demo.demo14;

import java.util.Scanner;

public class Day14 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        String password = "";
        boolean truePassword = false;

        while (!truePassword) {
            System.out.println("Please enter Password");
            password = sc.nextLine();
            truePassword = passwordControl(password);
        }
        System.out.println("Password control Successfully: ");
    }

    public static boolean passwordControl(String password) {

        int flag = 0;
        char firstCharacter = password.charAt(0);

        if (!(firstCharacter >= 'A' && firstCharacter <= 'Z')) {
            System.out.println("First Character must be Uppercase");
            flag++;
        }
        char lastCharacter = password.charAt(password.length() - 1);

        if (!(lastCharacter >= '0' && lastCharacter <= '9')) {
            System.out.println("The last character must be a number");
            flag++;
        }
        if (password.contains(" ")) {
            System.out.println("There cannot be spaces in the password");
            flag++;
        }
        if (password.length() < 7) {
            System.out.println("Password length must be at least 7 characters");
            flag++;
        }
        if (flag == 0) {
            return true;
        } else {
            return false;
        }

    }
}
