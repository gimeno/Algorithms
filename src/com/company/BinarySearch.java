package com.company;

import java.util.Arrays;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        search(arr, 2);
        search(arr, 5);
        search(arr, 8);
        search(arr, 11);
    }

    private static void search(int[] arr, int number) {
        int index = binarySearchRec(arr, number);
//        int index = binarySearch(arr, number);
        if (index > -1) {
            System.out.println("Is " + number + " in index " + index + "? " + (arr[index] == number));
        } else {
            System.out.println("Hey asshole " + number + " is not in the array");
        }
    }

    private static int binarySearch(int[] a, int x) {
        int left = 0;
        int right = a.length - 1;
        int mid;

        while (left <= right) {
            mid = (left + right) / 2;
            if (a[mid] < x) {
                left = mid + 1;
            } else if (a[mid] > x) {
                right = mid - 1;
            } else {
                return mid;
            }
        }
        return -1; // Error
    }

    private static int binarySearchRec(int[] arr, int value) {
        return binarySearch(arr, 0, arr.length - 1, value);
    }

    private static int binarySearch(int[] arr, int lowIndex, int highIndex, int value) {
        if (highIndex >= lowIndex) {

            int index = (highIndex + lowIndex) / 2;

            if (arr[index] == value) {
                return index;
            } else if (arr[index] < value) {
                return binarySearch(arr, index + 1, highIndex, value);
            } else if (arr[index] > value) {
                return binarySearch(arr, lowIndex, index - 1, value);
            }
        }

        return -1;
    }

}
