/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ChildWelfareCentreUI;

import CWSUtilities.Constants;
import CWSUtilities.DatabaseConnection;
import CWSUtilities.Email;
import CWSUtilities.Validate;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import javax.swing.JOptionPane;
import modelChildWelfareCentre.CaseVerification;
import trials.ComplaineeSignUp;

/**
 *
 * @author nitan
 */
public class CVerificationCAssignCPS extends javax.swing.JFrame {

    /**
     * Creates new form CVerificationCAssignCPS
     */
    String voUsername;
    String[] cpsNamesN = new String[10];
    String[] cpsUsernamesN = new String[10];
    
    public CVerificationCAssignCPS() {
        initComponents();
    }
    
    public CVerificationCAssignCPS(String voUsername) {
        initComponents();
        this.voUsername = voUsername;
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
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableComplaint = new javax.swing.JTable();
        jPanel5 = new javax.swing.JPanel();
        searchColumn = new javax.swing.JComboBox<>();
        searchValue = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtCPSOfficer = new javax.swing.JComboBox<>();
        btnAssign = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtComplaintID = new javax.swing.JTextField();
        btnBack = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(204, 255, 255));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("ASSIGN CPS");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Select a Case", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        tableComplaint.setBackground(new java.awt.Color(205, 195, 227));
        tableComplaint.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ComplaintID", "Level", "VisitDescription", "Legitimacy", "CPS Officer"
            }
        ));
        tableComplaint.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableComplaintMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tableComplaint);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        searchColumn.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        searchColumn.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ComplaintID", "Level" }));

        searchValue.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchValueKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchColumn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(searchValue, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(searchColumn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addComponent(searchValue, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Assign CPS Officer", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Times New Roman", 1, 12))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel2.setText("Choose a CPS Officer:");

        txtCPSOfficer.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        btnAssign.setBackground(new java.awt.Color(205, 195, 227));
        btnAssign.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnAssign.setText("Assign");
        btnAssign.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAssignActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel3.setText("ComplaintID:");

        txtComplaintID.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(431, 431, 431))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPSOfficer, 0, 172, Short.MAX_VALUE)
                            .addComponent(txtComplaintID))
                        .addGap(307, 307, 307))))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(txtComplaintID))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCPSOfficer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addComponent(btnAssign, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        btnBack.setBackground(new java.awt.Color(205, 195, 227));
        btnBack.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(378, 378, 378)
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 346, Short.MAX_VALUE)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(335, 335, 335))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(440, 440, 440))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(86, Short.MAX_VALUE))
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

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        CVerificationCHome CVCH = new CVerificationCHome(voUsername);
            CVCH.show();
            dispose();
    }//GEN-LAST:event_btnBackActionPerformed

    private void searchValueKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchValueKeyReleased
        // TODO add your handling code here:
            DefaultTableModel table = (DefaultTableModel)tableComplaint.getModel();
            String search = searchValue.getText();
            String column = searchColumn.getSelectedItem().toString();
            int index = 0;
            
            if(column == "ComplaintID"){
                index = 0;
                
            }else if(column == "Level"){
                index = 1;
            }

            TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(table);
            tableComplaint.setRowSorter(tr);
            tr.setRowFilter(RowFilter.regexFilter(search, index));
    }//GEN-LAST:event_searchValueKeyReleased

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        DefaultTableModel complaintTable = (DefaultTableModel) tableComplaint.getModel();
        ResultSet resultSet = null;
        try{
            
            resultSet = DatabaseConnection.getComplainVOCPSAssign(voUsername);
            
            while (resultSet.next()){
                String complainID = resultSet.getString(1);
                String level = resultSet.getString(2);
                String description = resultSet.getString(3);
                String legitimacy = resultSet.getString(4);
                String cpsOfficer = resultSet.getString(5);
      
                complaintTable.addRow(new Object[]{complainID,level,description,legitimacy,cpsOfficer});
                
                }
            }catch(Exception e){
                System.out.println("Error while Connecting");
                e.printStackTrace();
            }
        
            String[] cpsNames = new String[10];
            String[] cpsUsernames = new String[10];
            
            ResultSet newSet = null;
            try{
                int j=0;
                newSet = DatabaseConnection.getData(Constants.complaintVOCPS, false);

                while (newSet.next()){
                	cpsUsernames[j] = newSet.getString(1);
			cpsNames[j] = newSet.getString(2)+" "+newSet.getString(3);
                        j++;
                }
            }catch(Exception e){
                System.out.println("Error while Connecting2");
                e.printStackTrace();
            }
            
            cpsNamesN = Arrays.stream(cpsNames).filter(value ->value != null && value.length() > 0).toArray(size -> new String[size]);
            cpsUsernamesN = Arrays.stream(cpsUsernames).filter(value ->value != null && value.length() > 0).toArray(size -> new String[size]);
        
            txtCPSOfficer.setModel(new javax.swing.DefaultComboBoxModel<>(cpsNamesN));

    }//GEN-LAST:event_formWindowOpened

    private void tableComplaintMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableComplaintMouseClicked
        // TODO add your handling code here:
        DefaultTableModel tblModel = (DefaultTableModel)tableComplaint.getModel();
        int selectedRow = tableComplaint.getSelectedRow();
        //Set data to text fields
        
        String complainID = tblModel.getValueAt(tableComplaint.getSelectedRow(), 0).toString();
        
        txtComplaintID.setText(complainID);
    }//GEN-LAST:event_tableComplaintMouseClicked

    private void btnAssignActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAssignActionPerformed
        // TODO add your handling code here:
       Integer complaintID = Validate.ConvertIntoNumeric(txtComplaintID.getText());
       String cpsOfficerUsername;
       String cpsOfficerName = txtCPSOfficer.getSelectedItem().toString();
       Date date = new Date();
       String toEmail = "";
       String subject = "Hello";
       String text = "There is an update on you ComplaintId = "+complaintID+" Open the portal to see the status";
       boolean result = false;

       SimpleDateFormat dateFormat = new SimpleDateFormat("MM-dd-yyyy");
       String newdate = dateFormat.format(date);

	if (txtComplaintID.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Please Select a Complain", "Try Again",JOptionPane.ERROR_MESSAGE);
        }else{
		    int indx = Arrays.asList(cpsNamesN).indexOf(cpsOfficerName);
		    cpsOfficerUsername = cpsUsernamesN[indx];
                
		    CaseVerification case1 = new CaseVerification(voUsername,complaintID," "," "," ", cpsOfficerUsername, newdate);
            
                try{
                    DatabaseConnection.updateCaseVerification(case1);
                }catch(Exception e){
                    System.out.println("Error while Connecting");
                    e.printStackTrace();
                }
                
                DatabaseConnection.updateSetStatus(Integer.toString(complaintID), "Child Protection Officer Assigned");
		    
		try{
                    ResultSet newSet1 = null;
                    newSet1 = DatabaseConnection.getComplaineeEmail(Integer.toString(complaintID));

                    while (newSet1.next()){
			  toEmail = newSet1.getString(1);
                    }
                }catch(Exception e){
                	System.out.println("Error while Connecting2");
                	e.printStackTrace();
                }

        
        	try {
                    result = Email.sendEmail(toEmail, subject, text);
        	} catch (Exception ex) {
                    java.util.logging.Logger.getLogger(ComplaineeSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        	}
                
                
            	txtComplaintID.setText("");

		
		DefaultTableModel complaintTable = (DefaultTableModel) tableComplaint.getModel();
                complaintTable.setRowCount(0);	
                ResultSet resultSet = null;
                
                        try{
            
            resultSet = DatabaseConnection.getComplainVOCPSAssign(voUsername);
            
            while (resultSet.next()){
                String complainID = resultSet.getString(1);
                String level = resultSet.getString(2);
                String description = resultSet.getString(3);
                String legitimacy = resultSet.getString(4);
                String cpsOfficer = resultSet.getString(5);
      
                complaintTable.addRow(new Object[]{complainID,level,description,legitimacy,cpsOfficer});
                
                }
            }catch(Exception e){
                System.out.println("Error while Connecting");
                e.printStackTrace();
            }

            JOptionPane.showMessageDialog(this, "CPS Officer Assigned Succesfully");
        
	}
    }//GEN-LAST:event_btnAssignActionPerformed

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
            java.util.logging.Logger.getLogger(CVerificationCAssignCPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CVerificationCAssignCPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CVerificationCAssignCPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CVerificationCAssignCPS.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CVerificationCAssignCPS().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAssign;
    private javax.swing.JButton btnBack;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JComboBox<String> searchColumn;
    private javax.swing.JTextField searchValue;
    private javax.swing.JTable tableComplaint;
    private javax.swing.JComboBox<String> txtCPSOfficer;
    private javax.swing.JTextField txtComplaintID;
    // End of variables declaration//GEN-END:variables
}
