package M1;

import java.util.ArrayList;
import java.util.Arrays;

public class U13 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList<Double>(Arrays.asList(2.0, 4.2, 7.4, 4.3, 5.8, 6.0));

        Double average = average(list);

        System.out.println("average = " + average);
    }
    public static double average(ArrayList<Double> arrayList) {
        double total = 0;

        for (Double value : arrayList) {
            total += value;
        }

        return total;
    }
}
