package Diagnos;

import java.util.ArrayList;
import java.util.Scanner;

public class U3 {

    public static int sum(ArrayList<Integer> arrayList) {
        int current = 0;

        for (int i = 0; i < arrayList.size(); i++) {
            current += arrayList.get(i);
        }

        return current;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<Integer> arrayList = new ArrayList<>();

        int number = 0;

        System.out.println("Mata in ett antal positiva heltal, avsluta med -1");

        while(number != -1) {
            number = input.nextInt();
            if(number != -1)
                arrayList.add(number);
        }

        System.out.println("Summan = " + sum(arrayList));
    }
}
