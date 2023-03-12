/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase8;

import java.util.ArrayList;

/**
 *
 * @author freddymonterroso
 */
public class Departamento extends Provincia{
    
    private ArrayList<Municipio> listaMunicipios = new ArrayList<>();
    
    public Departamento(String codigo, String nombre) {
        super(codigo, nombre);
    }

    public ArrayList<Municipio> getListaMunicipios() {
        return listaMunicipios;
    }
    
    
    
}
