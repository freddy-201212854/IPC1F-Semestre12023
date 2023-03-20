/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.clase9;

import javax.swing.JFrame;

/**
 *
 * @author freddymonterroso
 */
public class Clase9 {

    public static void main(String[] args) {
        
        MiHilo hilo = new MiHilo();
        hilo.start();
        
        JFrame ventana = new JFrame("Pelota");
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setSize(400, 400);
        
        Pelota pelota = new Pelota();
        
        ventana.add(pelota);
        
        ventana.setVisible(true);
        
    }
}
