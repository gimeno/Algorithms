package Trees;

public class BinarySerachTree {

    public static void main(String[] args) {

        BinaryTree tree = new BinaryTree();

        /* Let us create following BST
              50
           /     \
          30      70
         /  \    /  \
       20   40  60   80 */
        tree.insert(50);
        tree.insert(30);
        tree.insert(20);
        tree.insert(40);
        tree.insert(70);
        tree.insert(60);
        tree.insert(80);

        // printInOrder inorder traversal of the BST
        tree.printInOrder();

        System.out.println(tree.search(60).getData());

    }


}
