/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.SystemAdminWorkArea;

import Business.Donor.Donor;
import userInterface.ManageEmployeeJPanel;
import Business.Ecosystem;
import Business.Enterprise.Enterprise;
import Business.Product.ProductDefinationList;
import userInterface.ManageDonationsJPanel;
import userInterface.HumanResources.ManageOrganizationJPanel;
import java.awt.CardLayout;
import javax.swing.JPanel;
import userInterface.Donor.AddDonorJPanel;
import userInterface.Receiver.AddUserJPanel;
import Business.Product.Inventory;
import Business.Product.InventoryItem;
import java.awt.Color;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import userInterface.Inventory.InventoryJPanel;

/**
 *
 * @author dabho
 */
public class AdminJPanel extends javax.swing.JPanel {

    /**
     * Creates new form adminJPanel
     */
   
    private JPanel userProcessContainer;
    private Enterprise enterprise;
    private ProductDefinationList productDefinationList;
    private Inventory inventory;


    public AdminJPanel(JPanel userProcessContainer, Enterprise enterprise, ProductDefinationList productDefinationList, Inventory inventory) {
        initComponents();
        this.userProcessContainer=userProcessContainer;
        this.enterprise=enterprise;
        this.productDefinationList=productDefinationList;
        this.inventory=inventory;
    }

    public AdminJPanel(JPanel userProcessContainer, Enterprise enterprise, ProductDefinationList productDefinationList) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        adduserJButton = new javax.swing.JButton();
        checkinventoryJButton = new javax.swing.JButton();
        manageEmployeeBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        managedonationsJButton = new javax.swing.JButton();
        manageemployeeJButton = new javax.swing.JButton();
        manageReceiverJButton = new javax.swing.JButton();
        manageDonorrJButton = new javax.swing.JButton();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        adduserJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        adduserJButton.setText("Manage Organization");
        adduserJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                adduserJButtonActionPerformed(evt);
            }
        });
        add(adduserJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 70, 308, 54));

        checkinventoryJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        checkinventoryJButton.setText("Check Inventory");
        checkinventoryJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                checkinventoryJButtonActionPerformed(evt);
            }
        });
        add(checkinventoryJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 560, 308, 54));

        manageEmployeeBtn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageEmployeeBtn.setText("Manage Employee");
        manageEmployeeBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageEmployeeBtnActionPerformed(evt);
            }
        });
        add(manageEmployeeBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 150, 308, 54));

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel2.setText("      Admin Section");
        add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 6, 225, 32));

        managedonationsJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        managedonationsJButton.setText("Manage Doanations");
        managedonationsJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managedonationsJButtonActionPerformed(evt);
            }
        });
        add(managedonationsJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 480, 308, 54));

        manageemployeeJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageemployeeJButton.setText("Manage User Accounts");
        manageemployeeJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageemployeeJButtonActionPerformed(evt);
            }
        });
        add(manageemployeeJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 230, 308, 54));

        manageReceiverJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageReceiverJButton.setText("Manage Receiver");
        manageReceiverJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageReceiverJButtonActionPerformed(evt);
            }
        });
        add(manageReceiverJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 310, 310, 50));

        manageDonorrJButton.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        manageDonorrJButton.setText("Manage Donor");
        manageDonorrJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageDonorrJButtonActionPerformed(evt);
            }
        });
        add(manageDonorrJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 390, 310, 60));
    }// </editor-fold>//GEN-END:initComponents

    private void checkinventoryJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_checkinventoryJButtonActionPerformed
        // TODO add your handling code here:
        InventoryJPanel ijp = new InventoryJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("InventoryJPanel", ijp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_checkinventoryJButtonActionPerformed

    private void adduserJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_adduserJButtonActionPerformed
        // TODO add your handling code here:
        ManageOrganizationJPanel manageOrganizationJPanel = new ManageOrganizationJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("manageOrganizationJPanel", manageOrganizationJPanel);
        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
        
        
    }//GEN-LAST:event_adduserJButtonActionPerformed

    private void manageEmployeeBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageEmployeeBtnActionPerformed
        // TODO add your handling code here:
        
           ManageEmployeeJPanel manageEmployeeJPanel = new ManageEmployeeJPanel(userProcessContainer, enterprise.getOrganizationDirectory());
        userProcessContainer.add("manageEmployeeJPanel", manageEmployeeJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageEmployeeBtnActionPerformed

    private void manageemployeeJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageemployeeJButtonActionPerformed
        // TODO add your handling code here:
          ManageUserAccountJPanel muajp = new ManageUserAccountJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("ManageUserAccountJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageemployeeJButtonActionPerformed

    private void managedonationsJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managedonationsJButtonActionPerformed
        // TODO add your handling code here:
        
        ManageDonationsJPanel muajp = new ManageDonationsJPanel(userProcessContainer, enterprise, productDefinationList,inventory);
        userProcessContainer.add("ManageDonationsJPanel", muajp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
      
    }//GEN-LAST:event_managedonationsJButtonActionPerformed

    private void manageReceiverJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageReceiverJButtonActionPerformed
        // TODO add your handling code here:
        AddUserJPanel addUserJPanel = new AddUserJPanel(userProcessContainer,enterprise);
        userProcessContainer.add("AddUserJPanel", addUserJPanel);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);
    }//GEN-LAST:event_manageReceiverJButtonActionPerformed

    private void manageDonorrJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageDonorrJButtonActionPerformed
        // TODO add your handling code here:
      
        AddDonorJPanel adjp = new AddDonorJPanel(userProcessContainer, enterprise);
        userProcessContainer.add("AddDonorJPanel", adjp);

        CardLayout layout = (CardLayout) userProcessContainer.getLayout();
        layout.next(userProcessContainer);

    }//GEN-LAST:event_manageDonorrJButtonActionPerformed

        public void populateFields() {


            DefaultCategoryDataset dataset = new DefaultCategoryDataset();

            for (Donor d : enterprise.getEmployeeDirectory().getDonorList()) {
                
                dataset.setValue(d.getDonatedItems().size(), "Donations", d.getName());
                System.out.println(d.getDonatedItems().size()+" "+d.getName());
            }
            
                JFreeChart chart = ChartFactory.createBarChart("Donations made by donors", "Name of Donors", "", dataset, PlotOrientation.VERTICAL, false, true, false);
                CategoryPlot p = chart.getCategoryPlot();
                p.setRangeGridlinePaint(Color.RED);
                ChartFrame frame = new ChartFrame("BarChart", chart);
                frame.setVisible(true);
                frame.setSize(450, 350);
                
        }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton adduserJButton;
    private javax.swing.JButton checkinventoryJButton;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JButton manageDonorrJButton;
    private javax.swing.JButton manageEmployeeBtn;
    private javax.swing.JButton manageReceiverJButton;
    private javax.swing.JButton managedonationsJButton;
    private javax.swing.JButton manageemployeeJButton;
    // End of variables declaration//GEN-END:variables
}
