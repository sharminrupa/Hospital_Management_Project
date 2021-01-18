package hospitalmanagemen;

import java.awt.Dimension;
import java.awt.Toolkit;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {
    int i = 0;
    static JFrame aWindow = new JFrame("This is ahome page.");
    public Home() {
        initComponents();
//        Toolkit thekit = aWindow.getToolkit();
//        Dimension wndsize = thekit.getScreenSize();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        arrow = new javax.swing.JButton();
        patient = new javax.swing.JButton();
        diagnosis = new javax.swing.JButton();
        history = new javax.swing.JButton();
        record = new javax.swing.JButton();
        information = new javax.swing.JButton();
        logout = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        pt_exeamination = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1366, 742));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        arrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/2Arrow.png"))); // NOI18N
        arrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                arrowActionPerformed(evt);
            }
        });
        getContentPane().add(arrow, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 20, 80, 60));

        patient.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        patient.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/patient (1).png"))); // NOI18N
        patient.setText("Add New Patient");
        patient.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        patient.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        patient.setPreferredSize(new java.awt.Dimension(240, 59));
        patient.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                patientActionPerformed(evt);
            }
        });
        getContentPane().add(patient, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, -1, -1));

        diagnosis.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        diagnosis.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/diagnosis.png"))); // NOI18N
        diagnosis.setText("Add patient information");
        diagnosis.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        diagnosis.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        diagnosis.setPreferredSize(new java.awt.Dimension(240, 59));
        diagnosis.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diagnosisActionPerformed(evt);
            }
        });
        getContentPane().add(diagnosis, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 190, -1, -1));

        history.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        history.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/history.png"))); // NOI18N
        history.setText("Full History of Patient");
        history.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        history.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        history.setPreferredSize(new java.awt.Dimension(240, 59));
        history.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                historyActionPerformed(evt);
            }
        });
        getContentPane().add(history, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, -1, -1));

        record.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        record.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/patient.png"))); // NOI18N
        record.setText("Upload Patient Record");
        record.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        record.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        record.setPreferredSize(new java.awt.Dimension(240, 59));
        record.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                recordActionPerformed(evt);
            }
        });
        getContentPane().add(record, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 350, -1, -1));

        information.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        information.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/logout.png"))); // NOI18N
        information.setText("Hospital information");
        information.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        information.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        information.setMargin(new java.awt.Insets(2, 4, 2, 14));
        information.setPreferredSize(new java.awt.Dimension(240, 69));
        information.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                informationActionPerformed(evt);
            }
        });
        getContentPane().add(information, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 530, -1, 60));

        logout.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        logout.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/login.png"))); // NOI18N
        logout.setText("Logout");
        logout.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        logout.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logout.setPreferredSize(new java.awt.Dimension(240, 59));
        logout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutActionPerformed(evt);
            }
        });
        getContentPane().add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 620, -1, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/mini.png"))); // NOI18N
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel2MouseExited(evt);
            }
        });
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1320, 10, 30, 10));

        pt_exeamination.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        pt_exeamination.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/lab.png"))); // NOI18N
        pt_exeamination.setText("Patient Diagnosis");
        pt_exeamination.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pt_exeamination.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pt_exeamination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pt_exeaminationActionPerformed(evt);
            }
        });
        getContentPane().add(pt_exeamination, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 440, 240, 60));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("IsDB Hospital & Diagnostic Center");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 390, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Dhanmondi, Dhaka - 1205");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 450, -1, -1));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/hospital_logo.png"))); // NOI18N
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(670, 270, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/home.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutActionPerformed
        
        int a = JOptionPane.showConfirmDialog(null, "Do you really want to logout", "select", JOptionPane.YES_NO_OPTION);
        if (a==0) {
            setVisible(false);
            new login().setVisible(true);
        }
    }//GEN-LAST:event_logoutActionPerformed

    private void arrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_arrowActionPerformed
        if (i==0) {
            
            patient.setLocation(110, 23);
            diagnosis.setLocation(358, 23);
            history.setLocation(603, 23);
            record.setLocation(846, 23);
            pt_exeamination.setLocation(1090, 23);
            logout.setLocation(1090, 100);
            information.setLocation(846, 100);
            i=1;
        }else{
        
            patient.setLocation(10, 100);
            diagnosis.setLocation(10, 173);
            history.setLocation(10, 250);
            record.setLocation(10, 330);
            pt_exeamination.setLocation(10, 410);
            information.setLocation(10, 490);
            logout.setLocation(10, 570);
            i=0;
        }
    }//GEN-LAST:event_arrowActionPerformed

    private void historyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_historyActionPerformed
        new FullHistoryOfThePatient().setVisible(true);
    }//GEN-LAST:event_historyActionPerformed

    private void informationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_informationActionPerformed
        new HospitalInformation().setVisible(true);
    }//GEN-LAST:event_informationActionPerformed

    private void patientActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_patientActionPerformed
        new AddNewPatientRecord().setVisible(true);
    }//GEN-LAST:event_patientActionPerformed

    private void diagnosisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diagnosisActionPerformed
        new AddDiagnosisInformation().setVisible(true);
    }//GEN-LAST:event_diagnosisActionPerformed

    private void recordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_recordActionPerformed
        new UploadPatientRecord().setVisible(true);
    }//GEN-LAST:event_recordActionPerformed

    private void jLabel2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseExited
        
    }//GEN-LAST:event_jLabel2MouseExited

    private void pt_exeaminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pt_exeaminationActionPerformed
        new PatientExamination().setVisible(true);
    }//GEN-LAST:event_pt_exeaminationActionPerformed

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
        this.setState(JFrame.ICONIFIED);
    }//GEN-LAST:event_jLabel2MouseClicked

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton arrow;
    private javax.swing.JButton diagnosis;
    private javax.swing.JButton history;
    private javax.swing.JButton information;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton logout;
    private javax.swing.JButton patient;
    private javax.swing.JButton pt_exeamination;
    private javax.swing.JButton record;
    // End of variables declaration//GEN-END:variables
}
