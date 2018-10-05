package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by Roberto on 11/03/2018.
 */
public class LargestFibonacciSubsequence {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testCases = scanner.nextInt();
        List<ArrayList<Integer>> fibonacciNumbers = new ArrayList<>();
        for (int i = 0; i < testCases; i++) {
            int n = scanner.nextInt();
            int[] numbers = new int[n];
            for (int j = 0; j < numbers.length; j++) {
                numbers[j] = scanner.nextInt();
            }
            fibonacciNumbers.add(fibonacciNumbers(numbers));
        }

        for (ArrayList<Integer> numbers : fibonacciNumbers) {
            for (int i = 0; i < numbers.size(); i++) {
                System.out.print(numbers.get(i) + " ");
            }
            System.out.println("");
        }



    }

    private static ArrayList<Integer> fibonacciNumbers(int[] numbers) {
        if (numbers == null || numbers.length == 0) {
            return null;
        }

        ArrayList<Integer> fibonacciNumbers = new ArrayList<>();

        for (int i = 0; i < numbers.length; i++) {
            if (isFibonacci(numbers[i])) {
                fibonacciNumbers.add(numbers[i]);
            }
        }

        return fibonacciNumbers;
    }

    // A utility method that returns true if x is perfect square
    static  boolean isPerfectSquare(int x){
        int s = (int) Math.sqrt(x);
        return (s*s == x);
    }

    // Returns true if n is a Fibonacci Number, else false
    static boolean isFibonacci(int n){
        // n is Fibonacci if one of 5*n*n + 4 or 5*n*n - 4 or both
        // is a perfect square
        return isPerfectSquare(5*n*n + 4) ||
                isPerfectSquare(5*n*n - 4);
    }

}
