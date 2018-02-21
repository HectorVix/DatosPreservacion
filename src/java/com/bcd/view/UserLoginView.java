/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.view;
import Controladores.UsuarioJpaController;
import com.bcd.managedbeans.ResquestScoped;
import java.io.Serializable;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.primefaces.context.RequestContext;
/**
 *
 * @author Héctor Vix
 */
@ManagedBean (name="login")
@ResquestScoped
public class UserLoginView  implements Serializable{
    UsuarioJpaController control_usuario = new UsuarioJpaController();
    private String username;
     
    private String password;
 
    public String getUsername() {
        return username;
    }
 
    public void setUsername(String username) {
        this.username = username;
    }
 
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
   
    public void login(ActionEvent event) {
        FacesMessage message = null;
        boolean loggedIn = false;
         
        if(username != null && username.equals("admin") && password != null && password.equals("admin")) {
            loggedIn = true;
            message = new FacesMessage(FacesMessage.SEVERITY_INFO, "Welcome", username);
        } else {
            loggedIn = false;
            message = new FacesMessage(FacesMessage.SEVERITY_WARN, "Loggin Error", "Invalid credentials");
        }
         
        FacesContext.getCurrentInstance().addMessage(null, message);
       // PrimeFaces.current().ajax().addCallbackParam("loggedIn", loggedIn);
    }  
    
    
    public String loginControl() {
        if (control_usuario.loginControl(username, password)) {
            return "home.xhtml?faces-redirect=true";
        }
        RequestContext.getCurrentInstance().update("growl");
        FacesContext context = FacesContext.getCurrentInstance();
        context.addMessage(null, new FacesMessage(FacesMessage.SEVERITY_ERROR, "Error", "Error de acceso"));
        return "";
    }
}
