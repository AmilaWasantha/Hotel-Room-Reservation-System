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
public class ReservationDTO extends SuperDTO{
    private String  r_id;
    private String  guest_id;
    private String room_id;
    private String Check_in;
    private String  Check_out;
    private double price;

    public ReservationDTO() {
    }

    public ReservationDTO(String room_id) {
        this.room_id = room_id;
    }

    
    

    public ReservationDTO(String r_id, String guest_id, String room_id, String Check_in, String Check_out, double price) {
        this.r_id = r_id;
        this.guest_id = guest_id;
        this.room_id = room_id;
        this.Check_in = Check_in;
        this.Check_out = Check_out;
        this.price = price;
    }

    /**
     * @return the r_id
     */
    public String getR_id() {
        return r_id;
    }

    /**
     * @param r_id the r_id to set
     */
    public void setR_id(String r_id) {
        this.r_id = r_id;
    }

    /**
     * @return the guest_id
     */
    public String getGuest_id() {
        return guest_id;
    }

    /**
     * @param guest_id the guest_id to set
     */
    public void setGuest_id(String guest_id) {
        this.guest_id = guest_id;
    }

    /**
     * @return the room_id
     */
    public String getRoom_id() {
        return room_id;
    }

    /**
     * @param room_id the room_id to set
     */
    public void setRoom_id(String room_id) {
        this.room_id = room_id;
    }

    /**
     * @return the Check_in
     */
    public String getCheck_in() {
        return Check_in;
    }

    /**
     * @param Check_in the Check_in to set
     */
    public void setCheck_in(String Check_in) {
        this.Check_in = Check_in;
    }

    /**
     * @return the Check_out
     */
    public String getCheck_out() {
        return Check_out;
    }

    /**
     * @param Check_out the Check_out to set
     */
    public void setCheck_out(String Check_out) {
        this.Check_out = Check_out;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
    
    
}
