package M1;

import java.util.Scanner;

public class U2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        double length = 0;

        System.out.print("Enter your height:\n> ");
        try {
            length = scanner.nextDouble();
        } catch (Exception e) {
            System.out.println("Invalid input...");
            System.exit(1);
        }

        if (length > 2) {
            System.out.println("Basket Player");
        } else {
            System.out.println("Handball Player");
        }
    }
}
