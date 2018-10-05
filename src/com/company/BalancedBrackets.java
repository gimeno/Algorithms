package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Roberto on 12/03/2018.
 */
public class BalancedBrackets {
    public static boolean isBalanced(String expression) {
        Stack<Character> closeBracket = new Stack<>();
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '[':
                    closeBracket.push(']');
                    break;
                case '{':
                    closeBracket.push('}');
                    break;
                case '(':
                    closeBracket.push(')');
                    break;
                default:
                    if (closeBracket.empty() || expression.charAt(i) != closeBracket.pop()) {
                        return false;
                    }
            }
        }
        return closeBracket.empty();
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int a0 = 0; a0 < t; a0++) {
            String expression = in.next();
            System.out.println( (isBalanced(expression)) ? "YES" : "NO" );
        }
    }
}
