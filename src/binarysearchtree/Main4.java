package binarysearchtree;

public class Main4 {
    public static void main(String[] args) {
        
        System.out.println("Notasi atitmatika");
        
        TNode<Character> root1 = BinaryTree.buildTree();
        System.out.println("Postorder = " + BinaryTree.postorderDisplay(root1));
        System.out.println("Height = " + BinaryTree.height(root1));
        
        System.out.println("\nNotasi huruf");
        
        TNode<Character> root2 = BinaryTree.buildTree5();
        System.out.println("Postorder = " + BinaryTree.postorderDisplay(root2));
        System.out.println("Height = " + BinaryTree.height(root2));
    }
}
