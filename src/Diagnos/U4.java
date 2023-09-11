package Diagnos;

import java.util.Scanner;

public class U4 {
    /**
     * Beräknar pootensen av två heltal, x^y
     *
     * @param bas Basen
     * @param exp Exponenten
     * @return Potensen
     */
    public static int pot(int bas, int exp ) {
        int potens = 1;

        for (int i = 0; i < exp; i++) {
            potens *= bas;
        }

        return potens;
    }

    /**
     * Main - Testar metoden exp()
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Mata in basen:");
        int x = input.nextInt();

        System.out.println("Mata in exponenten");
        int y = input.nextInt();

        int potensen = pot(x, y);

        System.out.println(x + "^" + y + " = " + potensen);
    }

}
