package com.company;

import java.util.Arrays;

public class ReverseArray {

    public static void main(String[] args) {
        Integer[] i = new Integer[]{1, 2, 3};
        System.out.println("Reverse {1, 2, 3} -> " + Arrays.toString(reverseArray(new Integer[]{1, 2, 3})));
        System.out.println("Reverse {A, B, C} -> " + Arrays.toString(reverseArray(new String[]{"A", "B", "C"})));
    }

    private static Object[] reverseArray(Object[] arr) {

        Object temp;
        for (int i = 0; i < arr.length / 2; i++) {
            temp = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - 1 - i] = temp;
        }

        return arr;
    }

}
