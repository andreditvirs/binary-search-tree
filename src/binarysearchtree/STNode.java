/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author student
 */
public class STNode<T> {

    public T nodeValue;
    public STNode<T> left, right;
    public STNode<T> parent;

    public STNode(T item) {
        nodeValue = item;
        left = right = null;
    }

    public STNode(T item, STNode<T> parent) {
        nodeValue = item;
        left = right = null;
        this.parent = parent;
    }

    public STNode(T item, STNode<T> left, STNode<T> right) {
        nodeValue = item;
        this.left = left;
        this.right = right;
    }

    @Override
    public String toString() {
        //return "STNode{" + "nodeValue=" + nodeValue + ", left=" + left + ", right=" + right + ", parent=" + parent + '}';
        return "STNode{" + "nodeValue=" + nodeValue + "}";
    }
    
}
