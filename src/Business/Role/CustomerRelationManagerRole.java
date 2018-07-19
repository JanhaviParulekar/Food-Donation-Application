/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.HumanResourcesOrganization;
import Business.Organization.Organization;
import Business.Product.Inventory;
import Business.Product.ProductDefinationList;
import Business.UserAccount.UserAccount;
import userInterface.HumanResources.CustomerRelationManagerWorkAreaJPanel;
import javax.swing.JPanel;

/**
 *
 * @author mahesh
 */
public class CustomerRelationManagerRole extends Role {
    
   

    @Override
     public String toString()
    {
        return "Customer Relation Manager";
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, ProductDefinationList productDefinationList,  Inventory inventory) {
        return new CustomerRelationManagerWorkAreaJPanel(userProcessContainer,account,(HumanResourcesOrganization) organization,enterprise);
    }
    
}