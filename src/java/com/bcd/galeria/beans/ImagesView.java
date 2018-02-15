/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.bcd.galeria.beans;

/**
 *
 * @author Hector Vix
 * USAC
 */

import java.util.ArrayList;
import java.util.List;
import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
 
@ManagedBean
public class ImagesView {
   
    private List<String> images;     
    @PostConstruct
    public void init() {
        images = new ArrayList<String>();
        for (int i = 1; i <= 10; i++) {
            images.add("nature" + i + ".jpg");
        }
    }
    public List<String> getImages() {
        return images;
    }
    
}
