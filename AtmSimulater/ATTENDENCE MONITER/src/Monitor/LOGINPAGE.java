
import static Monitor.sqldb.adminLogin;
import static Monitor.sqldb.getPass;
import java.awt.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class LOGINPAGE extends javax.swing.JFrame {
     Container ct;
     CardLayout cd;
      Random rn=new Random();
   int rand=0;
   String s3="",s2="";
    
    public LOGINPAGE() {
        initComponents();
        setLocationRelativeTo(null);
        ct=getContentPane();
        cd=(CardLayout) ct.getLayout();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel9 = new javax.swing.JLabel();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        jSplitPane1 = new javax.swing.JSplitPane();
        login = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        admintable = new javax.swing.JPanel();
        l1 = new javax.swing.JLabel();
        l2 = new javax.swing.JLabel();
        l3 = new javax.swing.JLabel();
        l4 = new javax.swing.JLabel();
        l5 = new javax.swing.JLabel();
        l6 = new javax.swing.JLabel();
        l7 = new javax.swing.JLabel();
        l8 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        cse = new javax.swing.JPanel();
        jLabel42 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        jLabel40 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        cs_c = new javax.swing.JPanel();
        jLabel33 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel44 = new javax.swing.JLabel();
        cr = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel37 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        mentor = new javax.swing.JPanel();
        jLabel39 = new javax.swing.JLabel();
        jLabel38 = new javax.swing.JLabel();
        jLabel36 = new javax.swing.JLabel();
        student = new javax.swing.JPanel();
        jLabel53 = new javax.swing.JLabel();
        jLabel52 = new javax.swing.JLabel();
        jLabel51 = new javax.swing.JLabel();
        jLabel50 = new javax.swing.JLabel();
        jLabel49 = new javax.swing.JLabel();
        jLabel48 = new javax.swing.JLabel();
        jLabel47 = new javax.swing.JLabel();
        jLabel46 = new javax.swing.JLabel();
        jLabel45 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        add1 = new javax.swing.JPanel();
        jLabel64 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        adr = new javax.swing.JTextArea();
        jLabel61 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        mob = new javax.swing.JTextField();
        h1 = new javax.swing.JRadioButton();
        h2 = new javax.swing.JRadioButton();
        jLabel59 = new javax.swing.JLabel();
        d = new com.toedter.calendar.JDateChooser();
        jLabel58 = new javax.swing.JLabel();
        g2 = new javax.swing.JRadioButton();
        g1 = new javax.swing.JRadioButton();
        jLabel57 = new javax.swing.JLabel();
        jLabel56 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        t1 = new javax.swing.JTextField();
        jLabel55 = new javax.swing.JLabel();
        jLabel54 = new javax.swing.JLabel();
        search = new javax.swing.JPanel();
        jLabel80 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel72 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel71 = new javax.swing.JLabel();
        jLabel70 = new javax.swing.JLabel();
        jLabel69 = new javax.swing.JLabel();
        jLabel68 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel66 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        remove = new javax.swing.JPanel();
        jLabel88 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel87 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel86 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();
        update = new javax.swing.JPanel();
        jLabel93 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jTextField6 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel92 = new javax.swing.JLabel();
        jLabel90 = new javax.swing.JLabel();
        jLabel89 = new javax.swing.JLabel();
        updatenext = new javax.swing.JPanel();
        jLabel104 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel95 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        jLabel96 = new javax.swing.JLabel();
        t4 = new javax.swing.JTextField();
        jLabel97 = new javax.swing.JLabel();
        g3 = new javax.swing.JRadioButton();
        g4 = new javax.swing.JRadioButton();
        d1 = new com.toedter.calendar.JDateChooser();
        jLabel98 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        h3 = new javax.swing.JRadioButton();
        h4 = new javax.swing.JRadioButton();
        mob1 = new javax.swing.JTextField();
        jLabel100 = new javax.swing.JLabel();
        jLabel101 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        adr1 = new javax.swing.JTextArea();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        Faculty = new javax.swing.JPanel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        jLabel134 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        jLabel137 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        jLabel131 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        jLabel128 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        jLabel125 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        jLabel122 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        jLabel119 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        jLabel116 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel113 = new javax.swing.JLabel();
        jLabel110 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel107 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        faculty_addnew = new javax.swing.JPanel();
        jLabel147 = new javax.swing.JLabel();
        jTextField9 = new javax.swing.JTextField();
        jTextField10 = new javax.swing.JTextField();
        jTextField8 = new javax.swing.JTextField();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        jLabel146 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        jLabel140 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        jLabel143 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        faculty_edit = new javax.swing.JPanel();
        jLabel159 = new javax.swing.JLabel();
        jLabel158 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jTextField12 = new javax.swing.JTextField();
        jTextField13 = new javax.swing.JTextField();
        jLabel157 = new javax.swing.JLabel();
        jLabel155 = new javax.swing.JLabel();
        jTextField11 = new javax.swing.JTextField();
        jLabel149 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        jLabel152 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        faculty_remove = new javax.swing.JPanel();
        jLabel164 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        jLabel167 = new javax.swing.JLabel();
        jLabel161 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jTextField14 = new javax.swing.JTextField();
        jTextField15 = new javax.swing.JTextField();
        jLabel163 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        attendence = new javax.swing.JPanel();
        jLabel172 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        jTextField16 = new javax.swing.JTextField();
        jTextField17 = new javax.swing.JTextField();
        jLabel170 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        attend_sheet = new javax.swing.JPanel();
        jLabel220 = new javax.swing.JLabel();
        jLabel221 = new javax.swing.JLabel();
        jLabel222 = new javax.swing.JLabel();
        jLabel223 = new javax.swing.JLabel();
        jLabel224 = new javax.swing.JLabel();
        jLabel225 = new javax.swing.JLabel();
        jLabel214 = new javax.swing.JLabel();
        jLabel215 = new javax.swing.JLabel();
        jLabel216 = new javax.swing.JLabel();
        jLabel217 = new javax.swing.JLabel();
        jLabel218 = new javax.swing.JLabel();
        jLabel219 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        jLabel209 = new javax.swing.JLabel();
        jLabel210 = new javax.swing.JLabel();
        jLabel211 = new javax.swing.JLabel();
        jLabel212 = new javax.swing.JLabel();
        jLabel213 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        jLabel203 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        jLabel206 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        jLabel197 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        jLabel200 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        jLabel191 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        jLabel194 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        jLabel185 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        jLabel188 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        jLabel182 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        jLabel176 = new javax.swing.JLabel();
        jLabel177 = new javax.swing.JLabel();
        jLabel178 = new javax.swing.JLabel();
        jLabel179 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel173 = new javax.swing.JLabel();
        admin = new javax.swing.JPanel();
        jLabel234 = new javax.swing.JLabel();
        jLabel235 = new javax.swing.JLabel();
        jLabel236 = new javax.swing.JLabel();
        jLabel237 = new javax.swing.JLabel();
        j4 = new javax.swing.JTextField();
        jLabel238 = new javax.swing.JLabel();
        j5 = new javax.swing.JTextField();
        jLabel239 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel233 = new javax.swing.JLabel();
        password = new javax.swing.JPanel();
        jLabel232 = new javax.swing.JLabel();
        jLabel241 = new javax.swing.JLabel();
        jLabel242 = new javax.swing.JLabel();
        jLabel243 = new javax.swing.JLabel();
        j6 = new javax.swing.JTextField();
        jLabel244 = new javax.swing.JLabel();
        jLabel245 = new javax.swing.JLabel();
        jLabel240 = new javax.swing.JLabel();

        jLabel9.setText("jLabel9");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MONITOR");
        getContentPane().setLayout(new java.awt.CardLayout());

        login.setBackground(new java.awt.Color(255, 255, 255));
        login.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        login.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/adminssion11.jpg"))); // NOI18N
        jLabel1.setToolTipText("IEC COLLEGE OF ENGG. & TECH");

        jLabel5.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 51));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("STUDENT-ATTENDENCE-MONITORING");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/admin.jpg"))); // NOI18N
        jLabel2.setToolTipText("click to login admin");
        jLabel2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel2MouseEntered(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(182, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("ADMIN");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/student-icon.png"))); // NOI18N
        jLabel3.setToolTipText("click to login ");
        jLabel3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Times New Roman", 3, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(182, 0, 0));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("STUDENT");

        javax.swing.GroupLayout loginLayout = new javax.swing.GroupLayout(login);
        login.setLayout(loginLayout);
        loginLayout.setHorizontalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(loginLayout.createSequentialGroup()
                .addGap(89, 89, 89)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 81, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, loginLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(107, 107, 107))))
        );
        loginLayout.setVerticalGroup(
            loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(loginLayout.createSequentialGroup()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30)
                .addGroup(loginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(loginLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(42, 42, 42))
                    .addGroup(loginLayout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        getContentPane().add(login, "cd1");

        admintable.setBackground(new java.awt.Color(255, 255, 255));
        admintable.setLayout(null);

        l1.setBackground(new java.awt.Color(153, 204, 255));
        l1.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l1.setForeground(new java.awt.Color(0, 0, 102));
        l1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l1.setText("IT");
        l1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l1.setOpaque(true);
        l1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l1MouseExited(evt);
            }
        });
        admintable.add(l1);
        l1.setBounds(258, 63, 118, 61);

        l2.setBackground(new java.awt.Color(153, 204, 255));
        l2.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l2.setForeground(new java.awt.Color(0, 0, 102));
        l2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l2.setText("CSE");
        l2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l2.setOpaque(true);
        l2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                l2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                l2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                l2MouseExited(evt);
            }
        });
        admintable.add(l2);
        l2.setBounds(120, 63, 118, 61);

        l3.setBackground(new java.awt.Color(153, 204, 255));
        l3.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l3.setForeground(new java.awt.Color(0, 0, 102));
        l3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l3.setText("EE");
        l3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l3.setOpaque(true);
        admintable.add(l3);
        l3.setBounds(256, 142, 118, 61);

        l4.setBackground(new java.awt.Color(153, 204, 255));
        l4.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l4.setForeground(new java.awt.Color(0, 0, 102));
        l4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l4.setText("ME");
        l4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l4.setOpaque(true);
        admintable.add(l4);
        l4.setBounds(120, 142, 118, 61);

        l5.setBackground(new java.awt.Color(153, 204, 255));
        l5.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l5.setForeground(new java.awt.Color(0, 0, 102));
        l5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l5.setText("EEE");
        l5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l5.setOpaque(true);
        admintable.add(l5);
        l5.setBounds(120, 221, 118, 61);

        l6.setBackground(new java.awt.Color(153, 204, 255));
        l6.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l6.setForeground(new java.awt.Color(0, 0, 102));
        l6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l6.setText("EC");
        l6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l6.setOpaque(true);
        admintable.add(l6);
        l6.setBounds(256, 221, 118, 61);

        l7.setBackground(new java.awt.Color(153, 204, 255));
        l7.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l7.setForeground(new java.awt.Color(0, 0, 102));
        l7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l7.setText("MECH");
        l7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l7.setOpaque(true);
        admintable.add(l7);
        l7.setBounds(120, 300, 118, 61);

        l8.setBackground(new java.awt.Color(153, 204, 255));
        l8.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        l8.setForeground(new java.awt.Color(0, 0, 102));
        l8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        l8.setText("CIVIL");
        l8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 51, 0)));
        l8.setOpaque(true);
        admintable.add(l8);
        l8.setBounds(256, 300, 118, 61);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background-pageflip-web-prospectus-sixth-rochdale-college.jpg"))); // NOI18N
        jLabel15.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        admintable.add(jLabel15);
        jLabel15.setBounds(0, 0, 510, 400);

        getContentPane().add(admintable, "cd3");

        cse.setLayout(null);

        jLabel42.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel42.setText("update");
        cse.add(jLabel42);
        jLabel42.setBounds(360, 230, 150, 40);

        jLabel41.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(255, 255, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("remove");
        cse.add(jLabel41);
        jLabel41.setBounds(360, 170, 150, 40);

        jLabel40.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel40.setText("add");
        cse.add(jLabel40);
        jLabel40.setBounds(400, 110, 110, 40);

        jLabel21.setBackground(new java.awt.Color(204, 204, 204));
        jLabel21.setFont(new java.awt.Font("Algerian", 2, 70)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(204, 204, 204));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("IEC");
        cse.add(jLabel21);
        jLabel21.setBounds(160, 160, 170, 80);

        jLabel20.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("CS-D");
        cse.add(jLabel20);
        jLabel20.setBounds(0, 270, 110, 40);

        jLabel19.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("CS-B");
        cse.add(jLabel19);
        jLabel19.setBounds(0, 150, 110, 40);

        jLabel18.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("CS-c");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
        });
        cse.add(jLabel18);
        jLabel18.setBounds(0, 210, 110, 40);

        jLabel17.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setText("CS-A");
        cse.add(jLabel17);
        jLabel17.setBounds(0, 90, 110, 40);

        jLabel16.setBackground(new java.awt.Color(255, 255, 255));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        cse.add(jLabel16);
        jLabel16.setBounds(0, 0, 507, 403);

        getContentPane().add(cse, "cd4");

        cs_c.setBackground(new java.awt.Color(255, 255, 255));
        cs_c.setEnabled(false);
        cs_c.setLayout(null);

        jLabel33.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(255, 255, 255));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("cr");
        jLabel33.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel33MouseClicked(evt);
            }
        });
        cs_c.add(jLabel33);
        jLabel33.setBounds(350, 80, 70, 40);

        jLabel32.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(255, 255, 255));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel32.setText("mentor");
        jLabel32.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel32MouseClicked(evt);
            }
        });
        cs_c.add(jLabel32);
        jLabel32.setBounds(320, 140, 140, 40);

        jLabel31.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(255, 255, 255));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("attndence");
        cs_c.add(jLabel31);
        jLabel31.setBounds(280, 260, 220, 40);

        jLabel30.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel30.setForeground(new java.awt.Color(255, 255, 255));
        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setText("faculty");
        cs_c.add(jLabel30);
        jLabel30.setBounds(310, 320, 170, 40);

        jLabel29.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setText("STUDENTs");
        jLabel29.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel29MouseClicked(evt);
            }
        });
        cs_c.add(jLabel29);
        jLabel29.setBounds(300, 200, 190, 40);

        jLabel24.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setText("CS-A");
        jLabel24.setEnabled(false);
        cs_c.add(jLabel24);
        jLabel24.setBounds(0, 90, 110, 40);

        jLabel25.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setText("CS-B");
        jLabel25.setEnabled(false);
        cs_c.add(jLabel25);
        jLabel25.setBounds(0, 150, 110, 40);

        jLabel26.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(255, 255, 255));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CS-c");
        cs_c.add(jLabel26);
        jLabel26.setBounds(0, 210, 110, 40);

        jLabel27.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel27.setText("CS-D");
        jLabel27.setEnabled(false);
        cs_c.add(jLabel27);
        jLabel27.setBounds(0, 270, 110, 40);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        cs_c.add(jLabel22);
        jLabel22.setBounds(0, 0, 507, 410);

        jLabel23.setBackground(new java.awt.Color(255, 255, 255));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        cs_c.add(jLabel23);
        jLabel23.setBounds(0, 0, 507, 403);

        jLabel44.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel44.setForeground(new java.awt.Color(255, 255, 255));
        jLabel44.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel44.setText("CS-c");
        cs_c.add(jLabel44);
        jLabel44.setBounds(0, 210, 110, 40);

        getContentPane().add(cs_c, "cd5");

        cr.setBackground(new java.awt.Color(255, 255, 255));
        cr.setLayout(null);

        jPanel1.setLayout(null);

        jLabel37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        jLabel37.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jPanel1.add(jLabel37);
        jLabel37.setBounds(0, 0, 140, 140);

        cr.add(jPanel1);
        jPanel1.setBounds(180, 40, 140, 140);

        jLabel35.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(255, 255, 255));
        jLabel35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel35.setText("1509010150");
        cr.add(jLabel35);
        jLabel35.setBounds(70, 270, 350, 40);

        jLabel34.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel34.setForeground(new java.awt.Color(255, 255, 255));
        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel34.setText("priyanshu  shukla");
        cr.add(jLabel34);
        jLabel34.setBounds(80, 210, 350, 40);

        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        cr.add(jLabel28);
        jLabel28.setBounds(0, 0, 507, 403);

        getContentPane().add(cr, "cd6");

        mentor.setBackground(new java.awt.Color(255, 255, 255));
        mentor.setLayout(null);

        jLabel39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        jLabel39.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        mentor.add(jLabel39);
        jLabel39.setBounds(170, 40, 140, 140);

        jLabel38.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel38.setText("mr. arvind tomar sir");
        mentor.add(jLabel38);
        jLabel38.setBounds(60, 210, 410, 40);

        jLabel36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        mentor.add(jLabel36);
        jLabel36.setBounds(0, 0, 507, 410);

        getContentPane().add(mentor, "cd7");

        student.setBackground(new java.awt.Color(255, 255, 255));
        student.setLayout(null);

        jLabel53.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel53.setForeground(new java.awt.Color(255, 255, 255));
        jLabel53.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel53.setText("remove");
        jLabel53.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel53MouseClicked(evt);
            }
        });
        student.add(jLabel53);
        jLabel53.setBounds(370, 250, 140, 40);

        jLabel52.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel52.setForeground(new java.awt.Color(255, 255, 255));
        jLabel52.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel52.setText("update");
        jLabel52.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel52MouseClicked(evt);
            }
        });
        student.add(jLabel52);
        jLabel52.setBounds(370, 320, 140, 40);

        jLabel51.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel51.setForeground(new java.awt.Color(255, 255, 255));
        jLabel51.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel51.setText("add");
        jLabel51.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel51MouseClicked(evt);
            }
        });
        student.add(jLabel51);
        jLabel51.setBounds(400, 190, 110, 40);

        jLabel50.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel50.setForeground(new java.awt.Color(255, 255, 255));
        jLabel50.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel50.setText("search");
        jLabel50.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel50MouseClicked(evt);
            }
        });
        student.add(jLabel50);
        jLabel50.setBounds(370, 50, 140, 40);

        jLabel49.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel49.setForeground(new java.awt.Color(255, 255, 255));
        jLabel49.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel49.setText("view all");
        student.add(jLabel49);
        jLabel49.setBounds(350, 120, 160, 40);

        jLabel48.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel48.setForeground(new java.awt.Color(255, 255, 255));
        jLabel48.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel48.setText("CS-c");
        student.add(jLabel48);
        jLabel48.setBounds(0, 210, 110, 40);

        jLabel47.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel47.setForeground(new java.awt.Color(255, 255, 255));
        jLabel47.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel47.setText("CS-b");
        jLabel47.setEnabled(false);
        jLabel47.setFocusable(false);
        student.add(jLabel47);
        jLabel47.setBounds(0, 150, 110, 40);

        jLabel46.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel46.setForeground(new java.awt.Color(255, 255, 255));
        jLabel46.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel46.setText("CS-d");
        jLabel46.setEnabled(false);
        jLabel46.setFocusable(false);
        student.add(jLabel46);
        jLabel46.setBounds(0, 270, 110, 40);

        jLabel45.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel45.setForeground(new java.awt.Color(255, 255, 255));
        jLabel45.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel45.setText("CS-A");
        jLabel45.setEnabled(false);
        jLabel45.setFocusable(false);
        student.add(jLabel45);
        jLabel45.setBounds(0, 90, 110, 40);

        jLabel43.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        student.add(jLabel43);
        jLabel43.setBounds(0, 0, 510, 410);

        getContentPane().add(student, "cd8");

        add1.setBackground(new java.awt.Color(255, 255, 255));
        add1.setLayout(null);

        jLabel64.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 255));
        jLabel64.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel64.setText("add - student");
        add1.add(jLabel64);
        jLabel64.setBounds(0, 0, 510, 40);

        jLabel63.setBackground(new java.awt.Color(0, 102, 0));
        jLabel63.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel63.setText("RESET");
        jLabel63.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel63.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel63.setOpaque(true);
        add1.add(jLabel63);
        jLabel63.setBounds(260, 380, 80, 20);

        jLabel62.setBackground(new java.awt.Color(0, 102, 0));
        jLabel62.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 255));
        jLabel62.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel62.setText("SUBMIT");
        jLabel62.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel62.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel62.setOpaque(true);
        add1.add(jLabel62);
        jLabel62.setBounds(150, 380, 80, 20);

        jPanel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        add1.add(jPanel2);
        jPanel2.setBounds(360, 70, 100, 100);

        adr.setColumns(20);
        adr.setRows(5);
        jScrollPane1.setViewportView(adr);

        add1.add(jScrollPane1);
        jScrollPane1.setBounds(180, 310, 240, 60);

        jLabel61.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel61.setText("Address");
        add1.add(jLabel61);
        jLabel61.setBounds(30, 330, 80, 20);

        jLabel60.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 255));
        jLabel60.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel60.setText("Mob No");
        add1.add(jLabel60);
        jLabel60.setBounds(30, 280, 80, 20);
        add1.add(mob);
        mob.setBounds(180, 280, 140, 20);

        buttonGroup2.add(h1);
        h1.setText("Yes");
        add1.add(h1);
        h1.setBounds(180, 230, 50, 23);

        buttonGroup2.add(h2);
        h2.setText("No");
        add1.add(h2);
        h2.setBounds(250, 230, 50, 23);

        jLabel59.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel59.setText("Hostler");
        add1.add(jLabel59);
        jLabel59.setBounds(30, 230, 80, 20);
        add1.add(d);
        d.setBounds(180, 190, 140, 30);

        jLabel58.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 255));
        jLabel58.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel58.setText("DOB");
        add1.add(jLabel58);
        jLabel58.setBounds(30, 190, 80, 20);

        buttonGroup1.add(g2);
        g2.setText("Female");
        add1.add(g2);
        g2.setBounds(250, 150, 60, 23);

        buttonGroup1.add(g1);
        g1.setText("Male");
        add1.add(g1);
        g1.setBounds(180, 150, 50, 23);

        jLabel57.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel57.setText("Gender");
        add1.add(jLabel57);
        jLabel57.setBounds(30, 150, 80, 20);

        jLabel56.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel56.setForeground(new java.awt.Color(255, 255, 255));
        jLabel56.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel56.setText("Roll No");
        add1.add(jLabel56);
        jLabel56.setBounds(30, 110, 80, 20);
        add1.add(t2);
        t2.setBounds(180, 110, 130, 20);
        add1.add(t1);
        t1.setBounds(180, 70, 130, 20);

        jLabel55.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel55.setForeground(new java.awt.Color(255, 255, 255));
        jLabel55.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel55.setText("NAME");
        add1.add(jLabel55);
        jLabel55.setBounds(30, 70, 80, 20);

        jLabel54.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        add1.add(jLabel54);
        jLabel54.setBounds(0, 0, 507, 410);

        getContentPane().add(add1, "cd9");

        search.setBackground(new java.awt.Color(255, 255, 255));
        search.setLayout(null);

        jLabel80.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel80.setForeground(new java.awt.Color(255, 255, 255));
        jLabel80.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel80.setText("Mob NO");
        search.add(jLabel80);
        jLabel80.setBounds(130, 320, 80, 20);

        jLabel81.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel81.setForeground(new java.awt.Color(255, 255, 255));
        jLabel81.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel81.setText("ID");
        search.add(jLabel81);
        jLabel81.setBounds(270, 350, 80, 20);

        jLabel82.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel82.setForeground(new java.awt.Color(255, 255, 255));
        jLabel82.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel82.setText("Address");
        search.add(jLabel82);
        jLabel82.setBounds(130, 350, 80, 20);

        jLabel83.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel83.setForeground(new java.awt.Color(255, 255, 255));
        jLabel83.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel83.setText("ID");
        search.add(jLabel83);
        jLabel83.setBounds(270, 320, 80, 20);

        jLabel76.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel76.setForeground(new java.awt.Color(255, 255, 255));
        jLabel76.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel76.setText("ID");
        search.add(jLabel76);
        jLabel76.setBounds(270, 250, 80, 20);

        jLabel77.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel77.setForeground(new java.awt.Color(255, 255, 255));
        jLabel77.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel77.setText("DOB");
        search.add(jLabel77);
        jLabel77.setBounds(130, 250, 80, 20);

        jLabel78.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel78.setForeground(new java.awt.Color(255, 255, 255));
        jLabel78.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel78.setText("ID");
        search.add(jLabel78);
        jLabel78.setBounds(270, 280, 80, 20);

        jLabel79.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel79.setForeground(new java.awt.Color(255, 255, 255));
        jLabel79.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel79.setText("Hostler");
        search.add(jLabel79);
        jLabel79.setBounds(130, 280, 80, 20);

        jLabel72.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel72.setForeground(new java.awt.Color(255, 255, 255));
        jLabel72.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel72.setText("ID");
        search.add(jLabel72);
        jLabel72.setBounds(270, 210, 80, 20);

        jLabel73.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel73.setForeground(new java.awt.Color(255, 255, 255));
        jLabel73.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel73.setText("Gender");
        search.add(jLabel73);
        jLabel73.setBounds(130, 210, 80, 20);

        jLabel74.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel74.setForeground(new java.awt.Color(255, 255, 255));
        jLabel74.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel74.setText("Name");
        search.add(jLabel74);
        jLabel74.setBounds(130, 180, 80, 20);

        jLabel75.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel75.setForeground(new java.awt.Color(255, 255, 255));
        jLabel75.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel75.setText("ID");
        search.add(jLabel75);
        jLabel75.setBounds(270, 180, 80, 20);

        jLabel71.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel71.setForeground(new java.awt.Color(255, 255, 255));
        jLabel71.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel71.setText("ID");
        search.add(jLabel71);
        jLabel71.setBounds(270, 140, 80, 20);

        jLabel70.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel70.setForeground(new java.awt.Color(255, 255, 255));
        jLabel70.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel70.setText("ID");
        search.add(jLabel70);
        jLabel70.setBounds(270, 110, 80, 20);

        jLabel69.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel69.setForeground(new java.awt.Color(255, 255, 255));
        jLabel69.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel69.setText("ID");
        search.add(jLabel69);
        jLabel69.setBounds(130, 110, 80, 20);

        jLabel68.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel68.setForeground(new java.awt.Color(255, 255, 255));
        jLabel68.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel68.setText("Roll No");
        search.add(jLabel68);
        jLabel68.setBounds(130, 140, 80, 20);

        jLabel67.setBackground(new java.awt.Color(0, 51, 51));
        jLabel67.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel67.setText("Get");
        jLabel67.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel67.setOpaque(true);
        search.add(jLabel67);
        jLabel67.setBounds(300, 70, 60, 20);

        jTextField3.setBorder(null);
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        search.add(jTextField3);
        jTextField3.setBounds(120, 70, 140, 20);

        jLabel66.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 255));
        jLabel66.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel66.setText("search");
        search.add(jLabel66);
        jLabel66.setBounds(160, 0, 140, 40);

        jLabel65.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel65.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        search.add(jLabel65);
        jLabel65.setBounds(0, 0, 507, 410);

        getContentPane().add(search, "cd10");

        remove.setBackground(new java.awt.Color(255, 255, 255));
        remove.setDoubleBuffered(false);
        remove.setLayout(null);

        jLabel88.setBackground(new java.awt.Color(0, 51, 51));
        jLabel88.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel88.setForeground(new java.awt.Color(255, 255, 255));
        jLabel88.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel88.setText("Remove");
        jLabel88.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel88.setOpaque(true);
        remove.add(jLabel88);
        jLabel88.setBounds(180, 230, 110, 20);

        jTextField5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField5.setMinimumSize(new java.awt.Dimension(9, 20));
        remove.add(jTextField5);
        jTextField5.setBounds(230, 170, 140, 20);

        jLabel87.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel87.setForeground(new java.awt.Color(255, 255, 255));
        jLabel87.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel87.setText("Roll No");
        remove.add(jLabel87);
        jLabel87.setBounds(70, 170, 140, 20);

        jTextField4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        remove.add(jTextField4);
        jTextField4.setBounds(230, 110, 140, 20);

        jLabel86.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel86.setForeground(new java.awt.Color(255, 255, 255));
        jLabel86.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel86.setText("remove");
        remove.add(jLabel86);
        jLabel86.setBounds(170, 0, 140, 40);

        jLabel85.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel85.setForeground(new java.awt.Color(255, 255, 255));
        jLabel85.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel85.setText("Enter  Name");
        remove.add(jLabel85);
        jLabel85.setBounds(70, 110, 140, 20);

        jLabel84.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel84.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        jLabel84.setToolTipText("");
        remove.add(jLabel84);
        jLabel84.setBounds(0, 0, 507, 410);

        getContentPane().add(remove, "cd11");

        update.setBackground(new java.awt.Color(255, 255, 255));
        update.setLayout(null);

        jLabel93.setBackground(new java.awt.Color(0, 51, 51));
        jLabel93.setFont(new java.awt.Font("Copperplate Gothic Light", 0, 24)); // NOI18N
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Update");
        jLabel93.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel93.setOpaque(true);
        jLabel93.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel93MouseClicked(evt);
            }
        });
        update.add(jLabel93);
        jLabel93.setBounds(200, 230, 110, 20);

        jLabel91.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Enter  Name");
        update.add(jLabel91);
        jLabel91.setBounds(100, 110, 140, 20);

        jTextField6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        update.add(jTextField6);
        jTextField6.setBounds(260, 110, 140, 20);

        jTextField7.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jTextField7.setMinimumSize(new java.awt.Dimension(9, 20));
        update.add(jTextField7);
        jTextField7.setBounds(260, 170, 140, 20);

        jLabel92.setFont(new java.awt.Font("Arial", 1, 16)); // NOI18N
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("Roll No");
        update.add(jLabel92);
        jLabel92.setBounds(100, 170, 140, 20);

        jLabel90.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel90.setForeground(new java.awt.Color(255, 255, 255));
        jLabel90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel90.setText("update-profile");
        jLabel90.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        update.add(jLabel90);
        jLabel90.setBounds(110, 10, 290, 40);

        jLabel89.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel89.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        update.add(jLabel89);
        jLabel89.setBounds(0, 0, 507, 410);

        getContentPane().add(update, "cd12");

        updatenext.setBackground(new java.awt.Color(255, 255, 255));
        updatenext.setLayout(null);

        jLabel104.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel104.setForeground(new java.awt.Color(255, 255, 255));
        jLabel104.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel104.setText("update-profile");
        jLabel104.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        updatenext.add(jLabel104);
        jLabel104.setBounds(110, 0, 290, 40);

        jPanel3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        updatenext.add(jPanel3);
        jPanel3.setBounds(360, 70, 100, 100);

        jLabel95.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel95.setForeground(new java.awt.Color(255, 255, 255));
        jLabel95.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel95.setText("NAME");
        updatenext.add(jLabel95);
        jLabel95.setBounds(30, 70, 80, 20);
        updatenext.add(t3);
        t3.setBounds(180, 70, 130, 20);

        jLabel96.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel96.setForeground(new java.awt.Color(255, 255, 255));
        jLabel96.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel96.setText("Roll No");
        updatenext.add(jLabel96);
        jLabel96.setBounds(30, 110, 80, 20);
        updatenext.add(t4);
        t4.setBounds(180, 110, 130, 20);

        jLabel97.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel97.setForeground(new java.awt.Color(255, 255, 255));
        jLabel97.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel97.setText("Gender");
        updatenext.add(jLabel97);
        jLabel97.setBounds(30, 150, 80, 20);

        buttonGroup1.add(g3);
        g3.setSelected(true);
        g3.setText("Male");
        updatenext.add(g3);
        g3.setBounds(180, 150, 50, 23);

        buttonGroup1.add(g4);
        g4.setText("Female");
        updatenext.add(g4);
        g4.setBounds(250, 150, 60, 23);
        updatenext.add(d1);
        d1.setBounds(180, 190, 140, 30);

        jLabel98.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel98.setForeground(new java.awt.Color(255, 255, 255));
        jLabel98.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel98.setText("DOB");
        updatenext.add(jLabel98);
        jLabel98.setBounds(30, 190, 80, 20);

        jLabel99.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Hostler");
        updatenext.add(jLabel99);
        jLabel99.setBounds(30, 230, 80, 20);

        buttonGroup2.add(h3);
        h3.setText("Yes");
        updatenext.add(h3);
        h3.setBounds(180, 230, 50, 23);

        buttonGroup2.add(h4);
        h4.setSelected(true);
        h4.setText("No");
        updatenext.add(h4);
        h4.setBounds(250, 230, 50, 23);
        updatenext.add(mob1);
        mob1.setBounds(180, 280, 140, 20);

        jLabel100.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("Mob No");
        updatenext.add(jLabel100);
        jLabel100.setBounds(30, 280, 80, 20);

        jLabel101.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel101.setForeground(new java.awt.Color(255, 255, 255));
        jLabel101.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel101.setText("Address");
        updatenext.add(jLabel101);
        jLabel101.setBounds(30, 330, 80, 20);

        adr1.setColumns(20);
        adr1.setRows(5);
        jScrollPane2.setViewportView(adr1);

        updatenext.add(jScrollPane2);
        jScrollPane2.setBounds(180, 310, 240, 60);

        jLabel102.setBackground(new java.awt.Color(0, 102, 0));
        jLabel102.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("SAVE CHANGE");
        jLabel102.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel102.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel102.setOpaque(true);
        updatenext.add(jLabel102);
        jLabel102.setBounds(150, 380, 100, 20);

        jLabel103.setBackground(new java.awt.Color(0, 102, 0));
        jLabel103.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("RESET");
        jLabel103.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jLabel103.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel103.setOpaque(true);
        updatenext.add(jLabel103);
        jLabel103.setBounds(280, 380, 80, 20);

        jLabel94.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        updatenext.add(jLabel94);
        jLabel94.setBounds(0, 0, 507, 410);

        getContentPane().add(updatenext, "cd13");

        Faculty.setBackground(new java.awt.Color(255, 255, 255));
        Faculty.setLayout(null);

        jLabel132.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("S.No");
        Faculty.add(jLabel132);
        jLabel132.setBounds(0, 290, 50, 20);

        jLabel133.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("NAME");
        Faculty.add(jLabel133);
        jLabel133.setBounds(70, 290, 140, 20);

        jLabel134.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel134.setForeground(new java.awt.Color(255, 255, 255));
        jLabel134.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel134.setText("SUBJECT TEACHING");
        Faculty.add(jLabel134);
        jLabel134.setBounds(240, 290, 150, 20);

        jLabel135.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("SUBJECT TEACHING");
        Faculty.add(jLabel135);
        jLabel135.setBounds(240, 330, 150, 20);

        jLabel136.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setText("NAME");
        Faculty.add(jLabel136);
        jLabel136.setBounds(70, 330, 140, 20);

        jLabel137.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel137.setForeground(new java.awt.Color(255, 255, 255));
        jLabel137.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel137.setText("S.No");
        Faculty.add(jLabel137);
        jLabel137.setBounds(0, 330, 50, 20);

        jLabel129.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("S.No");
        Faculty.add(jLabel129);
        jLabel129.setBounds(0, 250, 50, 20);

        jLabel130.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("NAME");
        Faculty.add(jLabel130);
        jLabel130.setBounds(70, 250, 140, 20);

        jLabel131.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel131.setForeground(new java.awt.Color(255, 255, 255));
        jLabel131.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel131.setText("SUBJECT TEACHING");
        Faculty.add(jLabel131);
        jLabel131.setBounds(240, 250, 150, 20);

        jLabel126.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("S.No");
        Faculty.add(jLabel126);
        jLabel126.setBounds(0, 210, 50, 20);

        jLabel127.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("NAME");
        Faculty.add(jLabel127);
        jLabel127.setBounds(70, 210, 140, 20);

        jLabel128.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel128.setForeground(new java.awt.Color(255, 255, 255));
        jLabel128.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel128.setText("SUBJECT TEACHING");
        Faculty.add(jLabel128);
        jLabel128.setBounds(240, 210, 150, 20);

        jLabel123.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("NAME");
        Faculty.add(jLabel123);
        jLabel123.setBounds(70, 170, 140, 20);

        jLabel124.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("S.No");
        Faculty.add(jLabel124);
        jLabel124.setBounds(0, 170, 50, 20);

        jLabel125.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel125.setForeground(new java.awt.Color(255, 255, 255));
        jLabel125.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel125.setText("SUBJECT TEACHING");
        Faculty.add(jLabel125);
        jLabel125.setBounds(240, 170, 150, 20);

        jLabel120.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("SUBJECT TEACHING");
        Faculty.add(jLabel120);
        jLabel120.setBounds(240, 170, 150, 20);

        jLabel121.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("NAME");
        Faculty.add(jLabel121);
        jLabel121.setBounds(70, 170, 140, 20);

        jLabel122.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel122.setForeground(new java.awt.Color(255, 255, 255));
        jLabel122.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel122.setText("S.No");
        Faculty.add(jLabel122);
        jLabel122.setBounds(0, 170, 50, 20);

        jLabel117.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("S.No");
        Faculty.add(jLabel117);
        jLabel117.setBounds(0, 130, 50, 20);

        jLabel118.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("NAME");
        Faculty.add(jLabel118);
        jLabel118.setBounds(70, 130, 140, 20);

        jLabel119.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel119.setForeground(new java.awt.Color(255, 255, 255));
        jLabel119.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel119.setText("SUBJECT TEACHING");
        Faculty.add(jLabel119);
        jLabel119.setBounds(240, 130, 150, 20);

        jLabel114.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("S.No");
        Faculty.add(jLabel114);
        jLabel114.setBounds(0, 90, 50, 20);

        jLabel115.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("NAME");
        Faculty.add(jLabel115);
        jLabel115.setBounds(70, 90, 140, 20);

        jLabel116.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel116.setForeground(new java.awt.Color(255, 255, 255));
        jLabel116.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel116.setText("SUBJECT TEACHING");
        Faculty.add(jLabel116);
        jLabel116.setBounds(240, 90, 150, 20);

        jLabel112.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("VIEW");
        jLabel112.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        Faculty.add(jLabel112);
        jLabel112.setBounds(430, 240, 90, 20);

        jLabel111.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("EDIT");
        jLabel111.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        Faculty.add(jLabel111);
        jLabel111.setBounds(430, 140, 90, 20);

        jLabel113.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel113.setForeground(new java.awt.Color(255, 255, 255));
        jLabel113.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel113.setText("REMOVE");
        jLabel113.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        Faculty.add(jLabel113);
        jLabel113.setBounds(430, 190, 90, 20);

        jLabel110.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel110.setForeground(new java.awt.Color(255, 255, 255));
        jLabel110.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel110.setText("ADD NEW");
        jLabel110.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        Faculty.add(jLabel110);
        jLabel110.setBounds(430, 90, 90, 20);

        jLabel109.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("faculty");
        jLabel109.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        Faculty.add(jLabel109);
        jLabel109.setBounds(120, 0, 230, 40);

        jLabel108.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("NAME");
        Faculty.add(jLabel108);
        jLabel108.setBounds(70, 50, 140, 20);

        jLabel107.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel107.setForeground(new java.awt.Color(255, 255, 255));
        jLabel107.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel107.setText("SUBJECT TEACHING");
        Faculty.add(jLabel107);
        jLabel107.setBounds(240, 50, 150, 20);

        jLabel106.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("S.No");
        Faculty.add(jLabel106);
        jLabel106.setBounds(0, 50, 50, 20);

        jLabel105.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        Faculty.add(jLabel105);
        jLabel105.setBounds(0, 0, 520, 407);

        getContentPane().add(Faculty, "cd14");

        faculty_addnew.setBackground(new java.awt.Color(255, 255, 255));
        faculty_addnew.setLayout(null);

        jLabel147.setBackground(new java.awt.Color(0, 51, 51));
        jLabel147.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setText("RESET");
        jLabel147.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 0), null, null));
        faculty_addnew.add(jLabel147);
        jLabel147.setBounds(230, 270, 80, 20);

        jTextField9.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faculty_addnew.add(jTextField9);
        jTextField9.setBounds(140, 150, 160, 20);

        jTextField10.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faculty_addnew.add(jTextField10);
        jTextField10.setBounds(140, 200, 160, 20);

        jTextField8.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faculty_addnew.add(jTextField8);
        jTextField8.setBounds(140, 100, 40, 20);

        jLabel144.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("S.No");
        faculty_addnew.add(jLabel144);
        jLabel144.setBounds(10, 100, 50, 20);

        jLabel145.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("NAME");
        faculty_addnew.add(jLabel145);
        jLabel145.setBounds(0, 150, 70, 20);

        jLabel146.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel146.setForeground(new java.awt.Color(255, 255, 255));
        jLabel146.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel146.setText("SUBJECT ");
        faculty_addnew.add(jLabel146);
        jLabel146.setBounds(10, 200, 70, 20);

        jLabel139.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("faculty");
        jLabel139.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        faculty_addnew.add(jLabel139);
        jLabel139.setBounds(130, 0, 220, 40);

        jLabel140.setBackground(new java.awt.Color(0, 51, 51));
        jLabel140.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel140.setForeground(new java.awt.Color(255, 255, 255));
        jLabel140.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel140.setText("ADD NEW");
        jLabel140.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 0), null, null));
        faculty_addnew.add(jLabel140);
        jLabel140.setBounds(120, 270, 80, 20);

        jLabel141.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("EDIT");
        jLabel141.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel141.setEnabled(false);
        faculty_addnew.add(jLabel141);
        jLabel141.setBounds(430, 140, 80, 20);

        jLabel142.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("REMOVE");
        jLabel142.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel142.setEnabled(false);
        faculty_addnew.add(jLabel142);
        jLabel142.setBounds(430, 190, 80, 20);

        jLabel143.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel143.setForeground(new java.awt.Color(255, 255, 255));
        jLabel143.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel143.setText("VIEW");
        jLabel143.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel143.setEnabled(false);
        faculty_addnew.add(jLabel143);
        jLabel143.setBounds(430, 240, 80, 20);

        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        faculty_addnew.add(jLabel138);
        jLabel138.setBounds(0, 0, 507, 407);

        getContentPane().add(faculty_addnew, "cd15");

        faculty_edit.setBackground(new java.awt.Color(255, 255, 255));
        faculty_edit.setLayout(null);

        jLabel159.setBackground(new java.awt.Color(51, 51, 0));
        jLabel159.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel159.setText("RESET");
        jLabel159.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        faculty_edit.add(jLabel159);
        jLabel159.setBounds(250, 270, 60, 20);

        jLabel158.setBackground(new java.awt.Color(51, 51, 0));
        jLabel158.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel158.setForeground(new java.awt.Color(255, 255, 255));
        jLabel158.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel158.setText("SAVE CHANGE");
        jLabel158.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        faculty_edit.add(jLabel158);
        jLabel158.setBounds(130, 270, 100, 20);

        jLabel156.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel156.setText("NAME");
        jLabel156.setEnabled(false);
        faculty_edit.add(jLabel156);
        jLabel156.setBounds(30, 160, 70, 20);

        jTextField12.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField12.setEnabled(false);
        faculty_edit.add(jTextField12);
        jTextField12.setBounds(160, 160, 160, 20);

        jTextField13.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jTextField13.setEnabled(false);
        faculty_edit.add(jTextField13);
        jTextField13.setBounds(160, 210, 160, 20);

        jLabel157.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("SUBJECT ");
        jLabel157.setEnabled(false);
        faculty_edit.add(jLabel157);
        jLabel157.setBounds(30, 210, 70, 20);

        jLabel155.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel155.setForeground(new java.awt.Color(255, 255, 255));
        jLabel155.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel155.setText("S.No");
        faculty_edit.add(jLabel155);
        jLabel155.setBounds(10, 100, 50, 20);

        jTextField11.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faculty_edit.add(jTextField11);
        jTextField11.setBounds(100, 100, 40, 20);

        jLabel149.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel149.setForeground(new java.awt.Color(255, 255, 255));
        jLabel149.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel149.setText("faculty");
        jLabel149.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        faculty_edit.add(jLabel149);
        jLabel149.setBounds(140, 0, 220, 40);

        jLabel150.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel150.setText("ADD NEW");
        jLabel150.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel150.setEnabled(false);
        faculty_edit.add(jLabel150);
        jLabel150.setBounds(430, 90, 80, 20);

        jLabel151.setBackground(new java.awt.Color(51, 51, 0));
        jLabel151.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("EDIT");
        jLabel151.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        faculty_edit.add(jLabel151);
        jLabel151.setBounds(210, 100, 80, 20);

        jLabel152.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel152.setForeground(new java.awt.Color(255, 255, 255));
        jLabel152.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel152.setText("REMOVE");
        jLabel152.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel152.setEnabled(false);
        faculty_edit.add(jLabel152);
        jLabel152.setBounds(430, 190, 80, 20);

        jLabel153.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("VIEW");
        jLabel153.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel153.setEnabled(false);
        faculty_edit.add(jLabel153);
        jLabel153.setBounds(430, 240, 80, 20);

        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel148.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        faculty_edit.add(jLabel148);
        jLabel148.setBounds(0, 0, 507, 407);

        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        faculty_edit.add(jLabel154);
        jLabel154.setBounds(0, 0, 507, 407);

        getContentPane().add(faculty_edit, "cd16");

        faculty_remove.setBackground(new java.awt.Color(255, 255, 255));
        faculty_remove.setLayout(null);

        jLabel164.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel164.setForeground(new java.awt.Color(255, 255, 255));
        jLabel164.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel164.setText("ADD NEW");
        jLabel164.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel164.setEnabled(false);
        faculty_remove.add(jLabel164);
        jLabel164.setBounds(430, 90, 80, 20);

        jLabel165.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel165.setText("EDIT");
        jLabel165.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel165.setEnabled(false);
        faculty_remove.add(jLabel165);
        jLabel165.setBounds(430, 140, 80, 20);

        jLabel166.setBackground(new java.awt.Color(51, 51, 51));
        jLabel166.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("REMOVE");
        jLabel166.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        faculty_remove.add(jLabel166);
        jLabel166.setBounds(200, 210, 80, 20);

        jLabel167.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel167.setForeground(new java.awt.Color(255, 255, 255));
        jLabel167.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel167.setText("VIEW");
        jLabel167.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        jLabel167.setEnabled(false);
        faculty_remove.add(jLabel167);
        jLabel167.setBounds(430, 240, 80, 20);

        jLabel161.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel161.setForeground(new java.awt.Color(255, 255, 255));
        jLabel161.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel161.setText("faculty");
        jLabel161.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        faculty_remove.add(jLabel161);
        jLabel161.setBounds(130, 0, 220, 40);

        jLabel162.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel162.setText("S.No");
        faculty_remove.add(jLabel162);
        jLabel162.setBounds(70, 100, 50, 20);

        jTextField14.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faculty_remove.add(jTextField14);
        jTextField14.setBounds(200, 100, 40, 20);

        jTextField15.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        faculty_remove.add(jTextField15);
        jTextField15.setBounds(200, 150, 160, 20);

        jLabel163.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("NAME");
        faculty_remove.add(jLabel163);
        jLabel163.setBounds(60, 150, 70, 20);

        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel160.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        faculty_remove.add(jLabel160);
        jLabel160.setBounds(0, 0, 507, 407);

        getContentPane().add(faculty_remove, "cd17");

        attendence.setBackground(new java.awt.Color(255, 255, 255));
        attendence.setLayout(null);

        jLabel172.setBackground(new java.awt.Color(0, 51, 0));
        jLabel172.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel172.setText("attndence");
        jLabel172.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        attendence.add(jLabel172);
        jLabel172.setBounds(140, 10, 220, 40);

        jLabel169.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("Roll No");
        attendence.add(jLabel169);
        jLabel169.setBounds(70, 100, 50, 20);

        jTextField16.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        attendence.add(jTextField16);
        jTextField16.setBounds(200, 100, 160, 20);

        jTextField17.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        attendence.add(jTextField17);
        jTextField17.setBounds(200, 150, 160, 20);

        jLabel170.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel170.setForeground(new java.awt.Color(255, 255, 255));
        jLabel170.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel170.setText("NAME");
        attendence.add(jLabel170);
        jLabel170.setBounds(60, 150, 70, 20);

        jLabel171.setBackground(new java.awt.Color(51, 51, 51));
        jLabel171.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel171.setText("CHECK");
        jLabel171.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(0, 51, 0), null, null));
        attendence.add(jLabel171);
        jLabel171.setBounds(180, 210, 80, 20);

        jLabel168.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        attendence.add(jLabel168);
        jLabel168.setBounds(0, 0, 507, 407);

        getContentPane().add(attendence, "cd18");

        attend_sheet.setBackground(new java.awt.Color(255, 255, 255));
        attend_sheet.setLayout(null);

        jLabel220.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel220.setForeground(new java.awt.Color(255, 255, 255));
        jLabel220.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel220.setText("SUBJECT");
        attend_sheet.add(jLabel220);
        jLabel220.setBounds(0, 10, 70, 20);

        jLabel221.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel221.setForeground(new java.awt.Color(255, 255, 255));
        jLabel221.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel221.setText("LECTURE");
        attend_sheet.add(jLabel221);
        jLabel221.setBounds(140, 10, 70, 20);

        jLabel222.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel222.setForeground(new java.awt.Color(255, 255, 255));
        jLabel222.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel222.setText("TUTE");
        attend_sheet.add(jLabel222);
        jLabel222.setBounds(220, 10, 60, 20);

        jLabel223.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel223.setForeground(new java.awt.Color(255, 255, 255));
        jLabel223.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel223.setText("LAB");
        attend_sheet.add(jLabel223);
        jLabel223.setBounds(290, 10, 50, 20);

        jLabel224.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel224.setForeground(new java.awt.Color(255, 255, 255));
        jLabel224.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel224.setText("TOTAL");
        attend_sheet.add(jLabel224);
        jLabel224.setBounds(340, 10, 70, 20);

        jLabel225.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel225.setForeground(new java.awt.Color(255, 255, 255));
        jLabel225.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel225.setText("PERCENTAGE");
        attend_sheet.add(jLabel225);
        jLabel225.setBounds(410, 10, 100, 20);

        jLabel214.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel214.setForeground(new java.awt.Color(255, 255, 255));
        jLabel214.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel214.setText("TOTAL");
        attend_sheet.add(jLabel214);
        jLabel214.setBounds(340, 290, 70, 20);

        jLabel215.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel215.setForeground(new java.awt.Color(255, 255, 255));
        jLabel215.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel215.setText("PERCENTAGE");
        attend_sheet.add(jLabel215);
        jLabel215.setBounds(410, 290, 100, 20);

        jLabel216.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel216.setForeground(new java.awt.Color(255, 255, 255));
        jLabel216.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel216.setText("SUBJECT");
        attend_sheet.add(jLabel216);
        jLabel216.setBounds(0, 290, 70, 20);

        jLabel217.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel217.setForeground(new java.awt.Color(255, 255, 255));
        jLabel217.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel217.setText("LAB");
        attend_sheet.add(jLabel217);
        jLabel217.setBounds(290, 290, 50, 20);

        jLabel218.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel218.setForeground(new java.awt.Color(255, 255, 255));
        jLabel218.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel218.setText("TUTE");
        attend_sheet.add(jLabel218);
        jLabel218.setBounds(220, 290, 60, 20);

        jLabel219.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel219.setForeground(new java.awt.Color(255, 255, 255));
        jLabel219.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel219.setText("LECTURE");
        attend_sheet.add(jLabel219);
        jLabel219.setBounds(140, 290, 70, 20);

        jLabel208.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel208.setText("TUTE");
        attend_sheet.add(jLabel208);
        jLabel208.setBounds(220, 250, 60, 20);

        jLabel209.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel209.setForeground(new java.awt.Color(255, 255, 255));
        jLabel209.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel209.setText("TOTAL");
        attend_sheet.add(jLabel209);
        jLabel209.setBounds(340, 250, 70, 20);

        jLabel210.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel210.setForeground(new java.awt.Color(255, 255, 255));
        jLabel210.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel210.setText("PERCENTAGE");
        attend_sheet.add(jLabel210);
        jLabel210.setBounds(410, 250, 100, 20);

        jLabel211.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel211.setForeground(new java.awt.Color(255, 255, 255));
        jLabel211.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel211.setText("LECTURE");
        attend_sheet.add(jLabel211);
        jLabel211.setBounds(140, 250, 70, 20);

        jLabel212.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel212.setForeground(new java.awt.Color(255, 255, 255));
        jLabel212.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel212.setText("SUBJECT");
        attend_sheet.add(jLabel212);
        jLabel212.setBounds(0, 250, 70, 20);

        jLabel213.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel213.setForeground(new java.awt.Color(255, 255, 255));
        jLabel213.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel213.setText("LAB");
        attend_sheet.add(jLabel213);
        jLabel213.setBounds(290, 250, 50, 20);

        jLabel202.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel202.setForeground(new java.awt.Color(255, 255, 255));
        jLabel202.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel202.setText("LAB");
        attend_sheet.add(jLabel202);
        jLabel202.setBounds(290, 210, 50, 20);

        jLabel203.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel203.setForeground(new java.awt.Color(255, 255, 255));
        jLabel203.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel203.setText("TOTAL");
        attend_sheet.add(jLabel203);
        jLabel203.setBounds(340, 210, 70, 20);

        jLabel204.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel204.setForeground(new java.awt.Color(255, 255, 255));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel204.setText("SUBJECT");
        attend_sheet.add(jLabel204);
        jLabel204.setBounds(0, 210, 70, 20);

        jLabel205.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel205.setForeground(new java.awt.Color(255, 255, 255));
        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel205.setText("TUTE");
        attend_sheet.add(jLabel205);
        jLabel205.setBounds(220, 210, 60, 20);

        jLabel206.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel206.setForeground(new java.awt.Color(255, 255, 255));
        jLabel206.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel206.setText("LECTURE");
        attend_sheet.add(jLabel206);
        jLabel206.setBounds(140, 210, 70, 20);

        jLabel207.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel207.setText("PERCENTAGE");
        attend_sheet.add(jLabel207);
        jLabel207.setBounds(410, 210, 100, 20);

        jLabel196.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel196.setText("LAB");
        attend_sheet.add(jLabel196);
        jLabel196.setBounds(290, 170, 50, 20);

        jLabel197.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel197.setForeground(new java.awt.Color(255, 255, 255));
        jLabel197.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel197.setText("PERCENTAGE");
        attend_sheet.add(jLabel197);
        jLabel197.setBounds(410, 170, 100, 20);

        jLabel198.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel198.setForeground(new java.awt.Color(255, 255, 255));
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel198.setText("SUBJECT");
        attend_sheet.add(jLabel198);
        jLabel198.setBounds(0, 170, 70, 20);

        jLabel199.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel199.setText("TUTE");
        attend_sheet.add(jLabel199);
        jLabel199.setBounds(220, 170, 60, 20);

        jLabel200.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel200.setForeground(new java.awt.Color(255, 255, 255));
        jLabel200.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel200.setText("LECTURE");
        attend_sheet.add(jLabel200);
        jLabel200.setBounds(140, 170, 70, 20);

        jLabel201.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel201.setForeground(new java.awt.Color(255, 255, 255));
        jLabel201.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel201.setText("TOTAL");
        attend_sheet.add(jLabel201);
        jLabel201.setBounds(340, 170, 70, 20);

        jLabel190.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel190.setForeground(new java.awt.Color(255, 255, 255));
        jLabel190.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel190.setText("LAB");
        attend_sheet.add(jLabel190);
        jLabel190.setBounds(290, 130, 50, 20);

        jLabel191.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel191.setForeground(new java.awt.Color(255, 255, 255));
        jLabel191.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel191.setText("PERCENTAGE");
        attend_sheet.add(jLabel191);
        jLabel191.setBounds(410, 130, 100, 20);

        jLabel192.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel192.setText("TUTE");
        attend_sheet.add(jLabel192);
        jLabel192.setBounds(220, 130, 60, 20);

        jLabel193.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel193.setText("SUBJECT");
        attend_sheet.add(jLabel193);
        jLabel193.setBounds(0, 130, 70, 20);

        jLabel194.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel194.setForeground(new java.awt.Color(255, 255, 255));
        jLabel194.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel194.setText("TOTAL");
        attend_sheet.add(jLabel194);
        jLabel194.setBounds(340, 130, 70, 20);

        jLabel195.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel195.setText("LECTURE");
        attend_sheet.add(jLabel195);
        jLabel195.setBounds(140, 130, 70, 20);

        jLabel184.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel184.setForeground(new java.awt.Color(255, 255, 255));
        jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel184.setText("PERCENTAGE");
        attend_sheet.add(jLabel184);
        jLabel184.setBounds(410, 90, 100, 20);

        jLabel185.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel185.setForeground(new java.awt.Color(255, 255, 255));
        jLabel185.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel185.setText("TOTAL");
        attend_sheet.add(jLabel185);
        jLabel185.setBounds(340, 90, 70, 20);

        jLabel186.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel186.setText("LAB");
        attend_sheet.add(jLabel186);
        jLabel186.setBounds(290, 90, 50, 20);

        jLabel187.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel187.setText("TUTE");
        attend_sheet.add(jLabel187);
        jLabel187.setBounds(220, 90, 60, 20);

        jLabel188.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel188.setForeground(new java.awt.Color(255, 255, 255));
        jLabel188.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel188.setText("LECTURE");
        attend_sheet.add(jLabel188);
        jLabel188.setBounds(140, 90, 70, 20);

        jLabel189.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel189.setText("SUBJECT");
        attend_sheet.add(jLabel189);
        jLabel189.setBounds(0, 90, 70, 20);

        jLabel180.setBackground(new java.awt.Color(0, 51, 51));
        jLabel180.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("LECTURE");
        jLabel180.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        attend_sheet.add(jLabel180);
        jLabel180.setBounds(10, 340, 70, 20);

        jLabel181.setBackground(new java.awt.Color(0, 51, 51));
        jLabel181.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("TUTE");
        jLabel181.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        attend_sheet.add(jLabel181);
        jLabel181.setBounds(260, 340, 60, 20);

        jLabel182.setBackground(new java.awt.Color(0, 51, 51));
        jLabel182.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel182.setForeground(new java.awt.Color(255, 255, 255));
        jLabel182.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel182.setText("LAB");
        jLabel182.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        attend_sheet.add(jLabel182);
        jLabel182.setBounds(10, 380, 50, 20);

        jLabel183.setBackground(new java.awt.Color(0, 51, 51));
        jLabel183.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setText("TOTAL");
        jLabel183.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        attend_sheet.add(jLabel183);
        jLabel183.setBounds(260, 380, 70, 20);

        jLabel175.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setText("SUBJECT");
        attend_sheet.add(jLabel175);
        jLabel175.setBounds(0, 50, 70, 20);

        jLabel176.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel176.setForeground(new java.awt.Color(255, 255, 255));
        jLabel176.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel176.setText("LAB");
        attend_sheet.add(jLabel176);
        jLabel176.setBounds(290, 50, 50, 20);

        jLabel177.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel177.setForeground(new java.awt.Color(255, 255, 255));
        jLabel177.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel177.setText("TOTAL");
        attend_sheet.add(jLabel177);
        jLabel177.setBounds(340, 50, 70, 20);

        jLabel178.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel178.setForeground(new java.awt.Color(255, 255, 255));
        jLabel178.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel178.setText("PERCENTAGE");
        attend_sheet.add(jLabel178);
        jLabel178.setBounds(410, 50, 100, 20);

        jLabel179.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel179.setForeground(new java.awt.Color(255, 255, 255));
        jLabel179.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel179.setText("LECTURE");
        attend_sheet.add(jLabel179);
        jLabel179.setBounds(140, 50, 70, 20);

        jLabel174.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel174.setText("TUTE");
        attend_sheet.add(jLabel174);
        jLabel174.setBounds(220, 50, 60, 20);

        jLabel173.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        attend_sheet.add(jLabel173);
        jLabel173.setBounds(0, 0, 507, 407);

        getContentPane().add(attend_sheet, "cd19");

        admin.setBackground(new java.awt.Color(255, 255, 255));
        admin.setLayout(null);

        jLabel234.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel234.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-icon1.png"))); // NOI18N
        jLabel234.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel234MouseClicked(evt);
            }
        });
        admin.add(jLabel234);
        jLabel234.setBounds(10, 10, 24, 24);

        jLabel235.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel235.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back-icon.png"))); // NOI18N
        jLabel235.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel235AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        admin.add(jLabel235);
        jLabel235.setBounds(40, 10, 24, 24);

        jLabel236.setFont(new java.awt.Font("Yu Gothic", 1, 36)); // NOI18N
        jLabel236.setForeground(new java.awt.Color(255, 255, 255));
        jLabel236.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel236.setText("Login");
        admin.add(jLabel236);
        jLabel236.setBounds(110, 90, 110, 40);

        jLabel237.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel237.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/username.png"))); // NOI18N
        jLabel237.setPreferredSize(new java.awt.Dimension(18, 17));
        admin.add(jLabel237);
        jLabel237.setBounds(200, 150, 20, 17);

        j4.setForeground(new java.awt.Color(204, 204, 204));
        j4.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        j4.setText("       username");
        j4.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j4.setCaretColor(new java.awt.Color(51, 51, 0));
        j4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j4MouseClicked(evt);
            }
        });
        j4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j4ActionPerformed(evt);
            }
        });
        admin.add(j4);
        j4.setBounds(200, 150, 140, 20);

        jLabel238.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel238.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/key_green_1.png"))); // NOI18N
        jLabel238.setPreferredSize(new java.awt.Dimension(18, 17));
        admin.add(jLabel238);
        jLabel238.setBounds(200, 210, 20, 17);

        j5.setForeground(new java.awt.Color(204, 204, 204));
        j5.setText("       password");
        j5.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j5.setCaretColor(new java.awt.Color(51, 51, 0));
        j5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j5MouseClicked(evt);
            }
        });
        j5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j5ActionPerformed(evt);
            }
        });
        admin.add(j5);
        j5.setBounds(200, 210, 140, 20);

        jLabel239.setFont(new java.awt.Font("Yu Gothic", 1, 12)); // NOI18N
        jLabel239.setForeground(new java.awt.Color(255, 255, 255));
        jLabel239.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel239.setText("forget password?");
        jLabel239.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel239.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel239MouseClicked(evt);
            }
        });
        admin.add(jLabel239);
        jLabel239.setBounds(240, 230, 101, 20);

        jButton2.setBackground(new java.awt.Color(19, 104, 15));
        jButton2.setFont(new java.awt.Font("Verdana", 1, 11)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login");
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setMargin(new java.awt.Insets(0, 0, 0, 0));
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        admin.add(jButton2);
        jButton2.setBounds(230, 270, 73, 23);

        jLabel233.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel233.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        admin.add(jLabel233);
        jLabel233.setBounds(0, 0, 507, 410);

        getContentPane().add(admin, "cd2");

        password.setBackground(new java.awt.Color(255, 255, 255));
        password.setLayout(null);

        jLabel232.setFont(new java.awt.Font("Algerian", 0, 30)); // NOI18N
        jLabel232.setForeground(new java.awt.Color(255, 255, 255));
        jLabel232.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        password.add(jLabel232);
        jLabel232.setBounds(140, 250, 190, 40);

        jLabel241.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel241.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/home-icon1.png"))); // NOI18N
        jLabel241.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel241MouseClicked(evt);
            }
        });
        password.add(jLabel241);
        jLabel241.setBounds(10, 10, 24, 24);

        jLabel242.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel242.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/Back-icon.png"))); // NOI18N
        jLabel242.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel242AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        jLabel242.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel242MouseClicked(evt);
            }
        });
        password.add(jLabel242);
        jLabel242.setBounds(40, 10, 24, 24);

        jLabel243.setBackground(new java.awt.Color(0, 51, 0));
        jLabel243.setFont(new java.awt.Font("Algerian", 0, 36)); // NOI18N
        jLabel243.setForeground(new java.awt.Color(255, 255, 255));
        jLabel243.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel243.setText("generator");
        jLabel243.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        password.add(jLabel243);
        jLabel243.setBounds(140, 10, 220, 40);

        j6.setForeground(new java.awt.Color(204, 204, 204));
        j6.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        j6.setText("       username");
        j6.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        j6.setCaretColor(new java.awt.Color(51, 51, 0));
        j6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                j6MouseClicked(evt);
            }
        });
        j6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                j6ActionPerformed(evt);
            }
        });
        password.add(j6);
        j6.setBounds(50, 140, 140, 20);

        jLabel244.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel244.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/username.png"))); // NOI18N
        jLabel244.setPreferredSize(new java.awt.Dimension(18, 17));
        password.add(jLabel244);
        jLabel244.setBounds(50, 140, 20, 17);

        jLabel245.setBackground(new java.awt.Color(0, 51, 51));
        jLabel245.setFont(new java.awt.Font("Bookman Old Style", 1, 12)); // NOI18N
        jLabel245.setForeground(new java.awt.Color(255, 255, 255));
        jLabel245.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel245.setText("GENERATE PASSWORD");
        jLabel245.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED, null, new java.awt.Color(51, 102, 0), null, null));
        jLabel245.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                jLabel245AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        password.add(jLabel245);
        jLabel245.setBounds(260, 140, 170, 20);

        jLabel240.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel240.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/background.jpg"))); // NOI18N
        password.add(jLabel240);
        jLabel240.setBounds(0, 0, 507, 410);

        getContentPane().add(password, "cd22");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseClicked
         cd.show(ct,"cd2");
    }//GEN-LAST:event_jLabel2MouseClicked
 int a=1;int b=1;
    private void l2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseEntered
       l2.setBackground(new Color(0,102,0));
       l2.setForeground(Color.white);
       
    }//GEN-LAST:event_l2MouseEntered

    private void l2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseExited
    l2.setBackground(new Color(153,204,255));
    l2.setForeground(new Color(0,0,102));
    }//GEN-LAST:event_l2MouseExited

    private void l1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseEntered
           l1.setBackground(new Color(0,102,0));
       l1.setForeground(Color.white);
    }//GEN-LAST:event_l1MouseEntered

    private void l1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l1MouseExited
        l1.setBackground(new Color(153,204,255));
    l1.setForeground(new Color(0,0,102));
    }//GEN-LAST:event_l1MouseExited

    private void l2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_l2MouseClicked
       cd.show(ct, "cd4");
    }//GEN-LAST:event_l2MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        cd.show(ct, "cd5");
    }//GEN-LAST:event_jLabel18MouseClicked

    private void jLabel33MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel33MouseClicked
       cd.show(ct, "cd6");
    }//GEN-LAST:event_jLabel33MouseClicked

    private void jLabel32MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel32MouseClicked
        cd.show(ct, "cd7");
    }//GEN-LAST:event_jLabel32MouseClicked

    private void jLabel29MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel29MouseClicked
       cd.show(ct, "cd8");
    }//GEN-LAST:event_jLabel29MouseClicked

    private void jLabel51MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel51MouseClicked
       cd.show(ct, "cd9");
    }//GEN-LAST:event_jLabel51MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jLabel50MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel50MouseClicked
        cd.show(ct, "cd10");
    }//GEN-LAST:event_jLabel50MouseClicked

    private void jLabel53MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel53MouseClicked
       cd.show(ct, "cd11");
    }//GEN-LAST:event_jLabel53MouseClicked

    private void jLabel52MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel52MouseClicked
         cd.show(ct, "cd12");
    }//GEN-LAST:event_jLabel52MouseClicked

    private void jLabel93MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel93MouseClicked
       cd.show(ct, "cd13");
    }//GEN-LAST:event_jLabel93MouseClicked
  
    private void jLabel2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel2MouseEntered
       // cd.show(ct,"cd2");
    }//GEN-LAST:event_jLabel2MouseEntered

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cd.show(ct,"cd2");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel234MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel234MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel234MouseClicked

    private void jLabel235AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel235AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel235AncestorAdded

    private void j4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j4MouseClicked

    private void j4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j4ActionPerformed

    private void j5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j5MouseClicked

    private void j5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j5ActionPerformed

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
       /*try {
             String s1=j1.getText();
             String s2=j2.getText();
             adminLogin.setString(1, s1);
             adminLogin.setString(2, s2);
             ResultSet rs=adminLogin.executeQuery();
             if(rs.next()){
               cd.show(ct, "cd3");  
             }
             else{
               JOptionPane.showMessageDialog(null,"Wrong email or password");  
             }
         } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, ex);
         }*/
       cd.show(ct, "cd3");
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jLabel239MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel239MouseClicked
       cd.show(ct, "cd22");
    }//GEN-LAST:event_jLabel239MouseClicked

    private void jLabel241MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel241MouseClicked
        cd.show(ct, "cd1");
    }//GEN-LAST:event_jLabel241MouseClicked

    private void jLabel242AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel242AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel242AncestorAdded

    private void j6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_j6MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_j6MouseClicked

    private void j6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_j6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_j6ActionPerformed

    private void jLabel245AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_jLabel245AncestorAdded
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel245AncestorAdded

    private void jLabel242MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel242MouseClicked
        cd.show(ct, "cd1");
    }//GEN-LAST:event_jLabel242MouseClicked

    
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
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LOGINPAGE.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LOGINPAGE().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Faculty;
    private javax.swing.JPanel add1;
    private javax.swing.JPanel admin;
    private javax.swing.JPanel admintable;
    private javax.swing.JTextArea adr;
    private javax.swing.JTextArea adr1;
    private javax.swing.JPanel attend_sheet;
    private javax.swing.JPanel attendence;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.JPanel cr;
    private javax.swing.JPanel cs_c;
    private javax.swing.JPanel cse;
    private com.toedter.calendar.JDateChooser d;
    private com.toedter.calendar.JDateChooser d1;
    private javax.swing.JPanel faculty_addnew;
    private javax.swing.JPanel faculty_edit;
    private javax.swing.JPanel faculty_remove;
    private javax.swing.JRadioButton g1;
    private javax.swing.JRadioButton g2;
    private javax.swing.JRadioButton g3;
    private javax.swing.JRadioButton g4;
    private javax.swing.JRadioButton h1;
    private javax.swing.JRadioButton h2;
    private javax.swing.JRadioButton h3;
    private javax.swing.JRadioButton h4;
    private javax.swing.JTextField j4;
    private javax.swing.JTextField j5;
    private javax.swing.JTextField j6;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel101;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel104;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel107;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel110;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel113;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel116;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel119;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel122;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel125;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel128;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel131;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel134;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel137;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel140;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel143;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel146;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel149;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel152;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel155;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel158;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel161;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel164;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel167;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel170;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel173;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel176;
    private javax.swing.JLabel jLabel177;
    private javax.swing.JLabel jLabel178;
    private javax.swing.JLabel jLabel179;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel182;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel185;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel188;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel191;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel194;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel197;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel200;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel203;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel206;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel209;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel210;
    private javax.swing.JLabel jLabel211;
    private javax.swing.JLabel jLabel212;
    private javax.swing.JLabel jLabel213;
    private javax.swing.JLabel jLabel214;
    private javax.swing.JLabel jLabel215;
    private javax.swing.JLabel jLabel216;
    private javax.swing.JLabel jLabel217;
    private javax.swing.JLabel jLabel218;
    private javax.swing.JLabel jLabel219;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel220;
    private javax.swing.JLabel jLabel221;
    private javax.swing.JLabel jLabel222;
    private javax.swing.JLabel jLabel223;
    private javax.swing.JLabel jLabel224;
    private javax.swing.JLabel jLabel225;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel232;
    private javax.swing.JLabel jLabel233;
    private javax.swing.JLabel jLabel234;
    private javax.swing.JLabel jLabel235;
    private javax.swing.JLabel jLabel236;
    private javax.swing.JLabel jLabel237;
    private javax.swing.JLabel jLabel238;
    private javax.swing.JLabel jLabel239;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel240;
    private javax.swing.JLabel jLabel241;
    private javax.swing.JLabel jLabel242;
    private javax.swing.JLabel jLabel243;
    private javax.swing.JLabel jLabel244;
    private javax.swing.JLabel jLabel245;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel26;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel37;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel44;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel46;
    private javax.swing.JLabel jLabel47;
    private javax.swing.JLabel jLabel48;
    private javax.swing.JLabel jLabel49;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel51;
    private javax.swing.JLabel jLabel52;
    private javax.swing.JLabel jLabel53;
    private javax.swing.JLabel jLabel54;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel56;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel68;
    private javax.swing.JLabel jLabel69;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel70;
    private javax.swing.JLabel jLabel71;
    private javax.swing.JLabel jLabel72;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel89;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jLabel90;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel95;
    private javax.swing.JLabel jLabel96;
    private javax.swing.JLabel jLabel97;
    private javax.swing.JLabel jLabel98;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    private javax.swing.JTextField jTextField10;
    private javax.swing.JTextField jTextField11;
    private javax.swing.JTextField jTextField12;
    private javax.swing.JTextField jTextField13;
    private javax.swing.JTextField jTextField14;
    private javax.swing.JTextField jTextField15;
    private javax.swing.JTextField jTextField16;
    private javax.swing.JTextField jTextField17;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JLabel l1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JLabel l8;
    private javax.swing.JPanel login;
    private javax.swing.JPanel mentor;
    private javax.swing.JTextField mob;
    private javax.swing.JTextField mob1;
    private javax.swing.JPanel password;
    private javax.swing.JPanel remove;
    private javax.swing.JPanel search;
    private javax.swing.JPanel student;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    private javax.swing.JTextField t4;
    private javax.swing.JPanel update;
    private javax.swing.JPanel updatenext;
    // End of variables declaration//GEN-END:variables
}
