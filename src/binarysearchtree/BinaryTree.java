/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

import java.util.Stack;

/**
 *
 * @author Insanity-
 */
public class BinaryTree<T> {

    Stack<TNode> stack = new Stack<TNode>();

    public static TNode<Integer> buildTreeExample() {
        TNode<Integer> root, p, q, r;
        p = new TNode<Integer>(20);
        q = new TNode<Integer>(40);
        r = new TNode<Integer>(30, q, null);
        root = new TNode<Integer>(10, p, r);
        return root;
    }

    public static TNode<Character> buildTree() {
        TNode<Character> a, b, c, d, kali, plus, bagi;
        a = new TNode<Character>('A');
        b = new TNode<Character>('B');
        c = new TNode<Character>('C');
        d = new TNode<Character>('D');
        plus = new TNode<Character>('+', a, b);
        kali = new TNode<Character>('*', plus, c);
        bagi = new TNode<Character>('/', kali, d);

        return bagi;
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

    public static TNode<Character> buildTree5() {
        TNode<Character> a, b, c, d, e, f, g;

        d = new TNode<Character>('C');
        c = new TNode<Character>('D');
        g = new TNode<Character>('G');
        e = new TNode<Character>('E', d, null);
        b = new TNode<Character>('B', c, e);
        f = new TNode<Character>('F', null, g);
        a = new TNode<Character>('A', b, f);

        return a;
    }

    //a+b*c
    public static TNode<Character> buildTree1() {
        TNode<Character> a, b, c, kali, tambah;
        a = new TNode<Character>('a');
        b = new TNode<Character>('b');
        c = new TNode<Character>('c');
        kali = new TNode<Character>('*', b, c);
        tambah = new TNode<Character>('+', a, kali);

        return tambah;
    }

    //a+b*c-d
    public static TNode<Character> buildTree2() {
        TNode<Character> a, b, c, d, kali, tambah, minus;
        a = new TNode<Character>('a');
        b = new TNode<Character>('b');
        c = new TNode<Character>('c');
        d = new TNode<Character>('d');
        kali = new TNode<Character>('*', b, c);
        tambah = new TNode<Character>('+', a, kali);
        minus = new TNode<Character>('-', tambah, d);

        return minus;
    }

    //(a-b)*c/d
    public static TNode<Character> buildTree3() {
        TNode<Character> a, b, c, d, kali, minus, bagi;
        a = new TNode<Character>('a');
        b = new TNode<Character>('b');
        c = new TNode<Character>('c');
        d = new TNode<Character>('d');
        minus = new TNode<Character>('-', a, b);
        kali = new TNode<Character>('*', minus, c);
        bagi = new TNode<Character>('/', kali, d);

        return bagi;
    }

    //a*b+(c-d)/e
    public static TNode<Character> buildTree4() {
        TNode<Character> a, b, c, d, e, kali, tambah, minus, bagi;
        a = new TNode<Character>('a');
        b = new TNode<Character>('b');
        c = new TNode<Character>('c');
        d = new TNode<Character>('d');
        e = new TNode<Character>('e');
        kali = new TNode<Character>('*', a, b);
        minus = new TNode<Character>('-', c, d);
        bagi = new TNode<Character>('/', minus, e);
        tambah = new TNode<Character>('+', kali, bagi);

        return tambah;
    }

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

    public static <T> String inorderDisplay(STNode<T> t) {
        String s = "";

        if (t != null) {
            s += inorderDisplay(t.left);   // descend left             
            s += t.nodeValue + "  ";       // display the node             
            s += inorderDisplay(t.right);  // descend right         }

        }
        return s;
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

    public static <T> String preorderDisplay(STNode<T> t) {
        String s = "";

        if (t != null) {
            s += t.nodeValue + "  ";       // display the node             
            s += preorderDisplay(t.left);   // descend left             
            s += preorderDisplay(t.right);  // descend right         
        }
        return s;
    }

    public static <T> String postorderDisplay(STNode<T> t) {
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
            char c = postfix.charAt(i); //
            //jika operand 
            if (Character.isAlphabetic(c)) {
                TNode<Character> tnode = new TNode<Character>(c);
                stack.add(tnode);
            }//jika operator
            else if (isOperator(c)) {
                try {
                    TNode<Character> right = stack.pop();
                    TNode<Character> left = stack.pop();
                    TNode<Character> M = new TNode<Character>(c, left, right);
                    stack.push(M);
                } catch (Exception e) {
                    System.out.println("Kurang Operand");
                }

            }
        }
        
        TNode<Character> temp = stack.pop();
        
        if(stack.size() > 0){
            throw new Exception("Kurang Operator");
        }
        return temp;
        
    }
}
