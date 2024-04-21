package demo.demo11;

public class Day11 {
    public static void main(String[] args) {

        int[][] arr = {{2, 3, 4}, {4, 5, 6}, {5, 6, 7}, {3, 6, 9}};

        method(arr);

    }

    public static void method(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) { // outer array-i control edecek

            for (int j = 0; j < arr[i].length; j++) { // inner arry-i control edecek

                sum += arr[i][j];

            }
        }
        System.out.println(sum);
    }
}
