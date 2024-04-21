package demo.demo21;

public class Day21 {

    public static void main(String[] args) {

        int[][] arr = {{2, 3, 4}, {4, 5, 6}, {5, 6, 7}, {3, 6, 9}};
        method(arr);
    }


    public static void method(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) { // outer array

            for (int j = 0; j < arr[i].length; j++) { // inner array

                if (arr[i][j] % 2 == 0) {
                    sum += arr[i][j];
                }
            }
        }
        System.out.println(sum);
    }
}
