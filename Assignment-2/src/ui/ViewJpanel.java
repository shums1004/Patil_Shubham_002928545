/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Car;

/**
 *
 * @author shubhampatil
 */
public class ViewJpanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewJpanel
     */
    
    ArrayList<String[]> Car_directory = new ArrayList<String[]>();
    boolean CheckValidSeats = false;
    public ViewJpanel(ArrayList<String[]> Car_directory) {
        initComponents();
        
        this.Car_directory = Car_directory;
        populateTable();
        cmbBox();
        
        
    }
    
    
    
    
    

     
     private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblDisplayCars.getModel();
        model.setRowCount(0);
        
        for (int i =0 ; i<Car_directory.size(); i++) {
            
            model.addRow(Car_directory.get(i));
        }
     }
     
     
      void cmbBox() {
            Set<String> Compname = new LinkedHashSet<String>();
            Set<String> Modelname = new LinkedHashSet<String>();
            Set<String> Manufyear = new LinkedHashSet<String>();
            Set<String> SerialNo = new LinkedHashSet<String>();
            Set<String> Location = new LinkedHashSet<String>();
            Set<String> EntryDate = new LinkedHashSet<String>();
            Set<String> Availability = new LinkedHashSet<String>();
            Set<String> Maintainance = new LinkedHashSet<String>();
            
         for (int i=0; i<Car_directory.size(); i++) {
             
             
            
            String X[] = Car_directory.get(i);
            Compname.add(X[0]);
            Modelname.add(X[1]);
            Manufyear.add(X[2]);
            SerialNo.add(X[3]);
            Location.add(X[4]);
            EntryDate.add(X[5]);
            Maintainance.add(X[6]);
            Availability.add(X[7]);
            
       
        }
         for(int i = 0; i<Compname.size(); i++); {
         
          cBoxCompName.addItem("All");
          Iterator<String> itr = Compname.iterator();
          while(itr.hasNext()){
              cBoxCompName.addItem(itr.next());
          }
          
      }
             for(int i = 0; i<Modelname.size(); i++); {
         cBoxModelName.addItem("All");
          Iterator<String> itr = Modelname.iterator();
          while(itr.hasNext()){
              cBoxModelName.addItem(itr.next());
          }
          
      }
                  
          for(int i = 0; i< Manufyear.size(); i++); {
         cBoxManufYear.addItem("All");
          Iterator<String> itr =  Manufyear.iterator();
          while(itr.hasNext()){
              cBoxManufYear.addItem(itr.next());
          }
          
      }
                           
         for(int i = 0; i<SerialNo.size(); i++); {
         cBoxSerialNo.addItem("All");
          Iterator<String> itr = SerialNo.iterator();
          while(itr.hasNext()){
              cBoxSerialNo.addItem(itr.next());
          }
          
      }
            for(int i = 0; i<Location.size(); i++); {
         cBoxLocation.addItem("All");
          Iterator<String> itr = Location.iterator();
          while(itr.hasNext()){
              cBoxLocation.addItem(itr.next());
          }
          
      }
                  for(int i = 0; i<EntryDate.size(); i++); {
         cBoxEntryDate.addItem("All");
          Iterator<String> itr = EntryDate.iterator();
          while(itr.hasNext()){
              cBoxEntryDate.addItem(itr.next());
          }
          
      }
                  
                for(int i = 0; i<Maintainance.size(); i++); {
         cBoxMaintCerti.addItem("All");
          Iterator<String> itr = Maintainance.iterator();
          while(itr.hasNext()){
              cBoxMaintCerti.addItem(itr.next());
          }
          
      }
                  
                  for(int i = 0; i<Availability.size(); i++); {
         cBoxAvailability.addItem("All");
          Iterator<String> itr = Availability.iterator();
          while(itr.hasNext()){
              cBoxAvailability.addItem(itr.next());
          }
          
      }
     }
     
     boolean company_name(String S){
         
          
            
             if(cBoxCompName.getSelectedItem().equals("All")){
             return true;
         }
            
           else if(cBoxCompName.getSelectedItem().equals(S)){    
                
                return true;
            }   
            else {
                return false;
            }
            }
          
         
         
     
     
     boolean model_name(String S){
         
         if( cBoxModelName.getSelectedItem().equals("All") ){
             return true;
         }
         else if(cBoxModelName.getSelectedItem().equals(S)){ 
                
                return true;
            }
            else {
                return false;
            }
            
         
         
     }
    
     boolean manf_year(String S){
         
         if( cBoxManufYear.getSelectedItem().equals("All") ){
             return true;
         } 
            if(cBoxManufYear.getSelectedItem().equals(S)){    
                return true;
            }
            else {
                return false;
                
            }
           
         
         
     }
     
      boolean serial_no(String S){
         
          
          if(cBoxSerialNo.getSelectedItem().equals("All") ){
             return true;
         } 
          
           else if(cBoxSerialNo.getSelectedItem().equals(S)){ 
                return true;
            }
            else {
                return false;
            }
         
         
     }
      
       boolean car_location(String S){
         
           if(cBoxLocation.getSelectedItem().equals("All") ){
             return true;
         } 
           else if(cBoxLocation.getSelectedItem().equals(S)){     
                return(true);
            }
            else{
                return false;
            }
         
         
     }
        
       boolean entry_date(String S){
         
          if( cBoxEntryDate.getSelectedItem().equals("All") ){
             return true;
         } 
            if(cBoxEntryDate.getSelectedItem().equals(S)){  
                return(true);
            }
            else {
                return false;
            }
         
         
     }
       
        boolean maintcerti(String S){
         
           if(cBoxMaintCerti.getSelectedItem().equals("All") ){
             return true;
         } 
          
           else if (cBoxMaintCerti.getSelectedItem().equals("true")){
                return true;
            
          } 
            else {
                return false;
            }
        }
       boolean avail(String S){
         
           if(cBoxAvailability.getSelectedItem().equals("All") ){
             return true;
         } 
          
           else if (cBoxAvailability.getSelectedItem().equals("true")){
                return true;
            
          } 
            else {
                return false;
            }
         
         
     }
       
       
       boolean seats(int S) {
           
           if(txtMinSeats.getText() == null || txtMinSeats.getText().equals("") && txtMaxSeats.getText().equals("") || txtMaxSeats.getText() == null){
               if(CheckValidSeats == false){
               JOptionPane.showMessageDialog(this, "Please enter a valid seats number"); 
               CheckValidSeats = true;
               }
               return false;
           }
           else if ( S > Integer.parseInt(txtMinSeats.getText()) && S < Integer.parseInt(txtMaxSeats.getText()) ){
               
               return true;
               
           }
           
           else {
               return false;
           }
               
           }
       
        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        tblDisplayCars = new javax.swing.JTable();
        cBoxCompName = new javax.swing.JComboBox<>();
        cBoxAvailability = new javax.swing.JComboBox<>();
        cBoxManufYear = new javax.swing.JComboBox<>();
        cBoxSerialNo = new javax.swing.JComboBox<>();
        lblCompName = new javax.swing.JLabel();
        lblAvailability = new javax.swing.JLabel();
        lblManufYear = new javax.swing.JLabel();
        lblSerialNo = new javax.swing.JLabel();
        cBoxModelName = new javax.swing.JComboBox<>();
        lblModelName = new javax.swing.JLabel();
        lblLocation = new javax.swing.JLabel();
        cBoxLocation = new javax.swing.JComboBox<>();
        btnDisplay = new javax.swing.JButton();
        cBoxEntryDate = new javax.swing.JComboBox<>();
        lblEntryDate = new javax.swing.JLabel();
        txtMinSeats = new javax.swing.JTextField();
        txtMaxSeats = new javax.swing.JTextField();
        lblMinSeats = new javax.swing.JLabel();
        lblMaxSeats = new javax.swing.JLabel();
        cBoxMaintCerti = new javax.swing.JComboBox<>();
        lblMaintCerti = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblDisplayCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Car Company", "Car Model", "Manufacturing Year", "Serial Number", "Location", "Entry Date", "Maintenance", "Availability", "Seats"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblDisplayCars);
        if (tblDisplayCars.getColumnModel().getColumnCount() > 0) {
            tblDisplayCars.getColumnModel().getColumn(7).setResizable(false);
            tblDisplayCars.getColumnModel().getColumn(8).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, 780, 236));

        add(cBoxCompName, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        add(cBoxAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 431, -1, -1));

        add(cBoxManufYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 431, -1, -1));

        add(cBoxSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 110, -1, -1));

        lblCompName.setText("Company Name");
        add(lblCompName, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        lblAvailability.setText("Availability");
        add(lblAvailability, new org.netbeans.lib.awtextra.AbsoluteConstraints(26, 407, -1, -1));

        lblManufYear.setText("Manufacturing year");
        add(lblManufYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(136, 407, -1, -1));

        lblSerialNo.setText("Serial No.");
        add(lblSerialNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, -1, -1));

        add(cBoxModelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, -1, -1));

        lblModelName.setText("Model Name");
        add(lblModelName, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 80, -1, -1));

        lblLocation.setText("Location");
        add(lblLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(628, 403, -1, -1));

        add(cBoxLocation, new org.netbeans.lib.awtextra.AbsoluteConstraints(634, 431, -1, -1));

        btnDisplay.setText("Display");
        btnDisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisplayActionPerformed(evt);
            }
        });
        add(btnDisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 510, -1, -1));

        add(cBoxEntryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(722, 431, -1, -1));

        lblEntryDate.setText("Entry Date");
        add(lblEntryDate, new org.netbeans.lib.awtextra.AbsoluteConstraints(709, 403, -1, -1));
        add(txtMinSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 100, 78, -1));

        txtMaxSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMaxSeatsActionPerformed(evt);
            }
        });
        add(txtMaxSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 100, 80, -1));

        lblMinSeats.setText("Min Seats");
        add(lblMinSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 70, -1, -1));

        lblMaxSeats.setText("Max Seats");
        add(lblMaxSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 70, -1, -1));

        add(cBoxMaintCerti, new org.netbeans.lib.awtextra.AbsoluteConstraints(74, 499, -1, -1));

        lblMaintCerti.setText("Maintainance Certificate Validity");
        add(lblMaintCerti, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 476, -1, -1));

        jLabel1.setBackground(new java.awt.Color(205, 92, 92));
        jLabel1.setFont(jLabel1.getFont().deriveFont((jLabel1.getFont().getStyle() | java.awt.Font.ITALIC) | java.awt.Font.BOLD, 16));
        jLabel1.setForeground(new java.awt.Color(255, 127, 80));
        jLabel1.setText("Choose Your Car &Lets Go");
        jLabel1.setToolTipText("");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(298, 0, 232, 33));
    }// </editor-fold>//GEN-END:initComponents

    private void btnDisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisplayActionPerformed
        // TODO add your handling code here:
        
        
        
         DefaultTableModel model = (DefaultTableModel) tblDisplayCars.getModel();
         model.setRowCount(0);
//         
         for (int i=0; i<Car_directory.size(); i++) {
             
             String X [] = Car_directory.get(i);
            
             
             if (company_name(X[0]) && model_name(X[1]) && manf_year(X[2]) && serial_no(X[3]) && car_location(X[4]) && entry_date(X[5]) && maintcerti(X[6])  && avail(X[7]) && seats(Integer.parseInt(X[8]))) {
 
                 model.addRow(X);
             }
            
             
           
             
         }
         CheckValidSeats = false;
    }//GEN-LAST:event_btnDisplayActionPerformed

    private void txtMaxSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMaxSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMaxSeatsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDisplay;
    private javax.swing.JComboBox<String> cBoxAvailability;
    private javax.swing.JComboBox<String> cBoxCompName;
    private javax.swing.JComboBox<String> cBoxEntryDate;
    private javax.swing.JComboBox<String> cBoxLocation;
    private javax.swing.JComboBox<String> cBoxMaintCerti;
    private javax.swing.JComboBox<String> cBoxManufYear;
    private javax.swing.JComboBox<String> cBoxModelName;
    private javax.swing.JComboBox<String> cBoxSerialNo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblAvailability;
    private javax.swing.JLabel lblCompName;
    private javax.swing.JLabel lblEntryDate;
    private javax.swing.JLabel lblLocation;
    private javax.swing.JLabel lblMaintCerti;
    private javax.swing.JLabel lblManufYear;
    private javax.swing.JLabel lblMaxSeats;
    private javax.swing.JLabel lblMinSeats;
    private javax.swing.JLabel lblModelName;
    private javax.swing.JLabel lblSerialNo;
    private javax.swing.JTable tblDisplayCars;
    private javax.swing.JTextField txtMaxSeats;
    private javax.swing.JTextField txtMinSeats;
    // End of variables declaration//GEN-END:variables
}
