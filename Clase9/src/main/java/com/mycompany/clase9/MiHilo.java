/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

/**
 *
 * @author freddymonterroso
 */
public class MiHilo extends Thread{
    
    public static int tiempo = 0;
    public static String cadena = "";
    public void run() {
        while(true) {
            tiempo ++;
            
            if (tiempo >= 0 && tiempo < 60) {
                cadena = "00:" + tiempo;
            }
            System.out.println("Hilo ejecutandose..." + cadena);
            try {
               Thread.sleep(1000);
            } catch(InterruptedException ex) {
                
            }
        }
        
    }
}
