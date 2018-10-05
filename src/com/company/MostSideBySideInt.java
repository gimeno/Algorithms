package com.company;

/**
 * Created by Roberto on 04/10/2018.
 */
public class MostSideBySideInt {

    public static void main(String[] args) {
        System.out.println(mostSideBySideInt(new int[]{1,2,2,2,2,3,3,3,2}));
    }

    private static int mostSideBySideInt(int[] ints) {
        int previous = ints[0];
        int auxCounter = 0;
        int number = 0;
        int counter = 0;

        for (int i = 0; i < ints.length; i++) {

            if (previous == ints[i]) {
                auxCounter++;
            }

            if (previous != ints[i] && auxCounter > counter) {
                number = previous;
                counter = auxCounter + 1;
                auxCounter = 0;
            }

            previous = ints[i];
        }

        System.out.println(counter);
        return number;
    }
}
