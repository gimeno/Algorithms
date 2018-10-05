package com.company;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by Roberto on 15/03/2018.
 */
public class QueueTwoStacks {

    public static void main(String[] args) {
        MyQueue<Integer> queue = new MyQueue<Integer>();

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for (int i = 0; i < n; i++) {
            int operation = scan.nextInt();
            if (operation == 1) { // enqueue
                queue.enqueue(scan.nextInt());
            } else if (operation == 2) { // dequeue
                queue.dequeue();
            } else if (operation == 3) { // print/peek
                System.out.println(queue.peek());
            }
        }

        scan.close();
    }

    static class MyQueue<T> {
        Stack<T> stack1;
        Stack<T> stack2;

        public MyQueue() {
            stack1 = new Stack<>();
            stack2 = new Stack<>();
        }

        public void enqueue(T value) {
            stack1.push(value);
        }

        public T dequeue() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                return null;
            }

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.pop();
        }

        public T peek() {
            if (stack1.isEmpty() && stack2.isEmpty()) {
                return null;
            }

            if (stack2.isEmpty()) {
                while (!stack1.isEmpty()) {
                    stack2.push(stack1.pop());
                }
            }
            return stack2.peek();
        }

    }
}
