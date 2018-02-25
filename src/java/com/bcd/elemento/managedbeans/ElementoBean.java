/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.elemento.managedbeans;

import com.bcd.elemento.beans.Foto;
import com.bcd.elemento.beans.Rastreo_Elemento;
import com.bcd.dao.FotoDAO;
import com.bcd.dao.Rastreo_ElementoDAO;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.Serializable;



import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletContext;
import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.DefaultStreamedContent;
import org.primefaces.model.StreamedContent;
import org.primefaces.model.UploadedFile;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
/**
 *
 * @author Hector Vix
 */
@ManagedBean
@SessionScoped
public class ElementoBean  implements Serializable{
    //*******re=rastreo_elemento********
     private List<Rastreo_Elemento> lre = new ArrayList<Rastreo_Elemento>();
      private Rastreo_Elemento re = new Rastreo_Elemento();
      private Rastreo_Elemento reSeleccionado = new Rastreo_Elemento();
      private Rastreo_ElementoDAO reDAO = new Rastreo_ElementoDAO();
      private FotoDAO fotoDAO = new FotoDAO();
      private Foto foto = new Foto();
      private StreamedContent imagen = new DefaultStreamedContent();
       private List<Foto> fotos = new ArrayList<Foto>();
     // private String val= new String();

    public Rastreo_Elemento getReSeleccionado() {
        return reSeleccionado;
    }

    public void setReSeleccionado(Rastreo_Elemento reSeleccionado) {
        this.reSeleccionado = reSeleccionado;
    }

   

    public FotoDAO getFotoDAO() {
        return fotoDAO;
    }

    public void setFotoDAO(FotoDAO fotoDAO) {
        this.fotoDAO = fotoDAO;
    }

    public Foto getFoto() {
        return foto;
    }

    public void setFoto(Foto foto) {
        this.foto = foto;
    }

    public StreamedContent getImagen() {
        return imagen;
    }

    public void setImagen(StreamedContent imagen) {
        this.imagen = imagen;
    }

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }

    public Rastreo_ElementoDAO getReDAO() {
        return reDAO;
    }

    public void setReDAO(Rastreo_ElementoDAO reDAO) {
        this.reDAO = reDAO;
    }

    
    public List<Rastreo_Elemento> getLre() {
        return lre;
    }

    public void setLre(List<Rastreo_Elemento> lre) {
        this.lre = lre;
    }

    public Rastreo_Elemento getRe() {
        return re;
    }

    public void setRe(Rastreo_Elemento re) {
        this.re = re;
    }
    
    //--------------------------------------------------------------------------------------------------------------
   public void guardarFotos()  {
        
        try {
            fotoDAO.guardar_Foto(foto);
            foto = new Foto();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Foto adicionada", "Foto adicionada"));
        } catch (SQLException ex) {
            Logger.getLogger(ElementoBean.class.getName()).log(Level.SEVERE, null, ex);
        }


    }
    
    
    public void enviarImagen(FileUploadEvent event) {
        
       try {
            imagen = new DefaultStreamedContent(event.getFile().getInputstream());
            foto.setRe(reSeleccionado);
            foto.setImagen(event.getFile().getContents());
        } catch (IOException ex) {
            Logger.getLogger(ElementoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void crearArchivo(byte[] bytes, String archivo) {
        FileOutputStream fos;
        try {
            fos = new FileOutputStream(archivo);
            fos.write(bytes);
            fos.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ElementoBean.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(ElementoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
   
   //---------------------------------------------------------------------------------------------------------- 
         public void guardarRastreoElemento() {
        try {
            reDAO.guardarRE_I(re);
            reDAO.guardarRE_TG(re);
            reDAO.guardarRE_TN(re);
            reDAO.guardarRE_SG(re);
            reDAO.guardarRE_SN(re);
            reDAO.guardarRE_SS(re);
            re = new Rastreo_Elemento();
            lre =reDAO.listaTodos();
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Rastreo Elemento Guardado", "Rs"));
        } catch (SQLException ex) {
            Logger.getLogger(ElementoBean.class.getName()).log(Level.SEVERE, null, ex);
            FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Error no se pudo guardar", ex.toString()));
        }
    }
     public ElementoBean()
     {
     try {
            lre = reDAO.listaTodos();
        
            
        } catch (SQLException ex) {
            Logger.getLogger(ElementoBean.class.getName()).log(Level.SEVERE, null, ex);
        }
     }
}
