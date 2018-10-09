package com.company;

import java.util.*;

/**
 * Created by Roberto on 12/03/2018.
 */
public class BalancedA {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        String s = scanner.next();
        System.out.println(isBalancedB("a(b)c)"));
        System.out.println(isBalancedB(")()a(("));
        System.out.println(isBalancedB("a((b)c))("));
    }

    public static String isBalanced(String expression) {

        Stack<Integer> closeBracket = new Stack<>();
        ArrayList<Integer> indexes = new ArrayList<>();
        for (int i = 0; i < expression.length(); i++) {
            switch (expression.charAt(i)) {
                case '(':
                    closeBracket.push(i);
                    break;
                case ')':
                    if (!closeBracket.empty()) {
                        closeBracket.pop();
                    } else {
                        indexes.add(i);
                    }
                    break;
            }
        }

        StringBuilder a = new StringBuilder(expression);
        while (!closeBracket.empty()) {
            a.deleteCharAt(closeBracket.pop());
        }

        for (int i = 0; i < indexes.size(); i++) {
            a.deleteCharAt(indexes.get(i));
        }

        return a.toString();
    }

    public static String isBalancedA(String braces) {
        Stack<Character> stack = new Stack<Character>();
        StringBuffer stringBuilder = new StringBuffer(braces);
        for (int i = 0; i < braces.length(); i++) {
            switch (braces.charAt(i)) {
                case '(':
                    stack.push('(');
                    break;
                case ')':
                    if (!stack.empty() && stack.pop() != '(') {
                        stringBuilder.deleteCharAt(i);
                    }
                    break;
            }

        }
        return stringBuilder.toString();
    }

    public static String isBalancedB(String braces) {
        Stack<Character> stack = new Stack<Character>();
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < braces.length(); i++) {

            switch (braces.charAt(i)) {
                case '(':
                    stack.push('(');
                    if (stringBuilder.length() != 0) {
                        stringBuilder.append("(");
                    }
                    break;
                case ')':
                    if (!stack.empty() && stack.pop() == '(') {
                        if (stringBuilder.length() != 0) {
                            stringBuilder.append(")");
                        }
                    }
                    break;
                default:
                    if (stringBuilder.length() != 0 ||
                            (stringBuilder.length() == 0 && braces.charAt(i) == 'a')) {
                        stringBuilder.append(braces.charAt(i));
                    }
                    break;
            }

        }
        if (!stack.empty()) {
            for (Character character : stack) {
                stringBuilder.deleteCharAt(stringBuilder.lastIndexOf(character.toString()));
            }
        }
        return stringBuilder.toString();
    }
}
