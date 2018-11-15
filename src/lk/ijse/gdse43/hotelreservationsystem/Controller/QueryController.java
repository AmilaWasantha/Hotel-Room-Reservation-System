/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.Controller;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.CustomeDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.QueryDAO;

/**
 *
 * @author user
 */
public class QueryController {
    
    private static QueryDAO queryDao = (QueryDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Query);
            
    public static CustomeDTO getAllDetails(String id) throws Exception{
           CustomeDTO cust=queryDao.getAllDeatil(id);
           return cust;
        
    
    }

    public static CustomeDTO getAllroomDetail(String id) throws Exception {
        
          CustomeDTO room=queryDao.searchRoomTypeDetail(id);
           return room;
        
    }

    
    

    public static ArrayList<CustomeDTO> search(String id) throws Exception {
         ArrayList<CustomeDTO>result=queryDao.search(id);
        return result;
    }

    public static CustomeDTO getAllReservationDetails(String id) throws Exception{
        CustomeDTO cust=queryDao.getAllReservationDetail(id);
        return cust;
        
    }

    

    
    
    
}
