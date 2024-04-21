package demo.demo7;

public class Day7 {

    public static void main(String[] args) {


        int[] arr1 = {1, 2, 053, 4};

        int[][] arr2 = {{1, 2, 4}, {2, 2, 1}, {0, 43, 2}};

        System.out.print(arr1[3] == arr2[0][2]);// arr1-in 3-cu indexinde 4 var arr2-nin 0-ci indexindeki array 4 true;

        System.out.print(" " + (arr1[2] == arr2[2][1]));// burada  arr1-in 2-ci elementi 053-dur ve arr2-nin 2-ci
        // indexindeki 1-ci element 43 dur yeni 053 == 43; Burada  intelij isareli gosterir 053-u cunki intelij 0 ile
        // basliyan reqem yazdiqda java bunu 8-lik sistemde (octal) kimi qebul edir yeni bu 8 lik sistemdeki 053 -dur
        // bunun decimal(10-luq) sistemde qarsiligi 3*1 = 3; + 8 * 5 = 40; + 0 * 64 = 0;yeni 053 * 6481; 0 + 40 + 3 = 43
        // 053 qarsiligi decimal(10-luq) sistemde qarsiligi 43 dur bu da true return edecek

        /*
          int[][] arr2 = {{1, 2, 3}, {10, 7}} = new int[2][]; // compile time eror verir cunki inner arraylar ferqli
        // size-de ola bilmez. olmasi ucun gerek inner arraylarin 2-side eyni size-de olsun

        int[][] arr = {{1, 2, 3}, {10, 7}};
        // {  inner array index = 0 {1, 2, 3} ve inner array index = 1 {10, 7}  }  outer array

        System.out.println(arr[0][2]); // 3 outer arrayin 0-ci indexindeki 2-ci elementi verecek bize

        System.out.println(Arrays.toString(arr[1])); // inner arraylerden birini capa vermek ucun yeni ki outer arrayin
        // 1 indexindeki inner array capa vermek ucun Arrays clasinin toString methodu istifade ederek cap etdik [10, 7]

        System.out.println(Arrays.deepToString(arr));// deepToString ile array nece mertebeli olsada cap ede bilerik
        // [[1, 2, 3], [10, 7]]
        /
         */

    }
}
