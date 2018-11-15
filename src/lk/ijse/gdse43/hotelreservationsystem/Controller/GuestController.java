/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.Controller;

//import java.sql.Connection;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.GuestDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
//import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.GuestDAO;

/**
 *
 * @author user
 */
public class GuestController {
    private static GuestDAO guestDao = (GuestDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GUEST);
   
    public static boolean addGuest(GuestDTO guest) throws Exception {
      
         return guestDao.add(guest);
        
    }
    
    public static ArrayList<GuestDTO>getAllGuest() throws Exception{
        ArrayList<GuestDTO> guest=guestDao.getAll();
        return guest;
        
    }
    
    /*public static GuestDTO searchGuest(GuestDTO guest) throws Exception{
        GuestDTO gues=guestDao.search(guest);
        return gues;
    
    }*/

    public static GuestDTO searcshGuest(String id) throws Exception{
        return guestDao.search(id);
        
        
    }
    
    
    
   
    
   
    
   /* public static boolean addGuest(GuestDTO guest)throws ClassNotFoundException, SQLException{
		String SQL="Insert into guest Values(?,?,?,?,?,?)";
		Connection conn=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=conn.prepareStatement(SQL);
		stm.setObject(1,guest.getGuest_id());
		stm.setObject(2,guest.getName());
		stm.setObject(3,guest.getCountry());
		stm.setObject(4,guest.getCity());
                stm.setObject(5,guest.getId_number());
                stm.setObject(6,guest.getPhone_number());
		int res=stm.executeUpdate();
		return res>0;
                
                
                
    }*/
    /*public static ArrayList<GuestDTO> getAllGuest() throws ClassNotFoundException, SQLException{
       Connection connection= DBConnection.getDBConnection().getConnection();
        Statement stm= connection.createStatement();
        ResultSet rst=stm.executeQuery("select*from guest");
        
        ArrayList<GuestDTO> guestList=new ArrayList<>();
        while(rst.next()){
            GuestDTO guest=new GuestDTO(rst.getString("guest_id"),rst.getString("name"),rst.getString("country"),rst.getString("city"),rst.getString("id_number"),rst.getString("phone_number"));
            guestList.add(guest);
        }
       return guestList;
        
    }
    
    public static ArrayList<String>getAllIds() throws ClassNotFoundException, SQLException{
        System.out.println("called");
        Connection connection= DBConnection.getDBConnection().getConnection();
        Statement stm= connection.createStatement();
         ResultSet rst=stm.executeQuery("select ID_Number from Guest");
         
         ArrayList<String> id=new ArrayList<>();
         while(rst.next()){
             id.add(rst.getString("ID_Number"));
             System.out.println(rst.getString("ID_Number"));
         }
         return id;
    }
    
    public static GuestDTO SearchGuest(String id) throws ClassNotFoundException, SQLException{
      Connection connection= DBConnection.getDBConnection().getConnection();
      Statement stm=connection.createStatement();
      ResultSet rst=stm.executeQuery("select*from Guest where ID_Number='"+id+"'");
      if(rst.next()){
          GuestDTO guest=new GuestDTO(rst.getString("Guest_id"),rst.getString("name"),rst.getString("country"),rst.getString("city"),rst.getString("Id_number"),rst.getString("Phone_number"));
          return guest;
      }else{
          return null;
      }
      
      
      
    }*/

   

    public static boolean UpdateGuest(GuestDTO guest) throws Exception {
        
        boolean gues=guestDao.update(guest);
        return gues;
    }

    public static boolean delete(String id) throws Exception {
        
        boolean gues=guestDao.delete(id);
        return gues;
    }

    public static ArrayList<String> getAllIdNumbers() throws Exception {
        ArrayList<String>result=guestDao.getIdNumber();
        return result;
    }

 
        
        
        
    

    
    
    
       
    }

    
    

