package demo.demo9;

import java.util.ArrayList;

public class Day9 {
    public static void main(String[] args) {

        ArrayList<Integer> values = new ArrayList<>();
        values.add(4);
        values.add(5);
        values.set(1, 6);
        values.remove(0);

        for (int i = 0; i < values.size(); i++) {
            System.out.println(values.get(i));

            // 9 cu setrde 4 add etdik 10-cu setrde 5 elave etdik sonra 11-ci setrde values.set(1,6) yeni 1-ci indexdeki
            // elemente 6 menimsetdik yeni 5 silindi 6 geldi 12- ci setrde 0-ci index silinir ve run 6 verdi capa
        }
    }
}
