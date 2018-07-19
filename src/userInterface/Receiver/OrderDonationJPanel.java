/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Receiver;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Organization.Organization;
import Business.Product.Inventory;
import Business.Product.InventoryItem;
import Business.Receiver.Receiver;
import Business.UserAccount.UserAccount;
import java.awt.CardLayout;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Janhavi
 */
public class OrderDonationJPanel extends javax.swing.JPanel {

    /**
     * Creates new form OrderDonationJPanel
     */

    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private UserAccount account;
    private Organization organization;
    private Ecosystem system;
    private InventoryItem i;
    private Receiver r;
    private Date currentDate;
    private Calendar date1;
    private Calendar date2;
    private Inventory inventory;



    public OrderDonationJPanel(JPanel userProcessContainer, UserAccount account, Organization organization, Enterprise enterprise, Ecosystem system, Inventory inventory) {
         initComponents();
         
         date1 = new GregorianCalendar();
         date2 = new GregorianCalendar();
              
              SimpleDateFormat sdf = new SimpleDateFormat("ddMMyyyy");

        this.inventory=inventory;
        this.userProcessContainer=userProcessContainer;
        this.account=account;
        this.enterprise=enterprise;
        this.organization=organization;
        this.system=system;
        r= (Receiver) account.getReceiver();
        this.enterprise=enterprise;
        this.currentDate= new Date();
        
        

        populateTable();

    }
    
 
    public int daysBetween(Date d1, Date d2){
             return (int)( (d2.getTime() - d1.getTime()) / (1000 * 60 * 60 * 24));
     }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) inventoryJTable.getModel();
        model.setRowCount(0);
        
        
        try{
        
        for(InventoryItem i : inventory.getInventoryItemList()){
            
            String[] receiverRequest = r.getCatersTo();
            System.out.println(receiverRequest[0]);
            Boolean matches=false;
            for(int k=0; k<6; k++)
            {
            if(i.getCatersTo().equals(receiverRequest[0]))
            {
                matches=true;
            }
            if(i.getCatersTo()=="All")
            {
                matches=true;
            }
            }   
            if(matches==true)
            {
            int life;
            date1.setTime(currentDate);
            date2.setTime(i.getExpires());
            life = daysBetween(date1.getTime(), date2.getTime());
            System.out.println("Days= "+daysBetween(date1.getTime(),date2.getTime()));
            i.setLife(life);
            if(life>r.getDeliveryTime())
            {
                if(i.getQuantity()>0)
                {
            Object row[] = new Object[5];
            row[0] = i;
            row[1] = i.getExpDate();
            row[2] = i.getQuantity();
            row[3] = i.getCategory();
            row[4] = i.getUnit();
            model.addRow(row);
            }
            }
            }
        }
        
        }
        catch(NullPointerException exception)
        {

        }
        
        }


        public void populateAll(){
        DefaultTableModel model = (DefaultTableModel) inventoryJTable.getModel();
        model.setRowCount(0);
        
        
        try{
        
        for(InventoryItem i : inventory.getInventoryItemList()){
            
            int life;
            date1.setTime(currentDate);
            date2.setTime(i.getExpires());
            life = daysBetween(date1.getTime(), date2.getTime());
            System.out.println("Days= "+daysBetween(date1.getTime(),date2.getTime()));
            i.setLife(life);
            if(life>r.getDeliveryTime())
            {
                if(i.getQuantity()>0)
                {
            Object row[] = new Object[5];
            row[0] = i;
            row[1] = i.getExpDate();
            row[2] = i.getQuantity();
            row[3] = i.getCategory();
            row[4] = i.getUnit();
            model.addRow(row);
            
            }
            }
        }
        
        }
        catch(NullPointerException exception)
        {

        }
        
        }




    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryJTable = new javax.swing.JTable();
        BackJButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        quantitySpinner = new javax.swing.JSpinner();
        addtoCartButton6 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("Welcome");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 180, -1));

        inventoryJTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Expiry Date", "Quantity", "Category", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventoryJTable);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, 841, 224));

        BackJButton.setText("View Category Based Products");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });
        jPanel1.add(BackJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 450, 200, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Quantity:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 340, -1, -1));

        quantitySpinner.setModel(new javax.swing.SpinnerNumberModel(0, 0, null, 1));
        jPanel1.add(quantitySpinner, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 340, 40, -1));

        addtoCartButton6.setText("Place Your Order");
        addtoCartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addtoCartButton6ActionPerformed(evt);
            }
        });
        jPanel1.add(addtoCartButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 340, -1, -1));

        jButton1.setText("View All Products");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 450, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 970, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 970, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 670, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 670, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed
        // TODO add your handling code here:
       populateTable();
    }//GEN-LAST:event_BackJButtonActionPerformed

    private void addtoCartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addtoCartButton6ActionPerformed
        // TODO add your handling code here:

        int row1 = inventoryJTable.getSelectedRow();
        
        if(row1<0){
            JOptionPane.showMessageDialog(null, "Please select a row!!", "Warning", JOptionPane.WARNING_MESSAGE);
        }
        int dialogButton = JOptionPane.YES_NO_OPTION;
        int dialogOption = JOptionPane.showConfirmDialog(null, "Are you sure you want to Order these Items?", TOOL_TIP_TEXT_KEY, WIDTH, HEIGHT);
        if(dialogOption == JOptionPane.YES_OPTION)
        {
            int fetchQty = (Integer)quantitySpinner.getValue();
            if(fetchQty <= 0){
                JOptionPane.showMessageDialog(null, "Quantity must be more than zero", "Warning", JOptionPane.WARNING_MESSAGE);
                return;
            }
            InventoryItem selectItem = (InventoryItem) inventoryJTable.getValueAt(row1, 0);
            
          //  try{
                if(fetchQty <= selectItem.getQuantity()){
                    
                            int oldQ = selectItem.getQuantity();
                            int newQ = selectItem.getQuantity() - fetchQty;
                            selectItem.setQuantity(newQ);
                            InventoryItem i=new InventoryItem();
                            i.setProductName(selectItem.getProductName());
                            i.setDate(selectItem.getDate());
                            i.setMonth(selectItem.getMonth());
                            i.setYear(selectItem.getYear());
                            i.setQuantity(fetchQty);
                            i.setIsOrdered(true);
                            i.setOrderedBy(account.getUsername());
                            inventory.addInventoryItem(i);
                            
                }else{
                    JOptionPane.showMessageDialog(null, "Quantity is greater than  availability", "Warning", JOptionPane.WARNING_MESSAGE);
                }
                /*
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Invalid sales value", "Warning", JOptionPane.WARNING_MESSAGE);
                System.out.println(e);
            }*/
        }
                        populateTable();



    }//GEN-LAST:event_addtoCartButton6ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        populateAll();
    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JButton addtoCartButton6;
    private javax.swing.JTable inventoryJTable;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSpinner quantitySpinner;
    // End of variables declaration//GEN-END:variables
}
