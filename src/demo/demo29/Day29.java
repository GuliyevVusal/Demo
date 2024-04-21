package demo.demo29;

import java.util.ArrayList;
import java.util.List;

public class Day29 {
    public static void main(String[] args) {

        System.out.println(method(20)); // [1, 2, 4, 5, 10, 20]

    }
    public static List<Integer> method(int num) {

        List<Integer> numbers = new ArrayList<>();

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                numbers.add(i);
            }
        }
        return numbers;
    }
}
