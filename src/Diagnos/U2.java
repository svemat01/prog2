package Diagnos;

public class U2 {
    public static void main(String[] args) {
        int[] array = {4, 7, 2, 9, 11, 1, 7, 8, 8, 3, 5, 6, 7, 0, 3};
        int arraySum = sum(array);
        System.out.println("Sum: " + arraySum);
    }

    public static int sum(int[] array) {
        int current = 0;

        for (int i = 0; i < array.length; i++) {
            current += array[i];
        }

        return current;
    }
}
