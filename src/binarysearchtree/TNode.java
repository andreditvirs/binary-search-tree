package binarysearchtree;

public class TNode<T> {

    public T nodeValue;
    public TNode<T> left;
    public TNode<T> right;

    public TNode(T item) {
        nodeValue = item;
        left = right = null;
    }

    public TNode(T item, TNode<T> left, TNode<T> right) {
        nodeValue = item;
        this.left = left;
        this.right = right;
    }
}
