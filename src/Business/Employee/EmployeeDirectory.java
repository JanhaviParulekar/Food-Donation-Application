/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;
import Business.Donor.Donor;
import Business.Receiver.Receiver;
import java.util.ArrayList;

/**
 *
 * @author mahesh
 */
public class EmployeeDirectory {
    
    
    private ArrayList<Employee> employeeList;
    private ArrayList<Donor> donorList;
    private ArrayList<Receiver> receiverList;
    

    public EmployeeDirectory() {
        employeeList = new ArrayList<>();
        donorList = new ArrayList<>();
        receiverList = new ArrayList<>();
    }

    public ArrayList<Donor> getDonorList() {
        return donorList;
    }

    public ArrayList<Receiver> getReceiverList() {
        return receiverList;
    }

    
    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }
    


    public Employee createEmployee(String name) {
         Employee employee = new Employee();
        employee.setName(name);
        employeeList.add(employee);
        return employee;
    }
    
     public Donor createDonor(String name) {
         Donor  donor = new Donor();
        donor.setName(name);
        donorList.add(donor);
        return donor;
    }


               
        public Receiver createReceiver(String name) {
         Receiver receiver = new Receiver();
        receiver.setName(name);
        receiverList.add(receiver);
        return receiver;
    }



    public void deleteEmployee(Employee e) {
        employeeList.remove(e);
    }
}
