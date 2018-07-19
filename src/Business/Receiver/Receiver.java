/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Receiver;

/**
 *
 * @author Janhavi
 */
public class Receiver {
    
    private String name;
    private String address;
    private String city;
    private String state;
    private String country;

    private String[] catersTo;
    private String location;
    private int deliveryTime;

    public String[] getCatersTo() {
        return catersTo;
    }

    public void setCatersTo(String[] catersTo) {
        this.catersTo = catersTo;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(int deliveryTime) {
        this.deliveryTime = deliveryTime;
    }
    
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
}
