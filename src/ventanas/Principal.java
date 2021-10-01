/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventanas;

import clases.Moneda;

/**
 *
 * @author pablo
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
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
        jLabel1 = new javax.swing.JLabel();
        txt_Pesos = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        cmb_monedas = new javax.swing.JComboBox<>();
        txt_Moneda = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Introduce cantidad en pesos:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 30, -1, -1));

        txt_Pesos.setForeground(new java.awt.Color(187, 81, 136));
        jPanel1.add(txt_Pesos, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 60, 160, -1));

        jButton1.setText("Convertir");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 120, 160, -1));

        cmb_monedas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Dólares", "Yenes", "Euros" }));
        jPanel1.add(cmb_monedas, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 60, 110, -1));

        txt_Moneda.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        txt_Moneda.setForeground(new java.awt.Color(187, 214, 61));
        txt_Moneda.setText("0");
        jPanel1.add(txt_Moneda, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 220, 100, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 310));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        
        Moneda m = new Moneda(Double.valueOf(this.txt_Pesos.getText()));
        
        double mds[] = new double[3];
        
        mds = m.getConversion();
        
        if (this.cmb_monedas.getSelectedIndex() == 0) {
            
            this.txt_Moneda.setText(String.valueOf(mds[0]));
            
        } else if(this.cmb_monedas.getSelectedIndex() == 1){
            
            this.txt_Moneda.setText(String.valueOf(mds[1]));
            
        }else if(this.cmb_monedas.getSelectedIndex() == 2){
            
            this.txt_Moneda.setText(String.valueOf(mds[2]));
            
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cmb_monedas;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel txt_Moneda;
    private javax.swing.JTextField txt_Pesos;
    // End of variables declaration//GEN-END:variables
}