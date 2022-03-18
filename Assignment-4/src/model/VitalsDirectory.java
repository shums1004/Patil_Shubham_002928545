/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author shubhampatil
 */
public class VitalsDirectory {
    
    
    private ArrayList<Vitals>  vdirectory;
    
    public VitalsDirectory() {

        this.vdirectory = new ArrayList<Vitals>();
        
}

    public ArrayList<Vitals> getVdirectory() {
        return vdirectory;
    }

    public void setVdirectory(ArrayList<Vitals> vdirectory) {
        this.vdirectory = vdirectory;
    }
    
    
    public Vitals addNewVitals() {
        
        Vitals newVitals = new Vitals();
        
        vdirectory.add(newVitals);
        
        return newVitals;
        
        
    }
}


