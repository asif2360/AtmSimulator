/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyBankAtm;

import static MyBankAtm.sqldb.*;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.scene.input.MouseEvent;
import javax.swing.JOptionPane;

/**
 *
 * @author Acer
 */
public class NewJFrame1 extends javax.swing.JFrame {
      Container ct;
      CardLayout cd;
      int bal1,rs=0;
    /**
     * Creates new form NewJFrame1
     */
    public NewJFrame1() {
        
        initComponents();
       setLocationRelativeTo(null);
       ct=getContentPane();
       cd=(CardLayout) ct.getLayout();
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
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        t3 = new javax.swing.JTextField();
        l90 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        la1 = new javax.swing.JLabel();
        jLabel35 = new javax.swing.JLabel();
        t2 = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        t1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel26 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel34 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel29 = new javax.swing.JLabel();
        jLabel31 = new javax.swing.JLabel();
        jLabel32 = new javax.swing.JLabel();
        jLabel33 = new javax.swing.JLabel();
        jLabel30 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(520, 385));
        setSize(new java.awt.Dimension(0, 0));
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(null);

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("BUSINESS");
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel4MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel4MouseExited(evt);
            }
        });
        jPanel1.add(jLabel4);
        jLabel4.setBounds(430, 290, 70, 20);

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot (61).png"))); // NOI18N
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 0, 500, 70);

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("SAVING");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel3MouseExited(evt);
            }
        });
        jPanel1.add(jLabel3);
        jLabel3.setBounds(440, 210, 60, 19);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("CURRENT");
        jLabel5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel5MouseExited(evt);
            }
        });
        jPanel1.add(jLabel5);
        jLabel5.setBounds(424, 130, 80, 20);

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/new img/images2.png"))); // NOI18N
        jPanel1.add(jLabel10);
        jLabel10.setBounds(60, 120, 190, 180);

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/HOME.jpg"))); // NOI18N
        jLabel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel8MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel8);
        jLabel8.setBounds(10, 70, 30, 30);

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/BACK.png"))); // NOI18N
        jLabel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel9MouseClicked(evt);
            }
        });
        jPanel1.add(jLabel9);
        jLabel9.setBounds(40, 70, 40, 30);

        getContentPane().add(jPanel1, "cd1");

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setPreferredSize(new java.awt.Dimension(500, 385));
        jPanel3.setLayout(null);

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot (61).png"))); // NOI18N
        jPanel3.add(jLabel15);
        jLabel15.setBounds(0, 0, 505, 62);

        jLabel16.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(9, 149, 0));
        jLabel16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel16.setText("10000");
        jLabel16.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel16MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel16MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel16MouseExited(evt);
            }
        });
        jPanel3.add(jLabel16);
        jLabel16.setBounds(30, 310, 60, 19);

        jLabel17.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(109, 2, 6));
        jLabel17.setText("ENTER YOUR CHOICE");
        jPanel3.add(jLabel17);
        jLabel17.setBounds(340, 160, 170, 19);

        jLabel18.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(9, 149, 0));
        jLabel18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel18.setText("500");
        jLabel18.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel18MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel18MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel18MouseExited(evt);
            }
        });
        jPanel3.add(jLabel18);
        jLabel18.setBounds(0, 230, 60, 19);

        jLabel19.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(9, 149, 0));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("1000");
        jLabel19.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel19MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel19MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel19MouseExited(evt);
            }
        });
        jPanel3.add(jLabel19);
        jLabel19.setBounds(60, 230, 60, 19);

        jLabel20.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(9, 149, 0));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("2000");
        jLabel20.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel20MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel20MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel20MouseExited(evt);
            }
        });
        jPanel3.add(jLabel20);
        jLabel20.setBounds(0, 270, 60, 19);

        jLabel21.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(9, 149, 0));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("5000");
        jLabel21.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel21MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel21MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel21MouseExited(evt);
            }
        });
        jPanel3.add(jLabel21);
        jLabel21.setBounds(60, 270, 60, 19);

        jLabel22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/CHASE LOGO.png"))); // NOI18N
        jPanel3.add(jLabel22);
        jLabel22.setBounds(150, 190, 200, 50);

        jLabel23.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(126, 38, 233));
        jLabel23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel23.setText("PROCEED");
        jLabel23.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel23MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel23MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel23MouseExited(evt);
            }
        });
        jPanel3.add(jLabel23);
        jLabel23.setBounds(390, 310, 80, 19);

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/HOME.jpg"))); // NOI18N
        jLabel24.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel24MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel24);
        jLabel24.setBounds(0, 60, 40, 30);

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/BACK.png"))); // NOI18N
        jLabel25.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel25MouseClicked(evt);
            }
        });
        jPanel3.add(jLabel25);
        jLabel25.setBounds(40, 60, 30, 30);

        t3.setBackground(new java.awt.Color(204, 204, 255));
        t3.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        t3.setForeground(new java.awt.Color(0, 0, 153));
        t3.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        t3.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t3ActionPerformed(evt);
            }
        });
        jPanel3.add(t3);
        t3.setBounds(400, 110, 80, 25);

        l90.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        l90.setForeground(new java.awt.Color(109, 2, 6));
        l90.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jPanel3.add(l90);
        l90.setBounds(0, 350, 500, 30);

        jLabel27.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(109, 2, 6));
        jLabel27.setText("PIN :");
        jPanel3.add(jLabel27);
        jLabel27.setBounds(330, 110, 40, 19);
        jPanel3.add(la1);
        la1.setBounds(280, 290, 140, 0);

        jLabel35.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel35.setForeground(new java.awt.Color(109, 2, 6));
        jLabel35.setText("SELECT  AMOUNT");
        jPanel3.add(jLabel35);
        jLabel35.setBounds(0, 180, 140, 19);

        t2.setBackground(new java.awt.Color(204, 204, 255));
        t2.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        t2.setForeground(new java.awt.Color(0, 0, 153));
        t2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        t2.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t2ActionPerformed(evt);
            }
        });
        jPanel3.add(t2);
        t2.setBounds(370, 200, 130, 25);

        jLabel36.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel36.setForeground(new java.awt.Color(109, 2, 6));
        jLabel36.setText("ACCOUNT NO :");
        jPanel3.add(jLabel36);
        jLabel36.setBounds(10, 110, 140, 19);

        t1.setBackground(new java.awt.Color(204, 204, 255));
        t1.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        t1.setForeground(new java.awt.Color(0, 0, 153));
        t1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        t1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        t1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                t1ActionPerformed(evt);
            }
        });
        jPanel3.add(t1);
        t1.setBounds(140, 110, 130, 25);

        getContentPane().add(jPanel3, "cd2");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(null);

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot (61).png"))); // NOI18N
        jPanel2.add(jLabel2);
        jLabel2.setBounds(0, 0, 500, 70);

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 9, 9));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("NO");
        jLabel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel6MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel6);
        jLabel6.setBounds(250, 240, 70, 21);

        jLabel7.setFont(new java.awt.Font("Trebuchet MS", 3, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 2, 11));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("PLEASE WAIT...");
        jPanel2.add(jLabel7);
        jLabel7.setBounds(180, 120, 130, 19);

        jLabel12.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(0, 51, 0));
        jLabel12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel12.setText("RECIEVED AMOUNT?");
        jPanel2.add(jLabel12);
        jLabel12.setBounds(150, 180, 180, 21);

        jLabel13.setFont(new java.awt.Font("Trebuchet MS", 3, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(0, 132, 25));
        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setText("YES");
        jLabel13.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel13MouseClicked(evt);
            }
        });
        jPanel2.add(jLabel13);
        jLabel13.setBounds(160, 240, 70, 21);

        getContentPane().add(jPanel2, "cd3");

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(null);

        jLabel14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot (61).png"))); // NOI18N
        jPanel4.add(jLabel14);
        jLabel14.setBounds(0, 0, 500, 70);

        jLabel26.setFont(new java.awt.Font("Trebuchet MS", 3, 22)); // NOI18N
        jLabel26.setForeground(new java.awt.Color(51, 153, 0));
        jLabel26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel26.setText("CONGRATULATION!");
        jPanel4.add(jLabel26);
        jLabel26.setBounds(130, 170, 220, 40);

        jLabel28.setFont(new java.awt.Font("Trebuchet MS", 3, 22)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(0, 0, 204));
        jLabel28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel28.setText(" YOUR TRANSACTION IS SUCCESFUL");
        jPanel4.add(jLabel28);
        jLabel28.setBounds(10, 220, 470, 40);

        jLabel34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/HOME.jpg"))); // NOI18N
        jLabel34.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel34MouseClicked(evt);
            }
        });
        jPanel4.add(jLabel34);
        jLabel34.setBounds(10, 70, 40, 30);

        getContentPane().add(jPanel4, "cd4");

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setLayout(null);

        jLabel29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/Screenshot (61).png"))); // NOI18N
        jPanel5.add(jLabel29);
        jLabel29.setBounds(0, 0, 500, 70);

        jLabel31.setFont(new java.awt.Font("Lucida Handwriting", 3, 29)); // NOI18N
        jLabel31.setForeground(new java.awt.Color(0, 0, 204));
        jLabel31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel31.setText("NEXT  TIME");
        jPanel5.add(jLabel31);
        jLabel31.setBounds(110, 280, 270, 40);

        jLabel32.setFont(new java.awt.Font("Lucida Handwriting", 3, 29)); // NOI18N
        jLabel32.setForeground(new java.awt.Color(204, 0, 51));
        jLabel32.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jLabel32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/ios_emoji_smiling_face_with_smiling_eyes.png"))); // NOI18N
        jLabel32.setText("   SORRY");
        jPanel5.add(jLabel32);
        jLabel32.setBounds(120, 140, 270, 40);

        jLabel33.setFont(new java.awt.Font("Lucida Handwriting", 3, 29)); // NOI18N
        jLabel33.setForeground(new java.awt.Color(0, 0, 204));
        jLabel33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel33.setText("BETTER  LUCK");
        jPanel5.add(jLabel33);
        jLabel33.setBounds(110, 210, 270, 40);

        jLabel30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/trans/HOME.jpg"))); // NOI18N
        jLabel30.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel30MouseClicked(evt);
            }
        });
        jPanel5.add(jLabel30);
        jLabel30.setBounds(10, 70, 40, 30);

        getContentPane().add(jPanel5, "cd5");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseEntered
        jLabel3.setOpaque(true);
        jLabel3.setBackground(new Color(32,9,135));
        jLabel3.setForeground(Color.white);
    }//GEN-LAST:event_jLabel3MouseEntered

    private void jLabel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseExited
        jLabel3.setBackground(Color.white);
        jLabel3.setForeground(Color.black); 
    }//GEN-LAST:event_jLabel3MouseExited

    private void jLabel4MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseEntered
        jLabel4.setOpaque(true);
        jLabel4.setBackground(new Color(32,9,135));
        jLabel4.setForeground(Color.white);
    }//GEN-LAST:event_jLabel4MouseEntered

    private void jLabel4MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseExited
        jLabel4.setBackground(Color.white);
        jLabel4.setForeground(Color.black);
    }//GEN-LAST:event_jLabel4MouseExited

    private void jLabel5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseEntered
       jLabel5.setOpaque(true);
        jLabel5.setBackground(new Color(32,9,135));
        jLabel5.setForeground(Color.white);
    }//GEN-LAST:event_jLabel5MouseEntered

    private void jLabel5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel5MouseExited
         jLabel5.setBackground(Color.white);
        jLabel5.setForeground(Color.black);
    }//GEN-LAST:event_jLabel5MouseExited

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        cd.show(ct, "cd2");
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jLabel18MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseEntered
         jLabel18.setOpaque(true);
        jLabel18.setBackground(new Color(23,136,16));
        jLabel18.setForeground(Color.white);
    }//GEN-LAST:event_jLabel18MouseEntered

    private void jLabel18MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseExited
       jLabel18.setBackground(Color.white);
        jLabel18.setForeground(new Color(9,149,0));
    }//GEN-LAST:event_jLabel18MouseExited

    private void jLabel19MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseEntered
         jLabel19.setOpaque(true);
        jLabel19.setBackground(new Color(23,136,16));
        jLabel19.setForeground(Color.white);
    }//GEN-LAST:event_jLabel19MouseEntered

    private void jLabel19MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseExited
       jLabel19.setBackground(Color.white);
        jLabel19.setForeground(new Color(9,149,0));
    }//GEN-LAST:event_jLabel19MouseExited

    private void jLabel20MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseEntered
         jLabel20.setOpaque(true);
        jLabel20.setBackground(new Color(23,136,16));
        jLabel20.setForeground(Color.white);
    }//GEN-LAST:event_jLabel20MouseEntered

    private void jLabel20MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseExited
        jLabel20.setBackground(Color.white);
        jLabel20.setForeground(new Color(9,149,0));
    }//GEN-LAST:event_jLabel20MouseExited

    private void jLabel21MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseExited
       jLabel21.setBackground(Color.white);
        jLabel21.setForeground(new Color(9,149,0));
    }//GEN-LAST:event_jLabel21MouseExited

    private void jLabel21MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseEntered
         jLabel21.setOpaque(true);
        jLabel21.setBackground(new Color(23,136,16));
        jLabel21.setForeground(Color.white);
    }//GEN-LAST:event_jLabel21MouseEntered

    private void jLabel16MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseEntered
         jLabel16.setOpaque(true);
        jLabel16.setBackground(new Color(23,136,16));
        jLabel16.setForeground(Color.white);
    }//GEN-LAST:event_jLabel16MouseEntered

    private void jLabel16MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseExited
       jLabel16.setBackground(Color.white);
        jLabel16.setForeground(new Color(9,149,0));
    }//GEN-LAST:event_jLabel16MouseExited

    private void jLabel23MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseEntered
       jLabel23.setOpaque(true);
        jLabel23.setBackground(new Color(126,38,233));
        jLabel23.setForeground(Color.white);
    }//GEN-LAST:event_jLabel23MouseEntered

    private void jLabel23MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseExited
         jLabel23.setBackground(Color.white);
        jLabel23.setForeground(new Color(126,38,233));
    }//GEN-LAST:event_jLabel23MouseExited

    private void jLabel23MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel23MouseClicked
       
        try{
            int n;
           int i1=Integer.parseInt(t2.getText());
           int i2=Integer.parseInt(t1.getText());
           int i3=Integer.parseInt(t3.getText());
           readAccount.setInt(1, i2);
           readAccount.setInt(2, i3);
           ResultSet rs1=readAccount.executeQuery();
           if(rs1.next()){
            n=rs1.getInt(8);
            System.out.println(n);
           updateUser.setInt(1,i1);
           updateUser.setInt(2,i2);
           updateUser.setInt(3, i3);
           if(n>i1){
            rs=updateUser.executeUpdate();
           cd.show(ct,"cd3");
            
           }
            else{
               JOptionPane.showMessageDialog(null,"Not sufficient balance");
           }
            
           }
            else{
                JOptionPane.showMessageDialog(null," inavild card detail");
            }
          
           }
       catch(Exception e){
       }
    }//GEN-LAST:event_jLabel23MouseClicked

    private void jLabel24MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel24MouseClicked
        dispose();
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel24MouseClicked

    private void jLabel25MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel25MouseClicked
      cd.show(ct,"cd1");  // TODO add your handling code here:
    }//GEN-LAST:event_jLabel25MouseClicked

    private void jLabel16MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel16MouseClicked
        
        jLabel16.setOpaque(true);
        jLabel16.setBackground(new Color(110,56,119));
        jLabel16.setForeground(Color.white);
        String s=String.valueOf(10000);
        t2.setText(s);

    }//GEN-LAST:event_jLabel16MouseClicked

    private void jLabel18MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel18MouseClicked
        jLabel18.setOpaque(true);
        jLabel18.setBackground(new Color(110,56,119));
        jLabel18.setForeground(Color.white);
        String s=String.valueOf(500);
        t2.setText(s);
        
    }//GEN-LAST:event_jLabel18MouseClicked

    private void t3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t3ActionPerformed

    private void jLabel8MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel8MouseClicked
        dispose();
        new NewJFrame().setVisible(true);
    }//GEN-LAST:event_jLabel8MouseClicked

    private void jLabel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel9MouseClicked
      dispose();
        new mainpage().setVisible(true);
    }//GEN-LAST:event_jLabel9MouseClicked

    private void jLabel13MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel13MouseClicked
          try {
              c.commit();
              cd.show(ct,"cd4");
          } catch (SQLException ex) {
              Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jLabel13MouseClicked

    private void jLabel6MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel6MouseClicked
          try {
              c.rollback();
              cd.show(ct, "cd5");
          } catch (SQLException ex) {
              Logger.getLogger(NewJFrame1.class.getName()).log(Level.SEVERE, null, ex);
          }
    }//GEN-LAST:event_jLabel6MouseClicked

    private void jLabel30MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel30MouseClicked
         dispose();
        new NewJFrame().setVisible(true);        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel30MouseClicked

    private void jLabel34MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel34MouseClicked
      dispose();
      new NewJFrame().setVisible(true);// TODO add your handling code here:
    }//GEN-LAST:event_jLabel34MouseClicked

    private void t2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t2ActionPerformed

    private void t1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_t1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_t1ActionPerformed

    private void jLabel19MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel19MouseClicked
         jLabel19.setOpaque(true);
        jLabel19.setBackground(new Color(110,56,119));
        jLabel19.setForeground(Color.white);
        String s=String.valueOf(1000);
        t2.setText(s);
    }//GEN-LAST:event_jLabel19MouseClicked

    private void jLabel20MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel20MouseClicked
        jLabel20.setOpaque(true);
        jLabel20.setBackground(new Color(110,56,119));
        jLabel20.setForeground(Color.white);
        String s=String.valueOf(2000);
        t2.setText(s);
    }//GEN-LAST:event_jLabel20MouseClicked

    private void jLabel21MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel21MouseClicked
        jLabel21.setOpaque(true);
        jLabel21.setBackground(new Color(110,56,119));
        jLabel21.setForeground(Color.white);
        String s=String.valueOf(5000);
        t2.setText(s);
    }//GEN-LAST:event_jLabel21MouseClicked

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
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JLabel jLabel31;
    private javax.swing.JLabel jLabel32;
    private javax.swing.JLabel jLabel33;
    private javax.swing.JLabel jLabel34;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JLabel l90;
    private javax.swing.JLabel la1;
    private javax.swing.JTextField t1;
    private javax.swing.JTextField t2;
    private javax.swing.JTextField t3;
    // End of variables declaration//GEN-END:variables
}