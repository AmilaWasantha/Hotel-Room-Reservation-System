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
public class RoomDTO extends SuperDTO{
    private String room_id;
    private String RoomType_Id;
    private String Room_name;
    private double Price;
    

    public RoomDTO() {
    }

    public RoomDTO(String room_id, String RoomType_Id, String Room_name, double Price) {
        this.room_id = room_id;
        this.RoomType_Id = RoomType_Id;
        this.Room_name = Room_name;
        this.Price = Price;
    }

    public RoomDTO(double price, String RID,String Room_Name) {
       
        this.room_id=RID;
        this.Room_name=Room_Name;
         this.Price=price;
        
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
     * @return the RoomType_Id
     */
    public String getRoomType_Id() {
        return RoomType_Id;
    }

    /**
     * @param RoomType_Id the RoomType_Id to set
     */
    public void setRoomType_Id(String RoomType_Id) {
        this.RoomType_Id = RoomType_Id;
    }

    /**
     * @return the Room_name
     */
    public String getRoom_name() {
        return Room_name;
    }

    /**
     * @param Room_name the Room_name to set
     */
    public void setRoom_name(String Room_name) {
        this.Room_name = Room_name;
    }

    /**
     * @return the Price
     */
    public double getPrice() {
        return Price;
    }

    /**
     * @param Price the Price to set
     */
    public void setPrice(double Price) {
        this.Price = Price;
    }

    
    
    

    
    
}
