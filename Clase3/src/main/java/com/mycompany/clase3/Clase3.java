/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase3;

import java.util.Scanner;

/**
 *
 * @author freddymonterroso
 */
public class Clase3 {
    
    

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int opcion;
        
        do {
            System.out.println("Menú de opciones");
        System.out.println("[1]. Números positivos, negativos o neutros");
        System.out.println("[2]. Número par o impar");
        System.out.println("[3]. Notas de cursos");
        System.out.println("[4]. Usuarios");
        System.out.println("[5]. Listado de productos");
        System.out.println("[6]. Salir");
        
        System.out.println("Ingrese un número de opción");
        opcion = scan.nextInt();
        
        switch (opcion) {
            case 1:
                System.out.println("Números positivos, negativos o neutros");
                // Métodos sin parametros
                numerosPositivos();
                
                break;
            case 2:
                System.out.println("Número par o impar");
                
                System.out.println("Ingrese el numero");
                int numero = scan.nextInt();
                
                String mensaje = numeroParesImpares(numero); // almacenar valor de una funcion en una variable
                System.out.println(mensaje);
                //System.out.println(numeroParesImpares(numero)); // Imprimir directamente su valor
                
                break;
            case 3:
                System.out.println("Nota de cursos");
                System.out.println("Ingrese la nota del curso");
                int nota = scan.nextInt();
                resultadoNota(nota);
                break;
            case 4:
                System.out.println("Usuarios");
                
                System.out.println("Ingrese el usuario");
                String usuario = scan.next();
                
                System.out.println("Ingrese la contraseña");
                String contrasenia = scan.next();
                
                if (validacionUsuario(usuario, contrasenia)) {
                    System.out.println("Autenticación correcta");
                } else {
                    System.out.println("El usuario o contraseña son invalidos");
                }
                
                break;
            case 5:
                System.out.println("Listado de productos");
                listadoProductos();
                
                break;
            case 6:
                System.out.println("Saliendo...");
                break;
            default:
                System.out.println("No existe la opción ingresada.");
                break;
        }
        }while (opcion != 6);
           
    }
    
    public static void numerosPositivos() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int numero = scan.nextInt();
        
        if (numero > 0) { // Numero positivo
            System.out.println("El número es positivo");
        } else if (numero < 0) { // Numero negativo
            System.out.println("El número es negativo");
        } else {
            System.out.println("El número es neutro");
        }
    }
    
    public static String numeroParesImpares(int numero) {
        
        if (numero % 2 == 0) {
            return "El número es par";
        } 
        else  {
            return "El número es impar";
        }
        
        //return "El número es impar";
    }
    
    public static void resultadoNota(int nota) {
        
        if (nota > 60) {
            System.out.println("El alumno Aprobo");
        } else /*if (nota < 61)*/ {
            System.out.println("El alumno Reprobo");
        } 
        
    }
    
    public static boolean validacionUsuario(String usuario, String contrasenia) {
        
        if (usuario.equals("cajero_201212854") && contrasenia.equals("1234")) {
            return true;
        } else {
            return false;    
        }
    }
    
    public static void listadoProductos() {
        String [][] listado = new String[5][2];
                
                listado [0][0] = "Producto 1";
                listado [0][1] = "15.00";
                
                listado [1][0] = "Producto 2";
                listado [1][1] = "30.00";
                for (int i = 0; i < 5; i++) {
                    
                    for (int j = 0; j < 2; j++) {
                        System.out.print(listado[i][j] + " ");
                    }
                    System.out.println("");
                }
    }
}
