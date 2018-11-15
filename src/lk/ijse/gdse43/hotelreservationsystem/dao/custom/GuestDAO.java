/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.GuestDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.SuperDAO;

/**
 *
 * @author user
 */
public interface GuestDAO extends SuperDAO<GuestDTO> {

    public GuestDTO search(String id)throws Exceptions;

  
      
  
  

    //public static boolean add();

    public boolean delete(String id)throws Exception;

    public ArrayList<String> getIdNumber()throws Exception;
    
    
}
