/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Frames;
import java.awt.*;
import java.sql.*;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Random;
/**
 *
 * @author Lenovo
 */
public class CustomerSignUp extends javax.swing.JFrame {

    /**
     * Creates new form CustomerSignUp
     */
    public static String encrypt(String str)
    {
        Random no=new Random();
        String message, code=" ";
        int rand;
        char ch;        
        int size=str.length();
        for (int i=0;i<=size-1;i++) {
            ch=str.charAt(i);
            int ascii=(int)ch;
            for(rand=0;rand%2==0;rand=1+no.nextInt(10)){}
            int c = (ascii-65)*rand;
            code += c + "(" + rand + ").";
        }
        return code;
    }
    public static String decrypt(String str)
    {
        String m="";
        char c;
        int size=str.length();
        for (int i=0;i<=size-1;i++){
            String ncod="",rcod="";
            for(c=str.charAt(i++);c!='(';c=str.charAt(i++))
                ncod += c;
            for(c=str.charAt(i++);c!=')';c=str.charAt(i++))
                rcod += c;
            int nc=Integer.parseInt(ncod);
            int rc=Integer.parseInt(rcod);
            int cod = (nc/rc)+65;
            m+=(char)cod;            
        }
       return m;        
    }
    public CustomerSignUp() {
        initComponents();
        //this.setBackground(new Color(0,0,0,0));
         jLabel2.setVisible(false);
         jLabel14.setVisible(false);
         jLabel3.setVisible(false);
         jLabel1.setVisible(false);
         jLabel15.setVisible(false);
         jLabel16.setVisible(false);
         jLabel18.setVisible(false);
        //jPanel5.setVisible(false);
    }
    int port=3306;
    int p1=0;
    int p2=0;

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        buttonGroup1 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel15 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel12 = new javax.swing.JLabel();
        jButton5 = new javax.swing.JButton();
        jTextField9 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel17 = new javax.swing.JLabel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jPasswordField1 = new javax.swing.JPasswordField();
        jPasswordField2 = new javax.swing.JPasswordField();

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Icon.png"))); // NOI18N

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel15.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(153, 0, 0));
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, 90, 20));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 0, 0));
        jLabel1.setText("It's not your password");
        jPanel4.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 130, 20));

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(153, 0, 0));
        jLabel16.setText("Your name please");
        jPanel4.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, 130, 20));

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(153, 0, 0));
        jLabel18.setText("Choose any one");
        jPanel4.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(248, 270, 90, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 0, 0));
        jLabel3.setText("I think it's not a phone number");
        jPanel4.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, 180, 20));

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(153, 0, 0));
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 310, 90, 20));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(153, 0, 0));
        jLabel2.setText("Make it unique!!");
        jPanel4.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, 90, 20));

        jLabel6.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel6.setText("Name");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 50, 80, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        jTextField2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField2MouseClicked(evt);
            }
        });
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 40, 220, 33));

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(153, 0, 0));
        jLabel14.setText("I think it's not an email address");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, 180, 20));

        jLabel7.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel7.setText("E-mail");
        jPanel4.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 80, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        jTextField3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField3MouseClicked(evt);
            }
        });
        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        jTextField3.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField3KeyReleased(evt);
            }
        });
        jPanel4.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 120, 220, 33));

        jLabel8.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel8.setText("Phone Number");
        jPanel4.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField4.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        jTextField4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField4MouseClicked(evt);
            }
        });
        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });
        jTextField4.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField4KeyReleased(evt);
            }
        });
        jPanel4.add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 160, 220, 33));

        jLabel9.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel9.setText("Date of Birth");
        jPanel4.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 90, -1));

        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(0, 102, 153));
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton1MouseExited(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 118, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 102, 153));
        jLabel5.setText("Sign Up as Customer");
        jPanel4.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, 40));

        jLabel11.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel11.setText("Password");
        jPanel4.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 250, 90, -1));

        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye-with-a-diagonal-line-interface-symbol-for-invisibility.png"))); // NOI18N
        jToggleButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 102, 153)));
        jToggleButton2.setContentAreaFilled(false);
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jToggleButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 330, 27, 20));

        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye-with-a-diagonal-line-interface-symbol-for-invisibility.png"))); // NOI18N
        jToggleButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 1, 0, 0, new java.awt.Color(0, 102, 153)));
        jToggleButton1.setContentAreaFilled(false);
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });
        jPanel4.add(jToggleButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 290, 27, -1));

        jLabel12.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel12.setText("Repype Password");
        jPanel4.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 330, -1, -1));

        jButton5.setBackground(new Color(0,0,0,0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 16)); // NOI18N
        jButton5.setForeground(new java.awt.Color(0, 102, 153));
        jButton5.setText("Generate Recovery Code");
        jButton5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton5MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton5MouseExited(evt);
            }
        });
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 360, -1, -1));

        jTextField9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jTextField9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jTextField9.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        jTextField9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField9MouseClicked(evt);
            }
        });
        jTextField9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField9ActionPerformed(evt);
            }
        });
        jPanel4.add(jTextField9, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 110, -1));

        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(0, 102, 153));
        jButton2.setText("SignUp");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jButton2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jButton2MouseExited(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel4.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 400, 118, -1));

        jLabel10.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel10.setText("User Id");
        jPanel4.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 80, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jTextField5.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        jTextField5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTextField5MouseClicked(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                jTextField5MouseReleased(evt);
            }
        });
        jTextField5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField5ActionPerformed(evt);
            }
        });
        jTextField5.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField5KeyReleased(evt);
            }
        });
        jPanel4.add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, 220, 33));

        jLabel17.setFont(new java.awt.Font("Levenim MT", 1, 14)); // NOI18N
        jLabel17.setText("Password");
        jPanel4.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 290, 90, -1));

        jCheckBox1.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox1);
        jCheckBox1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(0, 102, 153));
        jCheckBox1.setText("Male");
        jPanel4.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 250, -1, -1));

        jCheckBox2.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox2);
        jCheckBox2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(0, 102, 153));
        jCheckBox2.setText("Others");
        jPanel4.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 250, 80, -1));

        jCheckBox3.setBackground(new java.awt.Color(255, 255, 255));
        buttonGroup1.add(jCheckBox3);
        jCheckBox3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(0, 102, 153));
        jCheckBox3.setText("Female");
        jPanel4.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, 80, -1));

        jDateChooser1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(0, 102, 153)));
        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel4.add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 202, 220, 30));

        jPasswordField1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField1.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        jPasswordField1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPasswordField1FocusGained(evt);
            }
        });
        jPasswordField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField1KeyReleased(evt);
            }
        });
        jPanel4.add(jPasswordField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 320, 220, 30));

        jPasswordField2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPasswordField2.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 102, 153)));
        jPasswordField2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jPasswordField2KeyReleased(evt);
            }
        });
        jPanel4.add(jPasswordField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 280, 220, 30));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel4)
                .addGap(6, 6, 6)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 447, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2MouseClicked

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField3MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3MouseClicked

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed

    private void jTextField4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField4MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4MouseClicked

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseEntered
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0,102,153));
        jButton1.setForeground(new Color(225,225,225));
    }//GEN-LAST:event_jButton1MouseEntered

    private void jButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseExited
        // TODO add your handling code here:
        jButton1.setBackground(new Color(0,0,0,0));
        jButton1.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton1MouseExited

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton5MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseEntered
        // TODO add your handling code here:
        jButton5.setBackground(new Color(0,102,153));
        jButton5.setForeground(new Color(225,225,225));
    }//GEN-LAST:event_jButton5MouseEntered

    private void jButton5MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton5MouseExited
        // TODO add your handling code here:
        jButton5.setBackground(new Color(0,0,0,0));
        jButton5.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton5MouseExited

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        Random r=new Random();
        String a= Integer.toString(r.nextInt(998)+1);
        int l=a.length();
        if(l<3){
            for(int i=0;i<3-l;i++){
                a+="0";
            }
        }
        jTextField9.setText(a);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jTextField9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9MouseClicked

    private void jTextField9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField9ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField9ActionPerformed

    private void jButton2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseEntered
        // TODO add your handling code here:
        jButton2.setBackground(new Color(0,102,153));
        jButton2.setForeground(new Color(225,225,225));
    }//GEN-LAST:event_jButton2MouseEntered

    private void jButton2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseExited
        // TODO add your handling code here:
        jButton2.setBackground(new Color(0,0,0,0));
        jButton2.setForeground(new Color(0,102,153));
    }//GEN-LAST:event_jButton2MouseExited
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        SimpleDateFormat sdformat = new SimpleDateFormat("dd/MM/yyyy"); 
        if(jTextField2.getText().equals("")){
            jLabel16.setVisible(true);
        }
        else if(sdformat.format(jDateChooser1.getDate()).equals("")){
            jLabel15.setVisible(true);
        }else{
            try{
                int gender=3;
                if(jCheckBox1.isSelected())
                    gender=1;
                else if(jCheckBox3.isSelected())
                    gender=2;
                else if(jCheckBox2.isSelected())
                    gender=0;
                else
                    jLabel18.setVisible(true);
                Class.forName("java.sql.Driver");
                Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                Connection cn2=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
                Statement stmt=cn.createStatement();
                Statement stmt2=cn2.createStatement();
                ResultSet slno=stmt.executeQuery("select max(slno)+1 from user");
                    if(slno.next()){          

                        stmt2.executeUpdate("insert into user values("+slno.getString("max(slno)+1")+", '"+encrypt(jTextField5.getText())+"', '"+encrypt(jPasswordField2.getText())+
                                "', "+jTextField9.getText()+", '"+jTextField2.getText()+"', '"+jTextField4.getText()+"', '"+jTextField3.getText()+"', '"+sdformat.format(jDateChooser1.getDate())+"', "+gender+")");
                     
                        Login l=new Login();
                        l.setVisible(true);
//                        l.jTextField2.setText(jTextField5.getText());
//                        l.jTextField1.setText(jPasswordField2.getText());
                        this.dispose();
                        }                                    
            }
            catch(Exception e){System.out.println(e);}
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jTextField5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5MouseClicked

    private void jTextField5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField5ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField5ActionPerformed

    private void jTextField5MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTextField5MouseReleased
        // TODO add your handling code here:
        
    }//GEN-LAST:event_jTextField5MouseReleased

    private void jTextField3KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField3KeyReleased
        // TODO add your handling code here:
        
        
        
        if((jTextField3.getText()).length()>5 &&  !jTextField3.getText().matches("^[a-zA-Z0-9_+&*-]+(?:\\."+"[a-zA-Z0-9_+&*-]+)*@" + "(?:[a-zA-Z0-9-]+\\.)+[a-z" + 
                            "A-Z]{2,7}$")){
            jLabel14.setVisible(true);
        }
        else{
            jLabel14.setVisible(false);
            
        }
        
    }//GEN-LAST:event_jTextField3KeyReleased

    private void jTextField5KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField5KeyReleased
        // TODO add your handling code here:
        try{
            Class.forName("java.sql.Driver");
            Connection cn=(Connection)DriverManager.getConnection("jdbc:mysql://localhost:"+port+"/trouvaille_destiano","root","root");
            Statement stmt=cn.createStatement();
            ResultSet rs=stmt.executeQuery("select * from user where user_id = '"+jTextField5.getText()+"'");
            if(rs.next())
            {
                jLabel2.setVisible(true);
            }
            else{
                jLabel2.setVisible(false);
                
            }                

        }
        catch(Exception e){
            System.out.println(e);
        }
    }//GEN-LAST:event_jTextField5KeyReleased

    private void jTextField4KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField4KeyReleased
        // TODO add your handling code here:
        if(jTextField4.getText().length()<10)
            jLabel3.setVisible(true);
        else
            jLabel3.setVisible(false);
    }//GEN-LAST:event_jTextField4KeyReleased

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:
        if(p1==0){
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/visibility-button.png"))); 
        jPasswordField2.setEchoChar((char)0);
        p1++;
        }else{
            jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye-with-a-diagonal-line-interface-symbol-for-invisibility.png"))); 
            jPasswordField2.setEchoChar('*');
            p1--;            
        }       
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void jPasswordField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField1KeyReleased
        // TODO add your handling code here:
         if(jPasswordField1.getText().length() > 2 && !jPasswordField1.getText().equals(jPasswordField2.getText()))
            jLabel1.setVisible(true);
        else if(jPasswordField1.getText().equals(jPasswordField2.getText())){
            jLabel1.setVisible(false);
        }
    }//GEN-LAST:event_jPasswordField1KeyReleased

    private void jPasswordField2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jPasswordField2KeyReleased
        // TODO add your handling code here:
        jLabel13.setVisible(true);
        if(jPasswordField2.getText().length() >10 &&  !jPasswordField2.getText().matches("[a-zA-Z0-9]+")){
            jLabel13.setForeground(new Color(51,153,0));
            jLabel13.setText("Strong");
        }
        else if(jPasswordField2.getText().length() >8){
            jLabel13.setForeground(new Color(0,51,102));
            jLabel13.setText("Medium");
        }
        else{            
            jLabel13.setForeground(new Color(153,0,0));
            jLabel13.setText("Week");
        }
    }//GEN-LAST:event_jPasswordField2KeyReleased

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
        if(p2==0){
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/visibility-button.png"))); 
        jPasswordField1.setEchoChar((char)0);
        p2++;
        }else{
            jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/eye-with-a-diagonal-line-interface-symbol-for-invisibility.png"))); 
            jPasswordField1.setEchoChar('*');
            p2--;            
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    private void jPasswordField1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPasswordField1FocusGained
        // TODO add your handling code here:
        jLabel13.setVisible(false);
    }//GEN-LAST:event_jPasswordField1FocusGained

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
            java.util.logging.Logger.getLogger(CustomerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CustomerSignUp.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomerSignUp().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton5;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private com.toedter.calendar.JDateChooser jDateChooser1;
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JPasswordField jPasswordField2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField9;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}
