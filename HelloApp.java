import java.util.Scanner;

public class HelloApp {

    // UC2: Take input from user
    public static String getUserName() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your name: ");
        return sc.nextLine();
    }

    // UC3: Display greeting
    public static void greetUser(String name) {
        System.out.println("Hello, " + name + "!");
    }

    // UC4: Validate input
    public static boolean isValidName(String name) {
        return name != null && name.length() >= 3;
    }

    // UC5: Loop until valid input
    public static String getValidName() {
        String name;
        do {
            name = getUserName();
            if (!isValidName(name)) {
                System.out.println("Invalid name. Try again.");
            }
        } while (!isValidName(name));
        return name;
    }

    // UC6: Main logic
    public static void main(String[] args) {
        String name = getValidName();
        greetUser(name);
    }
}