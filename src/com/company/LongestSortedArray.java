package com.company;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Roberto on 21/03/2018.
 */
public class LongestSortedArray {

    public static void main(String[] args) {
        System.out.println(longestConsecuted(new int[]{1,2,3,4,7,3,5,6}));
        System.out.println(longestConsecuted(new int[]{1,2,3,4,7,3,5,6,8,10,20,15}));
        System.out.println(longestConsecuted(new int[]{2,1}));
        System.out.println(longestConsecuted(new int[]{8,7,6,9,10,15,30,40,80,1,2,3,4,7,3,5,6}));
        System.out.println(longestConsecuted(new int[]{8,7,6,5,4,3,30,20}));
        System.out.println(longestConsecuted(new int[]{8}));

    }

    private static String longestConsecuted(int[] arr) {
        if (arr == null || arr.length == 0) {
            return "";
        }
        int temp = arr[0];
        int firstIndex = 0;
        int firstIndexTemp = 0;
        int lastIndex = 0;
        int lastIndexTemp = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > temp) {
                lastIndexTemp = i;
            } else {
                if ((lastIndex - firstIndex) < (lastIndexTemp - firstIndexTemp)) {
                    firstIndex = firstIndexTemp;
                    lastIndex = lastIndexTemp;
                }
                firstIndexTemp = i;
                lastIndexTemp = i;
            }
            temp = arr[i];
        }

        StringBuilder result = new StringBuilder();
        for (int i = firstIndex; i <= lastIndex; i++) {
            result.append(arr[i]).append(" ");
        }

        return result.toString();
    }
}
