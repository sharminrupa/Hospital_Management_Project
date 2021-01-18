package hospitalmanagemen;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import project.DBConnection;

public class UploadPatientRecord extends javax.swing.JFrame {
   Connection conn = null;
    ResultSet rs;
    
    public UploadPatientRecord() {
        initComponents();
        setTitle("Update patient record");
        setLocationRelativeTo(null);
        
        try {
            conn = DBConnection.getConn();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        u_descess = new javax.swing.JTextField();
        u_id = new javax.swing.JTextField();
        u_name = new javax.swing.JTextField();
        u_contuct = new javax.swing.JTextField();
        u_age = new javax.swing.JTextField();
        u_address = new javax.swing.JTextField();
        u_bgroup = new javax.swing.JTextField();
        search = new javax.swing.JButton();
        update = new javax.swing.JButton();
        close = new javax.swing.JButton();
        u_gender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Patient Id:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, -1, -1));

        jLabel2.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, -1, -1));

        jLabel3.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contuct No:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, -1, -1));

        jLabel4.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Age:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 280, -1, -1));

        jLabel6.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Blood Group:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Any Mejor descis suffer:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 390, -1, -1));

        u_descess.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(u_descess, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 430, 341, -1));

        u_id.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(u_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 110, 259, -1));

        u_name.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(u_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 150, 259, -1));

        u_contuct.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(u_contuct, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 190, 258, -1));

        u_age.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        u_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                u_ageActionPerformed(evt);
            }
        });
        getContentPane().add(u_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 230, 259, -1));

        u_address.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(u_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 350, 259, -1));

        u_bgroup.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        getContentPane().add(u_bgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 310, 259, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/src.png"))); // NOI18N
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 110, -1, -1));

        update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/save.png"))); // NOI18N
        update.setText("Update");
        update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        getContentPane().add(update, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 480, -1, -1));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/close 2.png"))); // NOI18N
        close.setText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 480, -1, -1));

        u_gender.setFont(new java.awt.Font("Agency FB", 1, 18)); // NOI18N
        u_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(u_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 270, 259, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Update Patient Record");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 40, -1, -1));

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/src_bg.jpg"))); // NOI18N
        jLabel11.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void u_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_u_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_u_ageActionPerformed

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
                        
        try {
            String sql = " select * from patient_add where id =? ";
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
            int id = Integer.parseInt(u_id.getText());
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                String contuct = rs.getString("contuct");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String bgroup = rs.getString("bgroup");
                String address = rs.getString("address");
                String descess = rs.getString("any_descess");
                
                u_name.setText(rs.getString(2));
                u_contuct.setText(rs.getString(3));
                u_age.setText(rs.getString(4));
                u_gender.setSelectedItem(rs.getString(5));
                u_bgroup.setText(rs.getString(6));
                u_address.setText(rs.getString(7));
                u_descess.setText(rs.getString(8));
                u_id.setEditable(false);
                
            }else{
                JOptionPane.showMessageDialog(this, "Patient Id does not exist!");
            
            }
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        } 
        
    }//GEN-LAST:event_searchActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        
        String name = u_name.getText();
        String contuct = u_contuct.getText();
        String age = u_age.getText();
        String gender = (String)u_gender.getSelectedItem();
        String bgroup = u_bgroup.getText();
        String address = u_address.getText();
        String any_descess = u_descess.getText();
        int id = Integer.parseInt(u_id.getText());
        
        
        String sql = "update patient_add "
                     + " set name = ?, contuct = ?, age = ?, gender = ?, bgroup = ?, address = ?, any_descess = ? "
                     + " where id = ? ";
                
        try {
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, name);
            pst.setString(2, contuct);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5, bgroup);
            pst.setString(6, address);
            pst.setString(7, any_descess);
            pst.setInt(8, id);
            int rs = pst.executeUpdate();
            
            if (rs>0) {
                JOptionPane.showMessageDialog(null, "Success patient update");
                setVisible(false);
                new UploadPatientRecord().setVisible(true);
            
            }
            else{
                JOptionPane.showMessageDialog(null, "Failed patient update");
            
            }
            
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }//GEN-LAST:event_updateActionPerformed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UploadPatientRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JButton search;
    private javax.swing.JTextField u_address;
    private javax.swing.JTextField u_age;
    private javax.swing.JTextField u_bgroup;
    private javax.swing.JTextField u_contuct;
    private javax.swing.JTextField u_descess;
    private javax.swing.JComboBox<String> u_gender;
    private javax.swing.JTextField u_id;
    private javax.swing.JTextField u_name;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
