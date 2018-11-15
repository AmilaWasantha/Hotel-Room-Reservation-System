/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.Controller;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomTypeDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.RoomDAO;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.RoomTypeDAO;

/**
 *
 * @author user
 */
public class RoomMidifyController {

    public static boolean Update(RoomDTO room, RoomTypeDTO roomType) throws IOException {

        Connection connection = null;
        try {

            connection = DBConnection.getInstance().getConnection();

            connection.setAutoCommit(false);

            RoomDAO roomDAO = (RoomDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.ROOM);
            boolean result = roomDAO.update(room);
            
           

            if (result == false) {
                connection.rollback();
                return false;
            }

            RoomTypeDAO roomTypeDAO = (RoomTypeDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.RoomType);
            result = roomTypeDAO.update(roomType);
            

            if (result == false) {
                connection.rollback();
                return false;
            }
            connection.commit();
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(RoomMidifyController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (Exception ex) {
            Logger.getLogger(RoomMidifyController.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } finally {
            try {
                connection.setAutoCommit(true);
                return true;
            } catch (SQLException ex) {
                Logger.getLogger(RoomMidifyController.class.getName()).log(Level.SEVERE, null, ex);
            }
            

        }
    }

}
