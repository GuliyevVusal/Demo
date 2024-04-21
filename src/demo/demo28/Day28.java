package demo.demo28;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day28 {
    public static void main(String[] args) {

        List<String> names = new ArrayList<>(Arrays.asList("Vasif", "Taleh", "Bextiyar", "Tural", "Turkan"));
        String unwanted = "T";
        System.out.println(method(names, unwanted)); // [Vasif, Bextiyar]

    }

    public static List<String> method(List<String> names, String unwanted) {

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).contains(unwanted)) {
                names.remove(i);
                i--;
            }
        }
        return names;
    }
}
