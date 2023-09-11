package M1;

import java.util.ArrayList;
import java.util.Arrays;

public class U8 {
    public static void main(String[] args) {

        ArrayList<Integer> arrayList = new ArrayList(Arrays.asList(1, 3, 7, 9, 11));

        for (int arrayListLoop = 0; arrayListLoop < arrayList.size(); arrayListLoop++) {
            System.out.println("arrayListLoop = " + arrayList.get(arrayListLoop));
        }

        for (int reverseArrayListLoop = arrayList.size() - 1; reverseArrayListLoop >= 0; reverseArrayListLoop--) {
            System.out.println("reverseArrayListLoop = " + arrayList.get(reverseArrayListLoop));
        }
    }
}
