package binarysearchtree;

public class Main5 {

    public static void main(String[] args) {
        try {
            BinaryTree<Character> bt = new BinaryTree<Character>();
            TNode<Character> root1 = bt.createTree("abc*");
            System.out.println(BinaryTree.inorderDisplay(root1));
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
