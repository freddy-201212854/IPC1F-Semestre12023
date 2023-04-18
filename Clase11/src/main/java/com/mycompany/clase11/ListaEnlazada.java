/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11;

/**
 *
 * @author freddymonterroso
 */
public class ListaEnlazada {
    Nodo head;
    
    public ListaEnlazada () {
        this.head = null;
    }
    
    public void add(String valor) {
        Nodo nuevo = new Nodo(valor);
        if (this.head == null) {
            this.head = nuevo;
        } else {
            Nodo actual = this.head;
            
            while (actual.next != null) {
                actual = actual.next;
            }
            
            actual.next = nuevo;
        }
    }
    
    public void remove(int indice) {
        if (this.head == null) {
            return;
        }
        if (indice == 0) {
            this.head = this.head.next;
            return;
        }
        
        Nodo actual = this.head;
        int i = 0;
        
        while(actual != null && i < indice - 1){
            actual = actual.next;
            i++;
        }
        
        if (actual != null && actual.next != null){ 
           actual.next = actual.next.next; 
        }
    }
    
    public void printList() {
        Nodo actual = this.head;
        
        while (actual != null) {
               System.out.println(actual.valor);
               actual = actual.next;
        }
        System.out.println("");
    }
}
