/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive.Volunteer;

import project.foodrive.Monitor.*;
import project.foodrive.Admin.*;
import Testing.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import project.foodrive.Admin.Add_volunteer;
import project.foodrive.MyConnection;

/**
 *
 * @author abcd
 */
public class Drive_volunteer_status_view extends javax.swing.JPanel {

    /**
     * Creates new form Admin_volunteer_view
     */
    int member_id=-1;
    int area_id=-1;
    
    private int current_count=0;
    private int completed_count=0;
    private Volunteer_dashboard volunteer_dashboard;
    
    
    public Drive_volunteer_status_view() {
        initComponents();
        
    }
    
    public Drive_volunteer_status_view(int memberid,int areaid,Volunteer_dashboard obj) {
        initComponents();
        member_id=memberid;
        area_id=areaid;
        volunteer_dashboard=obj;
        load_drives();
    }
    
    private void refresh_count(){
        current_drives_count.setText(""+current_count);
        completed_drives_count.setText(""+completed_count);
    }
    
    private void load_drives()
    {
        try {
            Connection c=null;
            MyConnection mo= new MyConnection();
            c=mo.getMyConnection();
            //get volunteer req count
            String query="SELECT COUNT(drive_id) AS count FROM drive WHERE area_id=? "
                    + " AND status<>'completed';";
            
            PreparedStatement pst=c.prepareStatement(query);
            pst.setInt(1, area_id);
            ResultSet rs=pst.executeQuery();
            
            if(rs.next()){
                current_count=rs.getInt("count");
                System.out.println(current_count);
            }
            
            //get donor
            query="SELECT COUNT(drive_id) AS count FROM drive WHERE area_id=? "
                    + " AND status='completed';";
            
            pst=c.prepareStatement(query);
            pst.setInt(1, area_id);
            rs=pst.executeQuery();
            
            if(rs.next()){
                completed_count=rs.getInt("count");
                System.out.println(completed_count);
            }
            
            refresh_count();
            //join_count.setText(""+count);
        } catch (SQLException ex) {
            Logger.getLogger(Monitor_Notification_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    private Color mouseExitedColor = new Color(240,240,240);
    private Color mouseEnteredColor = new Color(190,190,190);
    private Color mouseClickedColor = new Color(215,219,227);
    private Color passiveFontColor = new Color(51,51,51);
    private Color activeFontColor = new Color(51,51,51);
    private int selected_option_from_left=0;
    private Color searchMouseEnterColor = new Color(220,220,220);
    private Color searchMouseExitColor = new Color(240,240,240);
    
     private void setAllOptionAsNonSelected(){
        
     }
     
    private void setColorToAllSearchEle(Color c){
        //jPanel3.setBackground(c);
        //tfSearch.setBackground(c);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        current_drive_btn = new javax.swing.JButton();
        completed_drive_btn = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        current_drives_count = new javax.swing.JLabel();
        completed_drives_count = new javax.swing.JLabel();

        setMaximumSize(new java.awt.Dimension(850, 550));
        setMinimumSize(new java.awt.Dimension(850, 550));
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });

        jScrollPane1.setMaximumSize(new java.awt.Dimension(850, 550));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(850, 550));

        jPanel1.setMaximumSize(new java.awt.Dimension(850, 550));
        jPanel1.setMinimumSize(new java.awt.Dimension(850, 550));
        jPanel1.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                jPanel1ComponentShown(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 30)); // NOI18N
        jLabel1.setText("Drives");

        jLabel2.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel2.setText("Current Drives");

        jLabel3.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        jLabel3.setText("Completed Drives");

        current_drive_btn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        current_drive_btn.setText("View..");
        current_drive_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                current_drive_btnActionPerformed(evt);
            }
        });

        completed_drive_btn.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        completed_drive_btn.setText("View..");
        completed_drive_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                completed_drive_btnActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel4.setText("Drive(s)");

        jLabel5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel5.setText("Drive(s)");

        current_drives_count.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        current_drives_count.setText("0");

        completed_drives_count.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        completed_drives_count.setText("0");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addGap(112, 112, 112)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(completed_drives_count)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel5))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(current_drives_count)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)))
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(current_drive_btn)
                    .addComponent(completed_drive_btn))
                .addContainerGap(362, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(current_drive_btn)
                    .addComponent(jLabel4)
                    .addComponent(current_drives_count))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(completed_drives_count)
                    .addComponent(completed_drive_btn))
                .addContainerGap(375, Short.MAX_VALUE))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 1, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        //records_panel.add(new RecordPanel());
        //records_panel.add(new RecordPanel());
        //records_panel.add(new RecordPanel());
        //records_panel.revalidate();
        //records_panel.repaint();
    }//GEN-LAST:event_jPanel1ComponentShown

    private void completed_drive_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_completed_drive_btnActionPerformed
        // TODO add your handling code here:
        volunteer_dashboard.load_in_main_panel(new Drive_listing_volunteer_view(member_id,area_id,"Completed",volunteer_dashboard));
    }//GEN-LAST:event_completed_drive_btnActionPerformed

    private void current_drive_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_current_drive_btnActionPerformed
        // TODO add your handling code here:
        volunteer_dashboard.load_in_main_panel(new Drive_listing_volunteer_view(member_id, area_id,"Running", volunteer_dashboard));
    }//GEN-LAST:event_current_drive_btnActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton completed_drive_btn;
    private javax.swing.JLabel completed_drives_count;
    private javax.swing.JButton current_drive_btn;
    private javax.swing.JLabel current_drives_count;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
