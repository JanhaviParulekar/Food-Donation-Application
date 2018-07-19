/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Role;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import Business.Product.Inventory;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;
import userInterface.Donor.AddDonorJPanel;
import userInterface.DonorJPanel;
import userInterface.HumanResources.InventoryAssistantJPanel;
import Business.Product.ProductDefinationList;
/**
 *
 * @author Janhavi
 */
public class DonorRole extends Role{
    
     @Override
    public String toString()
    {
        return "Donor";
    }

    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, ProductDefinationList productDefinationList, Inventory inventory) {
        return new DonorJPanel(userProcessContainer, account, (DonorOrganization) organization, enterprise, system, productDefinationList);
    }








    
}
