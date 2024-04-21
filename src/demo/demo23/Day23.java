package demo.demo23;

public class Day23 {
    public static void main(String[] args) {

        int[][] arr = {{4}, {4, 5, 6}, {6, 7}, {3, 6, 9}}; // inner arr-lerin son elementlerinin cemi
        method(arr);
    }

    public static void method(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) { // mene lazim olan arr[0],[1],[2],[3]-nin length-1 sonuncularin cemi
            sum += arr[i][arr[i].length - 1];

        }
        System.out.println(sum);
    }
}
