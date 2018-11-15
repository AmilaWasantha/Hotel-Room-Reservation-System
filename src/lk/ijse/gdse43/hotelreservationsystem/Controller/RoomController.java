/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.Controller;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.RoomDAO;

/*import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;*/

/**
 *
 * @author user
 */
public class RoomController {
    public static RoomDAO roomDAO=(RoomDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ROOM);
    
    public static RoomDTO search(String id) throws Exception{
        RoomDTO r=roomDAO.search(id);
        return r;
    }
    
      public static ArrayList<RoomDTO>getAllRooms() throws Exception{
         ArrayList<RoomDTO>roomList=roomDAO.getAll();
        return roomList;
      }
   /*public static boolean addRoom(RoomDTO room)throws ClassNotFoundException, SQLException{
		String SQL="Insert into room Values(select Room.room_id,roomtype from room Inner Join roomtype ON  )";
		Connection conn=DBConnection.getDBConnection().getConnection();
		PreparedStatement stm=conn.prepareStatement(SQL);
		stm.setObject(1,room.room_id());
		stm.setObject(2,room.getname());
		stm.setObject(3,room.getroom_type());
		int res=stm.executeUpdate();
		return res>0;*/
    
   /* public static RoomDTO search(String id) throws Exception{
        String SQL="Select * from room where RID='"+id+"'";
        Statement stm=DBConnection.getDBConnection().getConnection().createStatement();
        ResultSet rst=stm.executeQuery(SQL);
        if(rst.next()){
            RoomDTO c1;
            c1 = new RoomDTO(rst.getString("RID"),rst.getString("RoomType_Id"),rst.getString("Max_Capacity"),rst.getDouble("price"));
            return c1;
        }else{
           return null;
        }
        
    }*/

   /* public static ArrayList<String> getRoomIds()throws  Exception{
        ArrayList<String>room=roomDAO.getroomIds();
        return room;
        
        
    }*/

    public static ArrayList<String> getRoomIds() throws Exception {
        
         ArrayList<String>room=roomDAO.getroomIds();
        return room;
    }

    
    
    
}
