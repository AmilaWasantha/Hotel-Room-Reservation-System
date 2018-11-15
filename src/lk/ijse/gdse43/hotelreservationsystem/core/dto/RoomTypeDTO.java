/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lk.ijse.gdse43.hotelreservationsystem.core.dto;

/**
 *
 * @author user
 */
public class RoomTypeDTO extends SuperDTO{
    
    private String RoomType_Id;
    private String RoomType;
    private String Description;

    public RoomTypeDTO() {
    }

    public RoomTypeDTO(String RoomType_Id, String RoomType, String Description) {
        this.RoomType_Id = RoomType_Id;
        this.RoomType = RoomType;
        this.Description = Description;
    }

    public RoomTypeDTO(String roomType, String description) {
        this.RoomType=roomType;
        this.Description=description;
        
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
    
    
    
}
