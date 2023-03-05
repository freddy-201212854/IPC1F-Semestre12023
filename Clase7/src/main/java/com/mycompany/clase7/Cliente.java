/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase7;

import java.util.ArrayList;

/**
 *
 * @author freddymonterroso
 */
public class Cliente {
    private String nombre;
    private ArrayList<Cuenta> listaCuentas = new ArrayList<>();

    public Cliente(String nombre) {
        this.nombre = nombre;
    }
    
    public void agregarCuenta(Cuenta cuenta) {
        listaCuentas.add(cuenta);
    }
    
    public void eliminarCuenta(Cuenta cuenta) {
        listaCuentas.remove(cuenta);
    }
    
    public ArrayList<Cuenta> obtenerCuentas() {
        return listaCuentas;
    }
}
