/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.connectionfactory;

/**
 *
 * @author Hector Vix
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
public class ConnectionFactory {
     private static Connection con = null;
    
    
    private ConnectionFactory() {
    }
    
     public static Connection getPostgresSQLConnection() {
         
        
        try {
            if ((con == null) || (con.isClosed())) {
                String usuario = "postgres";
                String password = " ";
                String host = "localhost";
                String basedatos = "BCD";
                Class.forName("org.postgresql.Driver");
                
                con = DriverManager.getConnection("jdbc:postgresql://" + host + ":5432/" + basedatos + "?user=" + usuario + "&password=" + password + "");
              
                
            }
        } catch (SQLException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ConnectionFactory.class.getName()).log(Level.SEVERE, null, ex);
        }

        return con;
    }
}
