import java.util.Scanner;

public class UC7_MainApp {

    public static String getValidName() {
        Scanner sc = new Scanner(System.in);
        String name;

        do {
            System.out.print("Enter your name: ");
            name = sc.nextLine();

            if (name.length() < 3) {
                System.out.println("Invalid name. Try again.");
            }

        } while (name.length() < 3);

        return name;
    }

    public static void greetUser(String name) {
        System.out.println("Welcome, " + name + "!");
    }

    public static void main(String[] args) {
        String name = getValidName();
        greetUser(name);
    }
}