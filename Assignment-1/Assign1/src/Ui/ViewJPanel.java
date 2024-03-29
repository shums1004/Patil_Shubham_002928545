/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

package Ui;

import java.awt.Image;
import java.io.File;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import model.Car;
import model.CarHistory;

/**
 *
 * @author shubhampatil
 */
public class ViewJPanel extends javax.swing.JPanel {
    
    CarHistory history;

    /** Creates new form ViewJPanel */
    public ViewJPanel(CarHistory history) {
        initComponents();
        this.history = history;
        
        populateTable();
        
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Title = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCarProfile = new javax.swing.JTable();
        btnView = new javax.swing.JButton();
        btnDelete = new javax.swing.JButton();
        labelSeats_no = new javax.swing.JLabel();
        labelOwner_name = new javax.swing.JLabel();
        labelOwner_tele_no = new javax.swing.JLabel();
        labelOwner_email_add = new javax.swing.JLabel();
        labelOwner_driv_lic = new javax.swing.JLabel();
        labelOwner_SSN = new javax.swing.JLabel();
        labelOwner_addr = new javax.swing.JLabel();
        labelService_rec = new javax.swing.JLabel();
        labelWarranty_year = new javax.swing.JLabel();
        textYear = new javax.swing.JTextField();
        textSeats_no = new javax.swing.JTextField();
        textOwner_name = new javax.swing.JTextField();
        textOwner_tele_no = new javax.swing.JTextField();
        textOwner_email_add = new javax.swing.JTextField();
        textOwner_driv_lic = new javax.swing.JTextField();
        labelEngine_no = new javax.swing.JLabel();
        textEngine_no = new javax.swing.JTextField();
        labelBrand = new javax.swing.JLabel();
        labelModel = new javax.swing.JLabel();
        labelColour = new javax.swing.JLabel();
        labelYear = new javax.swing.JLabel();
        textBrand = new javax.swing.JTextField();
        textModel = new javax.swing.JTextField();
        textColour = new javax.swing.JTextField();
        textOwner_SSN = new javax.swing.JTextField();
        textOwner_addr = new javax.swing.JTextField();
        labelLicense_plate = new javax.swing.JLabel();
        textService_rec = new javax.swing.JTextField();
        textLicense_plate = new javax.swing.JTextField();
        textWarranty_year = new javax.swing.JTextField();
        labelPhoto = new javax.swing.JLabel();
        ChoosePhoto = new javax.swing.JButton();

        Title.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Title.setText("VIEW CAR PROFILE");

        tblCarProfile.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Brand", "Model", "License Plate", "Owner Driver License", "Service Records"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblCarProfile);

        btnView.setText("View Car Details");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        btnDelete.setText("Delete");
        btnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteActionPerformed(evt);
            }
        });

        labelSeats_no.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelSeats_no.setText("Seats Number:");

        labelOwner_name.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOwner_name.setText("Owner Name:");

        labelOwner_tele_no.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOwner_tele_no.setText("Owner Telephone Number:");

        labelOwner_email_add.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOwner_email_add.setText("Owner Email Addresses:");

        labelOwner_driv_lic.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOwner_driv_lic.setText("Owner Driver License:");

        labelOwner_SSN.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOwner_SSN.setText("Owner Social Security Number:");

        labelOwner_addr.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelOwner_addr.setText("Owner Addresses:");

        labelWarranty_year.setText("Warranty Year:");

        textYear.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textYear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textYearActionPerformed(evt);
            }
        });

        textSeats_no.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textSeats_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textSeats_noActionPerformed(evt);
            }
        });

        textOwner_name.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textOwner_name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textOwner_nameActionPerformed(evt);
            }
        });

        textOwner_tele_no.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        textOwner_email_add.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        textOwner_driv_lic.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        labelEngine_no.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelEngine_no.setText("Engine Number:");

        textEngine_no.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textEngine_no.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textEngine_noActionPerformed(evt);
            }
        });

        labelBrand.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelBrand.setText("Brand:");

        labelModel.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelModel.setText("Model:");

        labelColour.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelColour.setText("Colour:");

        labelYear.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelYear.setText("Year:");

        textBrand.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textBrand.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textBrandActionPerformed(evt);
            }
        });

        textModel.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textModel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textModelActionPerformed(evt);
            }
        });

        textColour.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textColour.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textColourActionPerformed(evt);
            }
        });

        textOwner_SSN.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        textOwner_addr.setHorizontalAlignment(javax.swing.JTextField.LEFT);

        labelLicense_plate.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        labelLicense_plate.setText("License_plate:");

        textLicense_plate.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        textLicense_plate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textLicense_plateActionPerformed(evt);
            }
        });

        ChoosePhoto.setText("Choose Photo");
        ChoosePhoto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChoosePhotoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(141, 141, 141)
                .addComponent(Title, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChoosePhoto)
                .addGap(43, 43, 43)
                .addComponent(btnView)
                .addGap(32, 32, 32)
                .addComponent(btnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93))
            .addGroup(layout.createSequentialGroup()
                .addGap(152, 152, 152)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 859, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(labelModel, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelColour, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelYear, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(labelEngine_no)
                            .addComponent(labelLicense_plate)
                            .addComponent(labelSeats_no)
                            .addComponent(labelOwner_name)
                            .addComponent(labelOwner_tele_no)
                            .addComponent(labelOwner_email_add)
                            .addComponent(labelOwner_driv_lic)
                            .addComponent(labelOwner_SSN)
                            .addComponent(labelOwner_addr)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(labelWarranty_year)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(labelService_rec, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(187, 187, 187)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(textModel)
                            .addComponent(textColour)
                            .addComponent(textYear)
                            .addComponent(textEngine_no)
                            .addComponent(textLicense_plate)
                            .addComponent(textSeats_no)
                            .addComponent(textOwner_name)
                            .addComponent(textOwner_tele_no, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textOwner_email_add)
                            .addComponent(textOwner_driv_lic)
                            .addComponent(textOwner_SSN, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textOwner_addr, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(textService_rec)
                            .addComponent(textWarranty_year)
                            .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(30, 30, 30)
                        .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 568, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 41, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(35, 35, 35)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnView)
                    .addComponent(btnDelete)
                    .addComponent(ChoosePhoto))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelBrand, javax.swing.GroupLayout.DEFAULT_SIZE, 27, Short.MAX_VALUE)
                    .addComponent(textBrand, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelModel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textModel))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelColour, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textColour))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelYear, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textYear))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelEngine_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textEngine_no))
                                        .addGap(23, 23, 23)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelSeats_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textSeats_no))
                                        .addGap(14, 14, 14)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelLicense_plate, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textLicense_plate))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelOwner_name, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textOwner_name))
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(labelOwner_tele_no, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(textOwner_tele_no))
                                        .addGap(17, 17, 17))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(9, 9, 9)
                                        .addComponent(labelPhoto, javax.swing.GroupLayout.PREFERRED_SIZE, 327, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelOwner_email_add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textOwner_email_add))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelOwner_driv_lic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textOwner_driv_lic))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelOwner_SSN, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textOwner_SSN))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelOwner_addr, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(textOwner_addr))
                                .addGap(18, 18, 18)
                                .addComponent(labelService_rec))
                            .addComponent(textService_rec, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(672, 672, 672))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(510, 510, 510)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelWarranty_year)
                            .addComponent(textWarranty_year, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteActionPerformed
        // TODO add your handling code here:
        
        int selectedRowIndex = tblCarProfile.getSelectedRow();
        
        if (selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a row to delete");
            return;   
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCarProfile.getModel();
        Car selectedCars = (Car) model.getValueAt(selectedRowIndex, 0);
        
        history.deleteCars(selectedCars);
        
        JOptionPane.showMessageDialog(this, "Cars deleted");
        
        populateTable(); 

    }//GEN-LAST:event_btnDeleteActionPerformed

    private void textYearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textYearActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textYearActionPerformed

    private void textSeats_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textSeats_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textSeats_noActionPerformed

    private void textOwner_nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textOwner_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textOwner_nameActionPerformed

    private void textEngine_noActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textEngine_noActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textEngine_noActionPerformed

    private void textBrandActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textBrandActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textBrandActionPerformed

    private void textModelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textModelActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textModelActionPerformed

    private void textColourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textColourActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textColourActionPerformed

    private void textLicense_plateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textLicense_plateActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textLicense_plateActionPerformed

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        
         int selectedRowIndex = tblCarProfile.getSelectedRow();
         int selectedColIndex = tblCarProfile.getSelectedColumn();
        
        if (selectedRowIndex<0) {
            
            JOptionPane.showMessageDialog(this, "Please select a row to view");
            return;   
        }
        
        DefaultTableModel model = (DefaultTableModel) tblCarProfile.getModel();
        ArrayList<Car> cr = history.getHistory();
        
        String brand = (String)model.getValueAt(selectedRowIndex, 0);
        String modelTable = (String)model.getValueAt(selectedRowIndex, 1);
        String Licence_plate = (String)model.getValueAt(selectedRowIndex, 2);
        
        String ownLicNo = (String)model.getValueAt(selectedRowIndex, 3);
        String service_rec = (String)model.getValueAt(selectedRowIndex, 4);
        Car car1 = cr.get(selectedRowIndex);


        textBrand.setText(car1.getBrand());
        textModel.setText(car1.getModel());
        textColour.setText(car1.getColour()); 
        textYear.setText(String.valueOf(car1.getYear()));
        textEngine_no.setText(String.valueOf(car1.getEngine_no()));
        textSeats_no.setText(String.valueOf(car1.getSeats_no()));
        textLicense_plate.setText(car1.getLicense_plate());
        textOwner_name.setText(car1.getOwner_name());
        textOwner_tele_no.setText(car1.getOwner_tele_no());
        textOwner_email_add.setText(car1.getOwner_email_add());
        textOwner_driv_lic.setText(car1.getOwner_driv_lic());
        textOwner_SSN.setText(car1.getOwner_SSN());
        textOwner_addr.setText(car1.getOwner_addr());
        //textService_rec.setText(car1.getService_rec());
        textWarranty_year.setText(String.valueOf(car1.getWarranty_year()));
        

        
    }//GEN-LAST:event_btnViewActionPerformed

    private void ChoosePhotoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ChoosePhotoActionPerformed
        // TODO add your handling code here:
                JFileChooser photo = new JFileChooser();
        photo.setCurrentDirectory (new File (System.getProperty("user.home") ) ) ;
        FileNameExtensionFilter extention = new FileNameExtensionFilter("*.Images","jpg", "gif", "png");
        photo.addChoosableFileFilter (extention) ;
        int result = photo. showSaveDialog (null) ;
        if (result == JFileChooser. APPROVE_OPTION) {
           File selectedFile = photo.getSelectedFile () ;
            String path = selectedFile.getAbsolutePath();
            //label.photo.setIcon (ResizeImage (path) ) ;
            
        
        ImageIcon icon = new ImageIcon(path);
        Image D = icon.getImage();
        Image M = D.getScaledInstance(labelPhoto.getWidth(), labelPhoto.getHeight(), Image.SCALE_SMOOTH);
        icon = new ImageIcon(M);
        labelPhoto.setIcon(icon);
    }//GEN-LAST:event_ChoosePhotoActionPerformed
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ChoosePhoto;
    private javax.swing.JLabel Title;
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelBrand;
    private javax.swing.JLabel labelColour;
    private javax.swing.JLabel labelEngine_no;
    private javax.swing.JLabel labelLicense_plate;
    private javax.swing.JLabel labelModel;
    private javax.swing.JLabel labelOwner_SSN;
    private javax.swing.JLabel labelOwner_addr;
    private javax.swing.JLabel labelOwner_driv_lic;
    private javax.swing.JLabel labelOwner_email_add;
    private javax.swing.JLabel labelOwner_name;
    private javax.swing.JLabel labelOwner_tele_no;
    private javax.swing.JLabel labelPhoto;
    private javax.swing.JLabel labelSeats_no;
    private javax.swing.JLabel labelService_rec;
    private javax.swing.JLabel labelWarranty_year;
    private javax.swing.JLabel labelYear;
    private javax.swing.JTable tblCarProfile;
    private javax.swing.JTextField textBrand;
    private javax.swing.JTextField textColour;
    private javax.swing.JTextField textEngine_no;
    private javax.swing.JTextField textLicense_plate;
    private javax.swing.JTextField textModel;
    private javax.swing.JTextField textOwner_SSN;
    private javax.swing.JTextField textOwner_addr;
    private javax.swing.JTextField textOwner_driv_lic;
    private javax.swing.JTextField textOwner_email_add;
    private javax.swing.JTextField textOwner_name;
    private javax.swing.JTextField textOwner_tele_no;
    private javax.swing.JTextField textSeats_no;
    private javax.swing.JTextField textService_rec;
    private javax.swing.JTextField textWarranty_year;
    private javax.swing.JTextField textYear;
    // End of variables declaration//GEN-END:variables

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblCarProfile.getModel();
        model.setRowCount(0);
        
        for (Car cr : history.getHistory()){
            
            Object[] row = new Object [5];
          
            row[0] = cr.getBrand();
            row[1] = cr.getModel();
            row[2] = cr.getLicense_plate();
            row[3] = cr.getOwner_driv_lic();
            row[4] = cr.getService_rec();
            
            model.addRow(row);
            
        }
            
            
                
   
            
            
            
    }
    

}
