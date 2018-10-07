package Trees;

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
        printRec(_root);
    }

    private void printRec(Node root) {
        if (root != null) {
            printRec(root.getLeft());
            System.out.println(root.getData());
            printRec(root.getRigth());
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
