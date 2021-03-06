/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelroomreservationsystem.view.panal;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gdse43.hotelreservationsystem.Controller.GuestController;
import lk.ijse.gdse43.hotelreservationsystem.Controller.QueryController;
import lk.ijse.gdse43.hotelreservationsystem.Controller.ReservationController;
import lk.ijse.gdse43.hotelreservationsystem.Controller.RoomController;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.CustomeDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;

/**
 *
 * @author user
 */
public class ModifyRoomReservation extends javax.swing.JPanel {
    //String in;
    //String out;

    /**
     * Creates new form ModifyRoomReservation
     */
    public ModifyRoomReservation() {
        initComponents();

        btn_search.requestFocus();

        getAllIds();

    }

    private void reservation() {

        SimpleDateFormat d1 = new SimpleDateFormat("YYYY-MM-dd");
        String chckin = d1.format(Check_In.getDate());

        SimpleDateFormat d2 = new SimpleDateFormat("YYYY-MM-dd");
        String chckout = d2.format(Check_Out.getDate());

        try {

            ArrayList<ReservationDTO> roomList = ReservationController.getRserveRoom(chckin, chckout);
            DefaultTableModel dtm = (DefaultTableModel) amila.getModel();
            dtm.setRowCount(0);
            for (ReservationDTO c1 : roomList) {

                try {
                    RoomDTO r1 = RoomController.search(c1.getRoom_id());

                    Object[] row = {r1.getRoom_id(), r1.getRoomType_Id(), r1.getRoom_name(), r1.getPrice(),};
                    dtm.addRow(row);
                } catch (Exception ex) {
                    Logger.getLogger(SerchRoom.class.getName()).log(Level.SEVERE, null, ex);
                }
                System.out.println("");

            }
            int x = dtm.getRowCount();
            if (x == 0) {
                JOptionPane.showMessageDialog(this, "All rooms are reserved");
            }
        } catch (Exception ex) {
            Logger.getLogger(SerchRoom.class.getName()).log(Level.SEVERE, null, ex);
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

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        labelguestid = new javax.swing.JLabel();
        NIC_Number = new javax.swing.JLabel();
        labelprice = new javax.swing.JLabel();
        labelroomid = new javax.swing.JLabel();
        labelchecin = new javax.swing.JLabel();
        labelcheckout = new javax.swing.JLabel();
        Text_roomPrice = new javax.swing.JTextField();
        textguestid = new javax.swing.JTextField();
        Text_NewAomunt = new javax.swing.JTextField();
        labeldelete = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        amila = new javax.swing.JTable();
        btn1reload = new javax.swing.JButton();
        labelmodifyroomreservation = new javax.swing.JLabel();
        labelreservationtable = new javax.swing.JLabel();
        labelupdate1 = new javax.swing.JButton();
        btnnewpayment = new javax.swing.JButton();
        Check_Out = new org.jdesktop.swingx.JXDatePicker();
        Check_In = new org.jdesktop.swingx.JXDatePicker();
        labelprice1 = new javax.swing.JLabel();
        Text_OldAmount = new javax.swing.JTextField();
        labelreservartionid1 = new javax.swing.JLabel();
        combo_Reservation = new javax.swing.JComboBox<>();
        btn_search = new javax.swing.JButton();
        labelroomid1 = new javax.swing.JLabel();
        textroomid1 = new javax.swing.JTextField();
        combo_nic = new javax.swing.JComboBox<>();
        labelreservartionid2 = new javax.swing.JLabel();
        Text_PaymentId = new javax.swing.JTextField();

        labelguestid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelguestid.setForeground(new java.awt.Color(102, 102, 255));
        labelguestid.setText("Guest Id");

        NIC_Number.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        NIC_Number.setForeground(new java.awt.Color(102, 102, 255));
        NIC_Number.setText("NIC_Number");

        labelprice.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelprice.setForeground(new java.awt.Color(102, 102, 255));
        labelprice.setText("New Amount");

        labelroomid.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelroomid.setForeground(new java.awt.Color(102, 102, 255));
        labelroomid.setText("Room price");

        labelchecin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelchecin.setForeground(new java.awt.Color(102, 102, 255));
        labelchecin.setText("Check_In");

        labelcheckout.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelcheckout.setForeground(new java.awt.Color(102, 102, 255));
        labelcheckout.setText("Check_Out");

        Text_roomPrice.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Text_roomPriceActionPerformed(evt);
            }
        });

        labeldelete.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labeldelete.setForeground(new java.awt.Color(102, 102, 255));
        labeldelete.setText("Delete");

        amila.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "RID", "RoomType_Id", "Room_Name", "Price"
            }
        ));
        jScrollPane1.setViewportView(amila);

        btn1reload.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn1reload.setForeground(new java.awt.Color(102, 102, 255));
        btn1reload.setText("Reload");
        btn1reload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1reloadActionPerformed(evt);
            }
        });

        labelmodifyroomreservation.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelmodifyroomreservation.setForeground(new java.awt.Color(255, 102, 102));
        labelmodifyroomreservation.setText("Modify Room Reservation");

        labelreservationtable.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelreservationtable.setForeground(new java.awt.Color(0, 153, 153));
        labelreservationtable.setText("   Room Table");

        labelupdate1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelupdate1.setForeground(new java.awt.Color(102, 102, 255));
        labelupdate1.setText("Update");

        btnnewpayment.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btnnewpayment.setForeground(new java.awt.Color(102, 102, 255));
        btnnewpayment.setText("New Payment");
        btnnewpayment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnnewpaymentActionPerformed(evt);
            }
        });

        labelprice1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelprice1.setForeground(new java.awt.Color(102, 102, 255));
        labelprice1.setText("Old Amount");

        labelreservartionid1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelreservartionid1.setForeground(new java.awt.Color(102, 102, 255));
        labelreservartionid1.setText("Payment_Id");

        btn_search.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        btn_search.setForeground(new java.awt.Color(102, 102, 255));
        btn_search.setText("Search Room");
        btn_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_searchMouseClicked(evt);
            }
        });
        btn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_searchActionPerformed(evt);
            }
        });

        labelroomid1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelroomid1.setForeground(new java.awt.Color(102, 102, 255));
        labelroomid1.setText("Room Id");

        textroomid1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textroomid1ActionPerformed(evt);
            }
        });

        combo_nic.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                combo_nicItemStateChanged(evt);
            }
        });
        combo_nic.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                combo_nicMouseClicked(evt);
            }
        });
        combo_nic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_nicActionPerformed(evt);
            }
        });

        labelreservartionid2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        labelreservartionid2.setForeground(new java.awt.Color(102, 102, 255));
        labelreservartionid2.setText("Reservation Id");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(505, 505, 505)
                        .addComponent(labelmodifyroomreservation, javax.swing.GroupLayout.PREFERRED_SIZE, 475, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(labelguestid, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelreservartionid1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelroomid1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelreservartionid2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(30, 30, 30)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(textguestid, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                        .addComponent(combo_Reservation, 0, 215, Short.MAX_VALUE))
                                    .addComponent(Text_PaymentId)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(NIC_Number, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(combo_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(labelprice1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(labelprice, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(Text_OldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Text_NewAomunt, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(Text_roomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(textroomid1, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addComponent(labelroomid, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 261, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(labelchecin, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Check_In, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(labelcheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(Check_Out, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(labelreservationtable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn_search, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(204, 204, 204)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 752, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGap(300, 300, 300)
                                        .addComponent(btn1reload)))))))
                .addContainerGap(70, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(155, 155, 155)
                .addComponent(labelupdate1)
                .addGap(30, 30, 30)
                .addComponent(labeldelete)
                .addGap(18, 18, 18)
                .addComponent(btnnewpayment)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelmodifyroomreservation)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(71, 71, 71)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelchecin)
                            .addComponent(Check_In, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(NIC_Number)
                            .addComponent(combo_nic, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Check_Out, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelcheckout))
                                .addGap(114, 114, 114)
                                .addComponent(labelreservationtable, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn1reload))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelreservartionid1, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(Text_PaymentId, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(combo_Reservation, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelreservartionid2, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(textguestid, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(labelguestid))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelroomid1)
                                    .addComponent(textroomid1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(61, 61, 61)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(labelroomid)
                                    .addComponent(Text_roomPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(69, 69, 69)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(Text_OldAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(82, 82, 82)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                            .addComponent(Text_NewAomunt, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(labelprice)))
                                    .addComponent(labelprice1)))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(236, 236, 236)
                        .addComponent(btn_search)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelupdate1)
                    .addComponent(labeldelete)
                    .addComponent(btnnewpayment))
                .addGap(62, 62, 62))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnnewpaymentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewpaymentActionPerformed
        afterroomreservationnewpayment a1 = new afterroomreservationnewpayment();
        a1.setSize(jPanel1.getSize());
        jPanel2.removeAll();
        jPanel2.add(a1);
        jPanel2.repaint();
        jPanel2.revalidate();
    }//GEN-LAST:event_btnnewpaymentActionPerformed

    private void btn1reloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1reloadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn1reloadActionPerformed

    private void btn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_searchActionPerformed
        Date checkin = Check_In.getDate();
        Date checkout = Check_Out.getDate();
        if (checkin == null || checkout == null) {
            JOptionPane.showMessageDialog(null, "Please Enter Check_In Date  &  Check_Out Date ", "Error", JOptionPane.WARNING_MESSAGE);
        } else {
            Date in = Check_In.getDate();
            SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
            String format = df.format(in);

            Date out = Check_Out.getDate();
            SimpleDateFormat dfe = new SimpleDateFormat("yyyy-MM-dd");
            String formatdate = dfe.format(out);
        }// TODO add your handling code here:
    }//GEN-LAST:event_btn_searchActionPerformed

    private void Text_roomPriceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Text_roomPriceActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Text_roomPriceActionPerformed

    private void btn_searchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_searchMouseClicked

        reservation();

    }//GEN-LAST:event_btn_searchMouseClicked

    private void textroomid1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textroomid1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textroomid1ActionPerformed

    private void combo_nicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_nicActionPerformed
        try {
            String id = combo_nic.getSelectedItem().toString();
            if (id == null) {

            } else {
                CustomeDTO cust = QueryController.getAllReservationDetails(id);

                if (cust == null) {

                } else {
                    System.out.println(cust);
                    Text_PaymentId.setText(cust.getPaymnet1());
                    combo_Reservation.setSelectedItem(cust.getRSid1());
                    textguestid.setText(cust.getGeustId1());
                    textroomid1.setText(cust.getRID1());
                    Text_roomPrice.setText(cust.getPrice1());
                    Text_OldAmount.setText(cust.getAmount1());

                }

            }
        } catch (Exception ex) {
            Logger.getLogger(ModifyRoomReservation.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_combo_nicActionPerformed

    private void combo_nicMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_combo_nicMouseClicked
        combo_Reservation.requestFocus();
    }//GEN-LAST:event_combo_nicMouseClicked

    private void combo_nicItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_combo_nicItemStateChanged
        combo_Reservation.removeAllItems();
        try {
            String id = combo_nic.getSelectedItem().toString();

            ArrayList<CustomeDTO> res = QueryController.search(id);
            for (CustomeDTO re : res) {
                combo_Reservation.addItem(re.getReservationID());

            }

            //searchPrice();
            /* combo_Payment.setSelectedItem(res.getgID());
            txtRoom.setText(res.getrID());
            oldRid = res.getrID();
            txtIN.setText(res.getCheck_In());
            txtOUT.setText(res.getCheck_Out());
            comboPerson.setSelectedItem(res.getPersons());
            //txtPersons.setText(res.getPersons() + "");
            txtOldPrice.setText(res.getPrice() + "");
            txtNewPrice.setText(res.getPrice() + "");
            txtDesription.setText("****");
            txtPrice.setText("****");
            dateCountReserve();
            icon();
            saveData();*/
        } catch (Exception ex) {
            Logger.getLogger(ModifyRoomReservation.class.getName()).log(Level.SEVERE, null, ex);
        }


    }//GEN-LAST:event_combo_nicItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.jdesktop.swingx.JXDatePicker Check_In;
    private org.jdesktop.swingx.JXDatePicker Check_Out;
    private javax.swing.JLabel NIC_Number;
    private javax.swing.JTextField Text_NewAomunt;
    private javax.swing.JTextField Text_OldAmount;
    private javax.swing.JTextField Text_PaymentId;
    private javax.swing.JTextField Text_roomPrice;
    private javax.swing.JTable amila;
    private javax.swing.JButton btn1reload;
    private javax.swing.JButton btn_search;
    private javax.swing.JButton btnnewpayment;
    private javax.swing.JComboBox<String> combo_Reservation;
    private javax.swing.JComboBox<String> combo_nic;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelchecin;
    private javax.swing.JLabel labelcheckout;
    private javax.swing.JButton labeldelete;
    private javax.swing.JLabel labelguestid;
    private javax.swing.JLabel labelmodifyroomreservation;
    private javax.swing.JLabel labelprice;
    private javax.swing.JLabel labelprice1;
    private javax.swing.JLabel labelreservartionid1;
    private javax.swing.JLabel labelreservartionid2;
    private javax.swing.JLabel labelreservationtable;
    private javax.swing.JLabel labelroomid;
    private javax.swing.JLabel labelroomid1;
    private javax.swing.JButton labelupdate1;
    private javax.swing.JTextField textguestid;
    private javax.swing.JTextField textroomid1;
    // End of variables declaration//GEN-END:variables

    private void getAllIds() {
        try {
            ArrayList<String> NicNumber = GuestController.getAllIdNumbers();
            for (String nic : NicNumber) {
                combo_nic.addItem(nic);

            }
        } catch (Exception ex) {
            Logger.getLogger(ModifyRoomReservation.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
