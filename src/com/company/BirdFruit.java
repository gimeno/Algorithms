package com.company;

import java.util.Scanner;

/**
 * Created by Roberto on 10/03/2018.
 */
public class BirdFruit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        int[] results = new int[testCases];
        for (int i = 0; i < testCases; i++) {
            int trees = scanner.nextInt();
            int seconds = scanner.nextInt();
            int[] treeValues = new int[trees];
            for (int j = 0; j < trees; j++) {
                treeValues[j] = scanner.nextInt();
            }
            results[i] = maxPossibleValue(trees, seconds, treeValues);
        }
        for (int result : results) {
            System.out.println(result);
        }
    }

    private static int maxPossibleValue(int trees, int seconds, int[] treeValues) {
        if (seconds > trees) {
            seconds = trees;
        }
        int maxValue = 0;
        int temp;
        for (int i = 0; i < treeValues.length; i++) {
            temp = 0;
            for (int s = 0; s < seconds; s++) {
                temp += treeValues[(i + s) % treeValues.length];
            }
            if (maxValue < temp) {
                maxValue = temp;
            }
        }
        return maxValue;
    }
}
