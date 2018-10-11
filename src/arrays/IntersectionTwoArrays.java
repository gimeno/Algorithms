package arrays;

import java.util.HashSet;
import java.util.Set;

/**
 * @author Roberto on 11/10/2018
 * Print the intersection of two arrays
 */
public class IntersectionTwoArrays {

    public static void main(String[] args) {
        int arr1[] = {7, 1, 5, 2, 3, 6};
        int arr2[] = {3, 8, 6, 20, 7};

        System.out.println("Intersection of two arrays is : ");
        printIntersection(arr1, arr2);
        System.out.println();
        printIntersectionBruteForce(arr1, arr2);
    }

    /**
     * Time: O(n+m)
     * Space: O(n)
     */
    private static void printIntersection(int[] arr1, int[] arr2) {

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            integers.add(arr1[i]);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (integers.contains(arr2[i])) {
                System.out.print(arr2[i] + " ");
                integers.remove(arr2[i]);
            }
        }

    }

    /**
     * Time: O(n^m)
     * Space: O(n)
     */
    private static void printIntersectionBruteForce(int[] arr1, int[] arr2) {

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j] && !integers.contains(arr1[i])) {
                    integers.add(arr1[i]);
                    System.out.print(arr1[i] + " ");
                }
            }
        }

    }

}
