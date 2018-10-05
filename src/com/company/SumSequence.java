package com.company;

/**
 * Created by Roberto on 21/03/2018.
 */
public class SumSequence {

    public static void main(String[] args) {
        System.out.println(sumSequence(new int[]{23, 5, 4, 7, 2, 11}, 20));
        System.out.println(sumSequence(new int[]{1, 3, 5, 23, 2}, 8));
        System.out.println(sumSequence(new int[]{1, 3, 5, 23, 2}, 7));
    }

    private static boolean sumSequence(int[] array, int target) {
        int start = 0;
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
            while (sum > target) {
                sum -= array[start];
                start++;
            }
            if (sum == target) {
                return true;
            }
        }
        return false;

    }

}
