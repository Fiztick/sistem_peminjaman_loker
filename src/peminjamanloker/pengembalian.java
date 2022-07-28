/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peminjamanloker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author Akn
 */
public class pengembalian extends javax.swing.JFrame {

    private int loker_selected = 0;    
    private ArrayList<String> loker = new ArrayList<>();
    
    private Connection conn;
    private final String driverClass = "com.mysql.cj.jdbc.Driver";
    private final String url = "jdbc:mysql://localhost:3306/peminjaman_loker?";
    private final String user = "root";
    private final String pass = "";
        
    public void readDB() throws ClassNotFoundException, SQLException{
        Class.forName(driverClass);
        conn = DriverManager.getConnection(url, user, pass);
    }
    
    /**
     * Creates new form menu
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public pengembalian() throws ClassNotFoundException, SQLException {
        initComponents();
        
        checkInput();  
//        readDB();

//        try (Connection conn = DriverManager.getConnection(driver, user, pass)) {
//            System.out.println("Database connected!");
//        } catch (SQLException e) {
//            throw new IllegalStateException("Cannot connect the database!", e);
//        }
        
        ambilDataDariDatabase();   
        
        ubahButtonLokerSaatPengembalian();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        tglBtnLoker1 = new javax.swing.JToggleButton();
        tglBtnLoker2 = new javax.swing.JToggleButton();
        tglBtnLoker3 = new javax.swing.JToggleButton();
        tglBtnLoker4 = new javax.swing.JToggleButton();
        tglBtnLoker5 = new javax.swing.JToggleButton();
        tglBtnLoker6 = new javax.swing.JToggleButton();
        tglBtnLoker7 = new javax.swing.JToggleButton();
        tglBtnLoker8 = new javax.swing.JToggleButton();
        btnPeminjaman = new javax.swing.JButton();
        btnBukaLoker = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pengembalian Loker");
        setName("frmMenu"); // NOI18N
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tglBtnLoker1.setText("1");
        tglBtnLoker1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker1ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 40, 100, 100));

        tglBtnLoker2.setText("2");
        tglBtnLoker2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker2ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker2, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 40, 100, 100));

        tglBtnLoker3.setText("3");
        tglBtnLoker3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker3ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker3, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 40, 100, 100));

        tglBtnLoker4.setText("4");
        tglBtnLoker4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker4ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker4, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 40, 100, 100));

        tglBtnLoker5.setText("5");
        tglBtnLoker5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker5ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 100, 100));

        tglBtnLoker6.setText("6");
        tglBtnLoker6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker6ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker6, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 180, 100, 100));

        tglBtnLoker7.setText("7");
        tglBtnLoker7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker7ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker7, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 180, 100, 100));

        tglBtnLoker8.setText("8");
        tglBtnLoker8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tglBtnLoker8ActionPerformed(evt);
            }
        });
        getContentPane().add(tglBtnLoker8, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 180, 100, 100));

        btnPeminjaman.setLabel("Pinjam Loker");
        btnPeminjaman.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPeminjamanActionPerformed(evt);
            }
        });
        getContentPane().add(btnPeminjaman, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 350, -1, 30));

        btnBukaLoker.setText("Buka Loker");
        btnBukaLoker.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBukaLokerActionPerformed(evt);
            }
        });
        getContentPane().add(btnBukaLoker, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 350, -1, 30));

        setSize(new java.awt.Dimension(718, 468));
    }// </editor-fold>//GEN-END:initComponents

    private void ubahButtonLokerSaatPengembalian(){        
        if(!(tglBtnLoker1.isEnabled())){
            tglBtnLoker1.setEnabled(true);
        } else {
            tglBtnLoker1.setEnabled(false);
        }
        
        if(!(tglBtnLoker2.isEnabled())){
            tglBtnLoker2.setEnabled(true);
        } else {
            tglBtnLoker2.setEnabled(false);
        }
        
        if(!(tglBtnLoker3.isEnabled())){
            tglBtnLoker3.setEnabled(true);
        } else {
            tglBtnLoker3.setEnabled(false);
        }
        
        if(!(tglBtnLoker4.isEnabled())){
            tglBtnLoker4.setEnabled(true);
        } else {
            tglBtnLoker4.setEnabled(false);
        }
        
        if(!(tglBtnLoker5.isEnabled())){
            tglBtnLoker5.setEnabled(true);
        } else {
            tglBtnLoker5.setEnabled(false);
        }
        
        if(!(tglBtnLoker6.isEnabled())){
            tglBtnLoker6.setEnabled(true);
        } else {
            tglBtnLoker6.setEnabled(false);
        }
        
        if(!(tglBtnLoker7.isEnabled())){
            tglBtnLoker7.setEnabled(true);
        } else {
            tglBtnLoker7.setEnabled(false);
        }
        
        if(!(tglBtnLoker8.isEnabled())){
            tglBtnLoker8.setEnabled(true);
        } else {
            tglBtnLoker8.setEnabled(false);
        }
    }
    
    private void ambilDataDariDatabase() {
        // ngambil data status loker dari database
        try {
            conn = DriverManager.getConnection(url, user, pass);
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("SELECT * from loker");
            
            while(rs.next()){
                int id_loker = rs.getInt("id_loker");
                int status = rs.getInt("status_loker");
                if(id_loker == 1 && status == 0){
                    tglBtnLoker1.setEnabled(false);
                } else if(id_loker == 2 && status == 0){
                    tglBtnLoker2.setEnabled(false);
                } else if(id_loker == 3 && status == 0){
                    tglBtnLoker3.setEnabled(false);
                }else if(id_loker == 4 && status == 0){
                    tglBtnLoker4.setEnabled(false);
                } else if(id_loker == 5 && status == 0){
                    tglBtnLoker5.setEnabled(false);
                } else if(id_loker == 6 && status == 0){
                    tglBtnLoker6.setEnabled(false);
                } else if(id_loker == 7 && status == 0){
                    tglBtnLoker7.setEnabled(false);
                } else if(id_loker == 8 && status == 0){
                    tglBtnLoker8.setEnabled(false);
                } 
//                System.out.println(id_loker + " | " +status);
            }
        } catch (SQLException e) {
            System.err.println(e.getMessage());
        }
    }
    
    private void tglBtnLoker1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker1ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker1.isSelected()){
            this.loker_selected += 1;
            this.loker.add("1");
        } else {
            this.loker_selected -= 1;
            this.loker.remove("1");
        }
        
//        if(this.loker_selected <= 0){
//            btnLanjut.setEnabled(false);
//        } else {
//            btnLanjut.setEnabled(true);
//        }
        
        checkInput();        
    }//GEN-LAST:event_tglBtnLoker1ActionPerformed

    private void tglBtnLoker2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker2ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker2.isSelected()){
            this.loker_selected += 1;
            this.loker.add("2");
        } else {
            this.loker_selected -= 1;
            this.loker.remove("2");
        }
        
        checkInput();  
    }//GEN-LAST:event_tglBtnLoker2ActionPerformed

    private void tglBtnLoker3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker3ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker3.isSelected()){
            this.loker_selected += 1;
            this.loker.add("3");
        } else {
            this.loker_selected -= 1;
            this.loker.remove("3");
        }
        
        checkInput();  
    }//GEN-LAST:event_tglBtnLoker3ActionPerformed

    private void tglBtnLoker4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker4ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker4.isSelected()){
            this.loker_selected += 1;
            this.loker.add("4");
        } else {
            this.loker_selected -= 1;
            this.loker.remove("4");
        }
        
        checkInput();  
    }//GEN-LAST:event_tglBtnLoker4ActionPerformed

    private void tglBtnLoker5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker5ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker5.isSelected()){
            this.loker_selected += 1;
            this.loker.add("5");
        } else {
            this.loker_selected -= 1;
            this.loker.remove("5");
        }
        
        checkInput();  
    }//GEN-LAST:event_tglBtnLoker5ActionPerformed

    private void tglBtnLoker6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker6ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker6.isSelected()){
            this.loker_selected += 1;
            this.loker.add("6");
        } else {
            this.loker_selected -= 1;
            this.loker.remove("6");
        }
        
        checkInput();  
    }//GEN-LAST:event_tglBtnLoker6ActionPerformed

    private void tglBtnLoker7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker7ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker7.isSelected()){
            this.loker_selected += 1;
            this.loker.add("7");
        } else {
            this.loker_selected -= 1;
            this.loker.add("7");
        }
        
        checkInput();  
    }//GEN-LAST:event_tglBtnLoker7ActionPerformed

    private void tglBtnLoker8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tglBtnLoker8ActionPerformed
        // TODO add your handling code here:
        if(tglBtnLoker8.isSelected()){
            this.loker_selected += 1;
            this.loker.add("8");
        } else {
            this.loker_selected -= 1;
            this.loker.add("8");
        }
        
        checkInput();  
    }//GEN-LAST:event_tglBtnLoker8ActionPerformed

    private void btnPeminjamanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPeminjamanActionPerformed
        try {
            // TODO add your handling code here:
            new menu().setVisible(true);
            this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            this.dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPeminjamanActionPerformed

    private void btnBukaLokerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBukaLokerActionPerformed
        try {
            // TODO add your handling code here:            
            for (String nomor_loker : loker) {
                updateStatusLoker(nomor_loker);
                updateStatusPeminjaman(nomor_loker);
            }
            
            new pengembalian().setVisible(true);
            this.dispose();
        } catch (SQLException | ClassNotFoundException ex) {
            Logger.getLogger(pengembalian.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_btnBukaLokerActionPerformed
    
    private void updateStatusLoker(String nomor_loker) throws SQLException {
        conn = DriverManager.getConnection(url, user, pass);
        
        Statement stm = conn.createStatement();
                
        stm.executeUpdate("UPDATE loker l, peminjaman p "
                +         "SET l.status_loker = 1 "
                +         "WHERE l.id_loker = '" + nomor_loker + "' AND p.status_peminjaman = 1;");
    }
    
    private void updateStatusPeminjaman(String nomor_loker) throws SQLException {
        conn = DriverManager.getConnection(url, user, pass);
        
        Statement stm = conn.createStatement();
        
        stm.executeUpdate("UPDATE loker l, peminjaman p "
                +         "SET p.status_peminjaman = 0 "
                +         "WHERE p.id_loker ='" + nomor_loker + "' AND p.status_peminjaman = 1;");
    }
    
    // Cek klo gkada yg kosong diinputan
    private void checkInput(){
        if(this.loker_selected > 0) {
            btnBukaLoker.setEnabled(true);
        } else {
            btnBukaLoker.setEnabled(false);
        }
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pengembalian.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new pengembalian().setVisible(true);
                } catch (ClassNotFoundException | SQLException ex) {
                    Logger.getLogger(pengembalian.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBukaLoker;
    private javax.swing.JButton btnPeminjaman;
    private javax.swing.JToggleButton tglBtnLoker1;
    private javax.swing.JToggleButton tglBtnLoker2;
    private javax.swing.JToggleButton tglBtnLoker3;
    private javax.swing.JToggleButton tglBtnLoker4;
    private javax.swing.JToggleButton tglBtnLoker5;
    private javax.swing.JToggleButton tglBtnLoker6;
    private javax.swing.JToggleButton tglBtnLoker7;
    private javax.swing.JToggleButton tglBtnLoker8;
    // End of variables declaration//GEN-END:variables
}
