/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formjavatable;

import static formjavatable.Staff.savedStaff;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DATV
 */
public class formjavatable extends javax.swing.JFrame {

    /**
     * Creates new form formjavatable
     */
    public formjavatable() {
        initComponents();

        try {
            if (!savedStaff.exists()) {
                savedStaff.createNewFile();
                return;
            }
//            readFile();
        } catch (final IOException ex) {
            ex.printStackTrace();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        txtSenority = new javax.swing.JTextField();
        txtName = new javax.swing.JTextField();
        txtBirth = new javax.swing.JTextField();
        txtAddress = new javax.swing.JTextField();
        txtGender = new javax.swing.JTextField();
        txtTelephone = new javax.swing.JTextField();
        txtEmail = new javax.swing.JTextField();
        txtDepartment = new javax.swing.JTextField();
        txtSalary = new javax.swing.JTextField();
        txtBasicSalary = new javax.swing.JTextField();
        txtCoefficient = new javax.swing.JTextField();
        btnChangePath = new javax.swing.JButton();
        btnAdd = new javax.swing.JButton();
        btnRead = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();
        btnDeleteFile = new javax.swing.JButton();
        btnDeleteLine = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jLabel1.setText("senority");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(50, 390, 60, 20);

        jLabel2.setText("Name");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(50, 60, 27, 14);

        jLabel3.setText("Birth");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(50, 90, 34, 14);

        jLabel4.setText("Address");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(50, 120, 60, 14);

        jLabel5.setText("Gender");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(50, 150, 60, 20);

        jLabel6.setText("Telephone");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(50, 180, 60, 20);

        jLabel7.setText("Email");
        getContentPane().add(jLabel7);
        jLabel7.setBounds(50, 210, 60, 20);

        jLabel8.setText("Department");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(50, 250, 60, 20);

        jLabel9.setText("Salary");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(50, 280, 60, 20);

        jLabel10.setText("Basicsalary");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(50, 310, 60, 20);

        jLabel11.setText("Coefficien");
        getContentPane().add(jLabel11);
        jLabel11.setBounds(50, 350, 60, 20);
        getContentPane().add(txtSenority);
        txtSenority.setBounds(170, 390, 220, 20);
        getContentPane().add(txtName);
        txtName.setBounds(170, 60, 220, 20);
        getContentPane().add(txtBirth);
        txtBirth.setBounds(170, 90, 220, 20);
        getContentPane().add(txtAddress);
        txtAddress.setBounds(170, 120, 220, 20);
        getContentPane().add(txtGender);
        txtGender.setBounds(170, 150, 220, 20);
        getContentPane().add(txtTelephone);
        txtTelephone.setBounds(170, 180, 220, 20);
        getContentPane().add(txtEmail);
        txtEmail.setBounds(170, 210, 220, 20);
        getContentPane().add(txtDepartment);
        txtDepartment.setBounds(170, 240, 220, 20);
        getContentPane().add(txtSalary);
        txtSalary.setBounds(170, 280, 220, 20);
        getContentPane().add(txtBasicSalary);
        txtBasicSalary.setBounds(170, 310, 220, 20);
        getContentPane().add(txtCoefficient);
        txtCoefficient.setBounds(170, 350, 220, 20);

        btnChangePath.setText("Change path");
        btnChangePath.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnChangePathActionPerformed(evt);
            }
        });
        getContentPane().add(btnChangePath);
        btnChangePath.setBounds(570, 190, 100, 50);

        btnAdd.setText("Add");
        btnAdd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddActionPerformed(evt);
            }
        });
        getContentPane().add(btnAdd);
        btnAdd.setBounds(570, 60, 51, 50);

        btnRead.setText("Read");
        btnRead.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReadActionPerformed(evt);
            }
        });
        getContentPane().add(btnRead);
        btnRead.setBounds(640, 60, 57, 50);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });
        getContentPane().add(btnUpdate);
        btnUpdate.setBounds(710, 60, 80, 50);

        btnDeleteFile.setText("Delete File");
        btnDeleteFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteFileActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteFile);
        btnDeleteFile.setBounds(570, 120, 100, 50);

        btnDeleteLine.setText("Delete Line");
        btnDeleteLine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeleteLineActionPerformed(evt);
            }
        });
        getContentPane().add(btnDeleteLine);
        btnDeleteLine.setBounds(690, 120, 100, 50);

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Birth", "Address", "Gender", "Telephone", "Email", "Department", "Salary", "Basic Salary", "Coefficient", "Senority", "Real Salary"
            }
        ));
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(table);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(30, 430, 950, 280);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void readFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader(Staff.savedStaff))) {
            DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
            tableModel.setRowCount(0);

            String s;
            while ((s = reader.readLine()) != null) {
                String[] dump = s.split("\\$");
                Staff staff = new Staff(dump[0], dump[1], dump[2], dump[3], Integer.parseInt(dump[4]), 
                        dump[5], dump[6], Float.parseFloat(dump[7]), Float.parseFloat(dump[8]), 
                        Float.parseFloat(dump[9]), Float.parseFloat(dump[10]));
                Staff.STAFF_MAP.put(dump[0], staff);
                tableModel.addRow(staff.getInfo().split("\\$"));
            }
        }

        // Chac chan rang staff trong file da load het
        Staff.STAFF_MAP.values().forEach((staff) -> {
            System.out.println(staff.getInfo());
        });
    }

    private void btnReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReadActionPerformed
        try {
            readFile();
        } catch (IOException ex) {
            Logger.getLogger(formjavatable.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnReadActionPerformed

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        String name = tableModel.getValueAt(table.getSelectedRow(), 0).toString();
        String birth = tableModel.getValueAt(table.getSelectedRow(), 1).toString();
        String address = tableModel.getValueAt(table.getSelectedRow(), 2).toString();
        String gender = tableModel.getValueAt(table.getSelectedRow(), 3).toString();
        String telephone = tableModel.getValueAt(table.getSelectedRow(), 4).toString();
        String email = tableModel.getValueAt(table.getSelectedRow(), 5).toString();
        String department = tableModel.getValueAt(table.getSelectedRow(), 6).toString();
        String salary = tableModel.getValueAt(table.getSelectedRow(), 7).toString();
        String basicsalary = tableModel.getValueAt(table.getSelectedRow(), 8).toString();
        String coefficient = tableModel.getValueAt(table.getSelectedRow(), 9).toString();
        String senority = tableModel.getValueAt(table.getSelectedRow(), 10).toString();

        txtName.setText(name);
        txtBirth.setText(birth);
        txtAddress.setText(address);
        txtGender.setText(gender);
        txtTelephone.setText(telephone);
        txtEmail.setText(email);
        txtDepartment.setText(department);
        txtSalary.setText(salary);
        txtBasicSalary.setText(basicsalary);
        txtCoefficient.setText(coefficient);
        txtSenority.setText(senority);
    }//GEN-LAST:event_tableMouseClicked

    private void btnAddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        if (txtName.getText().equals("") || txtBirth.getText().equals("") || txtAddress.getText().equals("") || 
                txtGender.getText().equals("") || txtTelephone.getText().equals("")
                || txtEmail.getText().equals("") || txtDepartment.getText().equals("") || txtSalary.getText().equals("") || 
                txtBasicSalary.getText().equals("") || txtCoefficient.getText().equals("") || txtSenority.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Table empty, please enter the value beside .... ");
        } else {
            Staff staff = new Staff(txtName.getText(), txtBirth.getText(), txtAddress.getText(), txtGender.getText(),
                    Long.parseLong(txtTelephone.getText()), txtEmail.getText(),
                    txtDepartment.getText(), Float.parseFloat(txtSalary.getText()), Float.parseFloat(txtBasicSalary.getText()),
                    Float.parseFloat(txtCoefficient.getText()), Float.parseFloat(txtSenority.getText()));
            Staff.addStaff(staff);
            tableModel.addRow(staff.getInfo().split("\\$"));
            JOptionPane.showMessageDialog(this, "Add successfully!!!");
            txtName.setText("");
            txtBirth.setText("");
            txtAddress.setText("");
            txtGender.setText("");
            txtTelephone.setText("");
            txtEmail.setText("");
            txtDepartment.setText("");
            txtSalary.setText("");
            txtBasicSalary.setText("");
            txtCoefficient.setText("");
            txtSenority.setText("");
        }
    }//GEN-LAST:event_btnAddActionPerformed

    private void btnDeleteFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteFileActionPerformed
        Staff.savedStaff.delete();
    }//GEN-LAST:event_btnDeleteFileActionPerformed

    private void btnDeleteLineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeleteLineActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {
            tableModel.removeRow(table.getSelectedRow());
        } else {
            if (table.getSelectedRow() == 0) {
                JOptionPane.showMessageDialog(this, "Table empty, please enter the value biside table to delete....");
            } else {
                JOptionPane.showMessageDialog(this, "Please click a row to delete ....");
            }
        }
    }//GEN-LAST:event_btnDeleteLineActionPerformed

    private void btnChangePathActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnChangePathActionPerformed
        boolean isMoved = Staff.savedStaff.renameTo(new File("C:/Users/DATV/Desktop/alo1234.dat"));
    }//GEN-LAST:event_btnChangePathActionPerformed

    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        DefaultTableModel tableModel = (DefaultTableModel) table.getModel();
        if (table.getSelectedRowCount() == 1) {
            String name = txtName.getText();
            String birth = txtBirth.getText();
            String address = txtAddress.getText();
            String gender = txtGender.getText();
            String telephone = txtTelephone.getText();
            String email = txtEmail.getText();
            String department = txtDepartment.getText();
            String salary = txtSalary.getText();
            String basicsalary = txtBasicSalary.getText();
            String coefficient = txtCoefficient.getText();
            String senority = txtSenority.getText();

            tableModel.setValueAt(name, table.getSelectedRow(), 0);
            tableModel.setValueAt(birth, table.getSelectedRow(), 1);
            tableModel.setValueAt(address, table.getSelectedRow(), 2);
            tableModel.setValueAt(gender, table.getSelectedRow(), 3);
            tableModel.setValueAt(telephone, table.getSelectedRow(), 4);
            tableModel.setValueAt(email, table.getSelectedRow(), 5);
            tableModel.setValueAt(department, table.getSelectedRow(), 6);
            tableModel.setValueAt(salary, table.getSelectedRow(), 7);
            tableModel.setValueAt(basicsalary, table.getSelectedRow(), 8);
            tableModel.setValueAt(coefficient, table.getSelectedRow(), 9);
            tableModel.setValueAt(senority, table.getSelectedRow(), 10);

            Staff staff = new Staff(name, birth, address, gender, Long.parseLong(telephone), email, department,
                    Float.parseFloat(salary), Float.parseFloat(basicsalary), Float.parseFloat(coefficient), Float.parseFloat((senority)));

            Staff.updateStaff(name, staff);

            JOptionPane.showMessageDialog(this, "Update successfully!!!");
        } else {
            if (table.getSelectedRow() == 0) {
                JOptionPane.showMessageDialog(this, "Please enter the value biside table...");
            } else {
                JOptionPane.showMessageDialog(this, "Please click update to update data....");
            }
            txtName.setText("");
            txtBirth.setText("");
            txtAddress.setText("");
            txtGender.setText("");
            txtTelephone.setText("");
            txtEmail.setText("");
            txtDepartment.setText("");
            txtSalary.setText("");
            txtBasicSalary.setText("");
            txtCoefficient.setText("");
            txtSenority.setText("");
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(formjavatable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formjavatable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formjavatable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formjavatable.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formjavatable().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnChangePath;
    private javax.swing.JButton btnDeleteFile;
    private javax.swing.JButton btnDeleteLine;
    private javax.swing.JButton btnRead;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextField txtBasicSalary;
    private javax.swing.JTextField txtBirth;
    private javax.swing.JTextField txtCoefficient;
    private javax.swing.JTextField txtDepartment;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSalary;
    private javax.swing.JTextField txtSenority;
    private javax.swing.JTextField txtTelephone;
    // End of variables declaration//GEN-END:variables
}