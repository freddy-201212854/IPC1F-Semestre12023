/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase7;

/**
 *
 * @author freddymonterroso
 */
public class Perro extends Animal{
    private String raza;
    
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }
    
    
    
}
