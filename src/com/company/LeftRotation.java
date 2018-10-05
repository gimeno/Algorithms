package com.company;

import java.util.Scanner;

/**
 * Created by Roberto on 15/03/2018.
 */
public class LeftRotation {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        int diff = n - k;
        int newPosition;
        for(int a_i=0; a_i < n; a_i++){
            newPosition = (a_i + diff) % n;
            a[newPosition] = in.nextInt();
        }

        for (int i : a) {
            System.out.print(i + " ");
        }

    }
}
