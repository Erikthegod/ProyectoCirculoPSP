/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.circulo;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;

/**
 *
 * @author Erikthegod
 */
public class HilosRojos implements Runnable {

    JButton boton = new JButton();
    int posicionCentralX = 272;
    int posicionCentralY = 200;
    int radio = 100;
    int x;
    int y;
    int grado1 = 0;
    int grado2 = 30;
    int grado3 = 60;
    int grado4 = 90;
    int grado5 = 120;

    public HilosRojos(JButton bot) {
        boton = bot;
    }

    @Override
    public void run() {
        while (true == true) {
            try {
                if (Thread.currentThread().getName().equals("hiloR1")) {
                    boton.setLocation(posX(grado1), posY(grado1));
                    grado1 += 4;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR2")) {
                    boton.setLocation(posX(grado2), posY(grado2));
                    grado2 += 8;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR3")) {
                    boton.setLocation(posX(grado3), posY(grado3));
                    grado3 += 2;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR4")) {
                    boton.setLocation(posX(grado4), posY(grado4));
                    grado4 += 6;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR5")) {
                    boton.setLocation(posX(grado5), posY(grado5));
                    grado5 += 10;
                    Thread.sleep(30);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(HilosRojos.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    public double cos(int grados) {
        Double angulo = Math.toRadians(grados);
        return Math.cos(angulo);
    }

    public double sen(int grados) {
        Double angulo = Math.toRadians(grados);
        return Math.sin(angulo);
    }

    public int posX(int grados) {
        x = (int) (posicionCentralX + (radio * cos(grados)));
        return x;
    }

    public int posY(int grados) {
        y = (int) (posicionCentralY + (radio * sen(grados)));
        return y;
    }

}
