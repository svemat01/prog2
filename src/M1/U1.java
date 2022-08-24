package M1;

import java.util.Scanner;

public class U1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your first number\n: ");
        double n1 = scanner.nextFloat();

        System.out.print("Enter your second number: ");
        double n2 = scanner.nextFloat();

        double result = n1 + n2;

        System.out.println("Result: " + result);

    }
}
