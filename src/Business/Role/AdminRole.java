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
import Business.UserAccount.UserAccount;
import userInterface.SystemAdminWorkArea.AdminJPanel;
import javax.swing.JPanel;
import Business.Product.ProductDefinationList;

/**
 *
 * @author mahesh
 */
public class AdminRole extends Role {

    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, ProductDefinationList productDefinationList, Inventory inventory) {
        return new AdminJPanel(userProcessContainer, enterprise, productDefinationList, inventory);
    }
    
}
