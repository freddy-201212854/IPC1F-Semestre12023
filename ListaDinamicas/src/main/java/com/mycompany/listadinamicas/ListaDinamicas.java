/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.listadinamicas;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author freddymonterroso
 */
public class ListaDinamicas {
    
    public static ArrayList<String> listaNombre = new ArrayList<>();
    
    public static LinkedList<String> listaApellido = new LinkedList<>();
            
    public static void main(String[] args) {
        System.out.println("--------------------- Ejemplos con ArrayList ----------------------");
        System.out.println("Agregando Datos");
        // Insertar datos
        listaNombre.add("Luis");
        listaNombre.add("Freddy");
        listaNombre.add("Pedro");
        
        for (int i = 0; i < listaNombre.size(); i++) {
            System.out.println(listaNombre.get(i));
        }
        
        System.out.println("");
        System.out.println("Modificando datos");
        // Modificar Datos
        listaNombre.set(0, "Luis remplazo");
        
        for (int i = 0; i < listaNombre.size(); i++) {
            System.out.println(listaNombre.get(i));
        }
        
        System.out.println("");
        System.out.println("Eliminando datos");
        listaNombre.remove("Freddy");
        
        for (int i = 0; i < listaNombre.size(); i++) {
            System.out.println(listaNombre.get(i));
        }
        
        
        System.out.println("");
        System.out.println("Verificar si existen datos");
        boolean existe = listaNombre.contains("Pedro");
        System.out.println(existe);
        
        System.out.println("--------------------- Ejemplos con LinkedList ----------------------");
        System.out.println("");
        System.out.println("Agregando Datos");
        
        listaApellido.add("Perez");
        listaApellido.add("Lopez");
        listaApellido.add("Juarez");
        
        for (int i = 0; i < listaApellido.size(); i++) {
            System.out.println(listaApellido.get(i));
        }
        
        System.out.println("");
        System.out.println("Modificando Datos");
        listaApellido.set(0, "Monterroso");
        
        
        for (int i = 0; i < listaApellido.size(); i++) {
            System.out.println(listaApellido.get(i));
        }
        
        
        System.out.println("");
        System.out.println("Eliminando Datos");
        listaApellido.remove("Lopez");
        
        for (int i = 0; i < listaApellido.size(); i++) {
            System.out.println(listaApellido.get(i));
        }
    }
}
