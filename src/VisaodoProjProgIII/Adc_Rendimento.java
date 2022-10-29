/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VisaodoProjProgIII;

import ClassesdoProjProgIII.Humanos;
import ClassesdoProjProgIII.Rendimento;
import static controlo.Familia_Login.idpessoa;
import controlo.RendimentoBD;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class Adc_Rendimento extends javax.swing.JFrame {

    /**
     * Creates new form Adc_Rendimento
     */
    public Adc_Rendimento() {
        initComponents();
        setSize(1262, 775);
       
        
    }
    public Adc_Rendimento(String valor) {
        initComponents();
        setSize(1262, 775);
      
        valorRendimento.setText(valor);
        
    }
    public ArrayList<Rendimento> Rendimentos = new  ArrayList<>();
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
      public void lerTabelaR() {
              DefaultTableModel tb= (DefaultTableModel) tabelaR.getModel();  
              tb.setNumRows(0);
              for(Rendimento rd: Rendimentos ){
                    tb.addRow(new Object[]{rd.getId(),rd.getOrigem(),rd.getValor(),rd.getDataRend()});
                }
       }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jFrame1 = new javax.swing.JFrame();
        jLabel5 = new javax.swing.JLabel();
        dataRend1 = new javax.swing.JTextField();
        origemRendimento1 = new javax.swing.JTextField();
        valorRendimento1 = new javax.swing.JTextField();
        assa1 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        Voltar1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaR = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        dataRend = new javax.swing.JTextField();
        origemRendimento = new javax.swing.JTextField();
        valorRendimento = new javax.swing.JTextField();
        assa = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        Voltar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        jFrame1.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        jFrame1.getContentPane().setLayout(null);

        jLabel5.setText("YYYY/MM/DD");
        jFrame1.getContentPane().add(jLabel5);
        jLabel5.setBounds(730, 330, 100, 20);
        jFrame1.getContentPane().add(dataRend1);
        dataRend1.setBounds(730, 350, 260, 40);
        jFrame1.getContentPane().add(origemRendimento1);
        origemRendimento1.setBounds(280, 440, 260, 40);
        jFrame1.getContentPane().add(valorRendimento1);
        valorRendimento1.setBounds(280, 350, 260, 40);

        assa1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        assa1.setText("DATA");
        jFrame1.getContentPane().add(assa1);
        assa1.setBounds(650, 360, 47, 20);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel6.setText("ORIGEM");
        jFrame1.getContentPane().add(jLabel6);
        jLabel6.setBounds(180, 450, 80, 20);

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel7.setText("VALOR");
        jFrame1.getContentPane().add(jLabel7);
        jLabel7.setBounds(181, 360, 70, 20);

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton2.setText("ADICIONAR RENDIMENTO");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(jButton2);
        jButton2.setBounds(500, 540, 260, 40);

        Voltar1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Voltar1.setText("Voltar");
        Voltar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Voltar1ActionPerformed(evt);
            }
        });
        jFrame1.getContentPane().add(Voltar1);
        Voltar1.setBounds(100, 620, 140, 40);

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/ADICIONAR RENDIMENTO.png"))); // NOI18N
        jFrame1.getContentPane().add(jLabel8);
        jLabel8.setBounds(0, 0, 1240, 720);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        tabelaR.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        tabelaR.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Id", "ORIGEM", "VALOR", "DATA"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tabelaR);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(320, 400, 580, 250);

        jLabel4.setText("YYYY/MM/DD");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(830, 260, 100, 20);
        getContentPane().add(dataRend);
        dataRend.setBounds(830, 280, 260, 40);
        getContentPane().add(origemRendimento);
        origemRendimento.setBounds(500, 280, 260, 40);

        valorRendimento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                valorRendimentoActionPerformed(evt);
            }
        });
        getContentPane().add(valorRendimento);
        valorRendimento.setBounds(150, 280, 260, 40);

        assa.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        assa.setText("DATA");
        getContentPane().add(assa);
        assa.setBounds(770, 290, 47, 20);

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel3.setText("ORIGEM");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(420, 290, 80, 20);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jLabel2.setText("VALOR");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(90, 290, 70, 20);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        jButton1.setText("ADICIONAR RENDIMENTO");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(470, 350, 260, 40);

        Voltar.setFont(new java.awt.Font("Tahoma", 1, 16)); // NOI18N
        Voltar.setText("Voltar");
        Voltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VoltarActionPerformed(evt);
            }
        });
        getContentPane().add(Voltar);
        Voltar.setBounds(100, 620, 140, 40);

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/VisaodoProjProgIII/Imagens/ADICIONAR RENDIMENTO.png"))); // NOI18N
        getContentPane().add(jLabel1);
        jLabel1.setBounds(0, 0, 1240, 720);

        jLabel9.setText("jLabel9");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(920, 350, 51, 20);

        setSize(new java.awt.Dimension(1263, 775));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void VoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VoltarActionPerformed
        // TODO add your handling code here:
        dispose();
        new Rendimentos().setVisible(true);
    }//GEN-LAST:event_VoltarActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
    
              
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void Voltar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Voltar1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Voltar1ActionPerformed

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        String vR= valorRendimento.getText();
        String dataR= dataRend.getText();
        String origem= origemRendimento.getText();
        float valorRend = Float.parseFloat(vR);
        Rendimento r=new Rendimento(origem, dataR, valorRend);
        RendimentoBD rbd = new RendimentoBD();
        Humanos h = new Humanos(null, null,null,null);
        h.setIdHumanos(idpessoa);
        r.setHumanos(h);
        r.setValor(valorRend);
        r.setOrigem(origem);
        r.setDataRend(dataR);   
        rbd.adicionarRendimento(r);
        Rendimentos.add(r);
        lerTabelaR();
    }//GEN-LAST:event_jButton1MouseClicked

    private void valorRendimentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_valorRendimentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_valorRendimentoActionPerformed

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
            java.util.logging.Logger.getLogger(Adc_Rendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Adc_Rendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Adc_Rendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Adc_Rendimento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Adc_Rendimento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Voltar;
    private javax.swing.JButton Voltar1;
    private javax.swing.JLabel assa;
    private javax.swing.JLabel assa1;
    private javax.swing.JTextField dataRend;
    private javax.swing.JTextField dataRend1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField origemRendimento;
    private javax.swing.JTextField origemRendimento1;
    private javax.swing.JTable tabelaR;
    public static javax.swing.JTextField valorRendimento;
    private javax.swing.JTextField valorRendimento1;
    // End of variables declaration//GEN-END:variables
}
