/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisaodoProjProgIII;

import ClassesdoProjProgIII.Dizimo;
import ClassesdoProjProgIII.Humanos;
import controlo.DizimoBD;
import static controlo.Familia_Login.idfamilia;
import static controlo.Familia_Login.idpessoa;
import controlo.PrevisaoBD;
import controlo.RendimentoBD;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author HP
 */
public class Fornecer_Dizimos extends javax.swing.JFrame {
    
    
    public Fornecer_Dizimos() {
        initComponents();
        setSize(1260, 775);
        dispose();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        fornecerDizimo = new javax.swing.JButton();
        dataDiz = new javax.swing.JTextField();
        instituicaoBenif = new javax.swing.JTextField();
        XZXX = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel4.setText("YYYY/MM/DD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(660, 350, 150, 20);

        fornecerDizimo.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        fornecerDizimo.setText("FAZER A DOAÇÃO");
        fornecerDizimo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fornecerDizimoActionPerformed(evt);
            }
        });
        getContentPane().add(fornecerDizimo);
        fornecerDizimo.setBounds(520, 560, 190, 40);

        dataDiz.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dataDizActionPerformed(evt);
            }
        });
        getContentPane().add(dataDiz);
        dataDiz.setBounds(660, 370, 260, 40);
        getContentPane().add(instituicaoBenif);
        instituicaoBenif.setBounds(660, 290, 260, 40);

        XZXX.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        XZXX.setText("DATA");
        getContentPane().add(XZXX);
        XZXX.setBounds(350, 390, 90, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("INSTITUIÇÃO BENIFICIARIA ");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(350, 300, 239, 20);

        Voltar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(100, 620, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/FORNECER DIZIMO.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1240, 720);

        setSize(new java.awt.Dimension(1282, 776));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Dizimos().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void fornecerDizimoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fornecerDizimoActionPerformed
      
        Float valorD = null;
        Float aux = null;
        String instituicao= instituicaoBenif.getText();
          float desc1;
    try {
        desc1 = PrevisaoBD.descontos1(idpessoa) + PrevisaoBD.somaPrev(idfamilia) + PrevisaoBD.descontos2(idfamilia);
        Login.saldo= RendimentoBD.somaRendimentos(idpessoa)-(desc1);
        valorD= Login.saldo*0.1f;
    } catch (SQLException ex) {
        Logger.getLogger(Adc_Valores_Pou.class.getName()).log(Level.SEVERE, null, ex);
    }   
    
        String dataD= dataDiz.getText();
        //Humanos humanos;
        //RendimentoBD.somaRendimentos(humanos.idHumanos);

        //valorD = (0.1*aux);
        Dizimo d=new Dizimo(valorD, instituicao, dataD);
        DizimoBD db= new DizimoBD();
        Humanos h = new Humanos(null, null, null, null);
        
        Login.saldo=Login.saldo-valorD;
        
        h.setIdHumanos(idpessoa);
        d.setHumanos(h);
        db.adicionarDizimo(d);  
    }//GEN-LAST:event_fornecerDizimoActionPerformed

    private void dataDizActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dataDizActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dataDizActionPerformed

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
            java.util.logging.Logger.getLogger(Fornecer_Dizimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Fornecer_Dizimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Fornecer_Dizimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Fornecer_Dizimos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Fornecer_Dizimos().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel XZXX;
    private javax.swing.JTextField dataDiz;
    private javax.swing.JButton fornecerDizimo;
    private javax.swing.JTextField instituicaoBenif;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}