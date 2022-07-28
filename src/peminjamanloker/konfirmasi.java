/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package peminjamanloker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import javax.swing.JFrame;

/**
 *
 * @author Akn
 */
public class konfirmasi extends javax.swing.JFrame {
   
    private Connection conn;
    private final String url = "jdbc:mysql://localhost:3306/peminjaman_loker?";
    private final String user = "root";
    private final String pass = "";
    
    private String nama;
    private String no_tlp;
    private ArrayList<String> loker;
    
    /**
     * Creates new form konfirmasi
     * @param nama
     * @param no_tlp
     * @param loker
     * @throws java.sql.SQLException
     */
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblNamaPeminjam = new javax.swing.JLabel();
        lblNoTlp = new javax.swing.JLabel();
        lblLokerTerpinjam = new javax.swing.JLabel();
        btnSimpan = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        btnKembali = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Konfirmasi Peminjaman");
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel1.setText("Nama Peminjam");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel2.setText("No Telepon Peminjam");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel3.setText("Loker yang dipinjam");

        lblNamaPeminjam.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNamaPeminjam.setText("Lorem");

        lblNoTlp.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblNoTlp.setText("Ipsum");

        lblLokerTerpinjam.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        lblLokerTerpinjam.setText("Dolor");

        btnSimpan.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel5.setText(":");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel6.setText(":");

        jLabel7.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        jLabel7.setText(":");

        btnKembali.setFont(new java.awt.Font("Segoe UI", 0, 16)); // NOI18N
        btnKembali.setText("Kembali");
        btnKembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKembaliActionPerformed(evt);
            }
        });

        jLabel4.setText("*Pastikan data benar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(129, 129, 129)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnKembali)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 185, Short.MAX_VALUE)
                        .addComponent(btnSimpan)
                        .addGap(116, 116, 116))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel7))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 25, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblLokerTerpinjam)
                            .addComponent(lblNamaPeminjam)
                            .addComponent(lblNoTlp))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(102, 102, 102)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(lblNamaPeminjam)
                    .addComponent(jLabel7))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(lblNoTlp)
                    .addComponent(jLabel6))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(lblLokerTerpinjam)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnSimpan)
                    .addComponent(btnKembali))
                .addGap(65, 65, 65))
        );

        setSize(new java.awt.Dimension(615, 426));
    }// </editor-fold>//GEN-END:initComponents

    public konfirmasi(String nama, String no_tlp, ArrayList<String> loker) throws SQLException {
        
        initComponents();
        
        this.nama = nama;
        this.no_tlp = no_tlp;
        this.loker = loker;
        
        lblNamaPeminjam.setText(nama);
        lblNoTlp.setText(no_tlp);
        lblLokerTerpinjam.setText(pisahLoker(loker));
    }

    private String pisahLoker(ArrayList<String> loker){
        String str;
        str = loker.stream().collect(Collectors.joining(", "));
        
        return str;
    }
    
    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        try {
            // TODO add your handling code here:
            conn = DriverManager.getConnection(url, user, pass);
            
            // insert input to sql
            for(int i = 0; i < loker.size(); i++) {
                Statement stm = conn.createStatement();
                
                // insert ke peminjaman
                stm.executeUpdate("INSERT INTO peminjaman(id_loker, nama_peminjam, nomor_telepon_peminjam) VALUES (" + loker.get(i) + ",'" + this.nama + "','" + this.no_tlp + "')");
                
                // update status loker
                stm.executeUpdate("UPDATE loker l, peminjaman p\n" +
                                  "SET l.status_loker = 0\n" +
                                  "WHERE l.id_loker = " + loker.get(i) + " AND p.status_peminjaman = 1");
            }
            System.out.println("Data Ditambahkan");
//          for(int i = 0; i < loker.size(); i++) {
//              System.out.println(loker.get(i));
//          }
        } catch (SQLException ex) {
            Logger.getLogger(konfirmasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        // restart app when done
        this.setVisible(false);
        try {
            new menu().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(konfirmasi.class.getName()).log(Level.SEVERE, null, ex);
        }
        initComponents();
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void btnKembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKembaliActionPerformed
        try {
            // TODO add your handling code here:
            new menu().setVisible(true);
            this.dispose();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(konfirmasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnKembaliActionPerformed

    private void formWindowClosing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        try {
            // TODO add your handling code here:
            setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            new menu().setVisible(true);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(konfirmasi.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_formWindowClosing

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
            java.util.logging.Logger.getLogger(konfirmasi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnKembali;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel lblLokerTerpinjam;
    private javax.swing.JLabel lblNamaPeminjam;
    private javax.swing.JLabel lblNoTlp;
    // End of variables declaration//GEN-END:variables
}