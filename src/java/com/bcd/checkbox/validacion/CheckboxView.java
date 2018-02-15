/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bcd.checkbox.validacion;

/**
 *
 * @author Hector Vix
 */
import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.model.SelectItem;
import javax.faces.model.SelectItemGroup;

@ManagedBean
public class CheckboxView {

    private String[] selectedSexo;
    private String[] selectedComunat;
    private String[] selectedFlora;
    private String[] selectedFauna;
    private String[] selectedHidrol;
    
    private List<String> sexo;
    private List<String> comunat;
    private List<String> flora;
    private List<String> fauna;

    public String[] getSelectedComunat() {
        return selectedComunat;
    }

    public void setSelectedComunat(String[] selectedComunat) {
        this.selectedComunat = selectedComunat;
    }

    public String[] getSelectedHidrol() {
        return selectedHidrol;
    }

    public void setSelectedHidrol(String[] selectedHidrol) {
        this.selectedHidrol = selectedHidrol;
    }

    public List<String> getComunat() {
        return comunat;
    }

    public void setComunat(List<String> comunat) {
        this.comunat = comunat;
    }

    public List<String> getHidrol() {
        return hidrol;
    }

    public void setHidrol(List<String> hidrol) {
        this.hidrol = hidrol;
    }
    private List<String> hidrol;

    public String[] getSelectedFauna() {
        return selectedFauna;
    }

    public void setSelectedFauna(String[] selectedFauna) {
        this.selectedFauna = selectedFauna;
    }

    public List<String> getFauna() {
        return fauna;
    }

    public void setFauna(List<String> fauna) {
        this.fauna = fauna;
    }

    

    public String[] getSelectedFlora() {
        return selectedFlora;
    }

    public void setSelectedFlora(String[] selectedFlora) {
        this.selectedFlora = selectedFlora;
    }

    public List<String> getFlora() {
        return flora;
    }

    public void setFlora(List<String> flora) {
        this.flora = flora;
    }

    public String[] getSelectedSexo() {
        return selectedSexo;
    }

    public void setSelectedSexo(String[] selectedSexo) {
        this.selectedSexo = selectedSexo;
    }

    public List<String> getSexo() {
        return sexo;
    }

    public void setSexo(List<String> sexo) {
        this.sexo = sexo;
    }

    @PostConstruct
    public void init() {
        sexo = new ArrayList<String>();
        sexo.add("Masculino");
        sexo.add("Femenino");

        comunat = new ArrayList<String>();
        comunat.add("COMUNAT");
        comunat.add("COMUTERR");
        comunat.add("BOSQUE");
        comunat.add("SABANA");
        comunat.add("PRADO");
        comunat.add("CHAPARRAL");
        comunat.add("DESIERTO");
        comunat.add("ALPINO");
        comunat.add("OTROTERR");
        comunat.add("MARITIMO");
        comunat.add("SUBTERP");
        
        flora = new ArrayList<String>();
        flora.add("FLORA");
        flora.add("FLORAAC");
        flora.add("FLORATERP");
        flora.add("MICROORG");
        flora.add("INFOSITO");

        fauna = new ArrayList<String>();
        fauna.add("FAUNA");
        fauna.add("FAUNAAC");
        fauna.add("FAUNATERR");
        fauna.add("MOLUSCOS");
        fauna.add("INSECTOS");
        fauna.add("CRUSTACEOS");
        fauna.add("OTROARTROP");
        fauna.add("OTROINVERT");
        fauna.add("PECES");
        fauna.add("ANFIBIOS");
        fauna.add("REPTILES");
        fauna.add("AVES");
        fauna.add("MAMIFEROS");
        fauna.add("CIENFISIC");
        fauna.add("FISIOTOPO");
        
        hidrol = new ArrayList<String>();
        hidrol.add("HIDROL");
        hidrol.add("GEOLOGIA");
        hidrol.add("SUELOS");
        hidrol.add("CLIMA");
        hidrol.add("BIOLOGIA");
        hidrol.add("ECOLOGIA");
        hidrol.add("FUNECOL");
        hidrol.add("DIVERSNAT");
        hidrol.add("INVENTARIO");
        hidrol.add("TECINVEST");
        hidrol.add("AM");
        hidrol.add("PLANMANEJO");
        hidrol.add("TECMANEJO");
        hidrol.add("ESTIMPAMB");
        hidrol.add("ORGANPROT");
        hidrol.add("HERRPROT");
 
        
        /*    
         flora = new ArrayList<SelectItem>();
        SelectItemGroup flora = new SelectItemGroup("Flora");
        flora.setSelectItems(new SelectItem[] {
            new SelectItem("FLORA", "FLORA"),
            new SelectItem("FLORAAC", "FLORAAC"),
            new SelectItem("FLORATERP", "FLORATRERP"),
            new SelectItem("MICROORG", "MICROORG"),
            new SelectItem("INFOSITO", "INFOSITO")
            
        });
       
        SelectItemGroup otros = new SelectItemGroup("Otros");
        otros.setSelectItems(new SelectItem[] {
            new SelectItem("COMUNAT", "COMUNAT"),
            new SelectItem("COMUTERR", "COMUTERR"),
            new SelectItem("BOSQUE", "BOSQUE"),
            new SelectItem("SABANA", "SABANA"),
            new SelectItem("PRADO", "PRADO"),
            new SelectItem("CHAPARRAL", "CHAPARRAL"),
            new SelectItem("DESIERTO", "DESIERTO"),
            new SelectItem("ALPINO", "ALPINO"),
            new SelectItem("OTROTERR", "OTROTERR"),
            new SelectItem("MARITIMO", "MARITIMO"),
            new SelectItem("SUBTERP", "SUBTERP")
        });
        
         */

    }

}
