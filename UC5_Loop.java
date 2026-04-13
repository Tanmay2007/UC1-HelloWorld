import java.util.Scanner;

public class UC5_Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name;

        do {
            System.out.print("Enter your name: ");
            name = sc.nextLine();

            if (name.length() < 3) {
                System.out.println("Invalid name. Try again.");
            }

        } while (name.length() < 3);

        System.out.println("Hello, " + name + "!");
    }
}