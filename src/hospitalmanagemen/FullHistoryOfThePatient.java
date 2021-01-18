package hospitalmanagemen;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;
import project.DBConnection;

public class FullHistoryOfThePatient extends javax.swing.JFrame {
    private static Connection conn = null;
    private static PreparedStatement pst;  
    int sRow = 0;
    public FullHistoryOfThePatient() {
        initComponents();
        
        setTitle("Full patient history");
        
        try {
            conn = DBConnection.getConn();
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        history_table = new javax.swing.JTable();
        close = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(280, 150));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        history_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Contuct", "Age", "Gender", "Blood Group", "Address", "any symptom"
            }
        ));
        jScrollPane1.setViewportView(history_table);
        if (history_table.getColumnModel().getColumnCount() > 0) {
            history_table.getColumnModel().getColumn(0).setHeaderValue("ID");
            history_table.getColumnModel().getColumn(1).setHeaderValue("Name");
            history_table.getColumnModel().getColumn(2).setHeaderValue("Contuct");
            history_table.getColumnModel().getColumn(3).setHeaderValue("Age");
            history_table.getColumnModel().getColumn(4).setHeaderValue("Gender");
            history_table.getColumnModel().getColumn(5).setHeaderValue("Blood Group");
            history_table.getColumnModel().getColumn(6).setHeaderValue("Address");
            history_table.getColumnModel().getColumn(7).setHeaderValue("any symptom");
        }

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, 740, 290));

        close.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        close.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/close 2.png"))); // NOI18N
        close.setText("Close");
        close.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });
        getContentPane().add(close, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 470, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Full History Of Patient");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 40, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/src_bg.jpg"))); // NOI18N
        jLabel1.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(0, 204, 153)));
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        setVisible(false);
    }//GEN-LAST:event_closeActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
            
        try {
            
            String sql = "SELECT * FROM patient_add inner join patient_diagnosis WHERE patient_add.id= patient_diagnosis.id ";
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
            ResultSet rs = pst.executeQuery();
            history_table.setAutoResizeMode(history_table.AUTO_RESIZE_OFF);
            history_table.setModel(DbUtils.resultSetToTableModel(rs));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Connection Error");
        }
        
    }//GEN-LAST:event_formComponentShown

        public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FullHistoryOfThePatient().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton close;
    private javax.swing.JTable history_table;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
