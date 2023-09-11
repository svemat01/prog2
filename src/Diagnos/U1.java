package Diagnos;

import java.util.Scanner;

public class U1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ange sida 1:\n> ");
        double sid1 = scanner.nextDouble();

        System.out.print("Ange sida 2:\n> ");
        double sid2 = scanner.nextDouble();

        System.out.print("Ange sida 3:\n> ");
        double sid3 = scanner.nextDouble();

        double omkrets = omk(sid1, sid2, sid3);
        System.out.println("Omkres: " + omkrets);

        double areaOut = area(sid1, sid2, sid3);
        System.out.println("Area: " + areaOut);
    }

    public static double omk(double sid1, double sid2, double sid3) {
        return sid1 + sid2 + sid3;
    }

    public static double area(double sid1, double sid2, double sid3) {
        double a;
        double b;

//        Per pytagoras sats så måste hypotenusan vara längre än båda sidor
        if (sid1 > sid2 && sid1 > sid3) {
            a = sid2;
            b = sid3;
        } else if (sid2 > sid1 && sid2 > sid3) {
            a = sid1;
            b = sid3;
        } else {
            a = sid1;
            b = sid2;
        }

        return (a * b) / 2;
    }
}
