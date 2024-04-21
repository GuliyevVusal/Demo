package demo.demo30;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day30 {
    public static void main(String[] args) {


        List<String> list = new ArrayList<>(Arrays.asList("Gunel", "Gunay", "Gulsen", "Gunes", "Gultekin"));

        int sumOfCharcaters = 0;

        for (int i = 0; i < list.size(); i++) {
            sumOfCharcaters += list.get(i).length();
        }
        System.out.println("Listde Toplam Character sayisi: " + sumOfCharcaters);
    }
}
