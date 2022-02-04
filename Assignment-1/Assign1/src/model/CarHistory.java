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
public class CarHistory {
      
    private ArrayList<Car>history;
    
    public CarHistory() {
        
        
        this.history = new ArrayList<Car>();
    
    }

    public ArrayList<Car> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Car> history) {
        this.history = history;
    }
    
    public Car addNewCars() {
        
        Car newCars = new  Car();
        history.add(newCars);
        return newCars;
    }
    
    public void deleteCars(Car cr){
        
        history.remove(cr);
    }
    
    
    
}
