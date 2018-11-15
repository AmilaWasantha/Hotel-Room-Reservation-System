/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.CustomeDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.SuperDAO;

/**
 *
 * @author user
 */
public interface QueryDAO extends SuperDAO<CustomeDTO>{
    
    public CustomeDTO getAllDeatil(String id)throws Exception;

    public CustomeDTO searchRoomTypeDetail(String id)throws Exception;

    public ArrayList<CustomeDTO> search(String id)throws Exception;

    public CustomeDTO getAllReservationDetail(String id)throws Exception;

    
    
}
