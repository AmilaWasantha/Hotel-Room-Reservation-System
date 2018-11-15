
package lk.ijse.gdse43.hotelreservationsystem.dao.custom;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.GuestDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.SuperDAO;

/**
 *
 * @author user
 */
public interface ReservationDAO extends SuperDAO<ReservationDTO>{
      public ArrayList<ReservationDTO> getReserveRoom(String in, String out) throws Exception;
    
    public GuestDTO getID_Name(String id)throws Exception;
    
    public boolean addresevation(ArrayList<ReservationDTO> d1)throws Exception;

    public ReservationDTO search(String id);
}
