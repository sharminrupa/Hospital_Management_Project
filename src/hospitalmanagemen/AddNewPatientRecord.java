package hospitalmanagemen;

import com.lowagie.text.Cell;
import com.lowagie.text.Row;
import com.sun.glass.events.KeyEvent;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.*;
import java.util.Iterator;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import project.DBConnection;


public class AddNewPatientRecord extends javax.swing.JFrame {

    private static Connection conn = null;
    private static PreparedStatement pst;    
    ResultSet rs;
    int sRow;
   // search filter//
    TableRowSorter<TableModel> sorter = null;
    DefaultTableModel table = null;
    
    public AddNewPatientRecord() {
        initComponents();
        setTitle("Add new patient");
        setLocationRelativeTo(null);

        try {
            conn = DBConnection.getConn();
            table_add();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }        
        // search filter//
        
        sorter = new TableRowSorter<>(table);
        p_table.setRowSorter(sorter);
    }


    private void table_add() throws ClassNotFoundException{
        int c;
        try {
            conn = DBConnection.getConn();
            pst = conn.prepareStatement("select * from patient_add");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            table = (DefaultTableModel) p_table.getModel();
            table.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a <= c; a++) {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("contuct"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("gender"));
                    v2.add(rs.getString("bgroup"));
                    v2.add(rs.getString("address"));
                    v2.add(rs.getString("any_descess"));
                }
                table.addRow(v2);
            }

        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        save = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        p_name = new javax.swing.JTextField();
        patient_id = new javax.swing.JTextField();
        p_contuct = new javax.swing.JTextField();
        p_age = new javax.swing.JTextField();
        p_address = new javax.swing.JTextField();
        p_bgroup = new javax.swing.JTextField();
        p_descess = new javax.swing.JTextField();
        p_gender = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        close = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        delete = new javax.swing.JButton();
        e_id = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        e_name = new javax.swing.JLabel();
        e_mobile = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        p_table = new javax.swing.JTable();
        p_import = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        search = new javax.swing.JButton();
        p_update = new javax.swing.JButton();
        table_src = new javax.swing.JTextField();
        table_src_icon = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        setPreferredSize(new java.awt.Dimension(1259, 572));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Name:");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 160, 48, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setText("Contuct No:");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 200, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setText("Age:");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, 58, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setText("Gender:");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 280, 58, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setText("Blood Group:");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 320, -1, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(0, 0, 0));
        jLabel7.setText("Address:");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 360, -1, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setText("Any Mejor descic suffered:");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 400, -1, -1));

        p_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, 231, -1));

        patient_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(patient_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 120, 120, -1));

        p_contuct.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_contuct, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 200, 231, -1));

        p_age.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_age, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 231, -1));

        p_address.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_address, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 360, 231, -1));

        p_bgroup.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_bgroup, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 320, 231, -1));

        p_descess.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(p_descess, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 430, 376, -1));

        p_gender.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        p_gender.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));
        getContentPane().add(p_gender, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 280, 231, -1));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(0, 0, 0));
        jLabel9.setText("Add New Patient");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, 200, -1));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/close 2.png"))); // NOI18N
        close.setText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(1140, 500, -1, -1));

        jLabel12.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 0, 0));
        jLabel12.setText("Patient ID:");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, 79, -1));

        delete.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        delete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/delete1.png"))); // NOI18N
        delete.setText("Delete");
        delete.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        getContentPane().add(delete, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 480, -1, -1));

        e_id.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        e_id.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(e_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 220, 30));

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 220, 20));

        jLabel13.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 220, 20));

        jLabel14.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 220, 20));

        jLabel15.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 120, 220, 20));

        e_name.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        e_name.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(e_name, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 160, 220, 30));

        e_mobile.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        e_mobile.setForeground(new java.awt.Color(255, 0, 0));
        getContentPane().add(e_mobile, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 200, 220, 30));

        p_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "P ID", "Name", "Mobile", "Age", "Gender", "B Group", "Address", "Symptom"
            }
        ));
        p_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                p_tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(p_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 150, 560, 300));

        p_import.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        p_import.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/import.png"))); // NOI18N
        p_import.setText("Import");
        p_import.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_import.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_importActionPerformed(evt);
            }
        });
        getContentPane().add(p_import, new org.netbeans.lib.awtextra.AbsoluteConstraints(986, 500, 110, -1));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("New Patient Record");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 40, -1, -1));

        search.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        search.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/src.png"))); // NOI18N
        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        getContentPane().add(search, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, -1, -1));

        p_update.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        p_update.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/update.jpg"))); // NOI18N
        p_update.setText("Update");
        p_update.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_updateActionPerformed(evt);
            }
        });
        getContentPane().add(p_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 480, 110, -1));

        table_src.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table_src.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                table_srcKeyPressed(evt);
            }
        });
        getContentPane().add(table_src, new org.netbeans.lib.awtextra.AbsoluteConstraints(980, 110, 190, -1));

        table_src_icon.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        table_src_icon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/src.png"))); // NOI18N
        table_src_icon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                table_src_iconActionPerformed(evt);
            }
        });
        getContentPane().add(table_src_icon, new org.netbeans.lib.awtextra.AbsoluteConstraints(1180, 110, 40, 30));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/add_bg.jpg"))); // NOI18N
        jLabel10.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(204, 255, 255)));
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        // TODO add your handling code here:

        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    public boolean checkValidation(String name, String contuct) {
        boolean isOk = true;

        if (name.isEmpty()) {
            isOk = false;
            e_name.setText("Please enter a patient name");
        } else if (!name.matches("[A-Za-z]{3,12}")) {
            isOk = false;
            e_name.setText("Please enter a valid patient name");
        } else {
            e_name.setText("");
        }

        if (contuct.isEmpty()) {
            isOk = false;
            e_mobile.setText("Please enter a patient mobile no");
        } else if (!contuct.matches("[0-9]{11,11}")) {
            isOk = false;
            e_mobile.setText("Please enter a valid patient mobile no");
        } else {
            e_mobile.setText("");
        }

        return isOk;
    }

    public void resetData() {
        int id = 0;
        try {
            //id = Integer.parseInt(patient_id.setInt(""));
        } catch (Exception e) {
            e.printStackTrace();
        }

        patient_id.setText("");
        p_name.setText("");
        p_contuct.setText("");
        p_age.setText("");
        p_gender.setSelectedIndex(0);
        p_bgroup.setText("");
        p_address.setText("");
        p_descess.setText("");
       
    }

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        int id = 0;
        try {
            id = Integer.parseInt(patient_id.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String name = p_name.getText();
        String contuct = p_contuct.getText();
        String age = p_age.getText();
        String gender = (String) p_gender.getSelectedItem();
        String bgroup = p_bgroup.getText();
        String address = p_address.getText();
        String any_descess = p_descess.getText();
        boolean isOk = checkValidation(name, contuct);
        String sql = "insert into patient_add(id, name, contuct, age, gender, bgroup, address, any_descess)"
                + "values(?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
            if (isOk) {
                pst.setInt(1, id);
                pst.setString(2, name);
                pst.setString(3, contuct);
                pst.setString(4, age);
                pst.setString(5, gender);
                pst.setString(6, bgroup);
                pst.setString(7, address);
                pst.setString(8, any_descess);            
                int rs = pst.executeUpdate();
                table_add(); 
                resetData();
                JOptionPane.showMessageDialog(null, "save success");
                
            } else {
                JOptionPane.showMessageDialog(null, "save failed");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }//GEN-LAST:event_saveActionPerformed

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel table = (DefaultTableModel) p_table.getModel();
        int selectedIndex = p_table.getSelectedRow();

        int id = Integer.parseInt(table.getValueAt(selectedIndex, 0).toString());
        try {
            int dialogResult = JOptionPane.showConfirmDialog(null, "Do you want to delete this record", "Warning", JOptionPane.YES_NO_OPTION);
            if (dialogResult == JOptionPane.YES_OPTION) {
                pst = conn.prepareStatement("delete from patient_add where id=? ");
                pst.setInt(1, id);
                pst.executeUpdate();
                resetData();
                table_add();
            } else {
                JOptionPane.showMessageDialog(this, "Delete failed!", "Failed!", JOptionPane.ERROR_MESSAGE);                
            }
        } catch (SQLException ex) {
            System.out.println(ex.getLocalizedMessage());
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(AddNewPatientRecord.class.getName()).log(Level.SEVERE, null, ex);
        } 
    }//GEN-LAST:event_deleteActionPerformed

    private void p_tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_p_tableMouseClicked
        DefaultTableModel table = (DefaultTableModel) p_table.getModel();
        sRow = p_table.getSelectedRow();
        patient_id.setText(table.getValueAt(sRow, 0).toString());
        p_name.setText(table.getValueAt(sRow, 1).toString());
        p_contuct.setText(table.getValueAt(sRow, 2).toString());
        p_age.setText(table.getValueAt(sRow, 3).toString());
        p_gender.setSelectedItem(table.getValueAt(sRow, 4).toString());
        p_bgroup.setText(table.getValueAt(sRow, 5).toString());
        p_address.setText(table.getValueAt(sRow, 6).toString());
        p_descess.setText(table.getValueAt(sRow, 7).toString());
    }//GEN-LAST:event_p_tableMouseClicked

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        try {
            Connection conn = DBConnection.getConn();
            String sql = "select * from  patient_add where id=?";
            PreparedStatement pst = conn.prepareStatement(sql);
            int id = Integer.parseInt(patient_id.getText());
            
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if(rs.next()) {
                String name = rs.getString("name");
                String contuct = rs.getString("contuct");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                String bgroup = rs.getString("bgroup");
                String address = rs.getString("address");
                String descess = rs.getString("any_descess");
                
                p_name.setText(name);
                p_contuct.setText(contuct);
                p_age.setText(age);
                p_gender.setSelectedItem(gender);
                p_bgroup.setText(bgroup);
                p_address.setText(address);
                p_descess.setText(descess);
                
            }else{
                 JOptionPane.showMessageDialog(this, "Data not fount");
                table_add();
            }            
        } catch (Exception e) {
        }
    }//GEN-LAST:event_searchActionPerformed

    private void p_importActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_importActionPerformed
        
        File file = new File("E:/Hospital");
        file.mkdir();
        String path = file.getAbsolutePath();
        File file1 = new File("E:/Hospital/patient_information.txt");
        
        try {
            FileWriter wf = new FileWriter(file1);
            BufferedWriter bf = new BufferedWriter(wf);
            for (int i = 0; i < p_table.getRowCount(); i++) {                
                for (int j = 0; j < p_table.getColumnCount(); j++) {
                    
                    bf.write(p_table.getValueAt(i, j).toString() + " \t");
                    
                }
                bf.newLine();
                
            }
            
            boolean p_import = true;
            if (p_table.isDisplayable()) {
                JOptionPane.showMessageDialog(this, "Data is imported success", "select", JOptionPane.YES_NO_OPTION);
            }else{
                 JOptionPane.showMessageDialog(this, "Data is imported failed");
            }
            bf.close();
            wf.close();
        } catch (Exception e) {
        }
         
    }//GEN-LAST:event_p_importActionPerformed

    private void p_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_updateActionPerformed
        int id = 0;
        try {
            id = Integer.parseInt(patient_id.getText());
        } catch (Exception e) {
            e.printStackTrace();
        }

        String name = p_name.getText();
        String contuct = p_contuct.getText();
        String age = p_age.getText();
        String gender = (String) p_gender.getSelectedItem();
        String bgroup = p_bgroup.getText();
        String address = p_address.getText();
        String any_descess = p_descess.getText();
        boolean isOk = checkValidation(name, contuct);

        String sql = "update patient_add"
                        + " set name = ?, contuct = ?, age = ?, gender = ?, bgroup = ?, address = ?,  any_descess = ? "
                        + " where id = ? ";
        try {
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, id);
            pst.setString(2, name);
            pst.setString(3, contuct);
            pst.setString(4, age);
            pst.setString(5, gender);
            pst.setString(6, bgroup);
            pst.setString(7, address);
            pst.setString(8, any_descess);            

            if (isOk) {
            int rs = pst.executeUpdate();
            DefaultTableModel table = (DefaultTableModel)p_table.getModel();
            table.setValueAt(id, sRow, 0);
            table.setValueAt(name, sRow, 1);
            table.setValueAt(contuct, sRow, 2);
            table.setValueAt(age, sRow, 3);
            table.setValueAt(gender, sRow, 4);
            table.setValueAt(bgroup, sRow, 5);
            table.setValueAt(address, sRow, 6);
            table.setValueAt(any_descess, sRow, 7);
           
            JOptionPane.showMessageDialog(null, "Update success");
            
            resetData();
            } else {
                JOptionPane.showMessageDialog(null, "Updated failed");
            }
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }//GEN-LAST:event_p_updateActionPerformed

    private void table_src_iconActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_table_src_iconActionPerformed
        String text = table_src.getText();
        if (!text.equals("")) {
            sorter.setRowFilter(RowFilter.regexFilter(text));            
        }else{
            sorter.setRowFilter(null);        
        }
    }//GEN-LAST:event_table_src_iconActionPerformed

    private void table_srcKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_table_srcKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            String text = table_src.getText();
        if (!text.equals("")) {
            sorter.setRowFilter(RowFilter.regexFilter(text));            
        }else{
            sorter.setRowFilter(null);        
        }
        }
    }//GEN-LAST:event_table_srcKeyPressed

    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AddNewPatientRecord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JButton delete;
    private javax.swing.JLabel e_id;
    private javax.swing.JLabel e_mobile;
    private javax.swing.JLabel e_name;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField p_address;
    private javax.swing.JTextField p_age;
    private javax.swing.JTextField p_bgroup;
    private javax.swing.JTextField p_contuct;
    private javax.swing.JTextField p_descess;
    private javax.swing.JComboBox<String> p_gender;
    private javax.swing.JButton p_import;
    private javax.swing.JTextField p_name;
    private javax.swing.JTable p_table;
    private javax.swing.JButton p_update;
    private javax.swing.JTextField patient_id;
    private javax.swing.JButton save;
    private javax.swing.JButton search;
    private javax.swing.JTextField table_src;
    private javax.swing.JButton table_src_icon;
    // End of variables declaration//GEN-END:variables
}
