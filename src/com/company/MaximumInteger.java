package com.company;

import java.util.Scanner;

/**
 * Created by Roberto on 10/03/2018.
 */
public class MaximumInteger {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String numbers = "";
        int[] results = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            numbers = scanner.next();
            results[i] = maxValue(numbers);
        }
        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int maxValue(String numbers) {
        if (numbers == null || numbers.equals("")) {
            return 0;
        }
        int value = Character.getNumericValue(numbers.charAt(0));
        for (int i = 1; i < numbers.length(); i++) {
            if ((numbers.charAt(i) == '0' || numbers.charAt(i) == '1')
                    || (numbers.charAt(i - 1) == '0' || numbers.charAt(i - 1) == '1')) {
                value += Character.getNumericValue(numbers.charAt(i));
            } else {
                value *= Character.getNumericValue(numbers.charAt(i));
            }
        }

        return value;
    }
}
