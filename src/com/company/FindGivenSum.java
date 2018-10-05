package com.company;

import java.util.*;

/**
 * Created by Roberto on 12/03/2018.
 */
public class FindGivenSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int sum = scanner.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.println(isThereAPairThatSumA(arr, sum));
    }

    private static boolean isThereAPairThatSumA(int[] arr, int sum) {
        int valueForSum;
        Set<Integer> requiredValues = new HashSet<>();
        for (int i = 0; i < arr.length; i++) {
            if (requiredValues.contains(arr[i])) {
                return true;
            }
            valueForSum = sum - arr[i];
            requiredValues.add(valueForSum);
        }

        return false;
    }
}
