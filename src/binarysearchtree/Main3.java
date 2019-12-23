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
public class Main3 {
    public static void main(String[] args) {
        BinarySearchTree<Integer> bst = new BinarySearchTree<Integer>();

        bst.add(6);
        bst.add(2);
        bst.add(9);
        bst.add(1);
        bst.add(5);
        bst.add(8);
        bst.add(13);
        bst.add(4);
        bst.add(7);
        bst.add(11);
        bst.add(18);
        bst.add(3);
        
        
        
        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.preorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.postorderDisplay(bst.getRoot()));
        //menghapus node dengan satu anak
        bst.removeNode(new STNode(5));
        
        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.preorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.postorderDisplay(bst.getRoot()));
        /*
        bst.removeNode(new STNode(8));
        
        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.preorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.postorderDisplay(bst.getRoot()));
*/
        bst.removeNode(new STNode(9));
        
        System.out.println(BinaryTree.inorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.preorderDisplay(bst.getRoot()));
        System.out.println(BinaryTree.postorderDisplay(bst.getRoot()));   
    }

}
