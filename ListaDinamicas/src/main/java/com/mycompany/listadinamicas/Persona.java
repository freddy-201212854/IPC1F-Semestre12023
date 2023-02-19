/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.listadinamicas;

/**
 *
 * @author freddymonterroso
 */
public class Persona {
    
    public String DPI;
    public String nombre;

    public Persona(String DPI, String nombre) {
        this.DPI = DPI;
        this.nombre = nombre;
    }

    public String getDPI() {
        return DPI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDPI(String DPI) {
        this.DPI = DPI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
  
    
}
