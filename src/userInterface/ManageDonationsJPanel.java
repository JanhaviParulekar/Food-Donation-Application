/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface;

import Business.Donor.Donor;
import Business.Product.Product;
import javax.swing.table.DefaultTableModel;
import javax.swing.JPanel;
import Business.Ecosystem;
import Business.Employee.Employee;
import Business.Enterprise.Enterprise;
import Business.Organization.DonorOrganization;
import Business.Organization.Organization;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import userInterface.Donor.UpdateDonorInventoryJPanel;
import Business.Product.ProductDefinationList;
import Business.Product.ProductDefination;
import Business.Product.Inventory;
import Business.Product.InventoryItem;
import Business.UserAccount.UserAccount;
import static com.db4o.qlin.QLinSupport.p;
import java.awt.Color;
import java.util.Date;
import jdk.nashorn.internal.objects.NativeString;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import userInterface.Donor.AddProductJPanel;
import userInterface.Donor.UpdateManageDonationJPanel;
/**
 *
 * @author dabho
 */
public class ManageDonationsJPanel extends javax.swing.JPanel {

    /**
     * Creates new form managedonationsJPanel
     */
    private JPanel userProcessContainer;
    private Product product;
    private Ecosystem system;
    private Enterprise enterprise;
    private ProductDefinationList productDefinationList;
    private InventoryItem inventoryItem;
    private Inventory inventory;
    private Donor d;
    
    
    

    public ManageDonationsJPanel(JPanel userProcessContainer, Enterprise enterprise, ProductDefinationList productDefinationList, Inventory inventory) {
        initComponents();
        this.inventory = inventory;
        this.enterprise = enterprise;
        this.userProcessContainer=userProcessContainer;
        this.system=system;
        this.productDefinationList=productDefinationList;
        donorComboBox();
    }
     public void donorComboBox(){
        donorNameJComboBox.removeAllItems();
        for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(o instanceof DonorOrganization)
            {
        for(Donor d : o.getEmployeeDirectory().getDonorList()){

            donorNameJComboBox.addItem(d);
        }
        }
        }
        
        populateTable();
        
    }
     public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) donationsJTable.getModel();
        model.setRowCount(0);
        
      /*  
        System.out.println(donorDirectory.getDonorList());
        for(Donor d: donorDirectory.getDonorList()){
        System.out.println(d.getName());
        for(Product p: d.getDonatedItems())
        {
            System.out.println(p.getName());
            System.out.println(p.getQuantity());
        }
        }
       */
        
        
        Donor donor = (Donor) donorNameJComboBox.getSelectedItem();
        this.d=donor;
        try{
            
       if(d.getIsSubmitted()==true)
        { 
        for(Product p : donor.getDonatedItems()){
            if(p.getIsInInventory()==false)
            {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getQuantity();
            row[2] = p.getExpDate();
            model.addRow(row);
            }
        }
        }
        }
        catch(NullPointerException exception)
        {
            //JOptionPane.showMessageDialog(null, "No Donors currently available", "Warning", JOptionPane.WARNING_MESSAGE);

        }
        }
     
     public void refreshTable() {
        DefaultTableModel model = (DefaultTableModel) donationsJTable.getModel();
        model.setRowCount(0);
        
        

        for(Product p : d.getDonatedItems()) {
            Object row[] = new Object[3];
            row[0] = p;
            row[1] = p.getQuantity();
            row[2] = p.getExpDate();

            model.addRow(row);
        }
    }

    public void dateCalculator(Date date)
     {
         String expiry;
         expiry=date.toString();
         System.out.println(expiry);
         String month="";
         int day;
         String d="";
         String y="";
         int year;
         for(int i=4; i<7; i++)
         {    
            String j =String.valueOf(expiry.charAt(i));
            month=month+j;
         }
         for(int i=24; i<28; i++)
         {    
            String k =String.valueOf(expiry.charAt(i));
            y=y+k;
         }
         for(int i=8; i<10; i++)
         {    
            String l =String.valueOf(expiry.charAt(i));
            d=d+l;

         }
            year=Integer.parseInt(y);
            day=Integer.parseInt(d);


         System.out.println(month);
                  System.out.println(day);

                           System.out.println(year);


     }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        donationsJTable = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        updateJButton = new javax.swing.JButton();
        addtoinventoryJButton = new javax.swing.JButton();
        backJButton = new javax.swing.JButton();
        removeJButton = new javax.swing.JButton();
        addDonationJButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        donorNameJComboBox = new javax.swing.JComboBox();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        updateExpiryJButton = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        jLabel1.setText("Manage Donations");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 20, 180, 39));

        donationsJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Quantity", "Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(donationsJTable);
        if (donationsJTable.getColumnModel().getColumnCount() > 0) {
            donationsJTable.getColumnModel().getColumn(0).setResizable(false);
            donationsJTable.getColumnModel().getColumn(1).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 210, 946, 146));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Donations List");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, 180, 39));

        updateJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        updateJButton.setText("Update");
        updateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateJButtonActionPerformed(evt);
            }
        });
        add(updateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 400, 180, 34));

        addtoinventoryJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addtoinventoryJButton.setText("Submit");
        addtoinventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoinventoryJButtonActionPerformed(evt);
            }
        });
        add(addtoinventoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 570, 180, 34));

        backJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        backJButton.setText("Back");
        backJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backJButtonActionPerformed(evt);
            }
        });
        add(backJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 590, 120, 30));

        removeJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        removeJButton.setText("Remove");
        removeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeJButtonActionPerformed(evt);
            }
        });
        add(removeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 400, 180, 34));

        addDonationJButton.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        addDonationJButton.setText("Add Donation");
        addDonationJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addDonationJButtonActionPerformed(evt);
            }
        });
        add(addDonationJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 400, 180, 34));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Donor Name:");
        add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 72, 180, 39));

        donorNameJComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                donorNameJComboBoxActionPerformed(evt);
            }
        });
        add(donorNameJComboBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, 380, -1));
        add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 150, -1, -1));

        updateExpiryJButton.setText("Update Expiry Date");
        updateExpiryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateExpiryJButtonActionPerformed(evt);
            }
        });
        add(updateExpiryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 150, -1, -1));

        jButton1.setText("View Report");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 510, -1, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void updateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateJButtonActionPerformed
        // TODO add your handling code here:
        int row1 = donationsJTable.getSelectedRow();
        
        if(row1<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Product p = (Product)donationsJTable.getValueAt(row1, 0);
        UpdateManageDonationJPanel updateManageDonationJPanel = new UpdateManageDonationJPanel(userProcessContainer, p);
        userProcessContainer.add("UpdateManageDonationJPanel", updateManageDonationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_updateJButtonActionPerformed

    private void addtoinventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoinventoryJButtonActionPerformed
        // TODO add your handling code here:
        if(d.getDonatedItems().size()>0){
        for(Product p: d.getDonatedItems())
        {
         if(p.getIsInInventory()==false)
         {
            boolean j=false;
            for(ProductDefination pd: productDefinationList.getProductDefinationList())
            {
                if(p.getName().equals(pd.getProductName()))
                {

                    for(InventoryItem i: inventory.getInventoryItemList())
                    {
                    if(p.getName().equals(i.getProductName()))
                    {
                    if(i.getYear()==p.getYear())
                    {
                    if(i.getMonth().equals(p.getMonth()))
                    {
                     if(i.getDate()==p.getDate())
                    {
                        int q = p.getQuantity();
                        int q1 = i.getQuantity();
                        i.setQuantity(q1+q);
                        j=true;
                        p.setIsInInventory(true);

                    }
                    }}
                    }
                }
                 
                    if(j==false)
        {
                    inventoryItem = new InventoryItem();
                    inventoryItem.setProductName(pd.getProductName());
                    inventoryItem.setCategory(pd.getCategory());
                    inventoryItem.setCatersTo(pd.getCatersTo());
                    inventoryItem.setUnit(pd.getUnit());
                    inventoryItem.setExpDate(String.valueOf(p.getDate())+" "+String.valueOf(p.getMonth())+" "+String.valueOf(p.getYear()));
                    inventoryItem.setQuantity(p.getQuantity());
                    inventoryItem.setDate(p.getDate());
                    inventoryItem.setMonth(p.getMonth());
                    inventoryItem.setYear(p.getYear());
                    inventoryItem.setExpires(p.getExpDate());
                    inventory.addInventoryItem(inventoryItem);
                    p.setIsInInventory(true);
        }
                }
            }          
        }
        }
        populateTable();
        JOptionPane.showMessageDialog(null, "Inventory Successfully Submitted ");
        

        }else{
            JOptionPane.showMessageDialog(null, "Cart is empty", "Warning", JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_addtoinventoryJButtonActionPerformed

    private void backJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backJButtonActionPerformed
        // TODO add your handling code here:
                userProcessContainer.remove(this);
               CardLayout layout = (CardLayout) userProcessContainer.getLayout();
                layout.previous(userProcessContainer);

    }//GEN-LAST:event_backJButtonActionPerformed

    private void removeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeJButtonActionPerformed
        // TODO add your handling code here:
        int row = donationsJTable.getSelectedRow();
        
        if(row<0) {
            JOptionPane.showMessageDialog(null, "Please select a row from the table first", "Warning", JOptionPane.WARNING_MESSAGE);
            return;
        }
        Product p = (Product)donationsJTable.getValueAt(row, 0);
        d.removeProduct(p);
        refreshTable();
    }//GEN-LAST:event_removeJButtonActionPerformed

    private void addDonationJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addDonationJButtonActionPerformed
        // TODO add your handling code here:
        AddProductJPanel create = new AddProductJPanel(userProcessContainer,productDefinationList,d);
        userProcessContainer.add("AddProductJPanel", create);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_addDonationJButtonActionPerformed

    private void donorNameJComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_donorNameJComboBoxActionPerformed
        // TODO add your handling code here:
        populateTable();
    }//GEN-LAST:event_donorNameJComboBoxActionPerformed

    private void updateExpiryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateExpiryJButtonActionPerformed
        // TODO add your handling code here:
        int row1 = donationsJTable.getSelectedRow();
        
        if(row1<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        Product p = (Product)donationsJTable.getValueAt(row1, 0);
        p.setExpDate(jDateChooser1.getDate());
       String expiry;
         expiry=jDateChooser1.getDate().toString();
         System.out.println(expiry);
         String month="";
         int day;
         String d="";
         String y="";
         int year;
         for(int i=4; i<7; i++)
         {    
            String j =String.valueOf(expiry.charAt(i));
            month=month+j;
         }
         for(int i=24; i<28; i++)
         {    
            String k =String.valueOf(expiry.charAt(i));
            y=y+k;
         }
         for(int i=8; i<10; i++)
         {    
            String l =String.valueOf(expiry.charAt(i));
            d=d+l;

         }
            year=Integer.parseInt(y);
            day=Integer.parseInt(d);

            p.setDate(day);
            p.setMonth(month);
            p.setYear(year);


        //dateCalculator(jDateChooser1.getDate());
        populateTable();
        
    }//GEN-LAST:event_updateExpiryJButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateFields();
    }//GEN-LAST:event_jButton1ActionPerformed

    public void populateFields() {


            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

           for(Organization o: enterprise.getOrganizationDirectory().getOrganizationList())
        {
            if(o instanceof DonorOrganization)
            {
            for(Donor d : o.getEmployeeDirectory().getDonorList()){
  

                dataset.setValue(d.getDonatedItems().size(), "Donation made", d.getName());
                System.out.println(d.getDonatedItems().size()+"hi "+d.getName());
            }
            }
        }
            
                JFreeChart chart = ChartFactory.createBarChart("Quantity of Products", "Name of Donors", "", dataset, PlotOrientation.VERTICAL, false, true, false);
                CategoryPlot p = chart.getCategoryPlot();
                p.setRangeGridlinePaint(Color.RED);
                ChartFrame frame = new ChartFrame("BarChart", chart);
                frame.setVisible(true);
                frame.setSize(450, 350);
                
        }
 
        
       
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addDonationJButton;
    private javax.swing.JButton addtoinventoryJButton;
    private javax.swing.JButton backJButton;
    private javax.swing.JTable donationsJTable;
    private javax.swing.JComboBox donorNameJComboBox;
    private javax.swing.JButton jButton1;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton removeJButton;
    private javax.swing.JButton updateExpiryJButton;
    private javax.swing.JButton updateJButton;
    // End of variables declaration//GEN-END:variables
}
