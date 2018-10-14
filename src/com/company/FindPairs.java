package com.company;

import java.util.*;

/**
 * Created by Roberto on 11/03/2018.
 */
public class FindPairs {
    public static void main(String[] args) {
        System.out.println(searchPairsBruteForce(new int[]{1,4,5,3,2,8}, new int[]{1,2,3,10,5}, 6));
        System.out.println(searchPairsBinarySearch(new int[]{1,4,5,3,2,8}, new int[]{1,2,3,10,5}, 6));
        System.out.println(searchPairsHash(new int[]{1,4,5,3,2,8}, new int[]{1,2,3,10,5}, 6));
    }

    private static void inputArrays() {
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
                results[test] = searchPairsBruteForce(arr1, arr2, x);
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

    private static String searchPairsBruteForce(int[] arr1, int[] arr2, int x) {
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

    /**
     * Second array must be ordered
     */
    private static String searchPairsBinarySearch(int[] arr1, int[] arr2, int x) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return "-1";
        }

        List<String> pairs = new ArrayList<>();
        int temp;
        for (int i = 0; i < arr1.length; i++) {
            temp = Arrays.binarySearch(arr2, x - arr1[i]);
            if (temp > 0) {
                pairs.add(arr1[i] + " " + arr2[temp]);
            }
        }

        if (pairs.size() == 0) {
            return "-1";
        }

        return String.join(", ", pairs);
    }

    private static String searchPairsHash(int[] arr1, int[] arr2, int x) {
        if (arr1 == null || arr2 == null || arr1.length == 0 || arr2.length == 0) {
            return "-1";
        }

        HashMap<Integer, Integer> integerHashMap = new HashMap<>();
        List<String> pairs = new ArrayList<>();
        for (int i = 0; i < arr1.length; i++) {
            integerHashMap.put(x - arr1[i], i);
        }

        for (int i = 0; i < arr2.length; i++) {
            if (integerHashMap.containsKey(arr2[i])) {
                pairs.add(arr1[integerHashMap.get(arr2[i])] + " " + arr2[i]);
            }
        }

        if (pairs.size() == 0) {
            return "-1";
        }

        Collections.reverse(pairs);
        return String.join(", ", pairs);
    }


}
