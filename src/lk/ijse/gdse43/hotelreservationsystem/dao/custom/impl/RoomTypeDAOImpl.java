/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.RoomTypeDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.RoomTypeDAO;

/**
 *
 * @author user
 */
public class RoomTypeDAOImpl implements RoomTypeDAO {

    @Override
    public boolean add(RoomTypeDTO dto) throws Exception {
        String SQL = "Insert into roomtype Values(?,?,?)";
        Connection conn = DBConnection.getInstance().getConnection();
        PreparedStatement stm = conn.prepareStatement(SQL);
        stm.setObject(1, dto.getRoomType_Id());
        stm.setObject(2, dto.getRoomType());
        stm.setObject(3, dto.getDescription());
        int affectedRows = stm.executeUpdate();
        return (affectedRows > 0);
    }

    @Override
    public boolean update(RoomTypeDTO dto) throws Exception {

        //System.out.println(dto.getRoomType_Id());
        //System.out.println(dto.getRoomType());
        System.out.println(dto.getDescription());
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement stm = connection.prepareStatement("update roomtype set RoomType_Id=?,RoomType=?,Discription=?  Where RoomType_Id=?");
        stm.setObject(1, dto.getRoomType_Id());
        stm.setObject(2, dto.getRoomType());
        stm.setObject(3, dto.getDescription());
        stm.setObject(4, dto.getRoomType_Id());
        int affectedRows = stm.executeUpdate();
        System.out.println(affectedRows);
        return (affectedRows > 0);

    }

    @Override
    public boolean delete(RoomTypeDTO dto) throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        PreparedStatement pstm = connection.prepareStatement("delete from roomtype where RoomType_Id=?");
        pstm.setObject(1, dto.getRoomType_Id());
        int executeUpdate = pstm.executeUpdate();
        return executeUpdate > 0;
    }

    @Override
    public RoomTypeDTO search(RoomTypeDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<RoomTypeDTO> getAll() throws Exception {
        Connection connection = DBConnection.getInstance().getConnection();
        Statement stm = connection.createStatement();
        ResultSet rst = stm.executeQuery("Select*from roomtype");
        ArrayList<RoomTypeDTO> room = null;
        while (rst.next()) {

            if (room == null) {
                room = new ArrayList<RoomTypeDTO>();
            }
            RoomTypeDTO roomTypeDTO = new RoomTypeDTO(rst.getString(1), rst.getString(2), rst.getString(3));
            room.add(roomTypeDTO);
        }
        return room;
    }

}
