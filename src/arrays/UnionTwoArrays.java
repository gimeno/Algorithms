package arrays;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * @author Roberto on 11/10/2018
 * Print the union of two arrays
 */
public class UnionTwoArrays {

    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};

        System.out.println("Union of two arrays is : ");
        printUnion(arr1, arr2);
        System.out.println();
        printUnionForceBrute(arr1, arr2);
    }

    /**
     *  time: O(n+m)
     *  space: O(n+m)
     */
    private static void printUnion(int[] arr1, int[] arr2) {
        HashSet<Integer> union = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            union.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            union.add(arr2[i]);
        }

        System.out.println(union);
    }

    /**
     * time: O(n + m^n+m)
     * space: O(n + m)
     */
    private static void printUnionForceBrute(int[] arr1, int[] arr2) {
        ArrayList<Integer> integers = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            integers.add(arr1[i]);
        }

        for (int j = 0; j < arr2.length; j++) {
            if (!integers.contains(arr2[j])) {
                integers.add(arr2[j]);
            }
        }

        System.out.println(integers);

    }
}
