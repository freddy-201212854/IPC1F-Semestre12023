/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase2;

/**
 *
 * @author freddymonterroso
 */
public class estudiante {
    
    public int carnet;
    public long dpi;
    public String nombre;
    public byte edad;
    public char genero;
    public double ingresos;
    
    public estudiante(int carnet, long dpi, String nombre, byte edad, char genero, double ingresos) {
        this.carnet = carnet;
        this.dpi = dpi;
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.ingresos = ingresos;
    }

    public int getCarnet() {
        return carnet;
    }

    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }

    public void setDpi(long dpi) {
        this.dpi = dpi;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public void setGenero(char genero) {
        this.genero = genero;
    }

    public void setIngresos(double ingresos) {
        this.ingresos = ingresos;
    }

    public long getDpi() {
        return dpi;
    }

    public String getNombre() {
        return nombre;
    }

    public byte getEdad() {
        return edad;
    }

    public char getGenero() {
        return genero;
    }

    public double getIngresos() {
        return ingresos;
    }
    
}
