/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Application;

/**
 *
 * @author ankithreddy
 */
public class MainJ extends javax.swing.JFrame {

    /**
     * Creates new form MainJFrame
     */
    
    Application application;
    
    public MainJ() {
        initComponents();
        
        this.application = new Application();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jSplitPane1 = new javax.swing.JSplitPane();
        ControlJPanel = new javax.swing.JPanel();
        assignMedicineBtn = new javax.swing.JButton();
        createBtn = new javax.swing.JButton();
        viewVitalSignBtn = new javax.swing.JButton();
        medicineCatalogBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ControlJPanel.setBackground(new java.awt.Color(204, 255, 204));
        ControlJPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        assignMedicineBtn.setText("assign medicine");
        assignMedicineBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMedicineBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(assignMedicineBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 390, 130, 50));

        createBtn.setText("Create");
        createBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(createBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 110, 50));

        viewVitalSignBtn.setText("view");
        viewVitalSignBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                viewVitalSignBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(viewVitalSignBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, 110, 50));

        medicineCatalogBtn.setText("Medicine catalog");
        medicineCatalogBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                medicineCatalogBtnActionPerformed(evt);
            }
        });
        ControlJPanel.add(medicineCatalogBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 290, 150, 50));

        jSplitPane1.setLeftComponent(ControlJPanel);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void assignMedicineBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMedicineBtnActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new MedicineAssignJPanel(this.application));
    }//GEN-LAST:event_assignMedicineBtnActionPerformed

    private void createBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createBtnActionPerformed
        // TODO add your handling code here:
        
        jSplitPane1.setRightComponent(new Create(this.application));
    }//GEN-LAST:event_createBtnActionPerformed

    private void viewVitalSignBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_viewVitalSignBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new View(this.application));
    }//GEN-LAST:event_viewVitalSignBtnActionPerformed

    private void medicineCatalogBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_medicineCatalogBtnActionPerformed
        // TODO add your handling code here:
        jSplitPane1.setRightComponent(new Catalog(this.application));
    }//GEN-LAST:event_medicineCatalogBtnActionPerformed

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
            java.util.logging.Logger.getLogger(MainJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainJ.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJ().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ControlJPanel;
    private javax.swing.JButton assignMedicineBtn;
    private javax.swing.JButton createBtn;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JButton medicineCatalogBtn;
    private javax.swing.JButton viewVitalSignBtn;
    // End of variables declaration//GEN-END:variables
}
