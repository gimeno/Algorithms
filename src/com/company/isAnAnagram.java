package com.company;

import java.util.Arrays;
import java.util.HashMap;

public class isAnAnagram {

    public static void main(String[] args) {

        System.out.println("Is GATO GOTA anagram? " + isAnAnagram("GATO", "GOTA"));
        System.out.println("Is GATO GOTON anagram? " + isAnAnagram("GATO", "GOTON"));
        System.out.println("Is GATO TOGA anagram? " + isAnAnagram("GATO", "TOGA"));
        System.out.println("Is GATO TOGI anagram? " + isAnAnagram("GATO", "TOGI"));

        System.out.println("Is geeksforgeeks forgeeksgeeki anagram? " + isAnAnagram2("geeksforgeeks", "forgeeksgeeki"));
        System.out.println("Is geeksforgeeks forgeeksgeeks anagram? " + isAnAnagram2("geeksforgeeks", "forgeeksgeeks"));

    }

    private static boolean isAnAnagram(String s1, String s2) {
        if (s1 == null || s2 == null || s1.equals("") || s2.equals("") || s1.length() != s2.length()) {
            return false;
        }

        HashMap<Character, Integer> hashMapS1 = new HashMap<>();
        for (int i = 0; i < s1.length(); i++) {
            if (!hashMapS1.containsKey(s1.charAt(i))) {
                hashMapS1.put(s1.charAt(i), 0);
            } else {
                hashMapS1.put(s1.charAt(i), hashMapS1.get(s1.charAt(i)) + 1);
            }
        }

        HashMap<Character, Integer> hashMapS2 = new HashMap<>();
        for (int i = 0; i < s2.length(); i++) {
            if (!hashMapS2.containsKey(s2.charAt(i))) {
                hashMapS2.put(s2.charAt(i), 0);
            } else {
                hashMapS2.put(s2.charAt(i), hashMapS2.get(s2.charAt(i)) + 1);
            }
        }

        return hashMapS1.equals(hashMapS2);
    }

    static int NO_OF_CHARS = 256;

    private static boolean isAnAnagram2(String s1, String s2) {
        if (s1 == null || s2 == null || s1.equals("") || s2.equals("") || s1.length() != s2.length()) {
            return false;
        }

        // Create 2 count arrays and initialize
        // all values as 0
        int count1[] = new int [NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int count2[] = new int [NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        // For each character in input strings,
        // increment count in the corresponding
        // count array
        for (i = 0; i <s1.length() && i < s2.length(); i++) {
            count1[s1.charAt(i)]++;
            count2[s2.charAt(i)]++;
        }

        // Compare count arrays
        for (i = 0; i < NO_OF_CHARS; i++) {
            if (count1[i] != count2[i]) {
                return false;
            }
        }

        return true;

    }

}
