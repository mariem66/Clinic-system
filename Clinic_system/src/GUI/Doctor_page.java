/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;
import Function_database.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import Class.*;
/**
 *
 * @author Mariam Hossam
 */
public class Doctor_page extends javax.swing.JFrame {

    int id ;
    /**
     * Creates new form Doctor_pageI
     
     * @param id
     * @throws java.sql.SQLException
     */
    
    ////constractor 
    
    public Doctor_page(int id) throws SQLException {
        initComponents();
        this.id=id;
    dbconnection con = new dbconnection() ; Connection conn = con.conn();
    PreparedStatement stmt = conn.prepareStatement("select patient_id,name,phone,email,address,"
                 + " age,national_id  from patient  ");
    ResultSet set = stmt.executeQuery();
            DefaultTableModel dm = new DefaultTableModel();
            dm.addColumn("Patient id");
            dm.addColumn("Name");
            dm.addColumn("Phone");
            dm.addColumn("E-mail");
            dm.addColumn("Address");
            dm.addColumn("Age");
            dm.addColumn("National id");
            
            while (set.next()) {
                String r[] = {set.getString(1), set.getString(2), set.getString(3),
                    set.getString(4),set.getString(5), set.getString(6), set.getString(7)};
                dm.addRow(r);
            }

            Table_patient.setModel(dm);
            
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table_patient = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        Tf_data_doctor = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        Butt_exit_doctor = new javax.swing.JButton();
        Butt_delet_doctor = new javax.swing.JButton();
        Butt_submit_doctor = new javax.swing.JButton();
        Butt_update_doctor = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        Tf_patient_info = new javax.swing.JTextField();
        Butt_Search_patient = new javax.swing.JButton();
        Comb_select_patient_info = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane4 = new javax.swing.JScrollPane();
        symp_tf = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Doctor Page");

        jPanel1.setBackground(new java.awt.Color(185, 219, 237));
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Doctor Page", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 24))); // NOI18N

        Table_patient.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Patient ID", "Name", "Phone", "E-mail", "Address", "Age", "National ID"
            }
        ));
        Table_patient.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Table_patientMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(Table_patient);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setText("Date of consulation");

        Tf_data_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Tf_data_doctorActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Info about illness ");

        Butt_exit_doctor.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        Butt_exit_doctor.setText("Exit");
        Butt_exit_doctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(112, 14, 3)));
        Butt_exit_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_exit_doctorActionPerformed(evt);
            }
        });

        Butt_delet_doctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Butt_delet_doctor.setText("Delete ");
        Butt_delet_doctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(222, 9, 9)));
        Butt_delet_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_delet_doctorActionPerformed(evt);
            }
        });

        Butt_submit_doctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Butt_submit_doctor.setText("Submit Consulation");
        Butt_submit_doctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(28, 29, 201)));
        Butt_submit_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_submit_doctorActionPerformed(evt);
            }
        });

        Butt_update_doctor.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        Butt_update_doctor.setText("Update Consulation");
        Butt_update_doctor.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(219, 242, 5)));
        Butt_update_doctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_update_doctorActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Search");

        Butt_Search_patient.setText("Search");
        Butt_Search_patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Butt_Search_patientActionPerformed(evt);
            }
        });

        Comb_select_patient_info.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Patient ID", "Name", "Phone", "E-mail", "Address", "National ID" }));

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane2.setViewportView(jTextArea1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setText("Treatment Plan:");

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "." }));

        symp_tf.setColumns(20);
        symp_tf.setRows(5);
        jScrollPane4.setViewportView(symp_tf);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Symptoms:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel2))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 560, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10)
                .addGap(12, 12, 12))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(47, 47, 47)
                .addComponent(Tf_data_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 312, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(53, 53, 53)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(155, 155, 155))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(Butt_update_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Butt_exit_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Butt_delet_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(Butt_submit_doctor, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE))
                        .addGap(52, 52, 52))))
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 629, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(Tf_patient_info, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Comb_select_patient_info, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(Butt_Search_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 222, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Comb_select_patient_info, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(Tf_patient_info, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Butt_Search_patient, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)))
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Tf_data_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel6))
                    .addComponent(jLabel1))
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(jLabel10))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Butt_update_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Butt_submit_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(92, 92, 92)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Butt_delet_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Butt_exit_doctor, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Butt_Search_patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt_Search_patientActionPerformed
       dbconnection con = new dbconnection() ; Connection conn;
        try {
            conn = con.conn();
            PreparedStatement stmt = conn.prepareStatement("");
             ResultSet set = stmt.executeQuery();
            DefaultTableModel dm = new DefaultTableModel();
        int index = Comb_select_patient_info.getSelectedIndex();
        switch (index) {
            case 0:  //id
                
            dm.addColumn("Patient id");
            dm.addColumn("Name");
            dm.addColumn("Phone");
            dm.addColumn("E-mail");
            dm.addColumn("Address");
            dm.addColumn("Age");
            dm.addColumn("National id");
            
            while (set.next()) {
                String r[] = {set.getString(1), set.getString(2), set.getString(3),
                    set.getString(4),set.getString(5), set.getString(6), set.getString(7)};
                dm.addRow(r);
            }

            Table_patient.setModel(dm);
                
            break;
                
            case 1: //new
               
                break;
                
      
            case 2: //con
                
             break;
                //
            case 3: //admin
                //
                    break;
                   
        }
        } catch (SQLException ex) {}

       
                
        
        
        
        
        
        
        
        
        
        
    }//GEN-LAST:event_Butt_Search_patientActionPerformed

    private void Butt_update_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt_update_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Butt_update_doctorActionPerformed

    private void Butt_submit_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt_submit_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Butt_submit_doctorActionPerformed

    private void Butt_delet_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt_delet_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Butt_delet_doctorActionPerformed

    private void Butt_exit_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Butt_exit_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Butt_exit_doctorActionPerformed

    private void Tf_data_doctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Tf_data_doctorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Tf_data_doctorActionPerformed

    private void Table_patientMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Table_patientMouseClicked
        dbconnection con = new dbconnection() ; Connection conn;
        try {
            conn = con.conn();
        int row_num = Table_patient.getSelectedRow();
        int ID = (int) Table_patient.getValueAt(row_num, 0);
        PreparedStatement stmt = conn.prepareStatement("select symptom from patient"
                + " where patiend_id='"+ ID + "'");
        
        symp_tf.setText( String.valueOf(ID));
        } catch (SQLException ex) {}
        
        
    }//GEN-LAST:event_Table_patientMouseClicked

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
            java.util.logging.Logger.getLogger(Doctor_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Doctor_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Doctor_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Doctor_page.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            
            @Override
            public void run() {
                try {
                    new Doctor_page(0).setVisible(true);
                } catch (SQLException ex) {}
            }

          
           
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Butt_Search_patient;
    private javax.swing.JButton Butt_delet_doctor;
    private javax.swing.JButton Butt_exit_doctor;
    private javax.swing.JButton Butt_submit_doctor;
    private javax.swing.JButton Butt_update_doctor;
    private javax.swing.JComboBox<String> Comb_select_patient_info;
    private javax.swing.JTable Table_patient;
    private javax.swing.JTextField Tf_data_doctor;
    private javax.swing.JTextField Tf_patient_info;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea symp_tf;
    // End of variables declaration//GEN-END:variables
}
