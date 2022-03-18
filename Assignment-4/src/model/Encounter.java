/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import java.util.HashMap;
/**
 *
 * @author shubhampatil
 */
public class Encounter {
    ArrayList<Vitals> av = new ArrayList<>();
    HashMap<Integer,ArrayList<Vitals>> History = new HashMap<>(); 

    public ArrayList<Vitals> getHistory(int ID) {
        return History.get(ID);
    }

    public void AddEncounter(int ID, Vitals v) {
//        av.add(v);
//        this.History.put(ID, av);
    
        if(History.get(ID) != null) {
            av = History.get(ID);
            av.add(v);
        } 
        else {
            av = new ArrayList<>();
            av.add(v);
        }
        
        History.put(ID, av);
    }
    
}
