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
public class BinarySearchTree<T> {

    private STNode<T> root;
    private int treeSize;

    public BinarySearchTree() {
        root = null;
    }

    public STNode<T> getRoot() {
        return root;
    }

    public void setRoot(STNode<T> root) {
        this.root = root;
    }

    public int getTreeSize() {
        return treeSize;
    }

    public void setTreeSize(int treeSize) {
        this.treeSize = treeSize;
    }

    public boolean add(T item) {
        STNode<T> t = root, parent = null, newNode;
        int orderValue = 0;
        while (t != null) {
            parent = t;
            orderValue = ((Comparable<T>) item).compareTo(t.nodeValue);
            if (orderValue == 0) {
                return false;
            } else if (orderValue < 0) {
                t = t.left;
            } else {
                t = t.right;
            }
        }
        newNode = new STNode<T>(item, parent);
        if (parent == null) {
            root = newNode;
        } else if (orderValue < 0) {
            parent.left = newNode;
        } else {
            parent.right = newNode;
        }
        treeSize++;
        return true;
    }

    public STNode<T> findNode(T item) {
        STNode<T> t = root, parent = null, newNode;
        int orderValue = 0;
        while (t != null) {
            orderValue = ((Comparable<T>) item).compareTo(
                    t.nodeValue);
            if (orderValue == 0) {
                return t;
            } else if (orderValue < 0) {
                t = t.left;
            } else {
                t = t.right;
            }
        }
        return null;
    }

    public boolean find(T item) {
        STNode<T> t = findNode(item);
        T value = null;
        if (t != null) {
            value = t.nodeValue;
            return true;
        }
        return false;
    }

    public T first() {
        STNode<T> nextNode = root;

        // if the set is empty, return null
        if (nextNode == null) {
            return null;
        }

        // first node is the furthest node left from root
        while (nextNode.left != null) {
            nextNode = nextNode.left;
        }

        return nextNode.nodeValue;
    }

    public T last() {
        STNode<T> nextNode = root;

        // if the set is empty, return null
        if (nextNode == null) {
            return null;
        }

        // first node is the furthest node left from root
        while (nextNode.right != null) {
            nextNode = nextNode.right;
        }

        return nextNode.nodeValue;
    }

    public void removeNode(STNode<T> dNode) {
        if (dNode == null) {
            return;
        }

        // dNode = reference to node D that is deleted
        // pNode = reference to parent P of node D
        // rNode = reference to node R that replaces D
        STNode<T> pNode, rNode;

        dNode = findNode(dNode.nodeValue);

        // assign pNode as a reference to P
        pNode = dNode.parent;
        // if D has a null child, the
        // replacement node is the other child
        if (dNode.left == null || dNode.right == null) {
            if (dNode.right == null) {
                rNode = dNode.left;
            } else {
                rNode = dNode.right;
            }

            if (rNode != null) // the parent of R is now the parent of D
            {
                rNode.parent = pNode;
            }
            // deleting the root node; assign new root
            if (pNode == null) {
                root = rNode;
            } // attach R to the correct branch of P
            else if (((Comparable<T>) dNode.nodeValue).
                    compareTo(pNode.nodeValue) < 0) {
                pNode.left = rNode;
            } else {
                pNode.right = rNode;
            }
        } else {
            // pOfRNode is reference to parent of
            // replacement node
            STNode<T> pOfRNode = dNode;

            // first possible replacement is right
            // child of D; the reference to PofR,
            // pOfRNode, is the deleted node
            rNode = dNode.right;
            pOfRNode = dNode;
            // descend down path of left children, keeping
            // a record of the current node and its parent;
            // stop at the replacement node
            while (rNode.left != null) {
                pOfRNode = rNode;
                rNode = rNode.left;
            }

        }
    }

    /*
    public void removeNode2Child(STNode<T> dNode) {
        if (dNode.left == null || dNode.right == null) {

        } // case where deleted node has two nonnull children
        else {
            // pOfRNode is reference to parent of
            // replacement node
            STNode<T> pOfRNode = dNode;

            // first possible replacement is right
            // child of D; the reference to PofR,
            // pOfRNode, is the deleted node
            rNode = dNode.right;
            pOfRNode = dNode;
            // descend down path of left children, keeping
            // a record of the current node and its parent;
            // stop at the replacement node
            while (rNode.left != null) {
                pOfRNode = rNode;
                rNode = rNode.left;
            }

        }
    }
*/
}
