/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Organization;
import Business.Organization.Organization.Type;
import java.util.ArrayList;

/**
 *
 * @author Jiya
 */
public class OrganizationDirectory {
    private ArrayList<Organization> organizationList;
    
    public OrganizationDirectory()
    {
        organizationList = new ArrayList<>();
    }

    public ArrayList<Organization> getOrganizationList() {
        return organizationList;
    }

    public void setOrganizationList(ArrayList<Organization> organizationList) {
        this.organizationList = organizationList;
    }
    
    public Organization createOrganization(Type type)
    {
        Organization o = null;
        if(type.getValue().equals(Type.HumanResources.getValue()))
        {
            o = new HumanResourcesOrganization();
            organizationList.add(o);
        }
        else if(type.getValue().equals(Type.Inventory.getValue()))
        {
            o = new InventoryOrganization();
            organizationList.add(o);
        }
        else if(type.getValue().equals(Type.Donor.getValue()))
        {
            o = new DonorOrganization();
            organizationList.add(o);
        }
        else if(type.getValue().equals(Type.Receiver.getValue()))
        {
            o = new ReceiverOrganization();
            organizationList.add(o);
        }
        else if(type.getValue().equals(Type.Delivery.getValue()))
        {
            o = new DeliveryOrganization();
            organizationList.add(o);
        }
      
        return o;
    }
}
