/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.RoomDAO;

/**
 *
 * @author user
 */
public class RoomDAOImpl implements RoomDAO {

    @Override
    public boolean add(RoomDTO dto) throws Exception {

        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        /*	String SQL="Insert into room Values(?,?,?,?)";
		Connection conn=DBConnection.getInstance().getConnection();
		PreparedStatement stm=conn.prepareStatement(SQL);
		stm.setObject(1,dto.getRoom_id());
		stm.setObject(2,dto.getRoomType_Id());
		stm.setObject(3,dto.getRoom_name());
		stm.setObject(4,dto.getPrice());
		 int affectedRows = stm.executeUpdate();
                    return (affectedRows > 0);*/

    }

    @Override
    public boolean update(RoomDTO dto) throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("update room set Room_Name=?,Price=? where RID=?");
        stm.setObject(1, dto.getRoom_name());
        stm.setObject(2, dto.getPrice());
        stm.setObject(3, dto.getRoom_id());
        int affectesRows = stm.executeUpdate();

        return (affectesRows > 0);
    }

    @Override
    public boolean delete(RoomDTO dto) throws IOException, SQLException {
        int executeUpdate = 0;
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("delete from room where RID=?");
        pstm.setObject(1, dto.getRoom_id());
        executeUpdate = pstm.executeUpdate();

        return executeUpdate > 0;
    }

    @Override
    public RoomDTO search(RoomDTO dto) throws Exception {
        return null;

    }

    @Override
    public ArrayList<RoomDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select*from room");
        ArrayList<RoomDTO> room = null;
        while (rst.next()) {

            if (room == null) {
                room = new ArrayList<RoomDTO>();
            }
            RoomDTO roomDTO = new RoomDTO(rst.getString(1), rst.getString(2), rst.getString(3), rst.getDouble(4));
            room.add(roomDTO);
        }
        return room;
    }

    @Override
    public RoomDTO search(String id) throws Exception {

        String SQL = "Select * from room where RID='" + id + "'";
        Statement stm = DBConnection.getInstance().getConnection().createStatement();
        ResultSet rst = stm.executeQuery(SQL);
        if (rst.next()) {
            RoomDTO c1;
            //c1 = new RoomDTO(rst.getString("RID"), rst.getString("RoomType_Id"), rst.getString("Room_name"), rst.getDouble("price"));
            //return c1;
        } else {
            return null;
        }
        return null;
    }

    @Override
    public ArrayList<String> getroomIds() throws Exception {

        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("select RID from room");
        ArrayList<String> room = new ArrayList<>();
        while (rst.next()) {
            room.add(rst.getString(1));

        }
        return room;
    }

}
