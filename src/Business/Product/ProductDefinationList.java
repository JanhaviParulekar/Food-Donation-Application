/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Product;

import java.util.ArrayList;

/**
 *
 * @author Janhavi
 */
public class ProductDefinationList {
    private ArrayList<ProductDefination> productDefinationList;
    
    public ProductDefinationList()
    {
        productDefinationList = new ArrayList<>();
    }

    public ArrayList<ProductDefination> getProductDefinationList() {
        return productDefinationList;
    }

    public void setProductDefinationList(ArrayList<ProductDefination> productDefinationList) {
        this.productDefinationList = productDefinationList;
    }
    
    public ProductDefination addProductDefination(ProductDefination productDefination){
        productDefinationList.add(productDefination);
        return productDefination;
    }
    
    public ProductDefination searchProductDefination(String keyword){
        for (ProductDefination productDefination : productDefinationList) {
            if(productDefination.getProductName().equals(keyword)){
                return productDefination;
            }
        }
        return null;
    }
}
