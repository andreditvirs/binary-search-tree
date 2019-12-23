package binarysearchtree;

import java.util.Stack;

public class BinaryTree<T> {

    Stack<TNode> stack = new Stack<TNode>();

    public static <T> int height(TNode<T> t) {
        int heightLeft = 0, heightRight = 0, heightval = 0;

        if (t == null) // tinggi dari tree kosong adalah -1
        {
            heightval = -1;
        } else {             // mendapatkan kedalaman dari subtree kiri dari t  
            heightLeft = height(t.left);             // mendapatkan kedalaman dari subtree kanan dari t
            heightRight = height(t.right);             //kedalaman dari tree dari root t adalah 1 + maximum       // dari kedalaman dua subtree t             
            heightval = 1 + (heightLeft > heightRight ? heightLeft : heightRight);
        }
        return heightval;
    }

    public static <T> TNode<T> copyTree(TNode<T> t) {
        TNode<T> newLeft, newRight, newNode;
        if (t == null) {
            return null;
        }
        newLeft = copyTree(t.left);
        newRight = copyTree(t.right);
        newNode = new TNode<T>(t.nodeValue, newLeft, newRight);
        return newNode;
    }

    public static <T> void clearTree(TNode<T> t) {
        if (t != null) {
            clearTree(t.left);
            clearTree(t.right);
            t = null;
        }
    }

    public static <T> String inorderDisplay(TNode<T> t) {
        String s = "";

        if (t != null) {
            s += inorderDisplay(t.left);   // descend left             
            s += t.nodeValue + "  ";       // display the node             
            s += inorderDisplay(t.right);  // descend right         }

        }
        return s;
    }

    public static <T> String preorderDisplay(TNode<T> t) {
        String s = "";

        if (t != null) {
            s += t.nodeValue + "  ";       // display the node             
            s += preorderDisplay(t.left);   // descend left             
            s += preorderDisplay(t.right);  // descend right         
        }
        return s;
    }

    public static <T> String postorderDisplay(TNode<T> t) {
        String s = "";

        if (t != null) {
            s += postorderDisplay(t.left);   // descend left       
            s += postorderDisplay(t.right);  // descend right             
            s += t.nodeValue + "  ";       // display the node         
        }
        return s;
    }

    public boolean isOperator(char c) {
        if (c == '+' || c == '-' || c == '*' || c == '/') {
            return true;
        }
        return false;
    }

    public TNode<Character> createTree(String postfix) throws Exception {

        for (int i = 0; i < postfix.length(); i++) {
            char c = postfix.charAt(i);

            if (Character.isAlphabetic(c)) {
                TNode<Character> tnode = new TNode<Character>(c);
                stack.add(tnode);
            } else if (isOperator(c)) {
                try {
                    TNode<Character> right = stack.pop();
                    TNode<Character> left = stack.pop();
                    TNode<Character> M = new TNode<Character>(c, left, right);
                    stack.push(M);
                } catch (Exception e) {
                    System.out.println("Kurang operand");
                }
            }
        }

        TNode<Character> temp = stack.pop();

        if (stack.size() > 0) {
            throw new Exception("Kurang operator");
        }
        return temp;
    }
}
