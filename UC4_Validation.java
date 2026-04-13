import java.util.Scanner;

public class UC4_Validation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = sc.nextLine();

        if (name.length() < 3) {
            System.out.println("Invalid name. Must be at least 3 characters.");
        } else {
            System.out.println("Valid name!");
        }
    }
}