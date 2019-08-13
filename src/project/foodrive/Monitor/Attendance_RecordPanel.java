/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive.Monitor;

import project.foodrive.Admin.*;
import Testing.*;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.JDialog;
import javax.swing.border.EtchedBorder;
import project.foodrive.MyConnection;
import project.foodrive.Volunteer.Notification_panel;
import project.foodrive.Volunteer.Notification_record_panel;

/**
 *
 * @author abcd
 */
public class Attendance_RecordPanel extends javax.swing.JPanel {

    /**
     * Creates new form recordPanel
     */
    
    private int member_id=-1;
    private int drive_id=-1;
    private int attendance_flag=3;  // Means Present when this is 3, absent when 0
    Take_attendance_monitor parent;
    Color present_bg=new Color(51,255,51);
    Color present_fg=Color.BLACK;
    Color absent_bg=new Color(255,51,51);
    Color absent_fg=Color.WHITE;
    
    public Attendance_RecordPanel() {
        initComponents();
    }
    
    public Attendance_RecordPanel(int driveid,int memberid,Take_attendance_monitor aThis) {
        initComponents();
        member_id=memberid;
        //area_id=areaid;
        drive_id=driveid;
        parent=aThis;
        parent.attendence_vector.add(this.member_id);
        load_details();
    }
    
    private Color recordPanMouseEnterColor = new Color(220,220,220);
    private Color recordPanMouseExitColor = new Color(255,255,255);

    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        id = new javax.swing.JLabel();
        fname_text = new javax.swing.JLabel();
        lname_text = new javax.swing.JLabel();
        gender_text = new javax.swing.JLabel();
        multi_purpose_btn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED));
        setMaximumSize(new java.awt.Dimension(790, 40));
        setMinimumSize(new java.awt.Dimension(790, 40));
        setPreferredSize(new java.awt.Dimension(790, 40));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                formMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                formMouseExited(evt);
            }
        });

        id.setBackground(new java.awt.Color(255, 255, 255));
        id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        id.setText("<id>");

        fname_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        fname_text.setText("fname");

        lname_text.setBackground(new java.awt.Color(204, 204, 204));
        lname_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lname_text.setText("lname");

        gender_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        gender_text.setText("Gender");
        gender_text.setPreferredSize(new java.awt.Dimension(50, 18));

        multi_purpose_btn.setBackground(new java.awt.Color(51, 255, 51));
        multi_purpose_btn.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        multi_purpose_btn.setText("Present");
        multi_purpose_btn.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        multi_purpose_btn.setContentAreaFilled(false);
        multi_purpose_btn.setOpaque(true);
        multi_purpose_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multi_purpose_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(fname_text, javax.swing.GroupLayout.DEFAULT_SIZE, 145, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(lname_text, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(147, 147, 147)
                .addComponent(multi_purpose_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname_text)
                    .addComponent(lname_text)
                    .addComponent(gender_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(multi_purpose_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(2, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseEntered
        // TODO add your handling code here:
        this.setBackground(recordPanMouseEnterColor);
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.setBorder(raisedBevelBorder);
    }//GEN-LAST:event_formMouseEntered

    private void formMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseExited
        // TODO add your handling code here:
        this.setBackground(recordPanMouseExitColor);
        Border raisedEtchedBorder = new EtchedBorder(EtchedBorder.RAISED);
        this.setBorder(raisedEtchedBorder);
    }//GEN-LAST:event_formMouseExited

    private void multi_purpose_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multi_purpose_btnActionPerformed
        // TODO add your handling code here:
        if(attendance_flag==3){
            multi_purpose_btn.setBackground(absent_bg);
            multi_purpose_btn.setForeground(absent_fg);
            multi_purpose_btn.setText("Absent");
            attendance_flag=0;
            System.out.println(""+this.member_id);
            parent.attendence_vector.removeElement(this.member_id);
        }
        else{
            multi_purpose_btn.setBackground(present_bg);
            multi_purpose_btn.setForeground(present_fg);
            multi_purpose_btn.setText("Present");
            attendance_flag=3;
            System.out.println(""+this.member_id);
            parent.attendence_vector.add(this.member_id);
        }
    }//GEN-LAST:event_multi_purpose_btnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel fname_text;
    private javax.swing.JLabel gender_text;
    private javax.swing.JLabel id;
    private javax.swing.JLabel lname_text;
    private javax.swing.JButton multi_purpose_btn;
    // End of variables declaration//GEN-END:variables

    private void load_details() {
        try {
            Connection c=null;
            MyConnection mo= new MyConnection();
            c=mo.getMyConnection();
            
            String query="SELECT m.member_id,m.fname,m.lname,m.gender " +
                    "FROM attendance a " +
                    "JOIN member m " +
                    "ON a.member_id=m.member_id " +
                    "WHERE a.drive_id=? AND m.member_id=?;";
            System.out.println(drive_id+" "+member_id);
            PreparedStatement pst=c.prepareStatement(query);
            pst.setInt(1, drive_id);
            pst.setInt(2, member_id);
            ResultSet rs=pst.executeQuery();
            
            while(rs.next()){
                this.id.setText(""+rs.getInt("member_id"));
                this.fname_text.setText(rs.getString("fname"));
                //drive_status=rs.getString("status");
                this.lname_text.setText(rs.getString("lname"));
                this.gender_text.setText(rs.getString("gender"));
                
               
            }
            c.close();
        } catch (SQLException ex) {
            Logger.getLogger(Notification_panel.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
}
