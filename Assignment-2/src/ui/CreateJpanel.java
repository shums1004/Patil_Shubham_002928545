/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Car;
import model.Car_directory;


/**
 *
 * @author shubhampatil
 */
public class CreateJpanel extends javax.swing.JPanel {

    /**
     * Creates new form CreateJpanel
     */
    Car_directory C = new Car_directory();
    ArrayList<String[]> Car_directory = new ArrayList<String[]>();
    
    public CreateJpanel(Car_directory C) {
        initComponents();
        this.C = C;
        Car_directory = C.getCar_directory();
       
        for (int i=0; i<Car_directory.size(); i++) {
            
            String X[] = Car_directory.get(i);

            Serial_Number.addItem(X[3]);
       
        }
    }
    
    
    void dummylist(){
        
        Car car1 = new Car();
        car1.setCompany_name("BMW");
        car1.setModel_name("Series 7");
        car1.setManufacturing_year("2018");
        car1.setSerial_number(1);
        car1.setLocation("Boston");
        car1.setInput_date("22/11/2022");
        car1.setManir_certi_date(true);
        car1.setAvailability(true);
        car1.setSeats(6);
         String CD1[] = {car1.getCompany_name(), car1.getModel_name(), car1.getManufacturing_year(), ((Integer)car1.getSerial_number()).toString(), car1.getLocation(), car1.getInput_date(), ((Boolean)car1.isManir_certi_date()).toString(), ((Boolean)car1.isAvailability()).toString(), ((Integer)car1.getSeats()).toString()};
        Car_directory.add(CD1);
        
        Car car2 = new Car();
        car2.setCompany_name("BMW");
        car2.setModel_name("X5");
        car2.setManufacturing_year("2017");
        car2.setSerial_number(2);
        car2.setLocation("Las Vegas");
        car2.setInput_date("03/12/2021");
        car2.setManir_certi_date(true);

        car2.setAvailability(true);
        car2.setSeats(5);
         String CD2[] = {car2.getCompany_name(), car2.getModel_name(), car2.getManufacturing_year(), ((Integer)car2.getSerial_number()).toString(), car2.getLocation(), car2.getInput_date(), ((Boolean)car2.isManir_certi_date()).toString(), ((Boolean)car2.isAvailability()).toString(), ((Integer)car2.getSeats()).toString()};
        Car_directory.add(CD2);
        
        Car car3 = new Car();
        car3.setCompany_name("Lambourgini");
        car3.setModel_name("Hurracan");
        car3.setManufacturing_year("2020");
        car3.setSerial_number(3);
        car3.setLocation("Los Angeles");
        car3.setInput_date("22/01/2021");
        car3.setManir_certi_date(true);
       
        car3.setAvailability(true);
        car3.setSeats(2);
         String CD3[] = {car3.getCompany_name(), car3.getModel_name(), car3.getManufacturing_year(), ((Integer)car3.getSerial_number()).toString(), car3.getLocation(), car3.getInput_date(), ((Boolean)car3.isManir_certi_date()).toString(), ((Boolean)car3.isAvailability()).toString(), ((Integer)car3.getSeats()).toString()};
        Car_directory.add(CD3);
        
        
        Car car4 = new Car();
        car4.setCompany_name("Honda");
        car4.setModel_name("Civiv");
        car4.setManufacturing_year("2016");
        car4.setSerial_number(4);
        car4.setLocation("Washington");
        car4.setInput_date("01/08/2021");
        car4.setManir_certi_date(false);
     
        car4.setAvailability(false);
        car4.setSeats(4);
         String CD4[] = {car4.getCompany_name(),car4.getModel_name(), car4.getManufacturing_year(), ((Integer)car4.getSerial_number()).toString(), car4.getLocation(), car4.getInput_date(), ((Boolean)car4.isManir_certi_date()).toString(), ((Boolean)car4.isAvailability()).toString(), ((Integer)car4.getSeats()).toString()};
        Car_directory.add(CD4);
        
        Car car5 = new Car();
        car5.setCompany_name("Ford");
        car5.setModel_name("Mustang");
        car5.setManufacturing_year("2016");
        car5.setSerial_number(5);
        car5.setLocation("Miami");
        car5.setInput_date("02/12/2019");
        car5.setManir_certi_date(false);
        
        car5.setAvailability(true);
        car5.setSeats(4);
         String CD5[] = {car5.getCompany_name(), car5.getModel_name(), car5.getManufacturing_year(), ((Integer)car5.getSerial_number()).toString(), car5.getLocation(), car5.getInput_date(), ((Boolean)car5.isManir_certi_date()).toString(), ((Boolean)car5.isAvailability()).toString(), ((Integer)car5.getSeats()).toString()};
        Car_directory.add(CD5);
        
        Car car6 = new Car();
        car6.setCompany_name("Audi");
        car6.setModel_name("A7");
        car6.setManufacturing_year("2019");
        car6.setSerial_number(6);
        car6.setLocation("Texas");
        car6.setInput_date("22/02/2019");
        car6.setManir_certi_date(true);
  
        car6.setAvailability(false);
        car6.setSeats(5);
         String CD6[] = {car6.getCompany_name(), car6.getModel_name(), car6.getManufacturing_year(), ((Integer)car6.getSerial_number()).toString(), car6.getLocation(), car6.getInput_date(), ((Boolean)car6.isManir_certi_date()).toString(), ((Boolean)car6.isAvailability()).toString(), ((Integer)car6.getSeats()).toString()};
        Car_directory.add(CD6);
        
        
        Car car7 = new Car();
        car7.setCompany_name("Audi");
        car7.setModel_name("Q7");
        car7.setManufacturing_year("2018");
        car7.setSerial_number(7);
        car7.setLocation("New York");
        car7.setInput_date("20/10/2020");
        car7.setManir_certi_date(true);
        car7.setAvailability(true);
        car7.setSeats(7);
        
        String CD7[] = {car7.getCompany_name(), car7.getModel_name(), car7.getManufacturing_year(), ((Integer)car7.getSerial_number()).toString(), car7.getLocation(), car7.getInput_date(), ((Boolean)car7.isManir_certi_date()).toString(), ((Boolean)car7.isAvailability()).toString(), ((Integer)car7.getSeats()).toString()};
        Car_directory.add(CD7);
    }
    
    
    void add_details()  {
        
        Car mycar = new Car();
        
        mycar.setCompany_name(txt_Car_comp.getText());
        mycar.setModel_name(txt_Car_mod.getText());
        mycar.setManufacturing_year(txt_manf_year.getText());
        mycar.setSerial_number(Integer.parseInt(txt_serial_no.getText()));
        mycar.setLocation(txt_location.getText());
        mycar.setInput_date(txt_entry_date.getText());

        if (rdbtnMCYes.isSelected()) {
            
           mycar.setManir_certi_date(true);
        }
        else {
            mycar.setManir_certi_date(false);
        }
        if (rdbtn_yes.isSelected()) {
            
           mycar.setAvailability(true);
        }
        else {
            mycar.setAvailability(false);
        }
        mycar.setSeats(Integer.parseInt(txtSeats.getText()));
        
        
        
        
        String CD[] = {mycar.getCompany_name(), mycar.getModel_name(), mycar.getManufacturing_year(), ((Integer)mycar.getSerial_number()).toString(), mycar.getLocation(), mycar.getInput_date(),((Boolean)mycar.isManir_certi_date()).toString(), ((Boolean)mycar.isAvailability()).toString(),((Integer)mycar.getSeats()).toString()};
        Car_directory.add(CD);
        C.setCar_directory(Car_directory);

    }
    
    void emptyfields() {
        txt_Car_comp.setText("");
        txt_Car_mod.setText("");
        txt_manf_year.setText("");
        txt_serial_no.setText("");
        txt_location.setText("");
        txt_entry_date.setText("");
        rdbtnMCYes.setSelected(false);
        rdbtnMCNo.setSelected(false);
        rdbtn_yes.setSelected(false);
        rdbtn_no.setSelected(false);
        txtSeats.setText("");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        lblHeading = new javax.swing.JLabel();
        lbl_Car_comp = new javax.swing.JLabel();
        lbl_Car_mod = new javax.swing.JLabel();
        lbl_manf_year = new javax.swing.JLabel();
        lbl_serial_no = new javax.swing.JLabel();
        lbl_location = new javax.swing.JLabel();
        lbl_Entry_date = new javax.swing.JLabel();
        lbl_maint_certi_date = new javax.swing.JLabel();
        lbl_avai = new javax.swing.JLabel();
        txt_Car_comp = new javax.swing.JTextField();
        txt_Car_mod = new javax.swing.JTextField();
        txt_manf_year = new javax.swing.JTextField();
        txt_serial_no = new javax.swing.JTextField();
        txt_location = new javax.swing.JTextField();
        txt_entry_date = new javax.swing.JTextField();
        btn_save = new javax.swing.JButton();
        rdbtn_yes = new javax.swing.JRadioButton();
        rdbtn_no = new javax.swing.JRadioButton();
        Serial_Number = new javax.swing.JComboBox<>();
        btn_show = new javax.swing.JButton();
        btn_update = new javax.swing.JButton();
        btnDummyList = new javax.swing.JButton();
        lblSeats = new javax.swing.JLabel();
        txtSeats = new javax.swing.JTextField();
        rdbtnMCYes = new javax.swing.JRadioButton();
        rdbtnMCNo = new javax.swing.JRadioButton();
        time = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setForeground(new java.awt.Color(255, 250, 250));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lblHeading.setBackground(new java.awt.Color(0, 0, 0));
        lblHeading.setFont(new java.awt.Font("DialogInput", 3, 24)); // NOI18N
        lblHeading.setForeground(new java.awt.Color(255, 127, 80));
        lblHeading.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblHeading.setText("          Car Directory");
        add(lblHeading, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 10, 310, 48));

        lbl_Car_comp.setBackground(new java.awt.Color(0, 0, 139));
        lbl_Car_comp.setFont(new java.awt.Font("Myanmar MN", 3, 13)); // NOI18N
        lbl_Car_comp.setForeground(new java.awt.Color(255, 127, 80));
        lbl_Car_comp.setText("Car Company:");
        add(lbl_Car_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(229, 92, -1, -1));

        lbl_Car_mod.setBackground(new java.awt.Color(0, 0, 139));
        lbl_Car_mod.setFont(new java.awt.Font("Malayalam MN", 3, 13)); // NOI18N
        lbl_Car_mod.setForeground(new java.awt.Color(255, 127, 80));
        lbl_Car_mod.setText("Car Model:");
        add(lbl_Car_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 143, -1, -1));

        lbl_manf_year.setBackground(new java.awt.Color(0, 0, 139));
        lbl_manf_year.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lbl_manf_year.setForeground(new java.awt.Color(255, 127, 80));
        lbl_manf_year.setText("Manufacturing Year:");
        add(lbl_manf_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(191, 205, -1, -1));

        lbl_serial_no.setBackground(new java.awt.Color(0, 0, 139));
        lbl_serial_no.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lbl_serial_no.setForeground(new java.awt.Color(255, 127, 80));
        lbl_serial_no.setText("Serial Number:");
        add(lbl_serial_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(225, 247, -1, -1));

        lbl_location.setBackground(new java.awt.Color(0, 0, 139));
        lbl_location.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lbl_location.setForeground(new java.awt.Color(255, 127, 80));
        lbl_location.setText("Location(City):");
        add(lbl_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(226, 296, -1, -1));

        lbl_Entry_date.setBackground(new java.awt.Color(0, 0, 139));
        lbl_Entry_date.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lbl_Entry_date.setForeground(new java.awt.Color(255, 127, 80));
        lbl_Entry_date.setText("Drive Train:");
        add(lbl_Entry_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(244, 340, -1, -1));

        lbl_maint_certi_date.setBackground(new java.awt.Color(0, 0, 139));
        lbl_maint_certi_date.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lbl_maint_certi_date.setForeground(new java.awt.Color(255, 127, 80));
        lbl_maint_certi_date.setText("Maintainance Certificate Date:");
        add(lbl_maint_certi_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(128, 383, -1, -1));

        lbl_avai.setBackground(new java.awt.Color(0, 0, 139));
        lbl_avai.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lbl_avai.setForeground(new java.awt.Color(255, 127, 80));
        lbl_avai.setText("Availability:");
        add(lbl_avai, new org.netbeans.lib.awtextra.AbsoluteConstraints(243, 424, -1, -1));

        txt_Car_comp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_Car_compActionPerformed(evt);
            }
        });
        add(txt_Car_comp, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 87, 106, -1));
        add(txt_Car_mod, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 138, 106, -1));
        add(txt_manf_year, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 200, 106, -1));
        add(txt_serial_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 247, 106, -1));
        add(txt_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 291, 106, -1));
        add(txt_entry_date, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 335, 106, -1));

        btn_save.setForeground(new java.awt.Color(255, 127, 80));
        btn_save.setText("Save");
        btn_save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_saveActionPerformed(evt);
            }
        });
        add(btn_save, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 517, -1, -1));

        buttonGroup1.add(rdbtn_yes);
        rdbtn_yes.setForeground(new java.awt.Color(255, 127, 80));
        rdbtn_yes.setText("Yes");
        add(rdbtn_yes, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 420, -1, -1));

        buttonGroup1.add(rdbtn_no);
        rdbtn_no.setForeground(new java.awt.Color(255, 127, 80));
        rdbtn_no.setText("No");
        add(rdbtn_no, new org.netbeans.lib.awtextra.AbsoluteConstraints(445, 420, -1, -1));

        Serial_Number.setForeground(new java.awt.Color(255, 127, 80));
        Serial_Number.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Serial_NumberActionPerformed(evt);
            }
        });
        add(Serial_Number, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 88, -1, -1));

        btn_show.setForeground(new java.awt.Color(255, 127, 80));
        btn_show.setText("Show");
        btn_show.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_showActionPerformed(evt);
            }
        });
        add(btn_show, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 138, -1, -1));

        btn_update.setForeground(new java.awt.Color(255, 127, 80));
        btn_update.setText("Update");
        btn_update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_updateActionPerformed(evt);
            }
        });
        add(btn_update, new org.netbeans.lib.awtextra.AbsoluteConstraints(632, 138, -1, -1));

        btnDummyList.setForeground(new java.awt.Color(255, 127, 80));
        btnDummyList.setText("Dummy List");
        btnDummyList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDummyListActionPerformed(evt);
            }
        });
        add(btnDummyList, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 200, -1, -1));

        lblSeats.setBackground(new java.awt.Color(0, 0, 139));
        lblSeats.setFont(new java.awt.Font("Lucida Grande", 3, 13)); // NOI18N
        lblSeats.setForeground(new java.awt.Color(255, 127, 80));
        lblSeats.setText("Seats:");
        add(lblSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 466, -1, -1));

        txtSeats.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtSeatsActionPerformed(evt);
            }
        });
        add(txtSeats, new org.netbeans.lib.awtextra.AbsoluteConstraints(379, 461, 100, -1));

        buttonGroup10.add(rdbtnMCYes);
        rdbtnMCYes.setForeground(new java.awt.Color(255, 127, 80));
        rdbtnMCYes.setText("Yes");
        add(rdbtnMCYes, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 380, -1, -1));

        buttonGroup10.add(rdbtnMCNo);
        rdbtnMCNo.setForeground(new java.awt.Color(255, 127, 80));
        rdbtnMCNo.setText("No");
        rdbtnMCNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rdbtnMCNoActionPerformed(evt);
            }
        });
        add(rdbtnMCNo, new org.netbeans.lib.awtextra.AbsoluteConstraints(439, 379, -1, -1));
        add(time, new org.netbeans.lib.awtextra.AbsoluteConstraints(537, 517, 197, 21));

        jLabel1.setForeground(new java.awt.Color(255, 127, 80));
        jLabel1.setText("Last Updated Time");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 522, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void btn_saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_saveActionPerformed
        // TODO add your handling code here:
        
        
         DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
         LocalDateTime now = LocalDateTime.now();  
         time.setText(dtf.format(now)); 

        for (int i=0; i<Car_directory.size(); i++) {
            
            String X[] = Car_directory.get(i);
            
            if (X[3].equals(txt_serial_no.getText())) {
                
              JOptionPane.showMessageDialog(this, "Please enter a valid serial number");  
               
              return;
             
            }
        }
         
         if ((Integer.parseInt(txt_manf_year.getText()) > 2023 ) || (Integer.parseInt(txt_manf_year.getText()) < 1850 )) {
            
              JOptionPane.showMessageDialog(this, "Please enter a valid manufacturing year");
        }
          else if ((Integer.parseInt(txt_entry_date.getText()) > 7 ) || (Integer.parseInt(txt_entry_date.getText()) < 1 )) {
              
              JOptionPane.showMessageDialog(this, "Please enter only the number of Drive Train (2,4,6)");
          }
            
            else if ((Integer.parseInt(txtSeats.getText()) > 10 ) || (Integer.parseInt(txtSeats.getText()) < 1 )) {
              
              JOptionPane.showMessageDialog(this, "Please enter a valid number of seats");
          }
            
            else{
            add_details();
            Serial_Number.addItem(txt_serial_no.getText());
        
             JOptionPane.showMessageDialog(this, "Car details have been saved");
            
             emptyfields();
        
            }
            
          
//            if (txt_manf_year.getText() "2023")
        

        
        
       
        
    }//GEN-LAST:event_btn_saveActionPerformed

    private void Serial_NumberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Serial_NumberActionPerformed
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_Serial_NumberActionPerformed

    private void btn_showActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_showActionPerformed
        // TODO add your handling code here:
        
        for (int i=0; i<Car_directory.size(); i++) {
            
            
            String S[] = Car_directory.get(i);
            if(Serial_Number.getSelectedItem().equals(S[3])){
                
        txt_Car_comp.setText(S[0]);
        txt_Car_mod.setText(S[1]);
        txt_manf_year.setText(S[2]);
        txt_serial_no.setText(S[3]);
        txt_location.setText(S[4]);
        txt_entry_date.setText(S[5]);
        
        if (S[6].equals("true")){
            rdbtnMCYes.setSelected(true);
        }
        else{
        rdbtnMCNo.setSelected(true);
                
            }
        
        if (S[7].equals("true")){
            rdbtn_yes.setSelected(true);
        }
        else{
        rdbtn_no.setSelected(true);
                
            }}
        txtSeats.setText(S[8]);
        } 
    }//GEN-LAST:event_btn_showActionPerformed

    private void btn_updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_updateActionPerformed
        // TODO add your handling code here:
        
        
        
        for (int i=0; i<Car_directory.size(); i++) {
            
            String Z[] = Car_directory.get(i);
            
            if (Z[3].equals(txt_serial_no.getText())){
                
                Car_directory.remove(i);
              
                add_details();
                
                
                
            }
        }
        emptyfields();
    }//GEN-LAST:event_btn_updateActionPerformed

    private void btnDummyListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDummyListActionPerformed
        // TODO add your handling code here:
        dummylist();
    }//GEN-LAST:event_btnDummyListActionPerformed

    private void txtSeatsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSeatsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtSeatsActionPerformed

    private void rdbtnMCNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rdbtnMCNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_rdbtnMCNoActionPerformed

    private void txt_Car_compActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_Car_compActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_Car_compActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> Serial_Number;
    private javax.swing.JButton btnDummyList;
    private javax.swing.JButton btn_save;
    private javax.swing.JButton btn_show;
    private javax.swing.JButton btn_update;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lblHeading;
    private javax.swing.JLabel lblSeats;
    private javax.swing.JLabel lbl_Car_comp;
    private javax.swing.JLabel lbl_Car_mod;
    private javax.swing.JLabel lbl_Entry_date;
    private javax.swing.JLabel lbl_avai;
    private javax.swing.JLabel lbl_location;
    private javax.swing.JLabel lbl_maint_certi_date;
    private javax.swing.JLabel lbl_manf_year;
    private javax.swing.JLabel lbl_serial_no;
    private javax.swing.JRadioButton rdbtnMCNo;
    private javax.swing.JRadioButton rdbtnMCYes;
    private javax.swing.JRadioButton rdbtn_no;
    private javax.swing.JRadioButton rdbtn_yes;
    private javax.swing.JLabel time;
    private javax.swing.JTextField txtSeats;
    private javax.swing.JTextField txt_Car_comp;
    private javax.swing.JTextField txt_Car_mod;
    private javax.swing.JTextField txt_entry_date;
    private javax.swing.JTextField txt_location;
    private javax.swing.JTextField txt_manf_year;
    private javax.swing.JTextField txt_serial_no;
    // End of variables declaration//GEN-END:variables
}
