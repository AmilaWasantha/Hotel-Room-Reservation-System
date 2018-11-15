/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.gdse43.hotelreservationsystem.Controller;

import java.util.ArrayList;
import lk.ijse.gdse43.hotelreservationsystem.core.dto.PaymentDTO;
import lk.ijse.gdse43.hotelreservationsystem.dao.DAOFactory;
import lk.ijse.gdse43.hotelreservationsystem.dao.custom.PaymentDAO;

/**
 *
 * @author user
 */
public class PaymentController {
    private static PaymentDAO paymentDao = (PaymentDAO) DAOFactory.getInstance().getDAO(DAOFactory.DAOTypes.Payment);
    
    
    
    public static boolean addPaymetDetail(PaymentDTO payment) throws Exception{
    boolean paymentDetail=paymentDao.add(payment);
        return paymentDetail;
    
    }
    
    public static ArrayList<PaymentDTO>getPaymentIds() throws Exception{
       return paymentDao.getAll();
    
    }
}
