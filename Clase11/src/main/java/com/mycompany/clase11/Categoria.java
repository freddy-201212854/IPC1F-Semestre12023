/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase11;

/**
 *
 * @author freddymonterroso
 */
public class Categoria {
    public String usuario;
    public String nombre;
    //Lista doblemente enlazada
    ListaDoble imagenes = new ListaDoble();

    public Categoria(String nombre, String usuario) {
        this.nombre = nombre;
        this.usuario = usuario;
    }
    
    public ListaDoble getListImagenes() {
        return this.imagenes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setImagenes(ListaDoble imagenes) {
        this.imagenes = imagenes;
    }

    public String getUsuario() {
        return usuario;
    }

    
    
}
