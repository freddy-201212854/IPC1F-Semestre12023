/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pelota;

import static com.mycompany.pelota.MarcoRebote.comienza_el_juego;
import java.awt.Color;
import javax.swing.JFrame;

/**
 *
 * @author Freddy
 */
public class Juego //simulacion
{
        public static JFrame marco = new MarcoRebote();

        public static void main(String[] args) 
        {
        // TODO Auto-generated method stub
            marco=new MarcoRebote();
            marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            marco.setVisible(true);
            
            
            comienza_el_juego(Color.YELLOW, 1200, 400);
            comienza_el_juego(Color.RED, 1250, 400);
            comienza_el_juego(Color.BLUE, 1300, 400);


        }
}
