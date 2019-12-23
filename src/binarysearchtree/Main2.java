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
public class Main2 {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

        bst.add(8);
        bst.add(3);
        bst.add(10);
        bst.add(1);
        bst.add(6);
        bst.add(14);
        bst.add(4);
        bst.add(7);
        bst.add(13);
        
        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));

        System.out.println(bst.findNode(20));
        System.out.println(bst.find(20));
        
        System.out.println(bst.first());
        System.out.println(bst.last());
        
        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.preorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.postorderDisplay(bst.getRoot()));
        //menghapus node dengan satu anak
        bst.removeNode(new STNode(10));
        
        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.preorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.postorderDisplay(bst.getRoot()));
    }
}
