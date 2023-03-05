/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase7;

/**
 *
 * @author freddymonterroso
 */
public class Cuenta {
    
    private int numeroCuenta;
    private double saldo;

    public Cuenta(int numeroCuenta, double saldo) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
    }
    
    public void depositar(double cantidad) {
        saldo += cantidad;
    }
    
    public void retirar(double cantidad) {
        saldo -= cantidad;
    }
    
    public double obtenerSaldo() {
        return saldo;
    }
   
    public int obtenerCuenta() {
        return numeroCuenta;
    }
    
}
