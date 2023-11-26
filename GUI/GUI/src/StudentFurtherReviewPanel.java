/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package sfwe301;

import java.awt.GridLayout;
import javax.swing.ButtonGroup;
import javax.swing.JOptionPane;

/**
 *
 * @author micha
 */
public class StudentFurtherReviewPanel extends javax.swing.JPanel {
    private ButtonGroup apprejGroup = new ButtonGroup();
    /**
     * Creates new form StudentFurtherReviewPanel
     */
    public StudentFurtherReviewPanel() {
        initComponents();
        groupButtons();
    }
    
    public void groupButtons() {
        apprejGroup.add(this.approveButton);
        apprejGroup.add(this.rejectButton);
    }
    
    public void setStudentName(String s) {
        this.applicantName.setText(s);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        applicantName = new javax.swing.JLabel();
        approveButton = new javax.swing.JRadioButton();
        rejectButton = new javax.swing.JRadioButton();
        submitButton = new javax.swing.JButton();

        setBackground(new java.awt.Color(204, 204, 204));

        applicantName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        applicantName.setText("Applicant Name: ");

        approveButton.setBackground(new java.awt.Color(204, 204, 204));
        approveButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        approveButton.setText("Approve");

        rejectButton.setBackground(new java.awt.Color(204, 204, 204));
        rejectButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        rejectButton.setText("Reject");
        rejectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rejectButtonActionPerformed(evt);
            }
        });

        submitButton.setBackground(new java.awt.Color(0, 0, 51));
        submitButton.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        submitButton.setForeground(new java.awt.Color(255, 255, 255));
        submitButton.setText("Submit");
        submitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(applicantName, javax.swing.GroupLayout.DEFAULT_SIZE, 632, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(approveButton)
                .addGap(18, 18, 18)
                .addComponent(rejectButton)
                .addGap(29, 29, 29)
                .addComponent(submitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rejectButton)
                    .addComponent(approveButton)
                    .addComponent(submitButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(applicantName))
                .addContainerGap(14, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void rejectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rejectButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rejectButtonActionPerformed

    private void submitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitButtonActionPerformed
        // TODO add your handling code here:
        if(this.approveButton.isSelected()) {
            // Set Text to Email Sent
            String text = "Approval Email Sent: " + this.applicantName.getText();
            this.applicantName.setText(text);
        }
        else if (this.rejectButton.isSelected()){   
            // 
            String text = "Rejection Email Sent: " + this.applicantName.getText();
            this.applicantName.setText(text);
        }
        else {
            // No button was selected, prompt the user to enter a valid response
            JOptionPane.showMessageDialog(null, "Warning: Approve or Rejection Needed");
            return;
        }
        this.submitButton.setVisible(false);
        this.approveButton.setEnabled(false);
        this.rejectButton.setEnabled(false);
    }//GEN-LAST:event_submitButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel applicantName;
    private javax.swing.JRadioButton approveButton;
    private javax.swing.JRadioButton rejectButton;
    private javax.swing.JButton submitButton;
    // End of variables declaration//GEN-END:variables
}