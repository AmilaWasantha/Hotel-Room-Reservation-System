/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.Controller;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.GuestDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.ReservationDAO;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.spi.DirStateFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationnDTO;*/


/**
 *
 * @author user
 */
public class ReservationController {
    
    private static ReservationDAO reservationnDAO=(ReservationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RESERVATIONN);
    
    public static ArrayList<ReservationDTO> getRserveRoom(String in, String out) throws Exception{
        ArrayList<ReservationDTO> reservationList=reservationnDAO.getReserveRoom(in, out);
        return reservationList;
    }
    public static GuestDTO getID_NAME(String id) throws Exception{
        GuestDTO id_Name = reservationnDAO.getID_Name(id);
        return id_Name;
    }
    
    public static boolean GetAllReservation(ReservationDTO reservation) throws Exception{
    
    boolean reseve=reservationnDAO.add(reservation);
    return reseve;
    }
   
    
    public static ArrayList<ReservationDTO>getAllReservationDetail() throws Exception{
         ArrayList<ReservationDTO>reservationList=reservationnDAO.getAll();
        return reservationList;
        
    
    }
          public static ArrayList<ReservationDTO>getAllReservation() throws Exception{
         ArrayList<ReservationDTO>reservationList=reservationnDAO.getAll();
        return reservationList;
        
    
    }
        
    
    
    /*public void reserveRoom(in,out){
        String sql="select rid from room where rid not(select rid from Reservation where (check_in<='"+in"' && check_out>='"+in;+"')"
    }*/
  /*  public static ArrayList<ReservationnDTO> getRserveRoom(String in, String out){
        //System.out.println(in);
        //System.out.println(out);
       try {
            String SQL="SELECT RID from ROOM where RID not in(Select RID from Reservation Where (Check_In<='"+in+"' && Check_Out>='"+in+"') || (Check_In<='"+out+"' && Check_Out>='"+out+"') || (Check_In>='"+in+"' && Check_Out<='"+out+"') || (Check_Out='"+in+"' && Check_Out='"+out+"') || (Check_In='"+out+"' && Check_In='"+out+"'))";   
            Statement stm=DBConnection.getDBConnection().getConnection().createStatement();
            ResultSet res=stm.executeQuery(SQL);
            ArrayList<ReservationnDTO>reservationList=new ArrayList<>();
            while(res.next()){
                ReservationnDTO r1=new ReservationnDTO(res.getString("RID"));
                reservationList.add(r1);
            }
            return reservationList;
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ReservationController.class.getName()).log(Level.SEVERE, null, ex);
        }
        
       return null; 
    }
    
   public static boolean setAllReservation(ReservationnDTO reservation) throws ClassNotFoundException, SQLException{
        System.out.println("XXXXXXXXXXXXXXX");
        Connection connection= DBConnection.getDBConnection().getConnection();
        PreparedStatement stm=connection.prepareStatement("insert into reservation values(?,?,?,?,?,?)");
        stm.setObject(1, reservation.getR_id());
        stm.setObject(2, reservation.getGuest_id());
        stm.setObject(3, reservation.getRoom_id());
        stm.setObject(4, reservation.getCheck_in());
        stm.setObject(5, reservation.getCheck_out());
        stm.setObject(6, reservation.getPrice());
        int res=stm.executeUpdate();
        return res>0;
        
    }
    
    public static ArrayList<ReservationnDTO> getAllReservation() throws ClassNotFoundException, SQLException{
    Connection connection= DBConnection.getDBConnection().getConnection();
    Statement stm= connection.createStatement();
    ResultSet rst= stm.executeQuery("select*from Reservation");
    
    ArrayList<ReservationnDTO> reservationList=new ArrayList<>();
    
    while(rst.next()){
        ReservationnDTO d1=new ReservationnDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
        reservationList.add(d1);
    }
        return reservationList;
        
            
    
    }*/

    public static ReservationDTO search(String id) {
        return reservationnDAO.search(id);
    }
    
}
