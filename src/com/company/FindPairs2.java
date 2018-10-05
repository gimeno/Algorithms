package com.company;

import java.util.*;

/**
 * Created by Roberto on 11/03/2018.
 */
public class FindPairs2 {
    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int testCases = scanner.nextInt();
//        String[] results = new String[testCases];
//        int n, m, x;
//        int[] arr1, arr2;
//        for (int test = 0; test < testCases; test++) {
//            n = scanner.nextInt();
//            m = scanner.nextInt();
//            x = scanner.nextInt();
//            arr1 = createArray(n, scanner);
//            arr2 = createArray(m, scanner);
//            if (arr1 != null && arr2 != null) {
//                Arrays.sort(arr1);
//                Arrays.sort(arr2);
//                results[test] = searchPairs(arr1, arr2, x);
//            } else {
//                results[test] = "-1";
//            }
//        }
//
//        for (String result : results) {
//            System.out.println(result);
//        }

//        System.out.println(searchPairs(new int[]{0,1,2}));
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

    private static String searchPairs2(int[] arr1, int[] arr2, int x) {
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
