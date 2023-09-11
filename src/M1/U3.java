package M1;

import java.util.Scanner;

public class U3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer dividend = 0, divisor = 0;

        try {
            System.out.print("Enter your dividend:\n> ");
            dividend = scanner.nextInt();

            System.out.print("Enter your divisor:\n> ");
            divisor = scanner.nextInt();
        } catch (Exception e) {
            System.out.println("Invalid input...");
            System.exit(1);
        }

        if (divisor == 0) {
            System.out.println("Divisor can't be 0");
            System.exit(1);
        }

        System.out.println("Answer: " + dividend / divisor);
    }
}
