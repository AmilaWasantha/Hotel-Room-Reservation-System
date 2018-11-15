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
public class GuestDTO extends SuperDTO{
    private String  guest_id;
    private String name;
    private String country;
    private String city;
    private String id_number;
    private String  phone_number;

    public GuestDTO() {
    }
    
    

    
    
     public GuestDTO(String guest_id,String name) {
         this.guest_id=guest_id;
         this.name=name;
                 
    }

    public GuestDTO(String guest_id, String name, String country, String city, String id_number, String phone_number) {
        this.guest_id = guest_id;
        this.name = name;
        this.country = country;
        this.city = city;
        this.id_number = id_number;
        this.phone_number = phone_number;
    }

    public GuestDTO(String id_number) {
        this.id_number=id_number;
        
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
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country the country to set
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return the city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city the city to set
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return the id_number
     */
    public String getId_number() {
        return id_number;
    }

    /**
     * @param id_number the id_number to set
     */
    public void setId_number(String id_number) {
        this.id_number = id_number;
    }

    /**
     * @return the phone_number
     */
    public String getPhone_number() {
        return phone_number;
    }

    /**
     * @param phone_number the phone_number to set
     */
    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public Object getGender() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
