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

        System.out.println(Arrays.toString(zerosToLeft(new int[]{0,0,3,0,8,9,0,4,8,2})));
//        System.out.println(Arrays.toString(zerosToLeft2(new int[]{0,0,3,0,8,9,0,4,8,2})));
//        System.out.println(Arrays.toString(zerosToRight(new int[]{0,0,3,0,8,9,0,4,8,2})));
        System.out.println(Arrays.toString(zerosToRight2(new int[]{0,0,3,0,8,9,0,4,8,2})));
//        System.out.println(Arrays.toString(zerosToRight3(new int[]{0,0,3,0,8,9,0,4,8,2})));
    }

    private static int[] zerosToRight(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while (right >= left) {
            if (arr[left] != 0) {
                left++;
            }

            if (arr[right] != 0 && arr[left] == 0) {
                arr[left] = arr[right];
                right--;
                left++;
            }
        }
        System.out.println(left);
        return arr;
    }

    private static int[] zerosToRight2(int[] arr) {
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
        System.out.println(d);
        while (d < arr.length) {
            arr[d] = 0;
            d++;
        }
        return arr;
    }

    private static int[] zerosToRight3(int[] array) {
        Arrays.sort(array);
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = temp;
        }
        return array;
    }

    private static int[] zerosToLeft2(int[] arr) {
        Arrays.sort(arr);
        return arr;
    }

    private static int[] zerosToLeft(int[] arr) {
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
        System.out.println(arr.length - d);
        while (d >= 0) {
            arr[d] = 0;
            d--;
        }
        return arr;
    }

}
