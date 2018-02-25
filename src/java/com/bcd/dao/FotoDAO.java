/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.dao;


import com.bcd.connectionfactory.ConnectionFactory;
import com.bcd.elemento.beans.Foto;
import com.bcd.elemento.beans.Rastreo_Elemento;
import java.io.Serializable;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;

/**
 *
 * @author Hector Vix
 * USAC
 */
public class FotoDAO implements Serializable {
    
    private Connection con;
    private final String COL_ID = "foto_id";
    private final String COL_IMAGEM = "imagen";
    private final String COL_ORDEM = "orden";
    private final String COL_DESCRICAO = "descripcion";
    private final String COL_EVENTO = "eventos_id";

    public FotoDAO() {
       con = ConnectionFactory.getPostgresSQLConnection();
    }
   
    public void guardar_Foto(Foto foto) throws SQLException  {
     
        String sql = "insert into fotos(rastreo_elemento_ras_ele_id,"
                + "imagen,orden,descripcion) "
                + "values(?,?,?,?)";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, foto.getRe().getId());
        ps.setBytes(2, foto.getImagen());
        ps.setInt(3, foto.getOrden());      
        ps.setString(4, foto.getDescripcion());
        ps.execute();
    }
}
