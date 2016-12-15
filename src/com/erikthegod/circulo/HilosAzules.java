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
public class HilosAzules implements Runnable {

    JButton boton = new JButton(); 
    int posicionCentralX = 272;
    int posicionCentralY = 200;
    int radio = 150;//Radio del circulo que realizan los botones
    int x;//Posicion x del boton
    int y;//Posicion y del boton
    static int grado1 = 0; //declaramos los grados staticos para que podamos variarlos en otras clases
    static int grado2 = 30;
    static int grado3 = 60;
    static int grado4 = 90;
    static int grado5 = 120;
    static int grado6 = 270;

    public HilosAzules(JButton bot) {
        boton = bot;//Asignamos el boton recibido al instanciado en la clase
    }

    @Override
    public void run() {
        while (true == true) {//Se ejecuta durante toda la vida del hilo
            try {
                if (Thread.currentThread().getName().equals("hiloA1")) {//dependiendo del hilo que se use
                    boton.setLocation(posX(grado1), posY(grado1));//asignamos la posicion del boton
                    grado1 += 4;//velocidad a la que se mueve el boton
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloA2")) {
                    boton.setLocation(posX(grado2), posY(grado2));
                    grado2 += 8;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloA3")) {
                    boton.setLocation(posX(grado3), posY(grado3));
                    grado3 += 2;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloA4")) {
                    boton.setLocation(posX(grado4), posY(grado4));
                    grado4 += 6;
                    Thread.sleep(30);

                } else if (Thread.currentThread().getName().equals("hiloA5")) {
                    boton.setLocation(posX(grado5), posY(grado5));
                    grado5 += 10;
                    Thread.sleep(30);
                }else if (Thread.currentThread().getName().equals("hiloA6")) {
                    boton.setLocation(posX(grado6), posY(grado6));
                    grado6 += 4;
                    Thread.sleep(30);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(HilosAzules.class.getName()).log(Level.SEVERE, null, ex);
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
