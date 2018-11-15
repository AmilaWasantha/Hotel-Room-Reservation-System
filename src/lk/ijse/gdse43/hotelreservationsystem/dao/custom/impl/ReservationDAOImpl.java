/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.GuestDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.ReservationDAO;

/**
 *
 * @author user
 */
public class ReservationDAOImpl implements ReservationDAO {

    @Override
    public ArrayList<ReservationDTO> getReserveRoom(String in, String out) throws Exception {
       
       Connection conncetion = DBConnection.getInstance().getConnection();
        String SQL = "SELECT RID from ROOM where RID not in(Select RID from Reservation Where (Check_In<='" + in + "' && Check_Out>='" + in + "') || (Check_In<='" + out + "' && Check_Out>='" + out + "') || (Check_In>='" + in + "' && Check_Out<='" + out + "') || (Check_Out='" + in + "' && Check_Out='" + out + "') || (Check_In='" + out + "' && Check_In='" + out + "'))";
        Statement stm = conncetion.createStatement();
        ResultSet res = stm.executeQuery(SQL);
        ArrayList<ReservationDTO> reservationList = new ArrayList<>();
        while (res.next()) {
            
            ReservationDTO r1 = new ReservationDTO(res.getString("RID"));
            reservationList.add(r1);
        }
        return reservationList;
    }

    @Override
    public GuestDTO getID_Name(String id) throws Exception {
        Connection conn = DBConnection.getInstance().getConnection();
        Statement stm = conn.createStatement();
        ResultSet rst = stm.executeQuery("SELECT guest.Guest_Id,guest.Name\n" + "FROM guest\n" + "WHERE guest.ID_Number='" + id + "';");
        if (rst.next()) {
            GuestDTO d1 = new GuestDTO(rst.getString("Guest_Id"), rst.getString("Name"));
            return d1;
        } else {
            return null;
        }
    }

    @Override
   public boolean addresevation(ArrayList<ReservationDTO> d1) throws Exception {
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = conn.prepareStatement("INSERT INTO reservation VALUES(?,?,?,?,?,?)");
       // int result =0;
        for (ReservationDTO resevetionDTO : d1) {
            pstm.setObject(1, resevetionDTO.getR_id());
            pstm.setObject(2, resevetionDTO.getGuest_id());
            pstm.setObject(3, resevetionDTO.getRoom_id());
            pstm.setObject(4, resevetionDTO.getCheck_in());
            pstm.setObject(5, resevetionDTO.getCheck_out());
            pstm.setObject(6, resevetionDTO.getPrice());
            int affectedRows= pstm.executeUpdate();
            System.out.println(resevetionDTO.getR_id());
            return (affectedRows>0);
                                //result = pstm.executeUpdate();

        }
        //return result > 0;
        return false;
    
}


    @Override
    public boolean add(ReservationDTO dto) throws Exception {
        
        Connection connection = DBConnection.getInstance().getConnection();
        int result=0;
        PreparedStatement stm = connection.prepareStatement("insert into reservation values(?,?,?,?,?,?)");
        stm.setObject(1, dto.getR_id());
        stm.setObject(2, dto.getGuest_id());
        stm.setObject(3, dto.getRoom_id());
        stm.setObject(4, dto.getCheck_in());
        stm.setObject(5, dto.getCheck_out());
        stm.setObject(6, dto.getPrice());
        result=stm.executeUpdate();
        return result>0;
        
    }

    @Override
    public boolean update(ReservationDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(ReservationDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ReservationDTO search(ReservationDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<ReservationDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("select*from reservation");
        ArrayList<ReservationDTO> reservation = null;
        while (rst.next()) {
            if (reservation == null) {
                reservation = new ArrayList<ReservationDTO>();
            }
            ReservationDTO reseve = new ReservationDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getString(4), rst.getString(5), rst.getDouble(6));

            reservation.add(reseve);
        }
        return reservation;
    }

    @Override
    public ReservationDTO search(String id) {
      
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
