package M1;

public class U5 {
    public static void main(String[] args) {
        Integer whileLoop = 0;
        while (whileLoop < 5) {
            whileLoop++;

            System.out.println("whileLoop = " + whileLoop);
        }

        Integer doWhileLoop = 0;

        do {
            doWhileLoop++;

            System.out.println("doWhileLoop = " + doWhileLoop);
        } while (doWhileLoop < 5);

        for (int forLoop = 1; forLoop <= 5; forLoop++) {
            System.out.println("forLoop = " + forLoop);
        }
    }
}
