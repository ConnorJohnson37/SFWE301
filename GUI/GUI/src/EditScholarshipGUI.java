/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author adria
 */
public class EditScholarshipGUI extends javax.swing.JFrame {

    /**
     * Creates new form EditScholarshipGUI
     */
    public EditScholarshipGUI() {
        initComponents();
        populateScrollPane();
        this.setVisible(true);
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
        topBanner = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        oldName = new javax.swing.JLabel();
        newName = new javax.swing.JTextField();
        titleOld = new javax.swing.JLabel();
        titleNew = new javax.swing.JLabel();
        titleName = new javax.swing.JLabel();
        nameLabel = new javax.swing.JLabel();
        deadlineLabel = new javax.swing.JLabel();
        oldDeadline = new javax.swing.JLabel();
        newDeadline = new javax.swing.JTextField();
        amountLabel = new javax.swing.JLabel();
        oldAmount = new javax.swing.JLabel();
        newAmount = new javax.swing.JTextField();
        GPALabel = new javax.swing.JLabel();
        oldGPA = new javax.swing.JLabel();
        newGPA = new javax.swing.JTextField();
        majorLabel = new javax.swing.JLabel();
        oldMajor = new javax.swing.JLabel();
        newMajor = new javax.swing.JTextField();
        descriptionLabel = new javax.swing.JLabel();
        oldDescription = new javax.swing.JLabel();
        newDescription = new javax.swing.JTextField();
        submitEdit = new javax.swing.JButton();
        homeButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        topBanner.setBackground(new java.awt.Color(171, 5, 32));
        topBanner.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        topBanner.setIcon(new javax.swing.ImageIcon(getClass().getResource("UAlogo.png"))); // NOI18N
        topBanner.setText("                                       Edit Scholarship");
        topBanner.setToolTipText("");
        topBanner.setOpaque(true);
        topBanner.setFont(topBanner.getFont().deriveFont(26f));

        jLabel1.setBackground(new java.awt.Color(12, 35, 75));
        jLabel1.setOpaque(true);

        oldName.setText("Scholarship Name");
        oldName.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        oldName.setHorizontalTextPosition(javax.swing.SwingConstants.LEFT);
        oldName.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        newName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newNameActionPerformed(evt);
            }
        });

        titleOld.setText("Old Field");

        titleNew.setText("New Field");

        titleName.setText("Field Name");

        nameLabel.setText("Scholarship Name:");
        nameLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        deadlineLabel.setText("<html><p>Application Deadline</p><p>Format (mm/dd/yyyy)</p>");
        deadlineLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        deadlineLabel.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        deadlineLabel.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        oldDeadline.setText("(07/09/1990)");
        oldDeadline.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        oldDeadline.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        amountLabel.setText("Amount ($)");
        amountLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        oldAmount.setText("20000");
        oldAmount.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        GPALabel.setText("Prefered GPA");
        GPALabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        oldGPA.setText(">3.5");
        oldGPA.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        majorLabel.setText("Prefered Majors");
        majorLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        oldMajor.setText("ECE, SFWE");
        oldMajor.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        descriptionLabel.setText("Description");
        descriptionLabel.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        oldDescription.setText("<html><p>New scholarship for students in a</p> <p>computer related field</p>");
        oldDescription.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        submitEdit.setText("Update");
        submitEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                submitEditActionPerformed(evt);
            }
        });

        homeButton.setText("Admin Home");
        homeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                homeButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(topBanner, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(homeButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(deadlineLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(amountLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleName)
                            .addComponent(GPALabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(majorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                        .addGap(30, 30, 30)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oldDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(titleOld)
                            .addComponent(oldAmount, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oldGPA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oldMajor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oldDescription))))
                .addGap(57, 57, 57)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(newDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                        .addComponent(titleNew)
                        .addComponent(newName)
                        .addComponent(newAmount)
                        .addComponent(newGPA)
                        .addComponent(newMajor))
                    .addComponent(newDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(submitEdit))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(topBanner, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(titleOld)
                            .addComponent(titleNew)
                            .addComponent(titleName))
                        .addGap(27, 27, 27)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(oldName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newName, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addComponent(nameLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deadlineLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 41, Short.MAX_VALUE)
                            .addComponent(newDeadline)
                            .addComponent(oldDeadline, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(newAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(newGPA, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(amountLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(oldGPA, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                                    .addComponent(GPALabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(majorLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(oldMajor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(newMajor, javax.swing.GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(newDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(descriptionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(oldDescription, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(submitEdit)
                        .addGap(15, 15, 15))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(homeButton)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void newNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_newNameActionPerformed

    private void submitEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_submitEditActionPerformed
        //on submit, set the old fields to the new fields
        if (!newAmount.getText().equals("")) {
            oldAmount.setText(newAmount.getText());
        }
        if (!newName.getText().equals("")) {
            oldName.setText(newName.getText());
        }
        if (!newDeadline.getText().equals("")) {
            oldDeadline.setText(newDeadline.getText());
        }
        if (!newGPA.getText().equals("")) {
            oldGPA.setText(newGPA.getText());
        }
        if (!newMajor.getText().equals("")) {
            oldMajor.setText(newMajor.getText());
        }
        if (!newDescription.getText().equals("")) {
            oldDescription.setText(newDescription.getText());
        }
    }//GEN-LAST:event_submitEditActionPerformed

    private void homeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_homeButtonActionPerformed
        this.dispose();
    }//GEN-LAST:event_homeButtonActionPerformed
    
    private void populateScrollPane() {
        //first check to see if old text existss (field was filled on creation)
        //can replace with getting text from scholarship object
        if (!oldAmount.getText().equals("")) {
            newAmount.setText(oldAmount.getText());
        }
        if (!oldName.getText().equals("")) {
            newName.setText(oldName.getText());
        }
        if (!oldDeadline.getText().equals("")) {
            newDeadline.setText(oldDeadline.getText());
        }
        if (!oldGPA.getText().equals("")) {
            newGPA.setText(oldGPA.getText());
        }
        if (!oldMajor.getText().equals("")) {
            newMajor.setText(oldMajor.getText());
        }
        if (!oldDescription.getText().equals("")) {
            newDescription.setText(oldDescription.getText());
        }
    }
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
            java.util.logging.Logger.getLogger(EditScholarshipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditScholarshipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditScholarshipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditScholarshipGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditScholarshipGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel GPALabel;
    private javax.swing.JLabel amountLabel;
    private javax.swing.JLabel deadlineLabel;
    private javax.swing.JLabel descriptionLabel;
    private javax.swing.JButton homeButton;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel majorLabel;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField newAmount;
    private javax.swing.JTextField newDeadline;
    private javax.swing.JTextField newDescription;
    private javax.swing.JTextField newGPA;
    private javax.swing.JTextField newMajor;
    private javax.swing.JTextField newName;
    private javax.swing.JLabel oldAmount;
    private javax.swing.JLabel oldDeadline;
    private javax.swing.JLabel oldDescription;
    private javax.swing.JLabel oldGPA;
    private javax.swing.JLabel oldMajor;
    private javax.swing.JLabel oldName;
    private javax.swing.JButton submitEdit;
    private javax.swing.JLabel titleName;
    private javax.swing.JLabel titleNew;
    private javax.swing.JLabel titleOld;
    private javax.swing.JLabel topBanner;
    // End of variables declaration//GEN-END:variables
}
