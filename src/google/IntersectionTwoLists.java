package google;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

/**
 * @author Roberto on 11/10/2018
 * Given two linked list, return a list that contains all elements that are in the intersection of both
 */
public class IntersectionTwoLists {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(4);
        list.add(2);
        list.add(9);
        list.add(15);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(2);
        list2.add(10);
        list2.add(4);
        list2.add(20);

        printIntersection(list, list2);
        System.out.println();
        printIntersectionBruteForce(list, list2);

    }

    /**
     * Time: O(n+m)
     * Space: O(n)
     */
    private static void printIntersection(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        Set<Integer> integers = new HashSet<>(list1);

        for (int i = 0; i < list2.size(); i++) {
            if (integers.contains(list2.get(i))) {
                System.out.print(list2.get(i) + " ");
                integers.remove(list2.get(i));
            }
        }

    }

    /**
     * Time: O(n*m)
     * Space: O(n)
     */
    private static void printIntersectionBruteForce(LinkedList<Integer> list1, LinkedList<Integer> list2) {

        Set<Integer> integers = new HashSet<>();

        for (int i = 0; i < list1.size(); i++) {
            for (int j = 0; j < list2.size(); j++) {
                if (list1.get(i) == list2.get(j) && !integers.contains(list1.get(i))) {
                    integers.add(list1.get(i));
                    System.out.print(list1.get(i) + " ");
                }
            }
        }

    }

}
