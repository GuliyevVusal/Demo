package demo.demo3;

public class Day3 {
    public static void main(String[] args) {

        final char a = 'A', d = 'D';

        char grade = 'B';

        switch (grade) {

            case a:
            case 'B': System.out.print(" great ");
            case 'C':System.out.print(" good "); break;
            case d:break;
            case 'F': System.out.println(" not good "); break;

        }
    }
}
