/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HumanResourcesOrganization;
import Business.Organization.InventoryOrganization;
import Business.Organization.Organization;
import Business.Product.Inventory;
import Business.Product.ProductDefinationList;
import Business.UserAccount.UserAccount;
import userInterface.HumanResources.InventoryManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mahesh
 */
public class InventoryManagerRole extends Role{

    
    @Override
     public String toString()
    {
        return "Inventory Manager";
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, ProductDefinationList productDefinationList, Inventory inventory) {
        
        System.out.println("in this method it is"+organization);
        return new InventoryManagerJPanel(userProcessContainer,productDefinationList,account,(InventoryOrganization) organization,enterprise,inventory,system);
        
        
    }

    
}
