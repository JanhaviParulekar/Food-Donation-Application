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
import javax.swing.JPanel;
import userInterface.HumanResources.InventoryAssistantJPanel;
import userInterface.Receiver.OrderDonationJPanel;

/**
 *
 * @author Janhavi
 */
public class ReceiverRole extends Role{

    
    public String toString()
    {
        return "Receiver";
    }

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, ProductDefinationList productDefinationList, Inventory inventory) {
        return new OrderDonationJPanel(userProcessContainer, account, organization, enterprise, system,inventory);
    }

   
    
}
