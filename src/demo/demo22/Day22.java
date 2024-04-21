package demo.demo22;

public class Day22 {

    public static void main(String[] args) {

        int[][] arr = {{2, 3, 4}, {4, 5, 6}, {5, 6, 7}, {3, 6, 9}}; // inner arraylarin ilk eleementlerinin cemi
        method(arr);
    }

    public static void method(int[][] arr) {

        int sum = 0;

        for (int i = 0; i < arr.length; i++) { // bizden teleb olunan arr[0][0],arr[1][0],arr[2][0],arr[3][0] si
            // tekrarlanmayan 0,0,0,0-ci elementlerdi 1 forloop ile bu isi gore bilerik

            sum += arr[i][0];
        }
        System.out.println(sum);
    }
}
