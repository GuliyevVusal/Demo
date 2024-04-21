package demo.demo18;

public class Day18 {

    public static void main(String[] args) {

        int[] arr = {23, 45, 12, 78, 54, 1, 97};

        method(arr, 15, 66); // 23 45 54
    }

    public static void method(int[] arr, int minValue, int maxValue) {

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= minValue && arr[i] <= maxValue) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}
