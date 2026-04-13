import java.util.Scanner;

public class UC6_Methods {

    public static String getName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return sc.nextLine();
    }

    public static boolean isValid(String name) {
        return name.length() >= 3;
    }

    public static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void main(String[] args) {
        String name;

        do {
            name = getName();
            if (!isValid(name)) {
                System.out.println("Invalid name. Try again.");
            }
        } while (!isValid(name));

        greet(name);
    }
}