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
    static int gradoV1 = 0;
    static int gradoV2 = 90;
    static int gradoV3 = 180;
    static int gradoV4 = 270;
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
                    boton.setLocation(posX(gradoV1, radio1), posY(gradoV1, radio1));
                    gradoV1 = gradoV1 + velocidad1;
                    Thread.sleep(40);
                    if (parador.parado() == true) {
                        try {
                            synchronized (parador) {
                                parador.wait();//Paramos el objeto sincronizado al hilo para que se pare el hilo 
                            }
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (Thread.currentThread().getName().equals("hilo2")) {
                    boton.setLocation(posX(gradoV2, radio2), posY(gradoV2, radio2));
                    gradoV2 = gradoV2 + velocidad2;
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
                    boton.setLocation(posX(gradoV3, radio3), posY(gradoV3, radio3));
                    gradoV3 = gradoV3 + velocidad3;
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
                    boton.setLocation(posX(gradoV4, radio4), posY(gradoV4, radio4));
                    gradoV4 = gradoV4 + velocidad4;
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

    /*
    Devuelve el coseno de un grado, primero lo convierte a radianes
     */
    public double cos(int grados) {
        Double angulo = Math.toRadians(grados);
        return Math.cos(angulo);
    }

    /*
    Devuelve el seno de un grado, primero lo convierte a radianes
     */
    public double sen(int grados) {
        Double angulo = Math.toRadians(grados);
        return Math.sin(angulo);
    }

    /*
    Formula que nos devuelve la x correspondiente para realizar un circulo con un radio y un grado determinado
     */
    public int posX(int grados, int radio) {
        x = (int) (posicionCentralX + (radio * cos(grados)));
        return x;
    }

    /*
    Formula que nos devuelve la y correspondiente para realizar un circulo con un radio y un grado determinado
     */
    public int posY(int grados, int radio) {
        y = (int) (posicionCentralY + (radio * sen(grados)));
        return y;
    }

}
