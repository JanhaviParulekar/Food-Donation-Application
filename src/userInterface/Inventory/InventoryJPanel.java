/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.Inventory;

import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Product.InventoryItem;
import java.awt.CardLayout;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author dabho
 */
public class InventoryJPanel extends javax.swing.JPanel {

    /**
     * Creates new form inventoryJPanel
     */
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private InventoryItem i;
    public InventoryJPanel(JPanel userProcessContainer, Enterprise enterprise) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        
        populateTable();
    }
    
    public void populateTable(){
        DefaultTableModel model = (DefaultTableModel) inventoryJTable.getModel();
        model.setRowCount(0);
        
        
        try{
        
        for(InventoryItem i : enterprise.getInventory().getInventoryItemList()){
            if(i.getIsOrdered()==false)
            {
            Object row[] = new Object[6];
            row[0] = i;
            row[1] = i.getExpDate();
            row[2] = i.getCatersTo();
            row[3] = i.getQuantity();
            row[4] = i.getCategory();
            row[5] = i.getUnit();
            model.addRow(row);
            }
        }
        }
        catch(NullPointerException exception)
        {
            JOptionPane.showMessageDialog(null, "No Donors currently available", "Warning", JOptionPane.WARNING_MESSAGE);

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

        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        inventoryJTable = new javax.swing.JTable();
        BackJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("      Inventory");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 60, 180, -1));

        inventoryJTable.setFont(new java.awt.Font("Times New Roman", 1, 18)); // NOI18N
        inventoryJTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Expiry Date", "Caters to", "Quantity", "Category", "Unit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(inventoryJTable);
        if (inventoryJTable.getColumnModel().getColumnCount() > 0) {
            inventoryJTable.getColumnModel().getColumn(0).setResizable(false);
            inventoryJTable.getColumnModel().getColumn(1).setResizable(false);
            inventoryJTable.getColumnModel().getColumn(2).setResizable(false);
            inventoryJTable.getColumnModel().getColumn(3).setResizable(false);
            inventoryJTable.getColumnModel().getColumn(4).setResizable(false);
            inventoryJTable.getColumnModel().getColumn(5).setResizable(false);
        }

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 180, 841, 224));

        BackJButton.setText("Back");
        BackJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackJButtonActionPerformed(evt);
            }
        });
        add(BackJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 540, 104, -1));
    }// </editor-fold>//GEN-END:initComponents

    private void BackJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BackJButtonActionPerformed
        // TODO add your handling code here:
        userProcessContainer.remove(this);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.previous(userProcessContainer);

    }//GEN-LAST:event_BackJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JTable inventoryJTable;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
