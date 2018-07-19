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
public class Inventory {
    private ArrayList<InventoryItem> inventoryItemList;
    
    public Inventory()
    {
        inventoryItemList = new ArrayList<>();
    }

    public ArrayList<InventoryItem> getInventoryItemList() {
        return inventoryItemList;
    }

    public void setInventoryItemList(ArrayList<InventoryItem> inventoryItemList) {
        this.inventoryItemList = inventoryItemList;
    }
    
        
    public InventoryItem addInventoryItem(InventoryItem inventoryItem){
        inventoryItemList.add(inventoryItem);
        return inventoryItem;
    }
    
    public InventoryItem searchInventoryItem(String keyword){
        for (InventoryItem inventoryItem : inventoryItemList) {
            if(inventoryItem.getProductName().equals(keyword)){
                return inventoryItem;
            }
        }
        return null;
    }
    
}
