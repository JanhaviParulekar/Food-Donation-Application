/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;

import Business.Role.CustomerRelationAssistantRole;
import Business.Role.CustomerRelationManagerRole;
import Business.Role.Role;
import java.util.ArrayList;

/**
 *
 * @author mahesh
 */
public class HumanResourcesOrganization extends Organization {
     public HumanResourcesOrganization()
    {
        super(Organization.Type.HumanResources.getValue());
    }


    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roles = new ArrayList<>();
       roles.add(new CustomerRelationManagerRole());
       roles.add(new CustomerRelationAssistantRole());
       return roles;
    }

   


    
}

