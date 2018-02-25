/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.galeria.beans;

import com.bcd.elemento.beans.Rastreo_Elemento;
import com.bcd.dao.Rastreo_ElementoDAO;
import java.io.Serializable;
import java.sql.SQLException;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.ViewScoped;
import javax.faces.context.FacesContext;
import org.primefaces.event.CellEditEvent;
import org.primefaces.event.RowEditEvent;
/**
 *
 * @author Hector Vix
 * USAC
 */

@ManagedBean(name="dtEditView")
@ViewScoped
public class EditView implements Serializable {
    
     private final Rastreo_ElementoDAO reDAO = new Rastreo_ElementoDAO();
     
     @PostConstruct
    public void init() {
       
    }
    public void onRowEdit(RowEditEvent event) throws SQLException {
        
        Rastreo_Elemento re=(Rastreo_Elemento) event.getObject();
        reDAO.UPDATE_RE_I(re);
        Long id= re.getId();
        
        FacesMessage msg = new FacesMessage("Rastreo Elemento Edit ","ID:"+ id.toString());
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
    
    public void onRowCancel(RowEditEvent event) {
        FacesMessage msg = new FacesMessage("Edit Cancelled");
        FacesContext.getCurrentInstance().addMessage(null, msg);
    }
}
