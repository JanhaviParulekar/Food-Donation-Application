/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package userInterface.HumanResources;

/**
 *
 * @author dabho
 */
public class AddEmployeeJPanel extends javax.swing.JPanel {

    /**
     * Creates new form addemployeeJPanel
     */
    public AddEmployeeJPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeenameJLabel = new javax.swing.JLabel();
        employeeJTextField = new javax.swing.JTextField();
        roleJTextField = new javax.swing.JTextField();
        roleJLabel = new javax.swing.JLabel();
        departmentJLabel = new javax.swing.JLabel();
        departmentJTextField = new javax.swing.JTextField();
        BackJButton = new javax.swing.JButton();
        CreateJButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(970, 670));
        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        employeenameJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        employeenameJLabel.setText("Employee Name :");
        add(employeenameJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 220, 150, 22));
        add(employeeJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 220, 221, -1));
        add(roleJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 260, 221, -1));

        roleJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        roleJLabel.setText("Role :");
        add(roleJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 260, 150, 22));

        departmentJLabel.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        departmentJLabel.setText("Department :");
        add(departmentJLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 300, 150, 22));
        add(departmentJTextField, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 300, 221, -1));

        BackJButton.setText("Back");
        add(BackJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 420, 104, -1));

        CreateJButton.setText("Ceate");
        CreateJButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CreateJButtonActionPerformed(evt);
            }
        });
        add(CreateJButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 420, 104, -1));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("   Add Employee");
        add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 130, 176, 32));
    }// </editor-fold>//GEN-END:initComponents

    private void CreateJButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CreateJButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CreateJButtonActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BackJButton;
    private javax.swing.JButton CreateJButton;
    private javax.swing.JLabel departmentJLabel;
    private javax.swing.JTextField departmentJTextField;
    private javax.swing.JTextField employeeJTextField;
    private javax.swing.JLabel employeenameJLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel roleJLabel;
    private javax.swing.JTextField roleJTextField;
    // End of variables declaration//GEN-END:variables
}
