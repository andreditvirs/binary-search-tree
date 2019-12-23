/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binarysearchtree;

/**
 *
 * @author Insanity-
 */
public class TNode<T> {
    // data dari sebuah node
   public T nodeValue;
   // menyimpan alamat dari anak kiri dan anak kanan
   public TNode<T> left, right;

   // membuat obyek dengan sebuah data item 
   // dan anak kiri dan anak kanan diset null
   public TNode(T item)
   {
      nodeValue = item;
      left = right = null;
   }
   
   // membuat obyek dengan sebuah data item 
   // dan menentukan alamat dari anak kiri dan anak kanan	
   public TNode (T item, TNode<T> left, TNode<T> right)
   {
      nodeValue = item;
      this.left = left;
      this.right = right;
   }
}
