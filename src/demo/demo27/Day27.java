package demo.demo27;

import java.util.ArrayList;
import java.util.List;

public class Day27 {
    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 4, 2, 3, 4, 5, 3, 2, 4, 6, 8, 4, 3, 2, 4, 6}; // UniqueList: [1, 2, 3, 4, 5, 6, 8]
        method(array);
    }

    public static int[] method(int[] arr) {

        List<Integer> uniqueList = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (!uniqueList.contains(arr[i])) {
                uniqueList.add(arr[i]);
            }
        }
        System.out.println("UniqueList: " + uniqueList);

        return arr;
    }
}
