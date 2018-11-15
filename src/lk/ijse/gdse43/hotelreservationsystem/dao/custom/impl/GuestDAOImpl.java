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
import lk.ijse.gdse43.hotelreservationsystem.core.dto.GuestDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.GuestDAO;

/**
 *
 * @author user
 */
public class GuestDAOImpl implements GuestDAO{
    

    @Override
    public boolean add(GuestDTO dto) throws Exception {
       
		String SQL="Insert into guest Values(?,?,?,?,?,?)";
		Connection conn=DBConnection.getInstance().getConnection();
		PreparedStatement stm=conn.prepareStatement(SQL);
		stm.setObject(1,dto.getGuest_id());
		stm.setObject(2,dto.getName());
		stm.setObject(3,dto.getCountry());
		stm.setObject(4,dto.getCity());
                stm.setObject(5,dto.getId_number());
                stm.setObject(6,dto.getPhone_number());
		 int affectedRows = stm.executeUpdate();
                    return (affectedRows > 0);
    }

    @Override
    public boolean update(GuestDTO dto) throws Exception {
        
        
        
        String sql="Update Guest set Name=?, country=?, city=?, ID_Number=?,Phone_Number=?";
        Connection connection=DBConnection.getInstance().getConnection();
       PreparedStatement stm=connection.prepareStatement(sql);
        stm.setObject(1, dto.getName());
        stm.setObject(2,dto.getCountry());
        stm.setObject(3, dto.getCity());
        stm.setObject(4, dto.getId_number());
        stm.setObject(5, dto.getPhone_number());
        
        int rst=stm.executeUpdate();
        return rst>0;
        
            
        
       
        
        
    }

    @Override
    public boolean delete(GuestDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public GuestDTO search(GuestDTO dto) throws Exception {
     
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        
    }

    @Override
     public ArrayList<GuestDTO> getAll() throws Exception {
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select*from Guest");
         ArrayList<GuestDTO> guest=null;
        while(rst.next()){
           
            if(guest==null){
                guest=new ArrayList<GuestDTO>();
            }
            GuestDTO guestDTO=new GuestDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
            guest.add(guestDTO);
        }
        return guest;
    }

    @Override
    public GuestDTO search(String id) {
        try {
            Connection connection=DBConnection.getInstance().getConnection();
            Statement stm=connection.createStatement();
            ResultSet rst=stm.executeQuery("select*from guest where Guest_Id='"+id+"'");
            if(rst.next()){
                GuestDTO gues=new GuestDTO(rst.getString(1),rst.getString(2),rst.getString(3),rst.getString(4),rst.getString(5),rst.getString(6));
                return gues;
            }else{
                return null;
            }
        } catch (IOException ex) {
            Logger.getLogger(GuestDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(GuestDAOImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
        
    }

    @Override
    public boolean delete(String id) throws Exception {
        
        
       String sql="delete from guest where guest_Id='"+id+"'";
       
       Connection connection= DBConnection.getInstance().getConnection();
       Statement stm=connection.createStatement();
       return stm.executeUpdate(sql)>0;
    

       
    }

    @Override
    public ArrayList<String> getIdNumber() throws Exception {
        
        Connection connection=DBConnection.getInstance().getConnection();
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("select ID_Number from guest");
        ArrayList<String>id=new ArrayList<>();
        while(rst.next()){
            
            id.add(rst.getString(1));
            
            
        }
        return id;
    }

    
   
     
    
}



    

    
