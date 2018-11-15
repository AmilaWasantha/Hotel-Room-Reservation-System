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
public class CustomeDTO extends SuperDTO{
    
    private String r_id;
    private String payment_Id;
    private String date;
     private String guest_id;
      private String rommId;
    private double amount;
    private double advance;
     private String room_id;
    private String RoomType_Id;
        private String RoomType;
    private String Description;
    private double Price;
    private String Room_Name;
    
    private String reservationID;
    private String ID_Number;
    
    private String idnumber1;
    private String geustId1;
    private String RID1;
    private String Price1;
    private String RSid1;
    private String Amount1;
    private String Paymnet1;

    public CustomeDTO() {
    }

    public CustomeDTO(String idnumber1, String geustId1, String RID1, String Price1, String RSid1, String Amount1, String Paymnet1) {
        
        this.idnumber1 = idnumber1;
        this.geustId1 = geustId1;
        this.RID1 = RID1;
        this.Price1 = Price1;
        this.RSid1 = RSid1;
        this.Amount1 = Amount1;
        this.Paymnet1 = Paymnet1;
    }

    
    /*public CustomeDTO(String r_id, String payment_Id, String guest_id, String rommId, double amount, double Price, String reservationID, String ID_Number) {
        this.r_id = r_id;
        this.payment_Id = payment_Id;
        this.guest_id = guest_id;
        this.room_id = rommId;
        this.amount = amount;
        this.Price = Price;
        this.reservationID = reservationID;
        this.ID_Number = ID_Number;
    }*/
    
     public CustomeDTO(String reservationID) {
         this.reservationID=reservationID;
    }


    public CustomeDTO(String r_id, String payment_Id, String date, String guest_id, String rommId, double amount, double advance, String room_id, String RoomType_Id, String RoomType, String Description, double Price, String Room_Name) {
        this.r_id = r_id;
        this.payment_Id = payment_Id;
        this.date = date;
        this.guest_id = guest_id;
        this.rommId = rommId;
        this.amount = amount;
        this.advance = advance;
        this.room_id = room_id;
        this.RoomType_Id = RoomType_Id;
        this.RoomType = RoomType;
        this.Description = Description;
        this.Price = Price;
        this.Room_Name = Room_Name;
    }

    public CustomeDTO(String RoomType_Id, String Room_Type, String Description , String Room_Name, double Price) {
        this.RoomType_Id= RoomType_Id;
        this.RoomType =Room_Type;
        this.Description=Description;
        this.Room_Name=Room_Name;
        this.Price=Price;
    }

    public CustomeDTO(String RsID, String Guest_Id, String RID, String Date, double Amount, double Advance) {
        this.r_id=RsID;
        this.guest_id=Guest_Id;
        this.rommId=RID;
        this.date=Date;
        this.amount=Amount;
        this.advance=Advance;
        
    }

    public CustomeDTO(String ID_Number, String Guest_Id, String  RID, double Price, String RsID, double Amount, String Payment_Id) {
        this.ID_Number=ID_Number;
        this.guest_id=Guest_Id;
        this.room_id=RID;
        this.Price=Price;
        this.r_id=RsID;
        this.amount=Amount;
        this.payment_Id=Payment_Id;
        
    }

    
    

   

   

   

 
    

    public String getID_Number() {
        return ID_Number;
    }

    public void setID_Number(String ID_Number) {
        this.ID_Number = ID_Number;
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
     * @return the date
     */
    public String getDate() {
        return date;
    }

    /**
     * @param date the date to set
     */
    public void setDate(String date) {
        this.date = date;
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
     * @return the rommId
     */
    public String getRommId() {
        return rommId;
    }

    /**
     * @param rommId the rommId to set
     */
    public void setRommId(String rommId) {
        this.rommId = rommId;
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
     * @return the advance
     */
    public double getAdvance() {
        return advance;
    }

    /**
     * @param advance the advance to set
     */
    public void setAdvance(double advance) {
        this.advance = advance;
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
     * @return the RoomType
     */
    public String getRoomType() {
        return RoomType;
    }

    /**
     * @param RoomType the RoomType to set
     */
    public void setRoomType(String RoomType) {
        this.RoomType = RoomType;
    }

    /**
     * @return the Description
     */
    public String getDescription() {
        return Description;
    }

    /**
     * @param Description the Description to set
     */
    public void setDescription(String Description) {
        this.Description = Description;
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

    /**
     * @return the Room_Name
     */
    public String getRoom_Name() {
        return Room_Name;
    }

    /**
     * @param Room_Name the Room_Name to set
     */
    public void setRoom_Name(String Room_Name) {
        this.Room_Name = Room_Name;
    }

    /**
     * @return the reservationID
     */
    public String getReservationID() {
        return reservationID;
    }

    /**
     * @param reservationID the reservationID to set
     */
    public void setReservationID(String reservationID) {
        this.reservationID = reservationID;
    }

    /**
     * @return the idnumber1
     */
    public String getIdnumber1() {
        return idnumber1;
    }

    /**
     * @param idnumber1 the idnumber1 to set
     */
    public void setIdnumber1(String idnumber1) {
        this.idnumber1 = idnumber1;
    }

    /**
     * @return the geustId1
     */
    public String getGeustId1() {
        return geustId1;
    }

    /**
     * @param geustId1 the geustId1 to set
     */
    public void setGeustId1(String geustId1) {
        this.geustId1 = geustId1;
    }

    /**
     * @return the RID1
     */
    public String getRID1() {
        return RID1;
    }

    /**
     * @param RID1 the RID1 to set
     */
    public void setRID1(String RID1) {
        this.RID1 = RID1;
    }

    /**
     * @return the Price1
     */
    public String getPrice1() {
        return Price1;
    }

    /**
     * @param Price1 the Price1 to set
     */
    public void setPrice1(String Price1) {
        this.Price1 = Price1;
    }

    /**
     * @return the RSid1
     */
    public String getRSid1() {
        return RSid1;
    }

    /**
     * @param RSid1 the RSid1 to set
     */
    public void setRSid1(String RSid1) {
        this.RSid1 = RSid1;
    }

    /**
     * @return the Amount1
     */
    public String getAmount1() {
        return Amount1;
    }

    /**
     * @param Amount1 the Amount1 to set
     */
    public void setAmount1(String Amount1) {
        this.Amount1 = Amount1;
    }

    /**
     * @return the Paymnet1
     */
    public String getPaymnet1() {
        return Paymnet1;
    }

    /**
     * @param Paymnet1 the Paymnet1 to set
     */
    public void setPaymnet1(String Paymnet1) {
        this.Paymnet1 = Paymnet1;
    }

   
    
    
    
}
