package Trees;

import java.util.LinkedList;
import java.util.Queue;

public class BinaryTree {

    private Node _root;

    public BinaryTree() {
        this._root = null;
    }

    public void insert(int value) {
        _root = insertRec(_root, value);
    }

    private Node insertRec(Node root, int value) {
        if (root == null) {
            root = new Node(value);
            return root;
        }

        if (value < root.getData()) {
            root.setLeft(insertRec(root.getLeft(), value));
        } else if (root.getData() < value) {
            root.setRigth(insertRec(root.getRigth(), value));
        }

        return root;
    }

    public void printInOrder() {
        traverseInOrder(_root);
    }

    private void traverseInOrder(Node root) {
        if (root != null) {
            traverseInOrder(root.getLeft());
            System.out.print(root.getData() + " ");
            traverseInOrder(root.getRigth());
        }
    }

    public void printPreOrder() {
        traversePreOrder(_root);
    }

    private void traversePreOrder(Node root) {
        if (root != null) {
            System.out.print(root.getData() + " ");
            traversePreOrder(root.getLeft());
            traversePreOrder(root.getRigth());
        }
    }

    public void printPostOrder() {
        traversePostOrder(_root);
    }

    private void traversePostOrder(Node root) {
        if (root != null) {
            traversePostOrder(root.getLeft());
            traversePostOrder(root.getRigth());
            System.out.print(root.getData() + " ");
        }
    }

    public void printLevelOrder() {
        Queue<Node> queue = new LinkedList<Node>();

        queue.add(_root);
        while (!queue.isEmpty()) {
            Node tempNode = queue.poll();
            System.out.print(tempNode.getData() + " ");

            /*Enqueue left child */
            if (tempNode.getLeft() != null) {
                queue.add(tempNode.getLeft());
            }

            /*Enqueue right child */
            if (tempNode.getRigth() != null) {
                queue.add(tempNode.getRigth());
            }
        }
    }


    public Node search(int value) {
        return searchRec(_root, value);
    }

    private Node searchRec(Node root, int value) {
        if (root == null || root.getData() == value) {
            return root;
        }

        if (value < root.getData()) {
            return searchRec(root.getLeft(), value);
        }

        return searchRec(root.getRigth(), value);
    }
}
