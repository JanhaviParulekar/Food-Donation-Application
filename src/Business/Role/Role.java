/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import Business.Product.ProductDefinationList;
import Business.Product.Inventory;

/**
 *
 * @author mahesh
 */
public abstract class Role {



    
    public enum RoleType{
        Admin("Admin Role"),
        CustomerRelationAssistant("Customer Relation Assistant Role"),
        CustomerRelationManager("Customer Relation Manager Role"),
        InventoryAssistant("Inventory Assistant Role"),
        InventoryManager("Inventory Manager Role"),
        Donor("Donor Role");
        
        
        private String value;
        private RoleType(String value)
        {
            this.value = value;
        }

        public String getValue() {
            return value;
        }
        
        @Override
        public String toString()
        {
            return this.value;
        }
    }
   public abstract JPanel createWorkArea(JPanel userProcessContainer, 
            UserAccount account, 
            Organization organization, 
            Enterprise enterprise, 
            Ecosystem system,
            ProductDefinationList productDefinationList,
            Inventory inventory);

    @Override
    public String toString() {
        return this.getClass().getName();
    }

}

    

