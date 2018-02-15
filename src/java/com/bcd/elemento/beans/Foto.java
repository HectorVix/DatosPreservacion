/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.elemento.beans;

import java.io.Serializable;



/**
 *
 * @author Hector Vix
 * USAC
 */
public class Foto implements Serializable {
    private Long id;
    private byte[] imagen;
    private int orden;
    private String descripcion;
    private String nombre;
    private String apellido;
    private Rastreo_Elemento re = new Rastreo_Elemento();

    public Rastreo_Elemento getRe() {
        return re;
    }

    public void setRe(Rastreo_Elemento re) {
        this.re = re;
    }

   

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public byte[] getImagen() {
        return imagen;
    }

    public void setImagen(byte[] imagen) {
        this.imagen = imagen;
    }

    public int getOrden() {
        return orden;
    }

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
}
