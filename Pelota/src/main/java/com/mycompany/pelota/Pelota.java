/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pelota;

/**
 *
 * @author Freddy
 */


import static com.mycompany.pelota.Pelota.contador;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.Box.Filler;
import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.Timer;
import javax.swing.border.LineBorder;



class Pelota {
    private float TAMX = 15; //eje x elipse (en el circulo si son 

    private float masa;
    private float TAMY = 15; //eje y elipse
    private double x = 0;
    private double y = 0;
    private double dx = 1; // desplazamiento en x (velocidad)
    private double dy = 1; // desplazamiento en y (velocidad)
    Color color = Color.GREEN;
    Rectangle2D limites;
    public static int contador = 5;

    public Pelota(Color color) {
        this.color = color;
        x = 1200;
        y = 500;
    }
    public Pelota(Color color, int diametro, int x, int y) {
        TAMX = diametro;
        TAMY = diametro;
        masa = diametro * 10;
        this.color = color;
        this.x = x;
        this.y = y;
    }
    public Pelota() {
       x = 1200;
       y = 500;
    }
    // Mueve la pelota invirtiendo posición si choca con límites
    public void mueve_pelota(Rectangle2D limites) {
        /*this.limites = limites;
        x = dx + x;
        y = dy + y;
        if (x + TAMX >= limites.getMaxX()) {
            x = limites.getMaxX() - TAMX;
            dx = -dx;
        }
        if (y + TAMY >= limites.getMaxY()) {
            y = limites.getMaxY() - TAMY;
            dy = -dy;
        }
        if (x < limites.getMinX()) {
            x = limites.getMinX();
            dx = -dx;
        }
        if (y < limites.getMinY()) {
            y = limites.getMinY();
            dy = -dy;
        }*/
        if (x == 988){
                y += dy;
            } else {
                x -= dx;
            }
            
            if (y == 539) {
                
                if (x <= 809){
                    contador = 5000;
                    
                    int delay = 1000; // Delay de 1 segundo (1000 milisegundos)
                    ActionListener taskPerformer = new ActionListener() {
                        int temp = 0;

                        public void actionPerformed(ActionEvent evt) {
                            // Tarea a ejecutar cuando el temporizador se activa
                            System.out.println("Temporizador activado");
                            temp++;
                            /*if (temp == 5) {
                                contador = 5;
                            }*/
                            System.out.println(temp);
                           
                        }
                    };
                    Timer timer = new Timer(delay, taskPerformer);
                    timer.start(); // Inicia el temporizador
                } 
                    x -= dx;
                    y = 539;
            } else {
                contador = 5;
            }
                
          
    }
    //Forma de la pelota en su posición inicial
    public Ellipse2D getShape() {
        return new Ellipse2D.Double(x, y, TAMX, TAMY);
    }
    public Color getColor() {
        return color;
    }
    void pintar_bola(Graphics g) {
        g.setColor(color);
        //int x1 =(int)x;
        //int y1 =(int)y;
        //g.fillOval(x1,y1,TAMX,TAMY);
        Graphics2D g2 = (Graphics2D) g;
        g2.fill(new Ellipse2D.Double(x, y, 40, 40));
        mueve_pelota(limites);
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public float getRadio() {
        return TAMX / 2;
    }
    public double getDx() {
        return dx;
    }
    public double getDy() {
        return dy;
    }
    public float getMasa() {
        return masa;
    }
    public void setDx(double desplazamientox) {
        dx = desplazamientox;
    }
    public void setDy(double desplazamientoy) {
        dy = desplazamientoy;
    }
    public static boolean choque(Pelota pelota1, Pelota pelota2) {
        double x1 = pelota1.getX();
        double y1 = pelota1.getY();
        float radio1 = pelota1.getRadio();
        double x2 = pelota2.getX();
        double y2 = pelota2.getY();
        float radio2 = pelota2.getRadio();
        if ((Math.pow((x2 - x1), 2) + Math.pow((y2 - y1),
                2)) <= Math.pow((radio1 + radio2), 2)) {
            return true;
        } else
            return false;
    }
}
class LaminaPelota extends JPanel {
    private ArrayList < Pelota > pelotas = new ArrayList <> ();
    
    public LaminaPelota() {
        setLayout(null);
        JPanel inventario = new JPanel();
        //inventario.setBackground(Color.CYAN);
        inventario.setBounds(800, 500, 400, 300);
        inventario.setBorder(new LineBorder(Color.CYAN, 8));
        inventario.setOpaque(false);
        add(inventario);
        System.out.println("JPanel");
        
    }
    //Añadimos pelota a la lámina
    public void add(Pelota b) {
        pelotas.add(b);
          
    }
    public void eliminar() {
        if (!pelotas.isEmpty())
            pelotas.remove(pelotas.size() - 1);
    }
    public int contar() {
        return (pelotas.size());
    }
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(245, 245, 220));
        g.fillRect(0, 0, getWidth(), getHeight());
        try {
            for (int i = 0; i < pelotas.size(); i++) {
                if (pelotas.size() >= 2) {
                    for (int j = i + 1; j < pelotas.size(); j++)

                        if (Pelota.choque(pelotas.get(i), pelotas.get(j))) {
                            System.out.println("Choque: " + i + " , " + j);
                            double masa1 = pelotas.get(i).getMasa();
                            double velocidadx1 = pelotas.get(i).getDx();
                            double velocidady1 = pelotas.get(i).getDy();

                            double masa2 = pelotas.get(j).getMasa();
                            double velocidadx2 = pelotas.get(j).getDx();
                            double velocidady2 = pelotas.get(j).getDy();

                            double sumaMasas = masa1 + masa2;

                            double velocidadF1x = ((masa1 - masa2) * velocidadx1 + 2 * masa2 * velocidadx2) / sumaMasas;
                            double velocidadF1y = ((masa1 - masa2) * velocidady1 + 2 * masa2 * velocidady2) / sumaMasas;

                            double velocidadF2x = ((masa2 - masa1) * velocidadx2 + 2 * masa1 * velocidadx1) / sumaMasas;
                            double velocidadF2y = ((masa2 - masa1) * velocidady2 + 2 * masa1 * velocidady1) / sumaMasas;

                            pelotas.get(i).setDx(velocidadF1x);
                            pelotas.get(i).setDy(velocidadF1y);
                            pelotas.get(j).setDx(velocidadF2x);
                            pelotas.get(j).setDy(velocidadF2y);
                        }
                    pelotas.get(i).pintar_bola(g);
                } else {
                    pelotas.get(i).pintar_bola(g);
                }
            }
            Thread.sleep(contador);
        } catch (InterruptedException e) {
            //System.out.println("Error al intentar pintar la 
            //bola"+e);
        }
        repaint();
    }
}
class MarcoRebote extends JFrame {
    private static LaminaPelota lamina;
    private static JTextField ventana = new JTextField(2);
    public MarcoRebote() {
        setBounds(100, 100, 1300, 900);
        setTitle("Juego Rebotes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        lamina = new LaminaPelota();
        this.add(lamina, null);
       
                          
    }
    public void ponerBoton(Container c, String titulo,
        ActionListener oyente) {
        JButton boton = new JButton(titulo);
        c.add(boton);
        boton.addActionListener(oyente);
    }
    //Añade pelota y la bota nuchas veces
    public static void  comienza_el_juego(Color color, int x, int y) {
       
        Pelota pelota = new Pelota(color, 20, x, y);
        HiloPelota hilo = new HiloPelota(pelota, lamina);
        hilo.start();
    }
}
class HiloPelota extends Thread //implements Runnable
{
    private Pelota pelota;
    private static LaminaPelota lamina;
    HiloPelota(Pelota pelota, LaminaPelota lamina) {
        this.pelota = pelota;
        this.lamina = lamina;
        
    }
    public void run() {
        lamina.add(pelota);
        pelota.mueve_pelota(lamina.getBounds());
    }
}