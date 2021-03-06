/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package br.edu.ifsc.sistemaordens;

import Conexao.DBController;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Cliente
 */
public class Tela_Inicial extends javax.swing.JFrame {

    /**
     * Creates new form Tela_Inicial
     */
    public Tela_Inicial() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnCadUsuarios = new javax.swing.JButton();
        btnCadOrdens = new javax.swing.JButton();
        btnMaquinas = new javax.swing.JButton();
        btnSetor = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnListaOrdens = new javax.swing.JButton();
        btnUsuariosCadastrados = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Menu Principal"));

        btnCadUsuarios.setText(" Usuarios");
        btnCadUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadUsuariosActionPerformed(evt);
            }
        });

        btnCadOrdens.setText("Ordens");
        btnCadOrdens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadOrdensActionPerformed(evt);
            }
        });

        btnMaquinas.setText("Maquinas");
        btnMaquinas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaquinasActionPerformed(evt);
            }
        });

        btnSetor.setText("Setor");
        btnSetor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSetorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnSetor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnMaquinas, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                    .addComponent(btnCadUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCadOrdens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(btnSetor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMaquinas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCadUsuarios)
                .addGap(13, 13, 13)
                .addComponent(btnCadOrdens)
                .addContainerGap())
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Listas"));

        btnListaOrdens.setText("OS Abertas");
        btnListaOrdens.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnListaOrdensActionPerformed(evt);
            }
        });

        btnUsuariosCadastrados.setText("Usuarios Cadastrados");
        btnUsuariosCadastrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuariosCadastradosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnListaOrdens, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnUsuariosCadastrados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnListaOrdens)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnUsuariosCadastrados)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnCadUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadUsuariosActionPerformed
        Tela_Cadastro_Usuarios tcu = new Tela_Cadastro_Usuarios();
        tcu.setVisible(true);   
    }//GEN-LAST:event_btnCadUsuariosActionPerformed

    private void btnCadOrdensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadOrdensActionPerformed
        Tela_Cadastro_Ordens tco = new Tela_Cadastro_Ordens();
        tco.setVisible(true);
    }//GEN-LAST:event_btnCadOrdensActionPerformed

    private void btnListaOrdensActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnListaOrdensActionPerformed
       String arqRel = "C:\\Users\\Cliente\\JaspersoftWorkspace\\MyReports\\";
       arqRel += "Ordens_Geradas.jasper";
        try {
            DBController db = new DBController();
            JasperReport rel = (JasperReport) 
                    JRLoader.loadObjectFromFile(arqRel);
            
            db.conectar();
            JasperPrint imp = JasperFillManager.fillReport(rel, 
                                                        null, db.getConexao());
            db.desconectar();
            
            JasperViewer v = new JasperViewer(imp,false);
            v.setTitle("Relat??rio de Ordens");
            v.setVisible(true);            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnListaOrdensActionPerformed

    private void btnSetorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSetorActionPerformed
        Tela_Cadastro_Setor tcs = new Tela_Cadastro_Setor();
        tcs.setVisible(true);
    }//GEN-LAST:event_btnSetorActionPerformed

    private void btnMaquinasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaquinasActionPerformed
        Tela_Cadastro_Maquina mqs = new Tela_Cadastro_Maquina();
        mqs.setVisible(true);
    }//GEN-LAST:event_btnMaquinasActionPerformed

    private void btnUsuariosCadastradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuariosCadastradosActionPerformed
        String arqRel = "C:\\Users\\Cliente\\JaspersoftWorkspace\\MyReports\\";
       arqRel += "Usuario_Cadastrados.jasper";
        try {
            DBController db = new DBController();
            JasperReport rel = (JasperReport) 
                    JRLoader.loadObjectFromFile(arqRel);
            
            db.conectar();
            JasperPrint imp = JasperFillManager.fillReport(rel, 
                                                        null, db.getConexao());
            db.desconectar();
            
            JasperViewer v = new JasperViewer(imp,false);
            v.setTitle("Relat??rio de Usuarios");
            v.setVisible(true);            
        } catch (JRException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_btnUsuariosCadastradosActionPerformed

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
            javax.swing.UIManager.setLookAndFeel(
                    UIManager.getSystemLookAndFeelClassName());
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela_Inicial.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Tela_Inicial().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadOrdens;
    private javax.swing.JButton btnCadUsuarios;
    private javax.swing.JButton btnListaOrdens;
    private javax.swing.JButton btnMaquinas;
    private javax.swing.JButton btnSetor;
    private javax.swing.JButton btnUsuariosCadastrados;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
