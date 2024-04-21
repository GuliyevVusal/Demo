package demo.demo10;

import java.util.ArrayList;
import java.util.List;

public class Day10 {
    public static void main(String[] args) {

        int[] arr = {6, 9, 8};

        List<Integer> list = new ArrayList<>();
        list.add(arr[0]);
        list.add(arr[2]);
        list.set(1, arr[1]);
        list.remove(0);

        System.out.println(list);
        // list.add edirik arr-daki 0-ci indexindeki element elave edildi yeni 6;
        // list.add edirik arr-daki 2-ci indexdeki element elave edildi yeni 8
        // list.set(1, arr[1]);  listin 1-ci indexindeki elemente arr-nin 1-ci indexindeki element menimsedilib yeni
        // 8 in yerine 9 menimsendi
        // list.remove(0); yeni 6-ni remove etdik
        // run [9]
    }
}
