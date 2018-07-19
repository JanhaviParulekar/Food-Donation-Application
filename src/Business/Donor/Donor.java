/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Donor;
import Business.Product.Product;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Janhavi
 */
public class Donor{
    private String name;
    private String location;
    private ArrayList<Product> donatedItems;
    private ArrayList<Product> history;
    private Boolean isSubmitted=true;
    
    public Donor(){
    donatedItems = new ArrayList<>();
    history = new ArrayList<>();
   // it=donatedItems.iterator();
    }

    public ArrayList<Product> getHistory() {
        return history;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }
    
    

   
    public Boolean getIsSubmitted() {
        return isSubmitted;
    }

    public void setIsSubmitted(Boolean isSubmitted) {
        this.isSubmitted = isSubmitted;
    }

    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Product> getDonatedItems() {
        return donatedItems;
    }

    public void setDonatedItems(ArrayList<Product> donatedItems) {
        this.donatedItems = donatedItems;
    }


    public Product addProduct(){
        Product p = new Product();
        donatedItems.add(p);
        return p;
    }
    

    
    public void removeProduct(Product p){
       donatedItems.remove(p);
      //it.remove();
    }
    
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }

}

