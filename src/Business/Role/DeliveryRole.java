/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DeliveryOrganization;
import Business.Organization.Organization;
import Business.Product.Inventory;
import Business.Product.ProductDefinationList;
import Business.UserAccount.UserAccount;
import userInterface.Delivery.DeliveryManagerJPanel;
import javax.swing.JPanel;

/**
 *
 * @author Janhavi
 */
public class DeliveryRole extends Role{
       @Override
     public String toString()
    {
        return "DeliveryManager";
    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, ProductDefinationList productDefinationList, Inventory inventory) {
        return new DeliveryManagerJPanel(userProcessContainer,account,(DeliveryOrganization)organization,enterprise);
    }
    
}
