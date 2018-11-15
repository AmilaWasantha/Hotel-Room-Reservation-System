/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.SuperDAO;

/**
 *
 * @author user
 */
public interface RoomDAO extends SuperDAO<RoomDTO>{
    public RoomDTO search(String id) throws Exception;

    public ArrayList<String> getroomIds()throws Exception;

   

    

   
}
