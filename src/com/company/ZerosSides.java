package com.company;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Roberto on 12/03/2018.
 */
public class ZerosSides {

    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        int n = scanner.nextInt();
//        int[] arr = new int[n];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = scanner.nextInt();
//        }
//        System.out.println(Arrays.toString(zerosToLeft(arr)));
//        System.out.println(Arrays.toString(zerosToRight3(arr)));

        System.out.println(Arrays.toString(new int[]{0, 0, 3, 0, 8, 9, 0, 4, 8, 2}));
        System.out.println("To Left lineal\t\t\t" + Arrays.toString(zerosToLeftLineal(new int[]{0, 0, 3, 0, 8, 9, 0, 4, 8, 2})));
        System.out.println("To Left sorting\t\t\t" + Arrays.toString(zerosToLeftSorting(new int[]{0, 0, 3, 0, 8, 9, 0, 4, 8, 2})));
        System.out.println("To Left brute force\t\t" + Arrays.toString(zerosToLeftBruteForce(new int[]{0, 0, 3, 0, 8, 9, 0, 4, 8, 2})));
        System.out.println("To right lineal\t\t\t" + Arrays.toString(zerosToRightLineal(new int[]{0, 0, 3, 0, 8, 9, 0, 4, 8, 2})));
        System.out.println("To right sorting\t\t" + Arrays.toString(zerosToRightSorting(new int[]{0, 0, 3, 0, 8, 9, 0, 4, 8, 2})));
        System.out.println("To right brute force\t" + Arrays.toString(zerosToRightBruteForce(new int[]{0, 0, 3, 0, 8, 9, 0, 4, 8, 2})));
    }

    private static int[] zerosToRightLineal(int[] arr) {
        int p = 0;
        int d = 0;
        while (p < arr.length) {
            if (arr[p] != 0) {
                arr[d] = arr[p];
                p++;
                d++;
            } else {
                p++;
            }
        }
        while (d < arr.length) {
            arr[d] = 0;
            d++;
        }
        return arr;
    }

    private static int[] zerosToRightSorting(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    private static int[] zerosToRightBruteForce(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                for (int j = arr.length - 1; j > i; j--) {
                    if (arr[j] != 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }

    private static int[] zerosToLeftSorting(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    private static int[] zerosToLeftLineal(int[] arr) {
        int p = arr.length - 1;
        int d = p;
        while (p >= 0) {
            if (arr[p] != 0) {
                arr[d] = arr[p];
                d--;
                p--;
            } else {
                p--;
            }
        }
        while (d >= 0) {
            arr[d] = 0;
            d--;
        }
        return arr;
    }

    private static int[] zerosToLeftBruteForce(int[] arr) {
        int temp;
        for (int i = arr.length - 1; i >= 0; i--) {
            if (arr[i] == 0) {
                for (int j = 0; j < i; j++) {
                    if (arr[j] != 0) {
                        temp = arr[i];
                        arr[i] = arr[j];
                        arr[j] = temp;
                    }
                }
            }
        }

        return arr;
    }

}
