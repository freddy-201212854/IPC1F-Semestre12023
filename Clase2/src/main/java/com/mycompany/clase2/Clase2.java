/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase2;

import java.math.BigInteger;
import java.util.Scanner;

/**
 *
 * @author freddymonterroso
 */
public class Clase2 {

    public static void main(String[] args) {
        
        /*Scanner scan = new Scanner(System.in);
        Scanner scan2 = new Scanner(System.in);

        System.out.println("Datos del estudiante");
        
        System.out.println("Ingrese un numero de carnet");
        int carnet;
        carnet = scan.nextInt();
        System.out.println("El carnet es: " + carnet);
        
        System.out.println("Ingrese un nombre");
        String nombre;
        nombre = scan2.nextLine();
        System.out.println("El nombre es: " + nombre);
        
        System.out.println("Ingrese el DPI");
        long dpi;
        dpi = scan.nextLong();
        System.out.println("El DPI es: " + dpi);
        
        System.out.println("Ingrese la edad");
        byte edad;
        edad = scan.nextByte();
        System.out.println("La edad es: " + edad);
        
        System.out.println("Ingrese el genero (M/F)");
        char genero;
        genero = scan2.nextLine().charAt(0);
        System.out.println("El genero es: " + genero);
        
        System.out.println("Ingrese el sueldo");
        double ingresos;
        ingresos = scan.nextDouble();
        System.out.println("Los ingresos son: " + ingresos);*/
        
        // Es una variable del tipo objeto y el objeto es Estudiante
        //estudiante es = new estudiante(carnet, dpi, nombre, edad, genero, ingresos);
        /*estudiante es = new estudiante(201232, 32343, "Freddy", (byte)12, 'F', 2500.0);
        estudiante es2 = new estudiante(201232, 32343, "Freddy", (byte)12, 'F', 2500.0);

        
        System.out.println("El carnet en el objeto es: " + es.getCarnet());
        System.out.println("El DPI en el objeto es: " + es.getDpi());
        System.out.println("El nombre en el objeto es:" + es.getNombre());
        System.out.println("La edad en el objeto es:" + es.getEdad());
        System.out.println("El genero en el objeto es: " + es.getGenero());
        System.out.println("Los ingresos en el objeto son: " + es.getIngresos());*/
        
        
        // Declarar y crear arreglos
        
        /*int [] listanumeros = new int[10];
        
        listanumeros[0] = 100;
        listanumeros[1] = 200;
        listanumeros[2] = 300;
        listanumeros[3] = 400;
        listanumeros[4] = 500;
        listanumeros[5] = 600;
        listanumeros[6] = 700;
        listanumeros[7] = 800;
        listanumeros[8] = 900;
        listanumeros[9] = 100;

        for (int i = 0; i < 10; i++) {
            System.out.println("El valor de la posicion: " + i + " es:" + listanumeros[i]);
        }
        
        String [] listaNombre = new String[3];
        
        listaNombre[0] = "IPC1";
        listaNombre[1] = "IPC2";
        
        
        for (int i = 0; i < listaNombre.length; i++) {
            System.out.println(listaNombre[i]);
        }
        
        
        estudiante [] listaEstudiante = new estudiante[2];
        
        estudiante es = new estudiante(201232, 32343, "Freddy", (byte)12, 'F', 2500.0);
        estudiante es1 = new estudiante(201232, 32343, "Alejandro", (byte)12, 'F', 2500.0);

        
       listaEstudiante[0] = es;
       listaEstudiante[1] = es1;
       
        for (int i = 0; i < 2; i++) {
            System.out.println(listaEstudiante[i].getCarnet() + " " + listaEstudiante[i].getNombre());
        }*/
        
        Producto [] listaProductos = new Producto [20];

        while(true) {
        
        System.out.println("Agregar Nuevo producto");
        Scanner product = new Scanner(System.in);
        
        System.out.println("Ingrese el nombre del producto");
        String nombre = product.nextLine();
        
        System.out.println("Ingrese el precio del producto");
        double precio = product.nextDouble();
        
        if (precio > 0) {
                    
            Producto objeto = new Producto(nombre, precio);

            for (int i = 0; i < 20; i++) {
                if (listaProductos[i] == null) { // validar si la posicion esta vacía
                    listaProductos[i] = objeto;
                    break;
                } else { // si esta llena la posicion
                        
                    if (listaProductos[i].getNombre().equals(nombre)) {
                        System.out.println("El producto ya existe ingrese otro nombre");
                        break;
                    }
                }
            }

            for (int i = 0; i < 20; i++) { // Mostrar productos
                if (listaProductos[i] != null) {
                    System.out.println("[" + i + "]" + listaProductos[i].getNombre() + " " + listaProductos[i].getPrecio());
                }
            }
           
        } else {
                System.out.println("El precio ingresado debe ser mayor que 0");
        }
    }
    }
}
