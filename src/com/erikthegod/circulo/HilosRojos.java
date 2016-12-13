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
    static int gradoR1 = 0;
    static int gradoR2 = 30;
    static int gradoR3 = 60;
    static int gradoR4 = 90;
    static int gradoR5 = 120;

    public HilosRojos(JButton bot) {
        boton = bot;
    }

    @Override
    public void run() {
        while (true == true) {
            try {
                if (Thread.currentThread().getName().equals("hiloR1")) {
                    boton.setLocation(posX(gradoR1), posY(gradoR1));
                    gradoR1 += 2;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR2")) {
                    boton.setLocation(posX(gradoR2), posY(gradoR2));
                    gradoR2 += 4;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR3")) {
                    boton.setLocation(posX(gradoR3), posY(gradoR3));
                    gradoR3 += 6;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR4")) {
                    boton.setLocation(posX(gradoR4), posY(gradoR4));
                    gradoR4 += 5;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloR5")) {
                    boton.setLocation(posX(gradoR5), posY(gradoR5));
                    gradoR5 += 8;
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
