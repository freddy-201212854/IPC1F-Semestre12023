/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemploordenamiento;

/**
 *
 * @author freddymonterroso
 */
public class EjemploOrdenamiento {

    public static void main(String[] args) {
        
        Producto [] listaVenta = new Producto[5];
        
        Producto prod = new Producto("Producto 1", 5);
        Producto prod2 = new Producto("Producto 2", 3);
        Producto prod3 = new Producto("Producto 3", 10);
        Producto prod4 = new Producto("Producto 4", 2);
        Producto prod5 = new Producto("Producto 5", 3);

        listaVenta[0] = prod;
        listaVenta[1] = prod2;
        listaVenta[2] = prod3;
        listaVenta[3] = prod4;
        listaVenta[4] = prod5;
        
        burbuja(listaVenta);
        
    }
    
    public static void burbuja(Producto []matrix){
        Producto temp;
        for(int i=1;i < matrix.length;i++){
            for (int j=0 ; j < matrix.length- 1; j++){
                if (matrix[j].getCantidad() > matrix[j+1].getCantidad()){
                    temp = matrix[j];
                    matrix[j] = matrix[j+1];
                    matrix[j + 1] = temp;
                }
            }
        }
        
        System.out.println("resultado");
        for (int i = 0; i < matrix.length; i++) {
            System.out.println(matrix[i].getNombre() + " " + matrix[i].getCantidad());
        }
    }
}
