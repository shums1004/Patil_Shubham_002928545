/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shubhampatil
 */
public class Person extends HouseNo{
    
    private String Name;
    
    private int Id;
    
    private int Age;

    private String Phone;
    
    private double Height;
    
    private double Weight;

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
    
   
    public String getPhone() {
        return Phone;
    }

    public void setPhone(String Phone) {
        this.Phone = Phone;
    }

    public double getHeight() {
        return Height;
    }

    public void setHeight(double Height) {
        this.Height = Height;
    }

    public double getWeight() {
        return Weight;
    }

    public void setWeight(double Weight) {
        this.Weight = Weight;
    }

  
    
    
    
}
