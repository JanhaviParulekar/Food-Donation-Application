/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

/**
 *
 * @author Janhavi
 */
public class ProductDefination {
    private int productID;
    private String productName;
    private String category;
    private String catersTo;
    private String unit;

    public int getProductID() {
        return productID;
    }

    public void setProductID(int productID) {
        this.productID = productID;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCatersTo() {
        return catersTo;
    }

    public void setCatersTo(String catersTo) {
        this.catersTo = catersTo;
    }

    public String getUnit() {
        return unit;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }
    
    public String toString() {
        return productName+" ("+unit+") "; //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
