/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package peminjamanloker;

import java.sql.SQLException;

/**
 *
 * @author Akn
 */
public class PeminjamanLoker {

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     * @throws java.sql.SQLException
     */
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        // TODO code application logic here
        menu menuPeminjaman = new menu();
        menuPeminjaman.setVisible(true);
    }
    
}
