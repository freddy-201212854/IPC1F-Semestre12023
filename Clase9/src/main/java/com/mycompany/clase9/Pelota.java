/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.clase9;

import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

/**
 *
 * @author freddymonterroso
 */
public class Pelota extends JPanel implements Runnable{

    private int x = 0;
    private int y = 0;
    private int dx = 1;
    private int dy = 1;
    
    public Pelota() {
        Thread hilo = new Thread(this);
        hilo.start();
    }
    
    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.red);
        if (x >= 50 && x <= 80) {
            g.setColor(Color.green);
        } 
        
        if (x >= 81 && x <= 150) {
            g.setColor(Color.yellow);
        } 
        g.fillOval(x, y, 30, 30);
    }
    
    @Override
    public void run() {
        while(true) {
            x += dx;
            y += dy;
            
            System.out.println("Posicion X: " + x);
            System.out.println("Posicion Y " + y);
            if (x < 0 || x > getWidth() - 30) {
                dx = -dx;
            }
            
            if (y < 0 || y > getHeight() - 30) {
                dy = -dy;
            }
            
            repaint();
            
            try {
               Thread.sleep(10);
            } catch(InterruptedException ex) {
                
            }
            
            
        }
    }
    
}
