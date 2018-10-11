package google;

public class PrimeNumbers {

    public static void main(String[] args) {
        printPrimeNumbers(1000);
    }

    private static void printPrimeNumbers(int number) {
        int counter = 0;
        for (int i = 1; i < number; i++) {
            for (int num = i; num >= 1; num--) {
                if (i % num == 0) {
                    counter++;
                }
            }
            if (counter == 2) {
                System.out.print(i + " ");
            }
            counter = 0;
        }
    }
}
