/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.dao;

import com.bcd.connectionfactory.ConnectionFactory;
import com.bcd.elemento.beans.Rastreo_Elemento;
import java.io.Serializable;
import java.sql.Connection;
import java.sql.Date;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Hector Vix
 */
public class Rastreo_ElementoDAO implements Serializable {
   
    private Connection con;
    private long sec_id=-1; // para opter el id puesto que se desnormalizo Rastreo Elemento
    
    //***Identificadores***
    private final String COL_ID = "ras_ele_id";
    private final String COL_CODIGOE = "codigoe";   
    private final String COL_TROPICOS = "tropicos";
    private final String COL_NACION = "nacion";
    private final String COL_SUBNACION = "subnacion";
    public Rastreo_ElementoDAO()
    {
     con = ConnectionFactory.getPostgresSQLConnection();
        
    }
    
    public List<Rastreo_Elemento> listaTodos() throws SQLException {
        List<Rastreo_Elemento> lre = new ArrayList<Rastreo_Elemento>();
        String sql = "select * from rastreo_elemento order by ras_ele_id";
        PreparedStatement ps = con.prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Rastreo_Elemento re = new Rastreo_Elemento();
            re.setId(rs.getLong(COL_ID));
            //***Identificadores***
            re.setCODIGOE(rs.getString(COL_CODIGOE));
            re.setTROPICOS(rs.getString(COL_TROPICOS));
            re.setNACION(rs.getString(COL_NACION));
             re.setSUBNACION(rs.getString(COL_SUBNACION));
            
            lre.add(re);
        }
        return lre;
    }
    
    public Rastreo_Elemento buscaPorId(long id) throws SQLException {
        Rastreo_Elemento re = null;
        String sql = "select * from eventos where ras_ele_id=?";
        PreparedStatement ps = con.prepareStatement(sql);
        ps.setLong(1, id);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            re = new Rastreo_Elemento();
            re.setId(id);
            
            
        }
        return re;
    }
    //****guardar Identificadores****
    public void UPDATE_RE_I(Rastreo_Elemento re) throws SQLException {
                    
          String  sql = "UPDATE rastreo_elemento set "
                    //****Identificadores****
                    + "codigoe=?,tropicos=?,nacion=?,subnacion=?"                
                    + " WHERE ras_ele_id=?";
        
        PreparedStatement ps = con.prepareStatement(sql);       
        //****Identificadores****         
         ps.setString(1, re.getCODIGOE());
         ps.setString(2, re.getTROPICOS());
         ps.setString(3, re.getNACION());
         ps.setString(4, re.getSUBNACION());                       
            ps.setLong(5, re.getId());
        
        ps.execute();
    }
     public void guardarRE_I(Rastreo_Elemento re) throws SQLException {
        String sql = "";
        String sql2="select  get_rastreoElementoid();";
        
        if (re.getId() != null) {
            sql = "UPDATE rastreo_elemento set "
                    //****Identificadores****
                    + "codigoe=?,tropicos=?,nacion=?,subnacion=?"                
                    + " WHERE ras_ele_id=?";
        } else {
            sql = "INSERT INTO rastreo_elemento "                   
                    + "(ras_ele_id,codigoe,tropicos,nacion,subnacion)"                                      
                    + "VALUES (?,?,?,?,?)";                                                             
               }
        PreparedStatement ps = con.prepareStatement(sql);
         PreparedStatement ps2 = con.prepareStatement(sql2);
         ResultSet rs = ps2.executeQuery();
         if (rs.next()) {
          sec_id=(rs.getLong(" get_rastreoelementoid"));
         }
        //****Identificadores****
          ps.setLong(1, sec_id);
         ps.setString(2, re.getCODIGOE());
         ps.setString(3, re.getTROPICOS());
         ps.setString(4, re.getNACION());
         ps.setString(5, re.getSUBNACION());                 
        if (re.getId() != null) {
            ps.setLong(5, re.getId());
        }
        ps.execute();
    }
      //****Guardar Taxonomia (Global)****
     public void guardarRE_TG(Rastreo_Elemento re) throws SQLException {
        String sql = "";              
        if (re.getId() != null) {
            sql = "UPDATE taxonomiag set "
                    
                    + "codigoe=?,tropicos=?,nacion=?,subnacion=?"                
                    + " WHERE ras_ele_id=?";
        } else {
            sql = "INSERT INTO taxonomiag "                   
                    + "(rastreo_elemento_ras_ele_id,clasetax,orden,familia,genero,"
                    + "nombreg,autor,fuentenom,refnombre,disttax,dudatax,nomcomung,comtaxg)"                                      
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?)";                                                             
               }
        PreparedStatement ps = con.prepareStatement(sql);
        
        //****taxonomia(global)****
          ps.setLong(1, sec_id);
          ps.setString(2, re.getCLASETAX());
          ps.setString(3, re.getORDEN());
          ps.setString(4, re.getFAMILIA());
          ps.setString(5, re.getGENERO());
          ps.setString(6, re.getNOMBREG());
          ps.setString(7, re.getAUTOR());
          ps.setString(8, re.getFUENTENOM());
          ps.setString(9, re.getREFNOMBRE());
          ps.setString(10, re.getDISTTAX());
          ps.setString(11, re.getDUDATAX());
          ps.setString(12, re.getNOMCOMUNG());
          ps.setString(13, re.getCOMTAXG());
         
        if (re.getId() != null) {
            ps.setLong(5, re.getId());
        }
        ps.execute();
    }
     //****Guardar Taxonomia (Nacional)****
     public void guardarRE_TN(Rastreo_Elemento re) throws SQLException {
        String sql = "";              
        if (re.getId() != null) {
            sql = "UPDATE taxonomiag set "
                    
                    + "codigoe=?,tropicos=?,nacion=?,subnacion=?"                
                    + " WHERE ras_ele_id=?";
        } else {
            sql = "INSERT INTO taxonomian "                   
                    + "(rastreo_elemento_ras_ele_id,nombren,numsinn,nomcomunn,comtaxn)"                                                      
                    + "VALUES (?,?,?,?,?)";                                                             
               }
        PreparedStatement ps = con.prepareStatement(sql);
        
        //****taxonomia(nacional)****
         ps.setLong(1, sec_id);
         ps.setString(2, re.getNOMBREN());
         ps.setString(3, re.getNUMSINN());
         ps.setString(4, re.getNOMCOMUNN());
         ps.setString(5, re.getCOMTAXN());
         
        if (re.getId() != null) {
            ps.setLong(5, re.getId());
        }
        ps.execute();
    }
     //****Guardar Status (Global)****
     public void guardarRE_SG(Rastreo_Elemento re) throws SQLException {
        String sql = "";              
        if (re.getId() != null) {
            sql = "UPDATE taxonomiag set "
                    
                    + "codigoe=?,tropicos=?,nacion=?,subnacion=?"                
                    + " WHERE ras_ele_id=?";
        } else {
            sql = "INSERT INTO statusg "                 
                    + "(rastreo_elemento_ras_ele_id, rangog,fecha_revrg,formularg,resprg,"
                    + "aepeu,fecha_aepeu,cites,uicn,"
                    + "planscons,resplan,resumenman,resresumen,"
                    + "exsitu,inst_exsitu,endemismo)"
                                                     
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";                                                             
               }
        PreparedStatement ps = con.prepareStatement(sql);
               
         ps.setLong(1, sec_id);
         ps.setString(2, re.getRANGOG());         
         ps.setDate(3, new java.sql.Date(re.getFECHA_REVRG().getTime()));
         ps.setString(4, re.getFORMULARG());
         ps.setString(5, re.getRESPRG());
         ps.setString(6, re.getAEPEU());
         ps.setDate(7, new java.sql.Date(re.getFECHA_AEPEU().getTime()));
         ps.setString(8, re.getCITES());
         ps.setString(9, re.getUICN());
         ps.setString(10, re.getPLANSCONS());
         ps.setString(11, re.getRESPLAN());
         ps.setString(12, re.getRESUMENMAN());
         ps.setString(13, re.getRESRESUMEN());
         ps.setString(14, re.getEXSITU());
         ps.setString(15, re.getINST_EXSITU());
         ps.setString(16, re.getENDEMISMO());
        if (re.getId() != null) {
            ps.setLong(5, re.getId());
        }
        ps.execute();
    }
     //****Guardar Status (Nacional)****
     public void guardarRE_SN(Rastreo_Elemento re) throws SQLException {
        String sql = "";              
        if (re.getId() != null) {
            sql = "UPDATE taxonomiag set "
                    
                    + "codigoe=?,tropicos=?,nacion=?,subnacion=?"                
                    + " WHERE ras_ele_id=?";
        } else {
            sql = "INSERT INTO statusn "                 
                    + "(rastreo_elemento_ras_ele_id,rangon,fecha_revrn,formularn,rastreolen,"
                    + "lestimn,leprotn,abundn,protnacion,"
                    + "refnombres,transparencian)"
                                                     
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?)";                                                             
               }
        PreparedStatement ps = con.prepareStatement(sql);
        
        //****Status(nacional)****
         ps.setLong(1, sec_id);
         ps.setString(2, re.getRANGON()); 
         ps.setDate(3, new java.sql.Date(re.getFECHA_REVRN().getTime()));
         ps.setString(4, re.getFORMULARN());
         ps.setString(5, re.getRASTREOLEN());
         ps.setString(6, re.getLESTIMN());        
         ps.setString(7, re.getLEPROTN());
         ps.setString(8, re.getABUNDN());
         ps.setString(9, re.getPROTNACION());
         ps.setString(10, re.getREFNOMBRES());
         ps.setString(11, re.getTRANSPARENCIAN());
         
        if (re.getId() != null) {
            ps.setLong(5, re.getId());
        }
        ps.execute();
    }
     //****Guardar Status (Nacional)****
     public void guardarRE_SS(Rastreo_Elemento re) throws SQLException {
        String sql = "";              
        if (re.getId() != null) {
            sql = "UPDATE taxonomiag set "
                    
                    + "codigoe=?,tropicos=?,nacion=?,subnacion=?"                
                    + " WHERE ras_ele_id=?";
        } else {
            sql = "INSERT INTO statuss "                 
                    + "(rastreo_elemento_ras_ele_id,rangos,fecha_revrs,formulars,rastreoles)"
                                                     
                    + "VALUES (?,?,?,?,?)";                                                             
               }
        PreparedStatement ps = con.prepareStatement(sql);
        
        //****Status(subnacional)****
         ps.setLong(1, sec_id);
         ps.setString(2, re.getRANGOS()); 
         ps.setDate(3, new java.sql.Date(re.getFECHA_REVRS().getTime()));
         ps.setString(4, re.getFORMULARS());
         ps.setString(5, re.getRASTREOLES());
         
         
        if (re.getId() != null) {
            ps.setLong(5, re.getId());
        }
        ps.execute();
    }
     
     
}
