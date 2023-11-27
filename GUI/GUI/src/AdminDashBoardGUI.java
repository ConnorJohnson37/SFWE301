import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListSelectionModel;

public class AdminDashBoardGUI extends javax.swing.JFrame {
    
    DefaultListModel defaultListModel = new DefaultListModel();
    /**
     * Creates new form AdminDashBoardGUI
     */
    public AdminDashBoardGUI() {
        initComponents();
        this.bindData();
        this.setVisible(true);
    }
    
    private ArrayList getScholarships(){
        ArrayList scholarships = new ArrayList();
        scholarships.add("Scholarship for Special Needs Students");
        scholarships.add("Autism Speaks");
        scholarships.add("AZ School for the Deaf and Blind");
        scholarships.add("Batman Scholarship (for orphaned students only)");
        scholarships.add("Scholarship for people with unfortunate names");
        
        return scholarships;
    }
    
    private void bindData(){
        /*getScholarships().stream().forEach(scholarship) -> {
            defaultListModel.addElement(scholarship);
        });*/
        int i;
        ArrayList scholarships2 = getScholarships();
        
        for (i=0;i<scholarships2.size();i++){
            defaultListModel.addElement(scholarships2.get(i));
        }
        scholarshipList.setModel(defaultListModel);
        scholarshipList.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
    }
    
    private void searchFilter(String searchTerm){
        DefaultListModel filteredItems = new DefaultListModel();
        ArrayList scholarships3 = getScholarships();
        int num = 0;
        for (int i = 0; i < scholarships3.size(); i++){
            String scholarshipName = scholarships3.get(i).toString().toLowerCase();
            if (scholarshipName.contains(searchTerm.toLowerCase())){
                filteredItems.addElement(scholarships3.get(i));
                num++;
            }
        }
        if (num == 0){
            filteredItems.addElement("No matching scholarships");
        }
        defaultListModel = filteredItems;
        scholarshipList.setModel(defaultListModel);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.JPanel titlePanel = new javax.swing.JPanel();
        javax.swing.JLabel logoLabel = new javax.swing.JLabel();
        javax.swing.JLabel titleLabel = new javax.swing.JLabel();
        javax.swing.JLabel searchPromptLabel = new javax.swing.JLabel();
        searchField = new javax.swing.JTextField();
        javax.swing.JScrollPane scrollPanel = new javax.swing.JScrollPane();
        scholarshipList = new javax.swing.JList<>();
        javax.swing.JButton searchButton = new javax.swing.JButton();
        javax.swing.JButton addButton = new javax.swing.JButton();
        javax.swing.JButton editButton = new javax.swing.JButton();
        javax.swing.JButton deleteButton = new javax.swing.JButton();
        javax.swing.JButton reportButton = new javax.swing.JButton();
        javax.swing.JButton reviewButton = new javax.swing.JButton();
        javax.swing.JButton furtherReviewButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(400, 300));
        setPreferredSize(new java.awt.Dimension(800, 600));

        titlePanel.setBackground(new java.awt.Color(255, 51, 51));
        titlePanel.setPreferredSize(new java.awt.Dimension(800, 100));

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("UAlogo.png"))); // NOI18N

        titleLabel.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        titleLabel.setText("Admin Dashboard");

        javax.swing.GroupLayout titlePanelLayout = new javax.swing.GroupLayout(titlePanel);
        titlePanel.setLayout(titlePanelLayout);
        titlePanelLayout.setHorizontalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, titlePanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(titleLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 427, Short.MAX_VALUE)
                .addComponent(logoLabel)
                .addGap(50, 50, 50))
        );
        titlePanelLayout.setVerticalGroup(
            titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titlePanelLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(titlePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(titleLabel)
                    .addComponent(logoLabel))
                .addGap(26, 26, 26))
        );

        searchPromptLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        searchPromptLabel.setText("Enter Scholarship Name or Keyword:");

        searchField.setToolTipText("");
        searchField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchFieldKeyReleased(evt);
            }
        });

        scholarshipList.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Scholarship for Special Needs Students", "Autism Speaks", "AZ School for the Deaf and Blind", "Batman Scholarship (for orphaned students only)" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        scrollPanel.setViewportView(scholarshipList);

        searchButton.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        addButton.setText("Add");
        addButton.setToolTipText("");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        editButton.setText("Edit");
        editButton.setToolTipText("");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        deleteButton.setText("Delete");
        deleteButton.setToolTipText("");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        reportButton.setText("Download Report");
        reportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reportButtonActionPerformed(evt);
            }
        });

        reviewButton.setText("Review Applicants");
        reviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                reviewButtonActionPerformed(evt);
            }
        });

        furtherReviewButton.setText("Further Review");
        furtherReviewButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                furtherReviewButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(titlePanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1054, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchPromptLabel)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(searchField)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchButton))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(addButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reportButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(reviewButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(furtherReviewButton))
                            .addComponent(scrollPanel))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(titlePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchPromptLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(scrollPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton)
                    .addComponent(editButton)
                    .addComponent(deleteButton)
                    .addComponent(reportButton)
                    .addComponent(reviewButton)
                    .addComponent(furtherReviewButton))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
        ScholarshipCreation scGUI = new ScholarshipCreation();
        
    }//GEN-LAST:event_addButtonActionPerformed

    private void searchFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchFieldKeyReleased
        //searchFilter(searchField.getText());
    }//GEN-LAST:event_searchFieldKeyReleased

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editButtonActionPerformed
        int row = scholarshipList.getSelectedIndex();
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    "No scholarship selected. Please select a scholaship", 
                    "Select Scholarship", 
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            //open Scholarship Edit GUI
            EditScholarshipGUI esGUI = new EditScholarshipGUI();
        }
    }//GEN-LAST:event_editButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        int row = scholarshipList.getSelectedIndex();
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    "No scholarship selected. Please select a scholarship", 
                    "Select Scholarship", 
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            int reply = JOptionPane.showConfirmDialog(this,
                    "Are you sure you want to delete this scholarship?", 
                    "Deleting Scholarship", 
                    JOptionPane.YES_NO_OPTION);
            if (reply == JOptionPane.YES_OPTION) {
                JOptionPane.showMessageDialog(this, "Scholarship Deleted");
            } 
        }
    }//GEN-LAST:event_deleteButtonActionPerformed

    private void reportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_reportButtonActionPerformed
        // TODO add your handling code here:
        int row = scholarshipList.getSelectedIndex();
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    "No scholarship selected. Please select a scholaship", 
                    "Select Scholarship", 
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            JOptionPane.showMessageDialog(this,
                    "Report Generated", 
                    "Report", 
                    JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_reportButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        searchFilter(searchField.getText());
    }//GEN-LAST:event_searchButtonActionPerformed


    private void reviewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int row = scholarshipList.getSelectedIndex();
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    "No scholarship selected. Please select a scholarship", 
                    "Select Scholarship", 
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            ReviewGUI rGUI = new ReviewGUI();
        }
    }

    private void furtherReviewButtonActionPerformed(java.awt.event.ActionEvent evt) {
        int row = scholarshipList.getSelectedIndex();
        if (row <0){
            JOptionPane.showMessageDialog(this,
                    "No scholarship selected. Please select a scholarship", 
                    "Select Scholarship", 
                    JOptionPane.ERROR_MESSAGE);
        }
        else {
            FurtherReviewGUI frGUI = new FurtherReviewGUI();
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
            java.util.logging.Logger.getLogger(AdminDashBoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminDashBoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminDashBoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminDashBoardGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminDashBoardGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> scholarshipList;
    private javax.swing.JTextField searchField;
    // End of variables declaration//GEN-END:variables
}