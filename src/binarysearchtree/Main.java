package binarysearchtree;

public class Main {

    public static void main(String[] args) {
        try {
            BinaryTree<Character> bt = new BinaryTree<Character>();
            TNode<Character> root1 = bt.createTree("abc*+");
            System.out.println("InOrder : " + BinaryTree.inorderDisplay(root1));
            System.out.println("PostOrder : " + BinaryTree.postorderDisplay(root1));
            System.out.println("PreOrder : " + BinaryTree.preorderDisplay(root1));
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
