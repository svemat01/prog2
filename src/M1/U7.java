package M1;

public class U7 {
    public static void main(String[] args) {
        int[] array = {1, 3, 7, 9, 11};

        for (int arrayLoop = 0; arrayLoop < array.length; arrayLoop++) {
            System.out.println("arrayLoop = " + array[arrayLoop]);
        }

        for (int reverseArrayLoop = array.length - 1; reverseArrayLoop >= 0; reverseArrayLoop--) {
            System.out.println("reverseArrayLoop = " + array[reverseArrayLoop]);
        }
    }
}
