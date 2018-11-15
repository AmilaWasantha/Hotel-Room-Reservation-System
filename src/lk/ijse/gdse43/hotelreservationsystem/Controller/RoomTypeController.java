/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.gdse43.hotelreservationsystem.Controller;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomTypeDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.RoomTypeDAO;

/**
 *
 * @author user
 */
public class RoomTypeController {
    private static RoomTypeDAO roomTypeDAO = (RoomTypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RoomType);
    
    
     
    public static ArrayList<RoomTypeDTO>getAllRoomType() throws Exception{
        ArrayList<RoomTypeDTO> room=roomTypeDAO.getAll();
        return room;
        
    }
}
