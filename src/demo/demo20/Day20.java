package demo.demo20;

public class Day20 {

    public static void main(String[] args) {

        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 7, 6, 45, 3, 2, 11};
        method(array, 7);
    }


    public static void method(int[] array, int element) {

        int founded = 0;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == element) {
                founded++;
            }
        }
        if (founded == 0) {
            System.out.println("Axtarilan element arrayde movcud deyil..");
        } else {
            System.out.println("Axtardiginiz element: " + element + " ededi " + founded + " defe tekrarlanib");
        }
    }
}
