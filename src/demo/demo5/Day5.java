package demo.demo5;

public class Day5 {
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;
        num1 = num2;
        num2 = 77;
        System.out.println(num1); // 20


/*
B)
        String[] city1 = {"Baku", "Gence", "Qebele"};
        String[] city2 = {"Sheki", "Quba", "Qazax"};

        city1 = city2; // 2-side eyni referansdi

        city1[0] = "Lenkeran";
        System.out.println(city2[0]); // Lenkeran
__________________________________________________________________
A)
        String[] city = {"Baku", "Gence", "Qebele"};
        city = new String[4]; // new
        city[3] = "Quba";
        System.out.println(city[1]); // null
/
 */
    }
}
