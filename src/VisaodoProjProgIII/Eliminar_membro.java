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
public class Eliminar_membro extends javax.swing.JFrame {

    /**
     * Creates new form Eliminar_membro
     */
    public Eliminar_membro() {
        initComponents();
         setSize(1258, 780);
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

        jButton1 = new javax.swing.JButton();
        emailEli = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        nomeEli = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Voltar = new javax.swing.JButton();
        eliminarMembro = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("ELIMINAR MEMBRO");
        getContentPane().add(jButton1);
        jButton1.setBounds(520, 470, 200, 50);
        getContentPane().add(emailEli);
        emailEli.setBounds(750, 290, 260, 40);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel3.setText("E-MAIL");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(660, 300, 80, 22);
        getContentPane().add(nomeEli);
        nomeEli.setBounds(270, 290, 260, 40);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setText("NOME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(200, 300, 70, 22);

        Voltar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.setActionCommand("voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(100, 620, 140, 40);

        eliminarMembro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/eliminar membro da familia.png"))); // NOI18N
        getContentPane().add(eliminarMembro);
        eliminarMembro.setBounds(-5, 4, 1240, 720);

        setSize(new java.awt.Dimension(1258, 779));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Meu_Perfil(pessoa).setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

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
            java.util.logging.Logger.getLogger(Eliminar_membro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Eliminar_membro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Eliminar_membro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Eliminar_membro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Eliminar_membro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JLabel eliminarMembro;
    private javax.swing.JTextField emailEli;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nomeEli;
    // End of variables declaration//GEN-END:variables
}