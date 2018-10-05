package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int asciiStart = '0';
        int asciiEnd = asciiStart + 9;
        String[] results = new String[testCases];
        for (int i = 0; i < testCases; i++) {
            String stringToRearrange = scanner.next();
            results[i] = rearrange(stringToRearrange, asciiStart, asciiEnd);
        }
        for (String result : results) {
            System.out.println(result);
        }
    }

    private static String rearrange(String s, int asciiStart, int asciiEnd) {
        String newOne = "";
        int sum = 0;
        char[] chars = s.toCharArray();
        for (int j = 0; j < chars.length; j++) {
            if (asciiStart <= chars[j] && chars[j] <= asciiEnd) {
                sum += chars[j] - asciiStart;
            } else {
                newOne += chars[j];
            }
        }
        newOne = sortString(newOne);
        newOne += sum;
        return newOne;
    }

    private static String sortString(String inputString) {
        // convert input string to char array
        char tempArray[] = inputString.toCharArray();

        // sort tempArray
        Arrays.sort(tempArray);

        // return new sorted string
        return new String(tempArray);
    }
}
