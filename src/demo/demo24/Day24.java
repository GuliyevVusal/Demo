package demo.demo24;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Day24 {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        String name = "";

        while (!(name.equalsIgnoreCase("q"))) {
            System.out.println("Telebe adlarini daxil edin:\nSistemden cixmaq ucun q daxil edin...");
            name = sc.nextLine();

            if (!(name.equalsIgnoreCase("q"))) {
                students.add(name);
            }
        }
        System.out.println("Telebelerin adlari: " + students);
    }
}
