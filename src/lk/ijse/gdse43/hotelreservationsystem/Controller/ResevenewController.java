/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.GuestDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.ReservationDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.GuestDAO;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.ReservationDAO;

/**
 *
 * @author user
 */
public class ResevenewController {
 /*static  Connection connection = null;

    public ResevenewController() {
    
      try {
          connection=DBConnection.getInstance().getConnection();
      } catch (IOException ex) {
          Logger.getLogger(ResevenewController.class.getName()).log(Level.SEVERE, null, ex);
      }
    }*/
  
    public static boolean addreseve(GuestDTO g1, ArrayList<ReservationDTO> d1){
    
        Connection connection = null;
        try {
            connection = DBConnection.getInstance().getConnection();

            connection.setAutoCommit(false);

            GuestDAO guestDAO = (GuestDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.GUEST);
            boolean result = guestDAO.add(g1);

            if (result == false) {
                connection.rollback();
                return false;
            }
            System.out.println(result);

            ReservationDAO reservationDAO = (ReservationDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RESERVATIONN);

            result = reservationDAO.addresevation(d1);
            System.out.println("amila wasantha kumara");
            if (result == false) {
                connection.rollback();
                return false;
            }

            connection.commit();
            return true;
        } catch (IOException ex) {
            Logger.getLogger(ResevenewController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SQLException ex) {
            Logger.getLogger(ResevenewController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(ResevenewController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                connection.setAutoCommit(true);
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(ResevenewController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

}
