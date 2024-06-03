/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.FantasyFittings;

// Import library
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Connection;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author ASUS
 */
public class koneksiDB {
 
    // Membuat koneksi database 
    // Nama Database: nama database_java_rpl4B
    
    // kelas koneksi
    public static Connection koneksi;
    
    // kelas konfigurasi
    public static Connection konfigurasi_koneksiDB() throws SQLException {
        Connection koneksi = null;
        // Exception Handling dengan try n catch
        try {
            String url_host = "jdbc:mysql://localhost/fantasyfittings";
            String nama_user = "root";
            String password_db = "";
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            koneksi = DriverManager.getConnection(url_host, nama_user, password_db);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Database gagal koneksi: " + e.getMessage());
        }
        return koneksi;
    }   
    
    public static void main(String[] args) throws SQLException {
        Connection mengkoneksi = koneksiDB.konfigurasi_koneksiDB();
        if (mengkoneksi != null) {
            System.out.println("Koneksi berhasil");
        } else {
            System.out.println("Koneksi gagal");
        }
    }
}