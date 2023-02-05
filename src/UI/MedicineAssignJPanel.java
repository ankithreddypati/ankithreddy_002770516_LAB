/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import Model.Application;
import Model.Medicine;
import Model.Observation;
import java.util.ArrayList;

/**
 *
 * @author ankithreddy
 */
public class MedicineAssignJPanel extends javax.swing.JPanel {

    private Application application;

    /**
     * Creates new form MedicineAssignJPanel
     */

    MedicineAssignJPanel(Application application) {
        initComponents();
        
        this.application = application;
        
        populateDropdowns();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        medicineBox = new javax.swing.JComboBox();
        ObservationBosx = new javax.swing.JComboBox();
        assignMedBtn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(204, 255, 204));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        add(medicineBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 60, 190, 30));

        ObservationBosx.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ObservationBosxItemStateChanged(evt);
            }
        });
        add(ObservationBosx, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 60, 200, 30));

        assignMedBtn.setText("ASSIGN");
        assignMedBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assignMedBtnActionPerformed(evt);
            }
        });
        add(assignMedBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 240, -1, -1));

        jLabel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51), new java.awt.Color(51, 51, 51)));
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 140, 100, 40));
    }// </editor-fold>//GEN-END:initComponents

    private void assignMedBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assignMedBtnActionPerformed
        // TODO add your handling code here:
        
        // assign the selected medicine object to observation
        
        Observation o = (Observation) ObservationBosx.getSelectedItem();
        Medicine m = (Medicine) medicineBox.getSelectedItem();
        
        o.setMedication(m);
        
    }//GEN-LAST:event_assignMedBtnActionPerformed

    private void ObservationBosxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ObservationBosxItemStateChanged
        // TODO add your handling code here:
        Observation o = (Observation) ObservationBosx.getSelectedItem();
        
        if(o.getMedication() != null) {
            jLabel1.setText(o.getMedication().getMedicineName());
        }
        
        
    }//GEN-LAST:event_ObservationBosxItemStateChanged

    public void populateDropdowns() {
        
        ArrayList<Medicine> medicines = this.application.getCatalog().getMedicineList();
        
        ArrayList<Observation> observations = this.application.getHistory().getVitalSignHistory();
        
        for(Observation o: observations) {
            ObservationBosx.addItem(o);
        }
        
        for(Medicine med: medicines) {
            medicineBox.addItem(med);
        }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ObservationBosx;
    private javax.swing.JButton assignMedBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JComboBox medicineBox;
    // End of variables declaration//GEN-END:variables
}