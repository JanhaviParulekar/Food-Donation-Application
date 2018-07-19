/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

import Business.Product.Product;
import java.util.ArrayList;

/**
 *
 * @author mahesh
 */
public class Employee {
    
    private String name;
    private int id;
    //private ArrayList<Product> donatedItems;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
        //donatedItems = new ArrayList<>();

    }

    /*
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
    }
 */
    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
    
}
