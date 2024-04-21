package demo.demo6;

public class Day6 {

    public static void main(String[] args) {

        byte a = 40, b = 50;

//      byte sum1 = a + b;        // compile timer eror Required type byte Provided int

//      byte sum2 = (byte) a + b; // compile timer eror Required type byte Provided int

//      byte sum3 = a + (byte) b;   // java castingi 1-ci edir

//      byte sum4 = (byte) a + (byte) b;// java castingi 1-ci edir a-ni byte cevirse yene de 40 olacaq
        // b-de cast edib 50 alacaq ikisini topladiqda 40 + 50-ni cemini int kimi gorur comile time eror

        byte sum5 = (byte) (a + b); // 1-ci (a+b) nin necitesinin necitcesini byte cast edirik

    }
}
