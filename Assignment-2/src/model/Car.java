/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author shubhampatil
 */
public class Car {
    
    private String Company_name;
    private String Model_name;
    private String Manufacturing_year;
    private int Serial_number;
    private String Location;
    private String Input_date;
    private boolean Manir_certi_date;
    private boolean Availability;
    private int Seats;

    public String getCompany_name() {
        return Company_name;
    }

    public void setCompany_name(String Company_name) {
        this.Company_name = Company_name;
    }

    public String getModel_name() {
        return Model_name;
    }

    public void setModel_name(String Model_name) {
        this.Model_name = Model_name;
    }

    public String getManufacturing_year() {
        return Manufacturing_year;
    }

    public void setManufacturing_year(String Manufacturing_year) {
        this.Manufacturing_year = Manufacturing_year;
    }

    public int getSerial_number() {
        return Serial_number;
    }

    public void setSerial_number(int Serial_number) {
        this.Serial_number = Serial_number;
    }

    public String getLocation() {
        return Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getInput_date() {
        return Input_date;
    }

    public void setInput_date(String Input_date) {
        this.Input_date = Input_date;
    }

    public boolean isManir_certi_date() {
        return Manir_certi_date;
    }

    public void setManir_certi_date(boolean Manir_certi_date) {
        this.Manir_certi_date = Manir_certi_date;
    }

   

    public boolean isAvailability() {
        return Availability;
    }

    public void setAvailability(boolean Availability) {
        this.Availability = Availability;
    }

    public int getSeats() {
        return Seats;
    }

    public void setSeats(int Seats) {
        this.Seats = Seats;
    }
   
       
    
}
