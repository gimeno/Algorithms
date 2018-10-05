package com.company;

/**
 * Created by Roberto on 04/10/2018.
 */
public class isPalindrome {
    public static void main(String[] args) {

    }

    public static boolean istPalindrom(String word){
        int i1 = 0;
        int i2 = word.length() - 1;
        while (i2 > i1) {
            if (word.charAt(i1) != word.charAt(i2)) {
                return false;
            }
            ++i1;
            --i2;
        }
        return true;
    }
}
