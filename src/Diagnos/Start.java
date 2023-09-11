package Diagnos;

import java.util.Scanner;

public class Start {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        boolean cont = true;

        while (cont) {
            System.out.println("Välj en uppgift att köra [1,2,3,4]\nVälj -1 för att avsluta.");

            int uppgift = input.nextInt();


            switch (uppgift) {
                case 1:
                    System.out.println("====\n U1\n====");
                    U1.main(args);
                    break;

                case 2:
                    System.out.println("====\n U2\n====");
                    U2.main(args);
                    break;

                case 3:
                    System.out.println("====\n U3\n====");
                    U3.main(args);
                    break;

                case 4:
                    System.out.println("====\n U4\n====");
                    U4.main(args);
                    break;

                case -1:
                    cont = false;
                    break;

                default:
                    System.out.println(uppgift + "är inte ett alternativ...");
            }

            System.out.println("=============================");
        }
    }
}
