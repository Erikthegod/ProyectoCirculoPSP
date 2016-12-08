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

    int posicionCentralX = 272;
    int posicionCentralY = 200;

    static int radio1 = 40;
    static int radio2 = 40;
    static int radio3 = 40;
    static int radio4 = 40;

    int x;
    int y;
    int grado1 = 0;
    int grado2 = 90;
    int grado3 = 180;
    int grado4 = 270;
    static int velocidad1 = 8;
    static int velocidad2 = 8;
    static int velocidad3 = 8;
    static int velocidad4 = 8;

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
                    boton.setLocation(posX(grado1,radio1), posY(grado1,radio1));
                    grado1 = grado1 + velocidad1;
                    Thread.sleep(40);
                    if (parador.parado() == true) {
                        try {
                            synchronized (parador) {
                                parador.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (Thread.currentThread().getName().equals("hilo2")) {
                    boton.setLocation(posX(grado2,radio2), posY(grado2,radio2));
                    grado2 = grado2 + velocidad2;
                    Thread.sleep(40);
                    if (parador.parado() == true) {
                        try {
                            synchronized (parador) {
                                parador.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }

                } else if (Thread.currentThread().getName().equals("hilo3")) {
                    boton.setLocation(posX(grado3,radio3), posY(grado3,radio3));
                    grado3 = grado3 + velocidad3;
                    Thread.sleep(40);
                    if (parador.parado() == true) {
                        try {
                            synchronized (parador) {
                                parador.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (Thread.currentThread().getName().equals("hilo4")) {
                    boton.setLocation(posX(grado4,radio4), posY(grado4,radio4));
                    grado4 = grado4 + velocidad4;
                    Thread.sleep(40);
                    if (parador.parado() == true) {
                        try {
                            synchronized (parador) {
                                parador.wait();
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
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

    public int posX(int grados,int radio) {
        x = (int) (posicionCentralX + (radio * cos(grados)));
        return x;
    }

    public int posY(int grados,int radio) {
        y = (int) (posicionCentralY + (radio * sen(grados)));
        return y;
    }

}
