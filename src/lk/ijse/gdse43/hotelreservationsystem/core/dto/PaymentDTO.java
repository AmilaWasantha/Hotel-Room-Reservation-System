/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.gdse43.hotelreservationsystem.core.dto;

/**
 *
 * @author user
 */
public class PaymentDTO extends SuperDTO{
    private String payment_Id;
    private String Reservation_Id;
    private String Date;
    private String Time;
    private double amount;
    private double Advance;

    public PaymentDTO() {
    }

    public PaymentDTO(String payment_Id, String Reservation_Id, String Date, String Time, double amount, double Advance) {
        this.payment_Id = payment_Id;
        this.Reservation_Id = Reservation_Id;
        this.Date = Date;
        this.Time = Time;
        this.amount = amount;
        this.Advance = Advance;
    }

    public PaymentDTO(String payment_id) {
        this.payment_Id=payment_id;
    }

    /**
     * @return the payment_Id
     */
    public String getPayment_Id() {
        return payment_Id;
    }

    /**
     * @param payment_Id the payment_Id to set
     */
    public void setPayment_Id(String payment_Id) {
        this.payment_Id = payment_Id;
    }

    /**
     * @return the Reservation_Id
     */
    public String getReservation_Id() {
        return Reservation_Id;
    }

    /**
     * @param Reservation_Id the Reservation_Id to set
     */
    public void setReservation_Id(String Reservation_Id) {
        this.Reservation_Id = Reservation_Id;
    }

    /**
     * @return the Date
     */
    public String getDate() {
        return Date;
    }

    /**
     * @param Date the Date to set
     */
    public void setDate(String Date) {
        this.Date = Date;
    }

    /**
     * @return the Time
     */
    public String getTime() {
        return Time;
    }

    /**
     * @param Time the Time to set
     */
    public void setTime(String Time) {
        this.Time = Time;
    }

    /**
     * @return the amount
     */
    public double getAmount() {
        return amount;
    }

    /**
     * @param amount the amount to set
     */
    public void setAmount(double amount) {
        this.amount = amount;
    }

    /**
     * @return the Advance
     */
    public double getAdvance() {
        return Advance;
    }

    /**
     * @param Advance the Advance to set
     */
    public void setAdvance(double Advance) {
        this.Advance = Advance;
    }

  
    
    
    
}
