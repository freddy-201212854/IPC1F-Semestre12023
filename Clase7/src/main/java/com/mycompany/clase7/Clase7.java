/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase7;

/**
 *
 * @author freddymonterroso
 */
public class Clase7 {

    public static void main(String[] args) {
        System.out.println("++++++++++++++++++++++++");
        System.out.println("Relación de Asociación");
        
        Cliente cliente = new Cliente("Luis Perez");
        
        Cuenta cuenta = new Cuenta(743938, 100.00);
        Cuenta cuenta2 = new Cuenta(343543, 350.00);

        cliente.agregarCuenta(cuenta);
        cliente.agregarCuenta(cuenta2);
        
        
        
        
        for (int i = 0; i < cliente.obtenerCuentas().size(); i++) {
            
            if (cliente.obtenerCuentas().get(i).obtenerCuenta() == 743938) {
                cliente.obtenerCuentas().get(i).depositar(155);
            }
        }
        
        for (int i = 0; i < cliente.obtenerCuentas().size(); i++) {
            System.out.println(cliente.obtenerCuentas().get(i).obtenerCuenta() + " " + cliente.obtenerCuentas().get(i).obtenerSaldo());
        }
        
        System.out.println("****************");
        System.out.println("Herencia");
        
        Perro perro = new Perro("Firulais", 2);
        Perro perro2 = new Perro("Fido", 5);
        
        Gato gato = new Gato("Pelusa", 3);
        Gato gato2 = new Gato("Felix", 1);
        
        
        System.out.println("Nombre: " + perro.getNombre() + " Edad: " + perro.getEdad() + " Raza: " + perro.getRaza());
        System.out.println("Nombre: " + perro2.getNombre() + " Edad: " + perro2.getEdad() + " Raza: " + perro2.getRaza());
        
        
        System.out.println("Nombre: " + gato.getNombre() + " Edad: " + gato.getEdad());
        System.out.println("Nombre: " + gato2.getNombre() + " Edad: " + gato2.getEdad());

        
    }
}
