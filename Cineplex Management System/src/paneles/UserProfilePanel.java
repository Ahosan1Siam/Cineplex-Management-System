/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paneles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Jahid
 */
public class UserProfilePanel extends javax.swing.JPanel {
    int UserId,ContactNumber;
    String Username, FullName , EmailId , Password; 
    /**
     * Creates new form UserProfilePanel
     */
    public UserProfilePanel() {
        initComponents();
        

    }
    
    
    
    public UserProfilePanel(String UserName) {
        initComponents();
        showList(UserName);
        
        Username = UserName;
    }
    
    
    public ArrayList<Profile> showList(String UserName){
        
        ArrayList<Profile> showsList = new ArrayList<>();
        
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
            Connection connection = DriverManager
            .getConnection(
            "jdbc:sqlserver://localhost:1433;databaseName=CineplexManagementSystem;selectMethod=cursor", "sa", "123456");
            
            String sql = "Select * from REGISTRATION where UserName = ?";
            PreparedStatement pst = connection.prepareStatement(sql);
            pst.setString(1, UserName);
            ResultSet rs = pst.executeQuery();
            if(rs.next()){
                FullName= rs.getString("FullName");
                EmailId = rs.getString("EmailId");
                String number=Integer.toString(rs.getInt("ContactNumber"));
                phoneNumber.setText("0"+number);
                //SilverPrice = rs.getString("Silver");
            }

           /* Profile p;
            if(rs.next()){
                p = new Profile(rs.getInt("UserId"),rs.getString("UserName"),rs.getString("FullName"),rs.getString("EmailId"),rs.getString("Password"),rs.getInt("UserId")); 
                showsList.add(p);
            }*/
            
            userName.setText(UserName);
            fullName.setText(FullName);
            emailId.setText(EmailId);
            /*String number=Integer.toString(ContactNumber);
            phoneNumber.setText(number);*/
        } catch (Exception e) {
            e.printStackTrace();
        }
        return showsList;
    }
   

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel23 = new javax.swing.JPanel();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        userName = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        phoneNumber = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        fullName = new javax.swing.JLabel();
        emailId = new javax.swing.JLabel();

        setLayout(null);

        jPanel23.setBackground(new java.awt.Color(82, 82, 82));
        jPanel23.setLayout(null);

        jSeparator3.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator3.setToolTipText("");
        jPanel23.add(jSeparator3);
        jSeparator3.setBounds(290, 240, 440, 10);

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("User Profile");
        jPanel23.add(jLabel7);
        jLabel7.setBounds(20, 10, 130, 25);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/rsz_senior-analyst.png"))); // NOI18N
        jPanel23.add(jLabel2);
        jLabel2.setBounds(460, 70, 110, 120);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Contact Number:");
        jPanel23.add(jLabel1);
        jLabel1.setBounds(120, 450, 180, 40);

        userName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        userName.setForeground(new java.awt.Color(204, 204, 204));
        jPanel23.add(userName);
        userName.setBounds(450, 190, 120, 40);

        jSeparator4.setForeground(new java.awt.Color(255, 255, 255));
        jSeparator4.setToolTipText("");
        jPanel23.add(jSeparator4);
        jSeparator4.setBounds(10, 40, 1070, 20);

        phoneNumber.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        phoneNumber.setForeground(new java.awt.Color(204, 204, 204));
        jPanel23.add(phoneNumber);
        phoneNumber.setBounds(360, 450, 200, 40);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(204, 204, 204));
        jLabel5.setText("Email:");
        jPanel23.add(jLabel5);
        jLabel5.setBounds(230, 380, 70, 40);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setText("Full Name:");
        jPanel23.add(jLabel6);
        jLabel6.setBounds(180, 300, 120, 40);

        fullName.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        fullName.setForeground(new java.awt.Color(204, 204, 204));
        jPanel23.add(fullName);
        fullName.setBounds(360, 300, 200, 40);

        emailId.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        emailId.setForeground(new java.awt.Color(204, 204, 204));
        jPanel23.add(emailId);
        emailId.setBounds(360, 380, 290, 40);

        add(jPanel23);
        jPanel23.setBounds(0, 0, 1098, 700);
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel emailId;
    private javax.swing.JLabel fullName;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel23;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JLabel phoneNumber;
    private javax.swing.JLabel userName;
    // End of variables declaration//GEN-END:variables
}
