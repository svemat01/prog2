package M1;

import java.util.ArrayList;

public class U13 {
    public static void main(String[] args) {
        ArrayList<Double> list = new ArrayList();
        list.add(1.6);
        list.add(3.6);
        list.add(4.4);
        list.add(7.3);
        list.add(3.2);
        list.add(9.4);

        double average = average(list);

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
