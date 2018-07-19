/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Product.Inventory;
import Business.Product.ProductDefinationList;
import Business.UserAccount.UserAccount;
import userInterface.HumanResources.InventoryAssistantJPanel;
import javax.swing.JPanel;
import userInterface.Inventory.InventoryJPanel;

/**
 *
 * @author mahesh
 */
public class InventoryAssistantRole extends Role {
    
    

     @Override
    public String toString()
    {
        return "Inventory Assistant";
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, ProductDefinationList productDefinationList,  Inventory inventory) {
        return new InventoryAssistantJPanel(userProcessContainer, account, organization, system, enterprise);
    }
    
}
