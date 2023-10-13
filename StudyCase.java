import java.util.Collections;
public class StudyCase {
    public static void main(String[] args) {
        
        String equals = String.join("", Collections.nCopies(63, "="));

        System.out.println(equals);
        System.out.printf("%" + 45 + "s%n", "Welcome to Ordinal Calculation!");
        System.out.println(equals);

        if (args.length < 2) {
            System.out.println("Usage: java StudyCase <arg1> <arg2> [arg3 ...]");
            return;
        }

        int result = 1;
        for (String arg : args) {
            int num = Integer.parseInt(arg);
            result *= num;
        }
        System.out.println("");
        System.out.println("Your input is " + String.join(" * ", args));
        System.out.println("");
        System.out.println(equals);
        
        System.out.printf("%" + 33 + "s%n", "Result");
        System.out.println(equals);
        System.out.println("");

        System.out.print(result + " - ");
        if (result % 2 == 0) {
            System.out.println("Genap");
        } else {
            System.out.println("Ganjil");
        }
    }
}