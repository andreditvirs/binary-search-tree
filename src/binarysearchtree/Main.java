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
public class Main {

    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

        bst.add(35);
        bst.add(18);
        bst.add(25);
        bst.add(48);
        bst.add(20);

        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.preorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.postorderDisplay(bst.getRoot()));

        System.out.println(bst.findNode(20));
        System.out.println(bst.find(20));
        
        System.out.println(bst.first());
        System.out.println(bst.last());
    }
}
