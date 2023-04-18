/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11;

/**
 *
 * @author freddymonterroso
 */
public class ListaDoble {
    Nodo2 head;
    
    public ListaDoble() {
        this.head = null;
    }
    
    public void add(String valor) {
        Nodo2 nuevo = new Nodo2(valor);
        if (this.head == null) {
            this.head = nuevo;
        } else {
            Nodo2 actual = this.head;
            
            while (actual.next != null) {
                actual = actual.next;
            }
            
            actual.prev = actual;
            actual.next = nuevo;
        }
    }
    
    public void remove(int indice) {
        if (this.head == null) {
            return;
        }
        if (indice == 0) {
            this.head = this.head.next;
            this.head.prev = null;
            return;
        }
        
        Nodo2 actual = this.head;
        int i = 0;
        
        while(actual != null && i < indice - 1){
            actual = actual.next;
            i++;
        }
        
        if (actual != null && actual.next != null){ 
           actual.next = actual.next.next; 
           actual.next.prev = actual;
        }
    }
    
    public void printListNext() {
    Nodo2 actual = this.head;
    while (actual != null) {
      System.out.println(actual.valor);
      actual = actual.next;
    }
    System.out.println();
  }
    
  public int size() {
    int index = 0;
    Nodo2 actual = this.head;
    while (actual != null) {
      System.out.print(actual.valor);
      actual = actual.next;
      index++;
    }
    
    return index;
  }
    
    public void printListPrev() {
        Nodo2 actual = this.head;
        while (actual != null) {
        if (actual.prev != null) {
            System.out.print(actual.valor);
            actual = actual.prev;
        }
    }
    System.out.println();
  }
    
}
