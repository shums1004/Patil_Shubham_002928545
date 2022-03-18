/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author shubhampatil
 */
public class PersonDirectory {
    
    private ArrayList<Person> directory;
    
    public PersonDirectory() {
        
        this.directory = new ArrayList<Person>();
    }

    public ArrayList<Person> getDirectory() {
        return directory;
    }

    public void setDirectory(ArrayList<Person> directory) {
        this.directory = directory;
    }
    
    public Person addNewPersons() {
        
        Person newPerson = new Person();
        directory.add(newPerson);
        return newPerson;
    }
    
    public void deleteperson(Person pr){
        
        directory.remove(pr);
    }
 
}
