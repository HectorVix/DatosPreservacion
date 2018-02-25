/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.dao;

import com.bcd.connectionfactory.ConnectionFactory;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Héctor Vix
 */
public class ControlDao implements Serializable{
    private Connection con;
  
    
    
    
    public ControlDao ()
    {
     con = ConnectionFactory.getPostgresSQLConnection();
     
    
    }   
    //Next Usuario
    public Integer sec_Usuario() throws SQLException
    {
        Integer sec_us=-1;
        String sql="select get_usuarioid();";
        PreparedStatement ps2 = con.prepareStatement(sql);
        ResultSet rs = ps2.executeQuery();
        if (rs.next()) {
          sec_us=(rs.getInt("get_usuarioid"));// obteniendo valor del nombre de la columna 
         }
      // System.out.println("Secuencia:"+sec_id);
        return sec_us;
    }
}
