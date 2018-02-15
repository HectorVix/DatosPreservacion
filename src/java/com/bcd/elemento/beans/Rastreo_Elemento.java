/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.elemento.beans;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Hector Vix
 * 
 */
public class Rastreo_Elemento implements Serializable {
    private Long id;
    //****Identificadores****
    private String CODIGOE;
    private String TROPICOS;
    private String NACION;
    private String SUBNACION;
    //****Taxonomia (Global)****
    private String CLASETAX;
    private String ORDEN;
    private String FAMILIA;
    private String GENERO;
    private String NOMBREG;
    private String AUTOR;
    private String FUENTENOM;
    private String REFNOMBRE;
    private String DISTTAX;
    private String DUDATAX;
    private String NOMCOMUNG;
    private String COMTAXG;
    //****Taxonomia (nacional)****
    private String NOMBREN;
    private String NUMSINN;
    private String NOMCOMUNN;
    private String COMTAXN;
    //****Status (Global)****
    private String RANGOG;
    private Date FECHA_REVRG= new java.util.Date("04/11/2017");
    
    private String FORMULARG;
    private String RESPRG;
    private String AEPEU;
    private Date FECHA_AEPEU=new java.util.Date("04/11/2017");
    private String CITES;
    private String UICN;
    private String PLANSCONS;
    private String RESPLAN;
    private String RESUMENMAN;
    private String RESRESUMEN;
    private String EXSITU;
    private String INST_EXSITU;
    private String ENDEMISMO;
    //****Status (Nacional)****
    private String RANGON;
    private Date   FECHA_REVRN=new java.util.Date("04/11/2017");
    private String FORMULARN;
    private String RASTREOLEN;
    private String LESTIMN;
    private String LEPROTN;
    private String ABUNDN;
    private String PROTNACION;
    private String REFNOMBRES; 
    private String TRANSPARENCIAN;
    //****Status (Subnacional)****
     private String RANGOS;
     private Date FECHA_REVRS=new java.util.Date("04/11/2017");
     private String FORMULARS;
      private String RASTREOLES;
     
      //****fotos****
      private  List<Foto> fotos = new ArrayList();

    public List<Foto> getFotos() {
        return fotos;
    }

    public void setFotos(List<Foto> fotos) {
        this.fotos = fotos;
    }
      
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCODIGOE() {
        return CODIGOE;
    }

    public void setCODIGOE(String CODIGOE) {
        this.CODIGOE = CODIGOE;
    }

    public String getTROPICOS() {
        return TROPICOS;
    }

    public void setTROPICOS(String TROPICOS) {
        this.TROPICOS = TROPICOS;
    }

    public String getNACION() {
        return NACION;
    }

    public void setNACION(String NACION) {
        this.NACION = NACION;
    }

    public String getSUBNACION() {
        return SUBNACION;
    }

    public void setSUBNACION(String SUBNACION) {
        this.SUBNACION = SUBNACION;
    }

    public String getCLASETAX() {
        return CLASETAX;
    }

    public void setCLASETAX(String CLASETAX) {
        this.CLASETAX = CLASETAX;
    }

    public String getORDEN() {
        return ORDEN;
    }

    public void setORDEN(String ORDEN) {
        this.ORDEN = ORDEN;
    }

    public String getFAMILIA() {
        return FAMILIA;
    }

    public void setFAMILIA(String FAMILIA) {
        this.FAMILIA = FAMILIA;
    }

    public String getGENERO() {
        return GENERO;
    }

    public void setGENERO(String GENERO) {
        this.GENERO = GENERO;
    }

    public String getNOMBREG() {
        return NOMBREG;
    }

    public void setNOMBREG(String NOMBREG) {
        this.NOMBREG = NOMBREG;
    }

    public String getAUTOR() {
        return AUTOR;
    }

    public void setAUTOR(String AUTOR) {
        this.AUTOR = AUTOR;
    }

    public String getFUENTENOM() {
        return FUENTENOM;
    }

    public void setFUENTENOM(String FUENTENOM) {
        this.FUENTENOM = FUENTENOM;
    }

    public String getREFNOMBRE() {
        return REFNOMBRE;
    }

    public void setREFNOMBRE(String REFNOMBRE) {
        this.REFNOMBRE = REFNOMBRE;
    }

    public String getDISTTAX() {
        return DISTTAX;
    }

    public void setDISTTAX(String DISTTAX) {
        this.DISTTAX = DISTTAX;
    }

    public String getDUDATAX() {
        return DUDATAX;
    }

    public void setDUDATAX(String DUDATAX) {
        this.DUDATAX = DUDATAX;
    }

    public String getNOMCOMUNG() {
        return NOMCOMUNG;
    }

    public void setNOMCOMUNG(String NOMCOMUNG) {
        this.NOMCOMUNG = NOMCOMUNG;
    }

    public String getCOMTAXG() {
        return COMTAXG;
    }

    public void setCOMTAXG(String COMTAXG) {
        this.COMTAXG = COMTAXG;
    }

    public String getNOMBREN() {
        return NOMBREN;
    }

    public void setNOMBREN(String NOMBREN) {
        this.NOMBREN = NOMBREN;
    }

    public String getNUMSINN() {
        return NUMSINN;
    }

    public void setNUMSINN(String NUMSINN) {
        this.NUMSINN = NUMSINN;
    }

    public String getNOMCOMUNN() {
        return NOMCOMUNN;
    }

    public void setNOMCOMUNN(String NOMCOMUNN) {
        this.NOMCOMUNN = NOMCOMUNN;
    }

    public String getCOMTAXN() {
        return COMTAXN;
    }

    public void setCOMTAXN(String COMTAXN) {
        this.COMTAXN = COMTAXN;
    }

    public String getRANGOG() {
        return RANGOG;
    }

    public void setRANGOG(String RANGOG) {
        this.RANGOG = RANGOG;
    }

    public Date getFECHA_REVRG() {
        return FECHA_REVRG;
    }

    public void setFECHA_REVRG(Date FECHA_REVRG) {
        this.FECHA_REVRG = FECHA_REVRG;
    }

    public String getFORMULARG() {
        return FORMULARG;
    }

    public void setFORMULARG(String FORMULARG) {
        this.FORMULARG = FORMULARG;
    }

    public String getRESPRG() {
        return RESPRG;
    }

    public void setRESPRG(String RESPRG) {
        this.RESPRG = RESPRG;
    }

    public String getAEPEU() {
        return AEPEU;
    }

    public void setAEPEU(String AEPEU) {
        this.AEPEU = AEPEU;
    }

    public Date getFECHA_AEPEU() {
        return FECHA_AEPEU;
    }

    public void setFECHA_AEPEU(Date FECHA_AEPEU) {
        this.FECHA_AEPEU = FECHA_AEPEU;
    }

    public String getCITES() {
        return CITES;
    }

    public void setCITES(String CITES) {
        this.CITES = CITES;
    }

    public String getUICN() {
        return UICN;
    }

    public void setUICN(String UICN) {
        this.UICN = UICN;
    }

    public String getPLANSCONS() {
        return PLANSCONS;
    }

    public void setPLANSCONS(String PLANSCONS) {
        this.PLANSCONS = PLANSCONS;
    }

    public String getRESPLAN() {
        return RESPLAN;
    }

    public void setRESPLAN(String RESPLAN) {
        this.RESPLAN = RESPLAN;
    }

    public String getRESUMENMAN() {
        return RESUMENMAN;
    }

    public void setRESUMENMAN(String RESUMENMAN) {
        this.RESUMENMAN = RESUMENMAN;
    }

    public String getRESRESUMEN() {
        return RESRESUMEN;
    }

    public void setRESRESUMEN(String RESRESUMEN) {
        this.RESRESUMEN = RESRESUMEN;
    }

    public String getEXSITU() {
        return EXSITU;
    }

    public void setEXSITU(String EXSITU) {
        this.EXSITU = EXSITU;
    }

    public String getINST_EXSITU() {
        return INST_EXSITU;
    }

    public void setINST_EXSITU(String INST_EXSITU) {
        this.INST_EXSITU = INST_EXSITU;
    }

    public String getENDEMISMO() {
        return ENDEMISMO;
    }

    public void setENDEMISMO(String ENDEMISMO) {
        this.ENDEMISMO = ENDEMISMO;
    }

    public String getRANGON() {
        return RANGON;
    }

    public void setRANGON(String RANGON) {
        this.RANGON = RANGON;
    }

    public Date getFECHA_REVRN() {
        return FECHA_REVRN;
    }

    public void setFECHA_REVRN(Date FECHA_REVRN) {
        this.FECHA_REVRN = FECHA_REVRN;
    }

    public String getFORMULARN() {
        return FORMULARN;
    }

    public void setFORMULARN(String FORMULARN) {
        this.FORMULARN = FORMULARN;
    }

    public String getRASTREOLEN() {
        return RASTREOLEN;
    }

    public void setRASTREOLEN(String RASTREOLEN) {
        this.RASTREOLEN = RASTREOLEN;
    }

    public String getLESTIMN() {
        return LESTIMN;
    }

    public void setLESTIMN(String LESTIMN) {
        this.LESTIMN = LESTIMN;
    }

    public String getLEPROTN() {
        return LEPROTN;
    }

    public void setLEPROTN(String LEPROTN) {
        this.LEPROTN = LEPROTN;
    }

    public String getABUNDN() {
        return ABUNDN;
    }

    public void setABUNDN(String ABUNDN) {
        this.ABUNDN = ABUNDN;
    }

    public String getPROTNACION() {
        return PROTNACION;
    }

    public void setPROTNACION(String PROTNACION) {
        this.PROTNACION = PROTNACION;
    }

    public String getREFNOMBRES() {
        return REFNOMBRES;
    }

    public void setREFNOMBRES(String REFNOMBRES) {
        this.REFNOMBRES = REFNOMBRES;
    }

    public String getTRANSPARENCIAN() {
        return TRANSPARENCIAN;
    }

    public void setTRANSPARENCIAN(String TRANSPARENCIAN) {
        this.TRANSPARENCIAN = TRANSPARENCIAN;
    }

    public String getRANGOS() {
        return RANGOS;
    }

    public void setRANGOS(String RANGOS) {
        this.RANGOS = RANGOS;
    }

    public Date getFECHA_REVRS() {
        return FECHA_REVRS;
    }

    public void setFECHA_REVRS(Date FECHA_REVRS) {
        this.FECHA_REVRS = FECHA_REVRS;
    }

    public String getFORMULARS() {
        return FORMULARS;
    }

    public void setFORMULARS(String FORMULARS) {
        this.FORMULARS = FORMULARS;
    }

    public String getRASTREOLES() {
        return RASTREOLES;
    }

    public void setRASTREOLES(String RASTREOLES) {
        this.RASTREOLES = RASTREOLES;
    }
 
      
            
}
