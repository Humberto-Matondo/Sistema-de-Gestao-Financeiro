/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisaodoProjProgIII;

import static VisaodoProjProgIII.Menu.pessoa;

/**
 *
 * @author HP
 */
public class Adc_Membros extends javax.swing.JFrame {

    /**
     * Creates new form Add_Membros
     */
    public Adc_Membros() {
        initComponents();
        setSize(1263, 775);
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

        voltar = new javax.swing.JButton();
        animal = new javax.swing.JButton();
        pai_mae = new javax.swing.JButton();
        filho_a = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        voltar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        voltar.setText("Voltar");
        voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                voltarActionPerformed(evt);
            }
        });
        getContentPane().add(voltar);
        voltar.setBounds(80, 620, 140, 40);

        animal.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        animal.setText("ANIMAL");
        animal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                animalActionPerformed(evt);
            }
        });
        getContentPane().add(animal);
        animal.setBounds(850, 280, 310, 250);

        pai_mae.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        pai_mae.setText("PAI OU MÃE");
        pai_mae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pai_maeActionPerformed(evt);
            }
        });
        getContentPane().add(pai_mae);
        pai_mae.setBounds(460, 280, 310, 250);

        filho_a.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        filho_a.setText("FILHO(A)");
        filho_a.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                filho_aActionPerformed(evt);
            }
        });
        getContentPane().add(filho_a);
        filho_a.setBounds(80, 280, 310, 250);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/Novo Membro.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1240, 720);

        setSize(new java.awt.Dimension(1286, 774));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void filho_aActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_filho_aActionPerformed
        // TODO add your handling code here:
        dispose();
        new adc_Filho().setVisible(true);
    }//GEN-LAST:event_filho_aActionPerformed

    private void animalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_animalActionPerformed
        // TODO add your handling code here:
        dispose();
        new adc_Animal().setVisible(true);
    }//GEN-LAST:event_animalActionPerformed

    private void pai_maeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pai_maeActionPerformed
        // TODO add your handling code here:
        dispose();
        new PaiOuMae().setVisible(true);
    }//GEN-LAST:event_pai_maeActionPerformed

    private void voltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_voltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Meu_Perfil(pessoa).setVisible(true);
    }//GEN-LAST:event_voltarActionPerformed

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
            java.util.logging.Logger.getLogger(Adc_Membros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adc_Membros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adc_Membros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adc_Membros.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adc_Membros().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton animal;
    private javax.swing.JButton filho_a;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton pai_mae;
    private javax.swing.JButton voltar;
    // End of variables declaration//GEN-END:variables
}
