/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelroomreservationsystem.view.panal;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import lk.ijse.gdse43.hotelreservationsystem.Controller.ReservationController;
import lk.ijse.gdse43.hotelreservationsystem.Controller.RoomController;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;

/**
 *
 * @author user
 */
public class SerchRoom extends javax.swing.JPanel {
    String in;
    String out;
    

    /**
     * Creates new form SerchRoom
     */
    public SerchRoom() {
        //initComponents();
        reservation();
    }

    SerchRoom(String formateDateIn, String formatDateOut) {
        initComponents();
        this.in=formateDateIn;
        this.out=formatDateOut;
        reservation();
        txtCheckIn.setText(in);
        txtCheckout.setText(out);
        
    }
    public void reservation(){
  
        try {
            ArrayList<ReservationDTO> roomList = ReservationController.getRserveRoom(in, out);
            DefaultTableModel dtm=(DefaultTableModel) table.getModel();
            dtm.setRowCount(0);
            for(ReservationDTO c1 : roomList){
     
            
            try {
                RoomDTO r1=RoomController.search(c1.getRoom_id());
             
                Object[]row={r1.getRoom_id(),r1.getRoomType_Id(),r1.getRoom_name(),r1.getPrice(),};
                dtm.addRow(row);
            } catch (Exception ex) {
                Logger.getLogger(SerchRoom.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
            int x=dtm.getRowCount();
            if(x==0){
                JOptionPane.showMessageDialog(this,"All rooms are reserved");
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
   // @SuppressWarnings("unchecked")
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlMain = new javax.swing.JPanel();
        labelsearchavilableroom = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        txtCheckIn = new javax.swing.JTextField();
        txtCheckout = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setPreferredSize(new java.awt.Dimension(1630, 920));

        labelsearchavilableroom.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        labelsearchavilableroom.setForeground(new java.awt.Color(255, 51, 51));
        labelsearchavilableroom.setText("Search Available Room");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Room Id", "Room Type Id", "Room_Name", "Price"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        txtCheckIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckInActionPerformed(evt);
            }
        });

        txtCheckout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCheckoutActionPerformed(evt);
            }
        });

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(51, 51, 255));
        jTextField1.setText("Check_Out");

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField2.setForeground(new java.awt.Color(51, 51, 255));
        jTextField2.setText("Check_In");

        javax.swing.GroupLayout pnlMainLayout = new javax.swing.GroupLayout(pnlMain);
        pnlMain.setLayout(pnlMainLayout);
        pnlMainLayout.setHorizontalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(381, 381, 381)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 920, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlMainLayout.createSequentialGroup()
                        .addGap(238, 238, 238)
                        .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlMainLayout.createSequentialGroup()
                                .addComponent(txtCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(50, 50, 50)
                                .addComponent(txtCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(labelsearchavilableroom, javax.swing.GroupLayout.PREFERRED_SIZE, 436, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        pnlMainLayout.setVerticalGroup(
            pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMainLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(labelsearchavilableroom)
                .addGap(72, 72, 72)
                .addGroup(pnlMainLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtCheckIn, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtCheckout, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(412, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMain, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
       
       DefaultTableModel dtm=(DefaultTableModel) table.getModel();
       String checkin=txtCheckIn.getText();
       String checkout=txtCheckout.getText();
       String roomId=(String) table.getValueAt(table.getSelectedRow(),0);
       double price=(double) table.getValueAt(table.getSelectedRow(),3);
       RoomReseve s1=new RoomReseve(checkin,checkout,roomId,price);
      
           s1.setSize(pnlMain.getSize());
           pnlMain.removeAll();
           pnlMain.add(s1);
           pnlMain.repaint();
           pnlMain.revalidate();
    }//GEN-LAST:event_tableMouseClicked

    private void txtCheckoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckoutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckoutActionPerformed

    private void txtCheckInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCheckInActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCheckInActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JLabel labelsearchavilableroom;
    private javax.swing.JPanel pnlMain;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtCheckIn;
    private javax.swing.JTextField txtCheckout;
    // End of variables declaration//GEN-END:variables

}


