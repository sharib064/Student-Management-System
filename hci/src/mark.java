/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author S
 */
public class mark extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public mark() {
        initComponents();
        String data=Login.roll;
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
        rSButtonHover2 = new rojeru_san.complementos.RSButtonHover();
        jLabel3 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        t = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ototal = new javax.swing.JLabel();
        m2 = new javax.swing.JLabel();
        a = new javax.swing.JLabel();
        p = new javax.swing.JLabel();
        quiz1 = new javax.swing.JLabel();
        jPanel9 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        jPanel11 = new javax.swing.JPanel();
        jPanel12 = new javax.swing.JPanel();
        jPanel13 = new javax.swing.JPanel();
        jPanel14 = new javax.swing.JPanel();
        jPanel15 = new javax.swing.JPanel();
        jPanel16 = new javax.swing.JPanel();
        jPanel17 = new javax.swing.JPanel();
        jPanel18 = new javax.swing.JPanel();
        jPanel19 = new javax.swing.JPanel();
        jPanel20 = new javax.swing.JPanel();
        m1 = new javax.swing.JLabel();
        mid1 = new javax.swing.JLabel();
        mid2 = new javax.swing.JLabel();
        assig = new javax.swing.JLabel();
        proj = new javax.swing.JLabel();
        quiz = new javax.swing.JLabel();
        tmid1 = new javax.swing.JLabel();
        tmid2 = new javax.swing.JLabel();
        tassig = new javax.swing.JLabel();
        tproj = new javax.swing.JLabel();
        tquiz = new javax.swing.JLabel();
        gtotal = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        logout = new rojeru_san.complementos.RSButtonHover();
        home = new rojeru_san.complementos.RSButtonHover();
        info = new rojeru_san.complementos.RSButtonHover();
        attendance = new rojeru_san.complementos.RSButtonHover();
        mark = new rojeru_san.complementos.RSButtonHover();
        gpa = new rojeru_san.complementos.RSButtonHover();
        rSButtonHover10 = new rojeru_san.complementos.RSButtonHover();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 51, 51));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        rSButtonHover2.setBackground(new java.awt.Color(255, 51, 51));
        rSButtonHover2.setText("X");
        rSButtonHover2.setToolTipText("");
        rSButtonHover2.setColorHover(new java.awt.Color(51, 51, 51));
        rSButtonHover2.setColorTextHover(new java.awt.Color(255, 51, 51));
        rSButtonHover2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rSButtonHover2MouseClicked(evt);
            }
        });
        jPanel1.add(rSButtonHover2, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 40, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Total");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 160, 190, 40));

        jComboBox2.setBackground(new java.awt.Color(255, 51, 51));
        jComboBox2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jComboBox2.setForeground(new java.awt.Color(255, 255, 255));
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "none", "HCI", "DS", "LA", "SRE", "FOM" }));
        jComboBox2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });
        jPanel1.add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 70, 190, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Subject:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 70, 130, 40));

        t.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        t.setForeground(new java.awt.Color(255, 255, 255));
        t.setText("Total:");
        jPanel1.add(t, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 460, 120, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Obtained");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 160, 190, 40));

        ototal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        ototal.setForeground(new java.awt.Color(255, 255, 255));
        ototal.setText("Mid 1:");
        jPanel1.add(ototal, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 460, 190, 40));

        m2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        m2.setForeground(new java.awt.Color(255, 255, 255));
        m2.setText("Mid 2:");
        jPanel1.add(m2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 260, 120, 40));

        a.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        a.setForeground(new java.awt.Color(255, 255, 255));
        a.setText("Assigment:");
        jPanel1.add(a, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 120, 40));

        p.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        p.setForeground(new java.awt.Color(255, 255, 255));
        p.setText("Project:");
        jPanel1.add(p, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 360, 120, 40));

        quiz1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        quiz1.setForeground(new java.awt.Color(255, 255, 255));
        quiz1.setText("Quiz:");
        jPanel1.add(quiz1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 120, 40));

        jPanel9.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 150, 10, 360));

        jPanel10.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 150, 10, 360));

        jPanel11.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 550, 10));

        jPanel12.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 250, 550, 10));

        jPanel13.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 160, 10, 350));

        jPanel14.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 200, 550, 10));

        jPanel15.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 500, 550, 10));

        jPanel16.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 550, 10));

        jPanel17.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 400, 550, 10));

        jPanel18.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, 550, 10));

        jPanel19.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 300, 550, 10));

        jPanel20.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.add(jPanel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 160, 10, 350));

        m1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        m1.setForeground(new java.awt.Color(255, 255, 255));
        m1.setText("Mid 1:");
        jPanel1.add(m1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 210, 120, 40));

        mid1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        mid1.setForeground(new java.awt.Color(255, 255, 255));
        mid1.setText("Mid 1:");
        jPanel1.add(mid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 210, 190, 40));

        mid2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        mid2.setForeground(new java.awt.Color(255, 255, 255));
        mid2.setText("Mid 1:");
        jPanel1.add(mid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 260, 190, 40));

        assig.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        assig.setForeground(new java.awt.Color(255, 255, 255));
        assig.setText("Mid 1:");
        jPanel1.add(assig, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 190, 40));

        proj.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        proj.setForeground(new java.awt.Color(255, 255, 255));
        proj.setText("Mid 1:");
        jPanel1.add(proj, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 360, 190, 40));

        quiz.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        quiz.setForeground(new java.awt.Color(255, 255, 255));
        quiz.setText("Mid 1:");
        jPanel1.add(quiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 410, 190, 40));

        tmid1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tmid1.setForeground(new java.awt.Color(255, 255, 255));
        tmid1.setText("Mid 1:");
        jPanel1.add(tmid1, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 210, 190, 40));

        tmid2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tmid2.setForeground(new java.awt.Color(255, 255, 255));
        tmid2.setText("Mid 1:");
        jPanel1.add(tmid2, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 260, 190, 40));

        tassig.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tassig.setForeground(new java.awt.Color(255, 255, 255));
        tassig.setText("Mid 1:");
        jPanel1.add(tassig, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 310, 190, 40));

        tproj.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tproj.setForeground(new java.awt.Color(255, 255, 255));
        tproj.setText("Mid 1:");
        jPanel1.add(tproj, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 360, 190, 40));

        tquiz.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        tquiz.setForeground(new java.awt.Color(255, 255, 255));
        tquiz.setText("Mid 1:");
        jPanel1.add(tquiz, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 410, 190, 40));

        gtotal.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        gtotal.setForeground(new java.awt.Color(255, 255, 255));
        gtotal.setText("Mid 1:");
        jPanel1.add(gtotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 460, 190, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 640));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apprentice.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 210, -1));

        logout.setBackground(new java.awt.Color(51, 51, 51));
        logout.setBorder(null);
        logout.setText("Log out");
        logout.setColorHover(new java.awt.Color(255, 51, 51));
        logout.setColorTextHover(new java.awt.Color(51, 51, 51));
        logout.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logoutMouseClicked(evt);
            }
        });
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 570, 150, 50));

        home.setBackground(new java.awt.Color(51, 51, 51));
        home.setBorder(null);
        home.setText("Home");
        home.setColorHover(new java.awt.Color(255, 51, 51));
        home.setColorTextHover(new java.awt.Color(51, 51, 51));
        home.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        home.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                homeMouseClicked(evt);
            }
        });
        jPanel2.add(home, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 300, 50));

        info.setBackground(new java.awt.Color(51, 51, 51));
        info.setBorder(null);
        info.setText("Student Information");
        info.setColorHover(new java.awt.Color(255, 51, 51));
        info.setColorTextHover(new java.awt.Color(51, 51, 51));
        info.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        info.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                infoMouseClicked(evt);
            }
        });
        jPanel2.add(info, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 250, 300, 50));

        attendance.setBackground(new java.awt.Color(51, 51, 51));
        attendance.setBorder(null);
        attendance.setText("Attendance");
        attendance.setColorHover(new java.awt.Color(255, 51, 51));
        attendance.setColorTextHover(new java.awt.Color(51, 51, 51));
        attendance.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        attendance.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                attendanceMouseClicked(evt);
            }
        });
        jPanel2.add(attendance, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 300, 50));

        mark.setBackground(new java.awt.Color(51, 51, 51));
        mark.setBorder(null);
        mark.setText("Marks");
        mark.setColorHover(new java.awt.Color(255, 51, 51));
        mark.setColorTextHover(new java.awt.Color(51, 51, 51));
        mark.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        mark.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                markMouseClicked(evt);
            }
        });
        jPanel2.add(mark, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, 300, 50));

        gpa.setBackground(new java.awt.Color(51, 51, 51));
        gpa.setBorder(null);
        gpa.setText("GPA");
        gpa.setColorHover(new java.awt.Color(255, 51, 51));
        gpa.setColorTextHover(new java.awt.Color(51, 51, 51));
        gpa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        gpa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                gpaMouseClicked(evt);
            }
        });
        jPanel2.add(gpa, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 430, 300, 50));

        rSButtonHover10.setBackground(new java.awt.Color(51, 51, 51));
        rSButtonHover10.setBorder(null);
        rSButtonHover10.setText("Student Information");
        rSButtonHover10.setColorHover(new java.awt.Color(255, 51, 51));
        rSButtonHover10.setColorTextHover(new java.awt.Color(51, 51, 51));
        rSButtonHover10.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jPanel2.add(rSButtonHover10, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 300, 50));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 640));

        setSize(new java.awt.Dimension(1200, 640));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void rSButtonHover2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rSButtonHover2MouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_rSButtonHover2MouseClicked

    private void homeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeMouseClicked
        // TODO add your handling code here:
        dispose();
        new Home().show();
    }//GEN-LAST:event_homeMouseClicked

    private void infoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_infoMouseClicked
        // TODO add your handling code here:
        dispose();
        new Info().show();
    }//GEN-LAST:event_infoMouseClicked

    private void attendanceMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_attendanceMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_attendanceMouseClicked

    private void markMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_markMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_markMouseClicked

    private void gpaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_gpaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_gpaMouseClicked

    private void logoutMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_logoutMouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        // TODO add your handling code here:
        if(jComboBox2.getSelectedIndex()==1){
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

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
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Home.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Home().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel a;
    private javax.swing.JLabel assig;
    private rojeru_san.complementos.RSButtonHover attendance;
    private rojeru_san.complementos.RSButtonHover gpa;
    private javax.swing.JLabel gtotal;
    private rojeru_san.complementos.RSButtonHover home;
    private rojeru_san.complementos.RSButtonHover info;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel17;
    private javax.swing.JPanel jPanel18;
    private javax.swing.JPanel jPanel19;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel20;
    private javax.swing.JPanel jPanel9;
    private rojeru_san.complementos.RSButtonHover logout;
    private javax.swing.JLabel m1;
    private javax.swing.JLabel m2;
    private rojeru_san.complementos.RSButtonHover mark;
    private javax.swing.JLabel mid1;
    private javax.swing.JLabel mid2;
    private javax.swing.JLabel ototal;
    private javax.swing.JLabel p;
    private javax.swing.JLabel proj;
    private javax.swing.JLabel quiz;
    private javax.swing.JLabel quiz1;
    private rojeru_san.complementos.RSButtonHover rSButtonHover10;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private javax.swing.JLabel t;
    private javax.swing.JLabel tassig;
    private javax.swing.JLabel tmid1;
    private javax.swing.JLabel tmid2;
    private javax.swing.JLabel tproj;
    private javax.swing.JLabel tquiz;
    // End of variables declaration//GEN-END:variables
}
