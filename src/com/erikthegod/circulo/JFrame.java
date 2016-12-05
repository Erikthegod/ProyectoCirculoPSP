/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.erikthegod.circulo;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Erikthegod
 */
public class JFrame extends javax.swing.JFrame {

    Thread t1;
    Thread t2;
    Thread t3;
    Thread t4;
    Thread t5;
    Pausador pausado1;
    Pausador pausado2;
    Pausador pausado3;
    Pausador pausado4;
    Pausador pausado5;

    public JFrame() {
        initComponents();
        pausado1 = new Pausador();
        pausado2 = new Pausador();
        pausado3 = new Pausador();
        pausado4 = new Pausador();
        pausado5 = new Pausador();
        t1 = new Thread(new HilosVerdes(jbVerde1, pausado1), "hilo1");
        t2 = new Thread(new HilosVerdes(jbVerde2, pausado2), "hilo2");
        t3 = new Thread(new HilosVerdes(jbVerde3, pausado3), "hilo3");
        t4 = new Thread(new HilosVerdes(jbVerde4, pausado4), "hilo4");
        t5 = new Thread(new HilosVerdes(jbVerde5, pausado5), "hilo5");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jbVerde1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jbVerde2 = new javax.swing.JButton();
        jbParar = new javax.swing.JButton();
        jcbBotones = new javax.swing.JComboBox<>();
        jbVerde3 = new javax.swing.JButton();
        jbVerde4 = new javax.swing.JButton();
        jbVerde5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jbVerde1.setBackground(new java.awt.Color(0, 255, 51));
        jbVerde1.setFont(new java.awt.Font("Verdana", 0, 13)); // NOI18N
        jbVerde1.setForeground(new java.awt.Color(51, 255, 51));
        jbVerde1.setToolTipText("");
        jbVerde1.setOpaque(true);

        jButton2.setText("Iniciar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jbVerde2.setBackground(new java.awt.Color(0, 255, 51));
        jbVerde2.setForeground(new java.awt.Color(0, 255, 0));
        jbVerde2.setOpaque(true);

        jbParar.setText("Parar");
        jbParar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbPararActionPerformed(evt);
            }
        });

        jcbBotones.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Boton 1", "Boton 2", "Boton 3", "Boton 4", "Boton 5" }));

        jbVerde3.setBackground(new java.awt.Color(0, 255, 51));
        jbVerde3.setOpaque(true);

        jbVerde4.setBackground(new java.awt.Color(0, 255, 51));
        jbVerde4.setOpaque(true);

        jbVerde5.setBackground(new java.awt.Color(0, 255, 51));
        jbVerde5.setOpaque(true);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(jButton2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jcbBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbParar)
                .addGap(33, 33, 33))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(185, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbVerde3)
                        .addGap(93, 93, 93)
                        .addComponent(jbVerde2)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jbVerde1)
                        .addGap(255, 255, 255))))
            .addGroup(layout.createSequentialGroup()
                .addGap(216, 216, 216)
                .addComponent(jbVerde4)
                .addGap(26, 26, 26)
                .addComponent(jbVerde5)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jbVerde1)
                .addGap(5, 5, 5)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jbVerde2)
                    .addComponent(jbVerde3))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jbVerde4)
                    .addComponent(jbVerde5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 201, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jbParar)
                    .addComponent(jcbBotones, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jbPararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbPararActionPerformed
        if (jcbBotones.getSelectedItem().equals("Boton 1")) {
            if (pausado1.parado() == true) {
                pausado1.boton = false;
                synchronized (pausado1) {
                    pausado1.notify();
                }
            } else {
                pausado1.boton = true;
            }
        } else if (jcbBotones.getSelectedItem().equals("Boton 2")) {
            if (pausado2.parado() == true) {
                pausado2.boton = false;
                synchronized (pausado2) {
                    pausado2.notify();
                }
            } else {
                pausado2.boton = true;
            }
        } else if (jcbBotones.getSelectedItem().equals("Boton 3")) {
            if (pausado3.parado() == true) {
                pausado3.boton = false;
                synchronized (pausado3) {
                    pausado3.notify();
                }
            } else {
                pausado3.boton = true;
            }
        } else if (jcbBotones.getSelectedItem().equals("Boton 4")) {
            if (pausado4.parado() == true) {
                pausado4.boton = false;
                synchronized (pausado4) {
                    pausado4.notify();
                }
            } else {
                pausado4.boton = true;
            }
        } else if (jcbBotones.getSelectedItem().equals("Boton 5")) {
            if (pausado5.parado() == true) {
                pausado5.boton = false;
                synchronized (pausado5) {
                    pausado5.notify();
                }
            } else {
                pausado5.boton = true;
            }
        }

    }//GEN-LAST:event_jbPararActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jbParar;
    private javax.swing.JButton jbVerde1;
    private javax.swing.JButton jbVerde2;
    private javax.swing.JButton jbVerde3;
    private javax.swing.JButton jbVerde4;
    private javax.swing.JButton jbVerde5;
    private javax.swing.JComboBox<String> jcbBotones;
    // End of variables declaration//GEN-END:variables
}
