package demo.demo26;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day26 {
    public static void main(String[] args) {

        List<String> students = new ArrayList<>(Arrays.asList("Orxan", "Niyazi", "Serxan", "Israfil", "Tural"));

        String theLongest = students.get(0);

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).length() > theLongest.length()) {
                theLongest = students.get(i);
            }
        }
        System.out.println(theLongest);
    }
}
