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
import lk.ijse.gdse43.hotelreservationsystem.core.dto.PaymentDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.Db.DBConnection;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.PaymentDAO;

/**
 *
 * @author user
 */
public class PaymentDAOImpl implements PaymentDAO{

    @Override
    public boolean add(PaymentDTO dto) throws Exception {
       Connection connection = DBConnection.getInstance().getConnection();
        //int result=0;
        PreparedStatement stm = connection.prepareStatement("insert into payment values(?,?,?,?,?,?)");
        stm.setObject(1, dto.getPayment_Id());
        stm.setObject(2, dto.getReservation_Id());
        stm.setObject(3, dto.getDate());
        stm.setObject(4, dto.getTime());
        stm.setObject(5, dto.getAmount());
        stm.setObject(6, dto.getAdvance());
       int  result=stm.executeUpdate();
        return result>0;
        
    }

    @Override
    public boolean update(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean delete(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public PaymentDTO search(PaymentDTO dto) throws Exception {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public ArrayList<PaymentDTO> getAll() throws Exception {  
        Connection connection=DBConnection.getInstance().getConnection();  
        Statement stm=connection.createStatement();
        ResultSet rst=stm.executeQuery("Select payment_Id from payment");
        ArrayList<PaymentDTO> paymentList=new ArrayList<>();
        while(rst.next()){
            PaymentDTO pay=new PaymentDTO(rst.getString(1));
            paymentList.add(pay);
            
        }
        return paymentList;
    }
    }
    
        
        
        

        

        

       
    
    

