/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.Date;

/**
 *
 * @author Janhavi
 */
public class Product{
    
    private String name;
    private int quantity;
    private Date expDate;
    private String unit;
    private String month;
    private int date;
    private int year;
    private ProductDefinationList productDefinationList;
    private Boolean isInInventory=false;

    public Product()
    {
        productDefinationList = new ProductDefinationList();
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    
    

    public Boolean getIsInInventory() {
        return isInInventory;
    }

    public void setIsInInventory(Boolean isInInventory) {
        this.isInInventory = isInInventory;
    }

    
    public ProductDefinationList getProductDefinationList() {
        return productDefinationList;
    }

    public void setProductDefinationList(ProductDefinationList productDefinationList) {
        this.productDefinationList = productDefinationList;
    }
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getExpDate() {
        return expDate;
    }

    public void setExpDate(Date expDate) {
        this.expDate = expDate;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public String toString() {
        return name; //To change body of generated methods, choose Tools | Templates.
    }    
    
}
