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
public class HilosVerdes implements Runnable {

    JButton boton = new JButton();
    int posicionCentralX = 250;
    int posicionCentralY = 200;
    int radio = 150;
    int x;
    int y;
    int grado1 = 0;
    int grado2 = 30;
    int grado3 = 60;
    int grado4 = 90;
    Boolean stop;
    Pausador parador;

    public HilosVerdes(JButton bot, Pausador pausado) {
        boton = bot;
        parador = pausado;
    }

    @Override
    public void run() {
        while (true == true) {
            try {
                if (Thread.currentThread().getName().equals("hilo1")) {
                    boton.setLocation(posX(grado1), posY(grado1));
                    grado1 += 4;
                    Thread.sleep(30);
                    if (parador.parado() == true) {
                        try {
                            synchronized (parador) {
                                parador.wait();
                            }
                        } catch (InterruptedException e) {
                            // TODO Auto-generated catch block
                            e.printStackTrace();
                        }
                    } else{
                        synchronized (parador) {
                                parador.notify();
                            }
                    }
                } else if (Thread.currentThread().getName().equals("hilo2")) {
                    boton.setLocation(posX(grado2), posY(grado2));
                    grado2 += 4;
                    Thread.sleep(30);
                    
                } else if (Thread.currentThread().getName().equals("hilo3")) {
                    boton.setLocation(posX(grado4), posY(grado4));
                    grado2 += 4;
                    Thread.sleep(30);
                } else if (Thread.currentThread().getName().equals("hilo4")) {
                    boton.setLocation(posX(grado4), posY(grado4));
                    grado2 += 4;
                    Thread.sleep(30);
                }

            } catch (InterruptedException ex) {
                Logger.getLogger(HilosVerdes.class.getName()).log(Level.SEVERE, null, ex);
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

    public void parada() {
        if (parador.parado() == true) {
            try {
                synchronized (parador) {
                    parador.wait();
                }
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        } else if (parador.parado() != true) {
            synchronized (parador) {
                parador.notify();
            }
        }
    }

}
