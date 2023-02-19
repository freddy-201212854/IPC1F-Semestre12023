/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase5;

import java.util.ArrayList;

/**
 *
 * @author freddymonterroso
 */
public class Region {
    
    public String codigo;
    public double estandar;
    public double especial;
    public String nombre;
    
    public ArrayList<Departamento> departamento = new ArrayList<>();
    
    public Region(String codigo, double estandar, double especial, String nombre) {
        this.codigo = codigo;
        this.estandar = estandar;
        this.especial = especial;
        this.nombre = nombre;
    }

    public void setEspecial(double especial) {
        this.especial = especial;
    }

    public void setDepartamento(ArrayList<Departamento> departamento) {
        this.departamento = departamento;
    }

    public double getEspecial() {
        return especial;
    }

    public ArrayList<Departamento> getDepartamento() {
        return departamento;
    }

    public String getCodigo() {
        return codigo;
    }

    public double getEstandar() {
        return estandar;
    }

    public double getIndividual() {
        return especial;
    }

    public String getNombre() {
        return nombre;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public void setEstandar(double estandar) {
        this.estandar = estandar;
    }

    public void setIndividual(double individual) {
        this.especial = individual;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
}
