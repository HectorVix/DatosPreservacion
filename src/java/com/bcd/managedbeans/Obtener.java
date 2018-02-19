/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.managedbeans;

import Controladores.UsuarioJpaController;
import Entidades.Usuario;
import java.io.Serializable;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.RequestScoped;
/**
 *
 * @author Héctor Vix
 */

@ManagedBean 
@ResquestScoped
public class Obtener  {

     UsuarioJpaController control_usuario = new UsuarioJpaController();
    /**
     * Creates a new instance of Obtener
     */
    public Obtener() {  
    }
    
    public List<Usuario>getUsuario(){
        return control_usuario.findUsuarioEntities();
    }
}
