/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase4;

/**
 *
 * @author freddymonterroso
 */
public class Clase4 {
    
    
    
    public static void main(String[] args) {
        
        //Ciclo for contador del 1 al 10
        System.out.println("Ciclo for");
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
        
        
        System.out.println("Ciclo While");
        
        int i = 1;
        while (i<=10) {
            
            System.out.println(i);
            i++; //i = i + 1;
            
        }
        
        System.out.println("Ciclo Do while");
        
        int j = 1;
        do {
            System.out.println(j);
            j++;
        }while(j<=10);
        
        System.out.println("Decremento Ciclo For");
         //Ciclo for contador del 10 al 1
         for (int k = 10; k >= 1; k--) {
             System.out.println(k);
        }
         
        System.out.println("Decremento Ciclo While");  
        int l = 10;
        while (l>=1) {
            
            System.out.println(l);
            l--; //i = i + 1;
            
        }
        
        System.out.println("Decremento Ciclo Do while");
        int m = 10;
        do {
            System.out.println(m);
            m--;
        }while(m>=1);
        
        
        
        System.out.println("Potencia de un número");
        int base = 5;
        int potencia = 3;
        
        int resultado = 1;
        
        // 5 X 5 X 5
        
        for (int k = 1; k <= potencia; k++) {
            //base = base * 5;
            resultado = resultado * base;
        }
        
        System.out.println(resultado);
        
        
        System.out.println("Serie de fibonacci");
        // 0 1 1 2 3 5 8 13 21 34
        int serie = 10;
        int numero1 = 0;
        int numero2 = 1;
        
        int suma = 1;
        
        System.out.println(numero1);
        for (int k = 1; k < serie; k++) {
            System.out.println(suma);
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
        }
        
        /* Primera Repeticion k = 1 condicion 1 < 10
            imprimo suma 1
            suma = 1
            numero1 = 1
            numero2 = 1
        */
        
         /* Primera Repeticion k = 2 condicion 2 < 10
            imprimo suma 1
            suma = 2
            numero1 = 1
            numero2 = 2
        */
        
         /* Primera Repeticion k = 3 condicion 3 < 10
            imprimo suma 2
            suma = 3
            numero1 = 2
            numero2 = 3
        */
        
         System.out.println("Factorial de un número");
         int numero = 5;
         int factorial = 1;
         
         for (int k = 2; k <= numero ; k++) {
            factorial = factorial * k;
        }
         System.out.println("Factorial de 5: " + factorial);
         
         
         try {
            contadorRecursivo(1);
         } catch(Exception error) {
             System.out.println(error);
         }
         // Contador del 1 al 10 con recursividad
         
         try {
            int num = 5;
            
            double division = num/0;
            
             System.out.println(division);
         } catch(Exception error) {
             System.out.println(error);
         }
         
    }
    
    
    public static int contadorRecursivo(int numero) {
        
        if (numero <= 10) {
            System.out.println(numero);
            return contadorRecursivo(numero + 1);
        }
        
        return numero;
    }
}
