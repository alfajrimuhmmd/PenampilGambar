/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.awt.CardLayout;

/**
 *
 * @author MUHAMMAD ALFAJRI
 */
public class MenambahakanGambarBox extends javax.swing.JFrame {

    /**
     * Creates new form MenambahakanGambarBox
     */
    public MenambahakanGambarBox() {
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

        pCardLayout = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        pilihanpilihCard = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pCardLayout.setLayout(new java.awt.CardLayout());

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Naruto.jpg"))); // NOI18N
        pCardLayout.add(jLabel2, "0");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/Doraemon.jpeg"))); // NOI18N
        pCardLayout.add(jLabel3, "1");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/gui/One-piece.jpg"))); // NOI18N
        pCardLayout.add(jLabel4, "2");

        getContentPane().add(pCardLayout, java.awt.BorderLayout.CENTER);

        jLabel1.setText("PILIH GAMBAR");
        jPanel2.add(jLabel1);

        pilihanpilihCard.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "NARUTO", "DORAEMON", "ONE PIECE" }));
        pilihanpilihCard.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                pilihanpilihCardItemStateChanged(evt);
            }
        });
        pilihanpilihCard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihanpilihCardActionPerformed(evt);
            }
        });
        jPanel2.add(pilihanpilihCard);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_START);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihanpilihCardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihanpilihCardActionPerformed

    }//GEN-LAST:event_pilihanpilihCardActionPerformed

    private void pilihanpilihCardItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_pilihanpilihCardItemStateChanged

        CardLayout cl = (CardLayout) (pCardLayout.getLayout());
        cl.show(pCardLayout, String.valueOf(pilihanpilihCard.getSelectedIndex()));
    }//GEN-LAST:event_pilihanpilihCardItemStateChanged

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
            java.util.logging.Logger.getLogger(MenambahakanGambarBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenambahakanGambarBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenambahakanGambarBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenambahakanGambarBox.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenambahakanGambarBox().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel pCardLayout;
    private javax.swing.JComboBox<String> pilihanpilihCard;
    // End of variables declaration//GEN-END:variables
}
