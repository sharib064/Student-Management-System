
import java.sql.*;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

/**
 *
 * @author S
 */
public class Info extends javax.swing.JFrame {

    /**
     * Creates new form Home
     */
    public Info() {
        initComponents();
        init();
    }
    final void init(){
        String roll=Login.roll;
        try {
            Class.forName("java.sql.DriverManager");
            Connection con=DriverManager.getConnection("jdbc:mysql://sql6.freesqldatabase.com:3306/sql6584078","sql6584078","zleIAz7Hvv");
            java.sql.Statement st=con.createStatement();
            String sql="select name,fname,nic,depart,batch,rollno from info";
            java.sql.ResultSet rs= st.executeQuery(sql);
            while(rs.next()){
                if(rs.getString(6).equals(roll)){
                    name.setText(rs.getString(1));
                    fname.setText(rs.getString(2));
                    nic.setText(rs.getString(3));
                    depart.setText(rs.getString(4));
                    batch.setText(rs.getString(5));
                    rollno.setText(rs.getString(6));
                    break;
                } 
            }
        }
        catch (Exception e) {
            
        }
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
        profile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        rollno = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        name = new javax.swing.JLabel();
        fname = new javax.swing.JLabel();
        nic = new javax.swing.JLabel();
        depart = new javax.swing.JLabel();
        batch = new javax.swing.JLabel();
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

        profile.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/user (2).png"))); // NOI18N
        jPanel1.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 80, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("Roll No:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 450, 100, 40));

        rollno.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        rollno.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(rollno, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 450, 520, 40));

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("Father Name:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, 160, 40));

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("NIC:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 270, 90, 40));

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("Department:");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 330, 150, 40));

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("Batch:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, 80, 40));

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("Name:");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 150, 90, 40));

        name.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(name, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 150, 400, 40));

        fname.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        fname.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(fname, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 440, 40));

        nic.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        nic.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(nic, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 270, 450, 40));

        depart.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        depart.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(depart, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 330, 590, 40));

        batch.setFont(new java.awt.Font("Segoe UI Semibold", 0, 24)); // NOI18N
        batch.setForeground(new java.awt.Color(255, 255, 255));
        jPanel1.add(batch, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 390, 590, 40));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 0, 900, 630));

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/apprentice.png"))); // NOI18N
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 140, -1));

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
        jPanel2.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 560, 150, 50));

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

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 300, 630));

        setSize(new java.awt.Dimension(1200, 630));
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
    private rojeru_san.complementos.RSButtonHover attendance;
    private javax.swing.JLabel batch;
    private javax.swing.JLabel depart;
    private javax.swing.JLabel fname;
    private rojeru_san.complementos.RSButtonHover gpa;
    private rojeru_san.complementos.RSButtonHover home;
    private rojeru_san.complementos.RSButtonHover info;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private rojeru_san.complementos.RSButtonHover logout;
    private rojeru_san.complementos.RSButtonHover mark;
    private javax.swing.JLabel name;
    private javax.swing.JLabel nic;
    private javax.swing.JLabel profile;
    private rojeru_san.complementos.RSButtonHover rSButtonHover10;
    private rojeru_san.complementos.RSButtonHover rSButtonHover2;
    private javax.swing.JLabel rollno;
    // End of variables declaration//GEN-END:variables
}