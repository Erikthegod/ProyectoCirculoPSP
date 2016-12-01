/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.circulo;

import javax.swing.JButton;

/**
 *
 * @author Erikthegod
 */
public class HilosVerdes implements Runnable {
    
    JButton boton = new JButton();
    int posicionCentralX=50;
    int posicionCentralY=50;
    int radio=30;
    double angulo;
    int x;
    int y;

    public HilosVerdes(JButton bot) {
        boton = bot;
    }
    
    
    @Override
    public void run() {
        boton.setLocation(posX(30), 0);
    }
    
    public double cos(int grados){
        angulo= Math.toRadians(grados);
        return Math.cos(angulo);  
    }
    
    public int posX(int grados){
        x= (int) (posicionCentralX+(radio*cos(grados)));
        return x;
    }
}
