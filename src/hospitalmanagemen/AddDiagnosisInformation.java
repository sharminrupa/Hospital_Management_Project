package hospitalmanagemen;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import project.DBConnection;

public class AddDiagnosisInformation extends javax.swing.JFrame {

    private static Connection conn = null;
    ResultSet rs;
    int flag = 0;

    public AddDiagnosisInformation() {
        initComponents();
        setTitle("Add diagnosis patient Information");

        patient_not_exit.setVisible(false);
        typeLabel.setVisible(false);
        type_word.setVisible(false);

        try {
            conn = DBConnection.getConn();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        search_label = new javax.swing.JLabel();
        p_id = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        search_table = new javax.swing.JTable();
        patient_not_exit = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        p_symptom = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        p_diagnosis = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        p_medicine = new javax.swing.JTextField();
        typeLabel = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        word_required = new javax.swing.JCheckBox();
        type_word = new javax.swing.JComboBox<>();
        save = new javax.swing.JButton();
        search = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setMinimumSize(new java.awt.Dimension(784, 541));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        search_label.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search_label.setForeground(new java.awt.Color(0, 0, 0));
        search_label.setText("Patient Id:");
        getContentPane().add(search_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 100, -1, -1));

        p_id.setBackground(new java.awt.Color(255, 255, 255));
        p_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        p_id.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        getContentPane().add(p_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 90, 233, -1));

        search_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contuct", "Age", "Gender", "Blood Group", "Address", "Any symtomp "
            }
        ));
        jScrollPane1.setViewportView(search_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 731, 50));

        patient_not_exit.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient_not_exit.setForeground(new java.awt.Color(255, 0, 0));
        patient_not_exit.setText("Patient ID Does not Exist!");
        getContentPane().add(patient_not_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Symptom's:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, -1, -1));

        p_symptom.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_symptom, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 270, 212, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Diagnosis:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 340, -1, -1));

        p_diagnosis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, 212, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Medicine:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 410, -1, -1));

        p_medicine.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_medicine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 410, 212, -1));

        typeLabel.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        typeLabel.setForeground(new java.awt.Color(0, 0, 0));
        typeLabel.setText("Type of word");
        getContentPane().add(typeLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 350, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Word Required?");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(460, 280, -1, -1));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/close 2.png"))); // NOI18N
        close.setText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 480, -1, -1));

        word_required.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        word_required.setForeground(new java.awt.Color(0, 0, 0));
        word_required.setText("Yes");
        word_required.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                word_requiredActionPerformed(evt);
            }
        });
        getContentPane().add(word_required, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 290, -1, -1));

        type_word.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        type_word.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "General", "ICU", "CCU", "VIP" }));
        getContentPane().add(type_word, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 350, -1, -1));

        save.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        save.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/save.png"))); // NOI18N
        save.setText("Save");
        save.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });
        getContentPane().add(save, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 480, -1, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/src.png"))); // NOI18N
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 90, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Add Patient Diagnosis Information");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/src_bg.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed

          String id = p_id.getText();
          
        String sql = "select * from patient_add where id= ? ";
                   
        try {
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, id);
            
            ResultSet rsd = pst.executeQuery();
            search_table.setModel(DbUtils.resultSetToTableModel(rsd));
            if (!rsd.first()) {
                patient_not_exit.setVisible(true);
            } else {
                patient_not_exit.setVisible(false);
                p_id.setEditable(true);
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error!");
        }
    }//GEN-LAST:event_searchActionPerformed
    
    private void resetdata(){
    
    p_symptom.setText("");
    p_diagnosis.setText("");
    p_medicine.setText("");
    word_required.setSelected(false);
     
    
    }
    
    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
                 
            String id = p_id.getText();
            String symptom = p_symptom.getText();
            String diagnosis = p_diagnosis.getText();
            String medicine = p_medicine.getText();
            String word_req;
            String combobox_type;
            
            if (word_required.isSelected()) {
                word_req = "YES";
                combobox_type = (String) type_word.getSelectedItem();
            } else {
                word_req = "No";
                combobox_type = "";
            }

            String sql = "insert into patient_diagnosis(id, symptom, diagnosis, medicine, word_req, combobox_type)"
                    + "values(?, ?, ?, ?, ?, ?)";

            try {
                conn = DBConnection.getConn();
                PreparedStatement pst = conn.prepareStatement(sql);
                pst.setString(1, id);
                pst.setString(2, symptom);
                pst.setString(3, diagnosis);
                pst.setString(4, medicine);
                pst.setString(5, word_req);
                pst.setString(6, combobox_type);
                int rs = pst.executeUpdate();
                
                if (rs>0) {
                    JOptionPane.showMessageDialog(null, "save success");
                resetdata();
                }else{
                    JOptionPane.showMessageDialog(null, "Patient Id is empty!");
                }
            } catch (Exception e) {
                System.out.println(e.getLocalizedMessage());
            }
        
    }//GEN-LAST:event_saveActionPerformed

    private void word_requiredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_word_requiredActionPerformed
        if (word_required.isSelected()) {
            typeLabel.setVisible(true);
            type_word.setVisible(true);
        } else {
            typeLabel.setVisible(false);
            type_word.setVisible(false);
        }
    }//GEN-LAST:event_word_requiredActionPerformed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddDiagnosisInformation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p_diagnosis;
    private javax.swing.JTextField p_id;
    private javax.swing.JTextField p_medicine;
    private javax.swing.JTextField p_symptom;
    private javax.swing.JLabel patient_not_exit;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JLabel search_label;
    private javax.swing.JTable search_table;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JComboBox<String> type_word;
    private javax.swing.JCheckBox word_required;
    // End of variables declaration//GEN-END:variables
}
