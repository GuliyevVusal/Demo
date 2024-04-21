package demo.demo25;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Day25 {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>(Arrays.asList(3, 5, 7, 3, 2, 5, 84, 2, 4, 99, 3, 33, 5, 5));

        int sum = 0;

        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        System.out.println(sum);
    }
}
