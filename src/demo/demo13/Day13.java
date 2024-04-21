package demo.demo13;

public class Day13 {

    public static void main(String[] args) {
        final String newFoo = foo("orxan", "memmedov", "123323456786");
        System.out.println(newFoo);  // O**** M******* ************6786

        final String replace = newFoo.replace("*", "#");
        System.out.println(replace); // O#### M####### ############6786
    }

    public static String foo(String name, String surname, String cartNumber) {

        String hiddenCartNumber = "************" + cartNumber.substring(8);
        String ready = String.format("%s%s %s%s %s",
                Character.toUpperCase(name.charAt(0)),
                name.substring(1).replaceAll("\\w", "*"),
                Character.toUpperCase(surname.charAt(0)),
                surname.substring(1).replaceAll("\\w", "*"),
                hiddenCartNumber);

        return ready;
    }
}

