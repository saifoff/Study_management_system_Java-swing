/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package studymanagementsystem;

import java.sql.Connection;
import java.sql.Date;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author saiful
 */
public class CourseTask extends javax.swing.JFrame {

    /**
     * Creates new form CourseTask
     */
    public CourseTask() {
        initComponents();
        table_update();
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
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TaskjTextArea = new javax.swing.JTextArea();
        CourseNamejTextField = new javax.swing.JTextField();
        taskjDateChooser = new com.toedter.calendar.JDateChooser();
        taskduejDateChooser = new com.toedter.calendar.JDateChooser();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        TaskAddjButton = new javax.swing.JButton();
        TaskUpdatejButton = new javax.swing.JButton();
        TaskDeletejButton = new javax.swing.JButton();
        TaskclearjButton = new javax.swing.JButton();
        HomejButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Task");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(153, 153, 255));

        jPanel2.setBackground(new java.awt.Color(51, 51, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Manage Your Task");

        jPanel3.setBackground(new java.awt.Color(153, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Date : ");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Task : ");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Course Name : ");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Due Date : ");

        TaskjTextArea.setColumns(20);
        TaskjTextArea.setRows(5);
        TaskjTextArea.setAutoscrolls(false);
        jScrollPane1.setViewportView(TaskjTextArea);

        taskjDateChooser.setDateFormatString("yyyy,MMM d");

        taskduejDateChooser.setDateFormatString("yyyy,MMM d");

        jTable1.setFont(new java.awt.Font("SansSerif", 0, 11)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Serial", "Date (yyyy-mmm-dd)", "Due Date", "Course Name", "Task"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.Object.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jTable1);
        if (jTable1.getColumnModel().getColumnCount() > 0) {
            jTable1.getColumnModel().getColumn(0).setResizable(false);
            jTable1.getColumnModel().getColumn(0).setPreferredWidth(20);
            jTable1.getColumnModel().getColumn(1).setResizable(false);
            jTable1.getColumnModel().getColumn(1).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(2).setResizable(false);
            jTable1.getColumnModel().getColumn(2).setPreferredWidth(50);
            jTable1.getColumnModel().getColumn(3).setResizable(false);
            jTable1.getColumnModel().getColumn(3).setPreferredWidth(80);
            jTable1.getColumnModel().getColumn(4).setResizable(false);
            jTable1.getColumnModel().getColumn(4).setPreferredWidth(270);
        }

        TaskAddjButton.setBackground(new java.awt.Color(51, 255, 0));
        TaskAddjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TaskAddjButton.setText("Add");
        TaskAddjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskAddjButtonActionPerformed(evt);
            }
        });

        TaskUpdatejButton.setBackground(new java.awt.Color(255, 255, 0));
        TaskUpdatejButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TaskUpdatejButton.setText("Update");
        TaskUpdatejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskUpdatejButtonActionPerformed(evt);
            }
        });

        TaskDeletejButton.setBackground(new java.awt.Color(255, 0, 0));
        TaskDeletejButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TaskDeletejButton.setText("Delete");
        TaskDeletejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskDeletejButtonActionPerformed(evt);
            }
        });

        TaskclearjButton.setBackground(new java.awt.Color(51, 51, 255));
        TaskclearjButton.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        TaskclearjButton.setText("Clear");
        TaskclearjButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TaskclearjButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel4)
                        .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                    .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CourseNamejTextField)
                    .addComponent(jScrollPane1)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(taskjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(36, 36, 36)
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(taskduejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(30, 30, 30))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addComponent(TaskAddjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(TaskUpdatejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(TaskclearjButton, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 112, Short.MAX_VALUE)
                .addComponent(TaskDeletejButton, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(69, 69, 69))
            .addComponent(jScrollPane2)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel2)
                        .addComponent(taskjDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(taskduejDateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))))
                .addGap(18, 26, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CourseNamejTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TaskAddjButton)
                    .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(TaskUpdatejButton)
                        .addComponent(TaskclearjButton))
                    .addComponent(TaskDeletejButton))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        HomejButton.setBackground(new java.awt.Color(51, 51, 255));
        HomejButton.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        HomejButton.setText("Home");
        HomejButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomejButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(HomejButton)
                .addGap(40, 40, 40))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(HomejButton))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 545, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void TaskUpdatejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskUpdatejButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        try {
            
            int serial = Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
            
            java.sql.Date taskdate = new java.sql.Date(taskjDateChooser.getDate().getTime()); //get input from datechooser1
            java.sql.Date taskduedate = new java.sql.Date(taskduejDateChooser.getDate().getTime()); //get input from datechooser2
            String coursename = CourseNamejTextField.getText();  //get input from text field1
            String task = TaskjTextArea.getText();  //get input from text field2
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursemanagement", "root", ""); //set connection with database
            insert = con1.prepareStatement("update coursetask set Date=?,Due_Date=?,Course_Name=?,Task=? where serial =?");
            insert.setDate(1, taskdate);
            insert.setDate(2, taskduedate);
            insert.setString(3, coursename);
            insert.setString(4, task);
            insert.setInt(5,serial);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Updated");
            table_update();

            taskjDateChooser.setDate(null);
            taskduejDateChooser.setDate(null);
            CourseNamejTextField.setText("");
            TaskjTextArea.setText("");
            taskjDateChooser.requestFocus();

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CourseTask.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to Add Record");

        }
        
    }//GEN-LAST:event_TaskUpdatejButtonActionPerformed

    Connection con1;
    PreparedStatement insert;
    
    private void table_update(){
        int c;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursemanagement","root",""); //set connection with database
            insert = con1.prepareStatement("select * from coursetask");
            ResultSet rs = insert.executeQuery();
            ResultSetMetaData Rss = rs.getMetaData();
            c = Rss.getColumnCount();
            
            DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
            Df.setRowCount(0);
            while(rs.next())
            {
                Vector v2 = new Vector();
                for(int a =1 ;a<=c; a++){
                    v2.add(rs.getInt("serial"));
                    v2.add(rs.getDate("Date"));
                    v2.add(rs.getDate("Due_Date"));
                    v2.add(rs.getString("Course_Name"));
                    v2.add(rs.getString("Task"));
                    
                }
                Df.addRow(v2); 
            }
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CourseTask.class.getName()).log(Level.SEVERE, null, ex);
           
        }
    
    }
    
    private void TaskAddjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskAddjButtonActionPerformed
        // TODO add your handling code here:
        java.sql.Date taskdate = new java.sql.Date(taskjDateChooser.getDate().getTime()); //get input from datechooser1
        java.sql.Date taskduedate = new java.sql.Date(taskduejDateChooser.getDate().getTime()); //get input from datechooser2
        String coursename = CourseNamejTextField.getText();  //get input from text field1
        String task = TaskjTextArea.getText();  //get input from text field2
        
        
        try {
           
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursemanagement","root",""); //set connection with database
            insert = con1.prepareStatement("insert into coursetask(Date,Due_Date,Course_Name,Task)values(?,?,?,?)");
            insert.setDate(1,taskdate);
            insert.setDate(2, taskduedate);
            insert.setString(3,coursename);
            insert.setString(4,task);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Added");
            table_update(); 
            
            taskjDateChooser.setDate(null);
            taskduejDateChooser.setDate(null);
            CourseNamejTextField.setText("");
            TaskjTextArea.setText("");
            taskjDateChooser.requestFocus();
            
            
            
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CourseTask.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to Add Record");
           
        }
        
        
    }//GEN-LAST:event_TaskAddjButtonActionPerformed

    private void TaskDeletejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskDeletejButtonActionPerformed
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        
        try {
            
            int serial = Integer.parseInt(Df.getValueAt(selectedIndex,0).toString());
            
            int dialogresult = JOptionPane.showConfirmDialog(null,"Do you want to delete this record?","Warning",JOptionPane.YES_NO_OPTION);
            
            if(dialogresult==JOptionPane.YES_OPTION){
                
            Class.forName("com.mysql.cj.jdbc.Driver");
            con1 = DriverManager.getConnection("jdbc:mysql://localhost:3306/coursemanagement", "root", ""); //set connection with database
            insert = con1.prepareStatement("delete from coursetask where serial =?");
            insert.setInt(1,serial);
            insert.executeUpdate();
            JOptionPane.showMessageDialog(this, "Record Deleted");
            table_update();

            taskjDateChooser.setDate(null);
            taskduejDateChooser.setDate(null);
            CourseNamejTextField.setText("");
            TaskjTextArea.setText("");
            taskjDateChooser.requestFocus();
            
            }

        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CourseTask.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(this, "Failed to Add Record");

        }
        
    }//GEN-LAST:event_TaskDeletejButtonActionPerformed

    private void TaskclearjButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TaskclearjButtonActionPerformed
        // TODO add your handling code here:
        taskjDateChooser.setDate(null);
        taskduejDateChooser.setDate(null);
        TaskjTextArea.setText("");
        CourseNamejTextField.setText("");
        taskjDateChooser.requestFocus();
    }//GEN-LAST:event_TaskclearjButtonActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        // TODO add your handling code here:
        DefaultTableModel Df = (DefaultTableModel)jTable1.getModel();
        int selectedIndex = jTable1.getSelectedRow();
        java.util.Date date = (java.util.Date) Df.getValueAt(selectedIndex, 1);
        taskjDateChooser.setDate(date);
        java.util.Date date1 = (java.util.Date) Df.getValueAt(selectedIndex, 2);
        taskduejDateChooser.setDate(date1);
        CourseNamejTextField.setText(Df.getValueAt(selectedIndex,3).toString());
        TaskjTextArea.setText(Df.getValueAt(selectedIndex,4).toString());
        
        
    }//GEN-LAST:event_jTable1MouseClicked

    private void HomejButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomejButtonActionPerformed
        // TODO add your handling code here:
        homePage home = new homePage();
        home.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_HomejButtonActionPerformed


    public void main() {
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
            java.util.logging.Logger.getLogger(CourseTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CourseTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CourseTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CourseTask.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new CourseTask().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CourseNamejTextField;
    private javax.swing.JButton HomejButton;
    private javax.swing.JButton TaskAddjButton;
    private javax.swing.JButton TaskDeletejButton;
    private javax.swing.JButton TaskUpdatejButton;
    private javax.swing.JButton TaskclearjButton;
    private javax.swing.JTextArea TaskjTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private com.toedter.calendar.JDateChooser taskduejDateChooser;
    private com.toedter.calendar.JDateChooser taskjDateChooser;
    // End of variables declaration//GEN-END:variables
}
