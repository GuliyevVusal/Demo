package demo.demo16;

public class Day16 {


    public static void main(String[] args) {

        String price1 = "15.30 $";
        String price2 = "11.45 $";

//        System.out.println(price1 + price2); //  15.55 $10.55 $


        final String s1 = price1.replaceAll("\\D", ""); // "\\D" replace all digits with -> ""

        final String s2 = price2.replaceAll("\\D", ""); // "\\D" replace all digits with -> ""

//        System.out.println(s1 + s2);  // 15551055

        System.out.println("Sum: = " + (Double.parseDouble(s1) + Double.parseDouble(s2)) / 100 + "$"); // Sum: = 26.75$

    }

}
