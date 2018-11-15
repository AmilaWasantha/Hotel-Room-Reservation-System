/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.CustomeDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.QueryDAO;

/**
 *
 * @author user
 */
public class QueryDAOImpl implements QueryDAO {

    @Override
    public boolean add(CustomeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean update(CustomeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(CustomeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public CustomeDTO search(CustomeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<CustomeDTO> getAll() throws Exception {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

        /* Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("SELECT  payment.RsID,reservation.Guest_Id,reservation.RID,payment.Date,payment.Amount,payment.Advance\n" +"FROM payment INNER JOIN reservation ON reservation.RsID=payment.RsID\n" +"WHERE payment.Payment_Id='6756';");
    
        ArrayList<CustomeDTO>custom=new ArrayList<>();
        if(rst.next()){
            CustomeDTO cust=new CustomeDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),Double.parseDouble(rst.getString(6)),Double.parseDouble(rst.getString(7)));
            custom.add(cust);
            return custom;
        }else{
            return false;
        }*/
    }

    @Override
    public CustomeDTO getAllDeatil(String id) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("SELECT  payment.RsID,reservation.Guest_Id,reservation.RID,payment.Date,payment.Amount,payment.Advance\n" + "FROM payment INNER JOIN reservation ON reservation.RsID=payment.RsID\n" + "WHERE payment.Payment_Id='" + id + "'");
        if (rst.next()) {
            CustomeDTO cust = new CustomeDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), Double.parseDouble(rst.getString(5)), Double.parseDouble(rst.getString(6)));
            return cust;
        } else {
            return null;
        }

    }

    @Override
    public CustomeDTO searchRoomTypeDetail(String id) throws Exception {
        CustomeDTO cust = null;

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("select room.roomtype_id,roomtype.roomtype,roomtype. Discription,room.Room_Name,room.price  from room INNER JOIN roomtype ON roomtype.roomtype_id=room.roomtype_id where room.RID='" + id + "';");
        while (rst.next()) {

            cust=new CustomeDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),Double.parseDouble(rst.getString(5)));

        }

        return cust;
    }

    @Override
    public ArrayList<CustomeDTO> search(String id) throws IOException, SQLException {
        
            Connection connection=DBConnection.getInstance().getConnection();
            Statement stm=connection.createStatement();
            ResultSet rst=stm.executeQuery("select reservation.RsID from reservation INNER JOIN guest ON guest.Guest_Id=reservation.Guest_Id where guest.ID_Number='"+id+"'");
            ArrayList<CustomeDTO>result=new ArrayList<>();
            while(rst.next()){
               CustomeDTO d1=new CustomeDTO(rst.getString("RsID"));
               result.add(d1);
            }
            return result;
       
    }

    @Override
    public CustomeDTO getAllReservationDetail(String id) throws IOException, SQLException {
        CustomeDTO cust=null;
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select guest.ID_Number,reservation.Guest_Id,reservation.RID,reservation.Price,reservation.RsID,payment.Amount,payment.Payment_Id from guest INNER JOIN reservation ON guest.Guest_Id=reservation.Guest_Id INNER JOIN payment ON reservation.RsID=payment.RsID where guest.ID_Number='"+id+"'");
        
       if(rst.next()){
           cust=new CustomeDTO(rst.getString("ID_Number"),rst.getString("Guest_Id"),rst.getString("RID"),rst.getString("Price"),rst.getString("RsID"),rst.getString("Amount"),rst.getString("Payment_Id"));
  
          return cust;
        
        
        
        
    }else{
           return null;
       }
    }

    
   
    

}
