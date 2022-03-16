/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;
import java.sql.Timestamp;    
import java.util.Date;    
import java.text.SimpleDateFormat;  

/**
 *
 * @author shubhampatil
 */
public class Vitals {
    
    
   private int HeartRate;
   
   private double Dystolic;
   
   private double Systolic;
   
   private int BloodOxygen;
   
   private double Glucose;
   
   private double Cholestrol;
   
   private String TimeStamp;

    public String getTimeStamp() {
        return TimeStamp;
    }
   
   public void setTimeStamp(){    
                Date date = new Date();  
                Timestamp ts=new Timestamp(date.getTime());  
                SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm");  
                this.TimeStamp = formatter.format(ts);
                
                
        }    

    
   
   

    public int getHeartRate() {
        return HeartRate;
    }

    public void setHeartRate(int HeartRate) {
        this.HeartRate = HeartRate;
    }

    public double getDystolic() {
        return Dystolic;
    }

    public void setDystolic(double Dystolic) {
        this.Dystolic = Dystolic;
    }

    public double getSystolic() {
        return Systolic;
    }

    public void setSystolic(double Systolic) {
        this.Systolic = Systolic;
    }

    public int getBloodOxygen() {
        return BloodOxygen;
    }

    public void setBloodOxygen(int BloodOxygen) {
        this.BloodOxygen = BloodOxygen;
    }

    public double getGlucose() {
        return Glucose;
    }

    public void setGlucose(double Glucose) {
        this.Glucose = Glucose;
    }

    public double getCholestrol() {
        return Cholestrol;
    }

    public void setCholestrol(double Cholestrol) {
        this.Cholestrol = Cholestrol;
    }

   
    

    
}
