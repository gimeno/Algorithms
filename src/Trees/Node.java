package Trees;

public class Node {
    private int _data;
    private Node _left;
    private Node _rigth;

    public Node(int data) {
        this._data = data;
        this._left = null;
        this._rigth = null;
    }

    public Node(int data, Node left, Node rigth) {
        this._data = data;
        this._left = left;
        this._rigth = rigth;
    }

    public int getData() {
        return _data;
    }

    public void setData(int _data) {
        this._data = _data;
    }

    public Node getLeft() {
        return _left;
    }

    public void setLeft(Node left) {
        this._left = left;
    }

    public Node getRigth() {
        return _rigth;
    }

    public void setRigth(Node rigth) {
        this._rigth = rigth;
    }
}
