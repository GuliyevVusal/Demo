package demo.demo4;

public class Day4 {
    public static void main(String[] args) {


        String str1 = "Java";
        String str2 = new String("java");

        if (str2.equals(str1.toLowerCase())) // 1-ci str1.toLowerCase icra olunacaq moterizenin ici kicik java
        // olacaq ve str2.equals(str1) = true;

        {
            System.out.println("Equal"); // Equal
        } else {
            System.out.println("Not Equal");
        }
    }
}

/*
 A)
        String str1 = "Java"; //
        String str2 = new String("java");

        str1.toLowerCase(); // hec bir menimsetme olmadigi ucun yalniz bu setre aitdi str1-in neticesi

        if (str1.equals(str1.toLowerCase())) { // str1 = Java equals str1 = java false verecek

            System.out.println("Equal");
        } else {
            System.out.println("Not Equal"); // Not Equal
        }
____________________________________________________________________________________________
 B)
            String str1 = "Java"; //
        String str2 = new String("java");

        if (str1.toLowerCase() == str2.toLowerCase()) {
           // str1 = java; == str2 = java; fals;

            System.out.println("Equal");
        } else {
            System.out.println("Not Equal"); // Not Equal
_________________________________________________________________________________________________
/ C)
        String str1 = "Java"; //
        String str2 = new String("java"); // 2 String yaranir burada 1-ci ("Java") avtomatik
        // Jvm terefinden 2-ci ise new String ("Java");

        str1.toLowerCase();// toLowerCase bize bir String qaytarir biz bu str1 -i hecneye menimsetmediyimiz
        System.out.println(str1);// ucun burada str1 qalici olaraq deyismez yeni sadece bu setrde str1 kicik
        // java olaraq qalar menimsetme etmediyimiz ucun println(str1); versek
        // Boyuk Java oldugunu gorecik eger qalici olmagini sitiyirikse
        // String lowerCase = str1.toLowerCase menimsetmeliydik

        if (str1 == str2) { // Not Equal
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
 */
