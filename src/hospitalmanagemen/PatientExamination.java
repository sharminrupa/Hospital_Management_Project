package hospitalmanagemen;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import project.DBConnection;

public class PatientExamination extends javax.swing.JFrame {
    private static Connection conn = null;
    private static PreparedStatement pst = null;
    ResultSet rs;
    
    public PatientExamination() {
        initComponents();
        try {
            table_add();
            conn = DBConnection.getConn();
        } catch (Exception e) {
        }
    }
    
    public boolean CheckValidation(){
        String id = search_pid.getText();
        String name = p_nametf.getText();
        String age = p_agetf.getText();
        String contuct = p_contuctf.getText();
        String subtotal = p_subtotal.getText();
        String payment = p_payment.getText();
        String total = p_totalTF.getText();
    
        if (id.trim().equals("") || name.trim().equals("") || age.trim().equals("") || contuct.trim().equals("")
                || subtotal.trim().equals("") || payment.trim().equals("") || total.trim().equals("")) {
            JOptionPane.showMessageDialog(this, "One or more field are empty");
            return false;
        }else{
            return true;
        }
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        p_totalTF = new javax.swing.JTextField();
        p_done = new javax.swing.JButton();
        Total = new javax.swing.JButton();
        jLabel20 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        ett = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        usg = new javax.swing.JCheckBox();
        jLabel9 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        s_cs = new javax.swing.JCheckBox();
        s_bc = new javax.swing.JCheckBox();
        mri = new javax.swing.JCheckBox();
        jLabel11 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        echo = new javax.swing.JCheckBox();
        creatinine = new javax.swing.JCheckBox();
        p_agetf = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        u_suger = new javax.swing.JCheckBox();
        jLabel26 = new javax.swing.JLabel();
        p_payment = new javax.swing.JTextField();
        ecg = new javax.swing.JCheckBox();
        jLabel2 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        rbs = new javax.swing.JCheckBox();
        xray = new javax.swing.JCheckBox();
        p_nametf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        u_cs = new javax.swing.JCheckBox();
        add = new javax.swing.JButton();
        jLabel22 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        covid = new javax.swing.JCheckBox();
        cbc = new javax.swing.JCheckBox();
        search = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        p_subtotal = new javax.swing.JTextField();
        p_contuctf = new javax.swing.JTextField();
        p_gendertf = new javax.swing.JComboBox<>();
        endo = new javax.swing.JCheckBox();
        hba1c = new javax.swing.JCheckBox();
        jLabel18 = new javax.swing.JLabel();
        lipid = new javax.swing.JCheckBox();
        anticcp = new javax.swing.JCheckBox();
        jLabel12 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        search_pid = new javax.swing.JTextField();
        subtotal = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ex_table = new javax.swing.JTable();
        jLabel29 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("IsBD Hospital & Diagnostic Center");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(406, 30, -1, -1));

        jPanel1.setForeground(new java.awt.Color(204, 255, 255));

        p_done.setText("Done");
        p_done.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        p_done.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                p_doneActionPerformed(evt);
            }
        });

        Total.setText("Total");
        Total.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Total.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TotalActionPerformed(evt);
            }
        });

        jLabel20.setText("2600/=");

        jLabel8.setText("800/=");

        jLabel4.setText("150/=");

        jLabel25.setText("Age:");

        ett.setText("ETT");

        jLabel6.setText("300/=");

        usg.setText("USG");

        jLabel9.setText("500/=");

        jLabel16.setText("200/=");

        jLabel21.setText("300/=");

        jLabel7.setText("300/=");

        s_cs.setText("Stool C/S");

        s_bc.setText("Stool Blood Cell");

        mri.setText("MRI");

        jLabel11.setText("200/=");

        jLabel3.setText("300/=");

        jLabel14.setText("3000/=");

        echo.setText("ECHO");

        creatinine.setText("Creatinine");

        jLabel13.setText("200/=");

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 0, 0));
        jLabel10.setText("Urine test");

        jLabel28.setText("Payment:");

        u_suger.setText("Urine suger");

        jLabel26.setText("Gender:");

        ecg.setText("ECG");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setText("Blood test");

        jLabel23.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(0, 0, 0));
        jLabel23.setText("Stool test");

        rbs.setText("RBS");

        xray.setText("X-ray");

        jLabel5.setText("800/=");

        jLabel15.setText("7000/=");

        u_cs.setText("Urine C/S");

        add.setText("Add");
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });

        jLabel22.setText("1200/=");

        jLabel19.setText("1500/=");

        covid.setText("Covid-19");

        cbc.setText("CBC");

        search.setText("Search");
        search.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });

        jLabel17.setText("2000/=");

        jLabel27.setText("Contuct:");

        p_gendertf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        endo.setText("Endoscopy");

        hba1c.setText("HbA1c");

        jLabel18.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(0, 0, 0));
        jLabel18.setText("Others test");

        lipid.setText("Lipid Prifile");

        anticcp.setText("AntiCCP");

        jLabel12.setText("200/=");

        jLabel24.setText("Name:");

        subtotal.setText("Subtotal");
        subtotal.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtotalActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(hba1c)
                            .addGap(62, 62, 62)
                            .addComponent(jLabel5))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(covid)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(u_cs)
                                .addComponent(u_suger))
                            .addGap(16, 16, 16)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel11)
                                .addComponent(jLabel9)
                                .addComponent(jLabel12))
                            .addGap(16, 16, 16))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(anticcp)
                            .addGap(45, 45, 45)
                            .addComponent(jLabel8)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbc)
                            .addComponent(rbs))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(creatinine)
                            .addComponent(lipid))
                        .addGap(31, 31, 31)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(usg)
                            .addComponent(echo))
                        .addGap(64, 64, 64)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel19)
                            .addComponent(jLabel20)))
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ecg)
                        .addGap(74, 74, 74)
                        .addComponent(jLabel21))
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(mri)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel15))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(ett)
                                        .addComponent(xray))
                                    .addGap(68, 68, 68))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(endo)
                                    .addGap(38, 38, 38)))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel17)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel22)
                                    .addComponent(jLabel14)))))
                    .addComponent(jLabel23, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(s_cs)
                            .addComponent(s_bc))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel13)
                            .addComponent(jLabel16))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel24)
                            .addComponent(search)
                            .addComponent(jLabel25)
                            .addComponent(jLabel26)
                            .addComponent(jLabel27))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(41, 41, 41)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(search_pid, javax.swing.GroupLayout.DEFAULT_SIZE, 166, Short.MAX_VALUE)
                                    .addComponent(p_nametf)
                                    .addComponent(p_agetf)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(p_gendertf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(p_contuctf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(subtotal)
                            .addComponent(Total)
                            .addComponent(jLabel28))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(p_subtotal)
                            .addComponent(p_payment)
                            .addComponent(p_totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(p_done)
                                .addGap(18, 18, 18)
                                .addComponent(add)))))
                .addGap(39, 39, 39))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(cbc)
                                            .addComponent(jLabel3))
                                        .addGap(18, 18, 18)
                                        .addComponent(rbs))
                                    .addComponent(jLabel4)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel23)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(s_cs)
                                    .addComponent(jLabel13))
                                .addGap(12, 12, 12)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(s_bc)
                                    .addComponent(jLabel16))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(hba1c)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(creatinine)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lipid)
                            .addComponent(jLabel7))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(anticcp)
                            .addComponent(jLabel8))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(covid)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(u_cs)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(u_suger)
                            .addComponent(jLabel12)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel18)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(usg)
                                            .addComponent(jLabel19))
                                        .addGap(18, 18, 18)
                                        .addComponent(echo))
                                    .addComponent(jLabel20)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(119, 119, 119)
                                        .addComponent(p_gendertf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(search_pid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(search))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(p_nametf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel24))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel25)
                                            .addComponent(p_agetf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel26)))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel27)
                                    .addComponent(p_contuctf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(ecg)
                                .addComponent(jLabel21))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(40, 40, 40)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(ett)
                                            .addComponent(jLabel22))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(xray)
                                            .addComponent(jLabel14))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(mri)
                                            .addComponent(jLabel15)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(p_subtotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p_payment, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(p_totalTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(28, 28, 28)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(add)
                                            .addComponent(p_done)))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addComponent(subtotal)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel28)
                                        .addGap(18, 18, 18)
                                        .addComponent(Total)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(endo)
                                    .addComponent(jLabel17))))
                        .addGap(2, 2, 2)))
                .addContainerGap())
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 700, 420));

        ex_table.setForeground(new java.awt.Color(0, 0, 0));
        ex_table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID:", "PT_Name:", "Age:", "Gender:", "Contuct:", "Examination:", "Subtotal:", "Payment", "Total:"
            }
        ));
        ex_table.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jScrollPane1.setViewportView(ex_table);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(740, 80, 560, 414));
        getContentPane().add(jLabel29, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 55, -1, -1));

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/hospitalmanagemen/add_bg.jpg"))); // NOI18N
        jLabel30.setBorder(javax.swing.BorderFactory.createMatteBorder(2, 2, 2, 2, new java.awt.Color(153, 204, 255)));
        jLabel30.setFocusable(false);
        jLabel30.setMaximumSize(new java.awt.Dimension(1317, 545));
        jLabel30.setMinimumSize(new java.awt.Dimension(1317, 545));
        jLabel30.setPreferredSize(new java.awt.Dimension(1317, 545));
        jLabel30.setRequestFocusEnabled(false);
        jLabel30.setVerifyInputWhenFocusTarget(false);
        getContentPane().add(jLabel30, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void resetData(){
    search_pid.setText("");
    p_nametf.setText("");
    p_agetf.setText("");
    p_gendertf.setSelectedIndex(0);
    p_contuctf.setText("");
    cbc.setSelected(false);
    rbs.setSelected(false);
    hba1c.setSelected(false);
    creatinine.setSelected(false);
    lipid.setSelected(false);
    anticcp.setSelected(false);
    covid.setSelected(false);
    p_subtotal.setText("");
    p_payment.setText("");
    p_totalTF.setText("");    
    }
    
    private void table_add() throws ClassNotFoundException{
        int c;
        try {
            conn = DBConnection.getConn();
            pst = conn.prepareStatement("select * from patientexeamination");
            rs = pst.executeQuery();
            ResultSetMetaData rss = rs.getMetaData();
            c = rss.getColumnCount();
            DefaultTableModel table = (DefaultTableModel) ex_table.getModel();
            table.setRowCount(0);
            while (rs.next()) {
                Vector v2 = new Vector();
                for (int a = 1; a <= c; a++) {
                    v2.add(rs.getString("id"));
                    v2.add(rs.getString("name"));
                    v2.add(rs.getString("age"));
                    v2.add(rs.getString("gender"));
                    v2.add(rs.getString("contuct"));
                    v2.add(rs.getString("pt_exeam")+", \n");
                    v2.add(rs.getString("subtotal"));
                    v2.add(rs.getString("payment"));
                    v2.add(rs.getString("total"));
                }
                table.addRow(v2);
            }

        } catch (SQLException e) {
            System.out.println(e.getLocalizedMessage());
        }

    }
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
       String id = search_pid.getText();
       String name = p_nametf.getText();
       String age = p_agetf.getText();
       String gender = p_gendertf.getSelectedItem().toString();
       String contuct = p_contuctf.getText();
       String pationtExeam = "";
       
        if (cbc.isSelected()) {
            pationtExeam += cbc.getText() + ", \n";
        }
        if (rbs.isSelected()) {
            pationtExeam += rbs.getText() + ", \n";
        }
        if (hba1c.isSelected()) {
            pationtExeam += hba1c.getText() + ", \n";
        }
        if (creatinine.isSelected()) {
            pationtExeam += creatinine.getText() + ", \n";
        }
        if (lipid.isSelected()) {
            pationtExeam += lipid.getText() + ", \n";
        }
        if (anticcp.isSelected()) {
            pationtExeam += anticcp.getText() + ", \n";
        }
        if (covid.isSelected()) {
            pationtExeam += covid.getText() + ", \n";
        }
       
       String subtotal = p_subtotal.getText();
       String payment = p_payment.getText();
       String total = p_totalTF.getText();
       
       boolean isOk = true;
       String sql = "insert into patientexeamination(id, name, age, gender, contuct, pt_exeam, subtotal, payment, total) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
        
        try {
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
           
            if (CheckValidation()) {
            pst.setString(1, id);
            pst.setString(2, name);
            pst.setString(3, age);
            pst.setString(4, gender);
            pst.setString(5, contuct);
            pst.setString(6, pationtExeam);
            pst.setString(7, subtotal);
            pst.setString(8, payment);
            pst.setString(9, total);            
            pst.executeUpdate();
            table_add();
            resetData();
            JOptionPane.showMessageDialog(null, "Data added");
            }else{
                JOptionPane.showMessageDialog(null, "Data failed");
            }         
            
        } catch (Exception e) {
            e.printStackTrace();
        }
 
    }//GEN-LAST:event_addActionPerformed

    private void p_doneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_p_doneActionPerformed
        setVisible(false);
    }//GEN-LAST:event_p_doneActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
         try {
            String sql = " select * from patient_add where id =? ";
            conn = DBConnection.getConn();
            PreparedStatement pst = conn.prepareStatement(sql);
            int id = Integer.parseInt(search_pid.getText());
            pst.setInt(1, id);
            ResultSet rs = pst.executeQuery();
            if (rs.next()) {
                String name = rs.getString("name");
                String contuct = rs.getString("contuct");
                String age = rs.getString("age");
                String gender = rs.getString("gender");
                                
                p_nametf.setText(rs.getString(2));
                p_contuctf.setText(rs.getString(3));
                p_agetf.setText(rs.getString(4));
                p_gendertf.setSelectedItem(rs.getString(5));                
                search_pid.setEditable(false);
                
            }else{
                JOptionPane.showMessageDialog(this, "Patient Id does not exist!");
            
            }
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }//GEN-LAST:event_searchActionPerformed

    private void subtotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtotalActionPerformed
       
        double subtotal = 0;
        

        if (cbc.isSelected()) {
            subtotal = subtotal + 300;
        }
        if (rbs.isSelected()) {
            subtotal = subtotal + 150;
        }
        if (hba1c.isSelected()) {
            subtotal = subtotal + 800;
        }
        if (creatinine.isSelected()) {
            subtotal = subtotal + 300;
        }
        if (lipid.isSelected()) {
            subtotal = subtotal + 300;
        }
        if (anticcp.isSelected()) {
            subtotal = subtotal + 800;
        }
        if (covid.isSelected()) {
            subtotal = subtotal + 500;
            
        }
        
            p_subtotal.setText(Double.toString(subtotal));            
            subtotal = Double.parseDouble(p_subtotal.getText());
    }//GEN-LAST:event_subtotalActionPerformed

    private void TotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TotalActionPerformed
        String subtotal = p_subtotal.getText();
        double sbt = Double.parseDouble(subtotal);
        String payment = p_payment.getText();
        double pt = Double.parseDouble(payment);
        String tot = p_totalTF.getText();
        double dt = (sbt - pt);
        p_totalTF.setText(String.valueOf(dt));        
        
    }//GEN-LAST:event_TotalActionPerformed
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PatientExamination().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Total;
    private javax.swing.JButton add;
    private javax.swing.JCheckBox anticcp;
    private javax.swing.JCheckBox cbc;
    private javax.swing.JCheckBox covid;
    private javax.swing.JCheckBox creatinine;
    private javax.swing.JCheckBox ecg;
    private javax.swing.JCheckBox echo;
    private javax.swing.JCheckBox endo;
    private javax.swing.JCheckBox ett;
    private javax.swing.JTable ex_table;
    private javax.swing.JCheckBox hba1c;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JCheckBox lipid;
    private javax.swing.JCheckBox mri;
    private javax.swing.JTextField p_agetf;
    private javax.swing.JTextField p_contuctf;
    private javax.swing.JButton p_done;
    private javax.swing.JComboBox<String> p_gendertf;
    private javax.swing.JTextField p_nametf;
    private javax.swing.JTextField p_payment;
    private javax.swing.JTextField p_subtotal;
    private javax.swing.JTextField p_totalTF;
    private javax.swing.JCheckBox rbs;
    private javax.swing.JCheckBox s_bc;
    private javax.swing.JCheckBox s_cs;
    private javax.swing.JButton search;
    private javax.swing.JTextField search_pid;
    private javax.swing.JButton subtotal;
    private javax.swing.JCheckBox u_cs;
    private javax.swing.JCheckBox u_suger;
    private javax.swing.JCheckBox usg;
    private javax.swing.JCheckBox xray;
    // End of variables declaration//GEN-END:variables
}
