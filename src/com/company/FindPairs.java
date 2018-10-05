package com.company;

import java.util.*;

/**
 * Created by Roberto on 11/03/2018.
 */
public class FindPairs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        String[] results = new String[testCases];
        int n, m, x;
        int[] arr1, arr2;
        for (int test = 0; test < testCases; test++) {
            n = scanner.nextInt();
            m = scanner.nextInt();
            x = scanner.nextInt();
            arr1 = createArray(n, scanner);
            arr2 = createArray(m, scanner);
            if (arr1 != null && arr2 != null) {
                Arrays.sort(arr1);
                Arrays.sort(arr2);
                results[test] = searchPairs(arr1, arr2, x);
            } else {
                results[test] = "-1";
            }
        }

        for (String result : results) {
            System.out.println(result);
        }
    }

    private static int[] createArray(int n, Scanner scanner) {
        if (n < 0) {
            return null;
        }

        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }
        return arr;
    }

    private static String searchPairs(int[] arr1, int[] arr2, int x) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return "-1";
        }
        List<String> pairs = new ArrayList<>();

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] + arr2[j] == x) {
                    pairs.add(arr1[i] + " " + arr2[j]);
                }
            }
        }

        if (pairs.size() == 0) {
            return "-1";
        }

        return String.join(", ", pairs);
    }


}
