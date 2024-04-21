package demo.demo8;

import java.util.Arrays;

public class Day8 {
    public static void main(String[] args) {

        int[] random = {16, -41, 112, 10, -110};
        int x = 10;
        int y = Arrays.binarySearch(random, x);
        System.out.println(y);

        // burada mutleq birinci sort olunmaliydi ona gore dogruda cavab vere biler yalnis cavabda vere biler bize
        // run -1 geldi ) hec tapa bilmedi. Helli ise Binary Search Tree-dedir bu bize javada elementlerin daha tez
        // tapa bilmekde komek edir misal 9 elementimiz var 7,15,17,22,27,45,60,75,30 bu arrayin icinde 27-ni axtarsaq
        // basdan basliyib baxa baxa gedib ve 27-ni tapariq normalda tek-tek baxa baxa gedirik ferz edek ki 1000 element
        // var ve bu elementlerin icersinen hansinisa tapa bilmek ucun serf olunan zamani israfi coxdur bunun ucun java
        // Binary Search Tree ile etmeyi tovsiye edir ilk once root deyer gotururuk tutaqki 30 bunnan kicik elementler
        // soluna boyuk elementler ise sagina dogru shaxelenir axtarmaga 30 dan basladiqda misal ucun 45-i axtaririq
        // gelir 30 baxir 45 boydur 30 dan kecir sag terefe sol teref tamamile unuduldu sonra qarsisina cixan reqemin
        // mes: 60 cixdi qarsisina 45 ile 60 i qarsilasdirir 60-dan kicikdir kecir 60-in soluna ve tapdi 45
        // 2-ci defede tapdi 45-i  30->60->45 Binary Tree de ilk once baslangic Node olmalidir sonra saga noddan boyuk
        // sola noddan kicik elementler dagidilir
        // {16, -41, 112, 10, -110} burada java binarySearch axtarmasina uygun olmasi ucun ortadan basliyir yeni 112-den
        // axtardigimiz reqem 10-dur 10 kicik oldugu ucun 112 den sola gedir -41 bunun sagina baxir ve tapa bilmir
        // -1 verir

        int[] random2 = {16, -41, 112, 10, -110};

        Arrays.sort(random2);

        System.out.println("Sorted Arrays: ");

        for (int nums : random2) {
            System.out.print(nums + " ");
        }
        System.out.println();

        int x2 = 10;
        int y2 = Arrays.binarySearch(random2, x2);
        System.out.println(y2);

/*
/
        String[] fruits = {"bannana", "apple", "pears", "grapes" };

        Arrays.sort(fruits);

        System.out.println("Sorted fruits: ");

        for (String frut : fruits) {
            System.out.println(frut);

            // Stringleri sorta etdikde ise Alfebetik olaraq sort edir
            // apple
            // bannana
            // grapes
            // pears
        }

 */

    }
}
