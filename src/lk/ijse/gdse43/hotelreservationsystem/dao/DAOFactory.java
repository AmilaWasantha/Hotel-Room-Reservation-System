/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.gdse43.hotelreservationsystem.dao;

import lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl.GuestDAOImpl;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl.PaymentDAOImpl;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl.QueryDAOImpl;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl.ReservationDAOImpl;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl.RoomDAOImpl;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.impl.RoomTypeDAOImpl;

/**
 *
 * @author user
 */
public class DAOFactory {
     public enum DAOTypes{
        GUEST,RESERVATIONN,ROOM,RoomType,Payment,RESERVATION,Query;
    }
    
    private static DAOFactory daoFactory;
    
    private DAOFactory(){
        
    }
    public static DAOFactory getInstance(){
        if(daoFactory==null){
            daoFactory=new DAOFactory();
        }
        return daoFactory;
    }
      public SuperDAO getDAO(DAOTypes daoType){
        switch(daoType){
            case GUEST:
                return new GuestDAOImpl();
            case RESERVATIONN:
                return new ReservationDAOImpl();
            case ROOM:
                return new RoomDAOImpl();
            case RoomType:
                return new RoomTypeDAOImpl();
            case Payment:
                return new PaymentDAOImpl();
            case Query:
                return new QueryDAOImpl();
            
            default:
                return null;
        }
    }
}
