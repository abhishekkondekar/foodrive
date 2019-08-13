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
import javax.swing.JDialog;
import javax.swing.JFrame;
import project.foodrive.Admin.Add_volunteer;
import project.foodrive.MyConnection;

/**
 *
 * @author abcd
 */
public class Donor_join_req_view extends javax.swing.JPanel {

    /**
     * Creates new form Admin_volunteer_view
     */
    int monitor_id=-1;
    int area_id=-1;
    public Donor_join_req_view() {
        initComponents();
        
        //Just for test....Remove it..
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.revalidate();
        records_panel.repaint();
    }
    
    public Donor_join_req_view(int monitorid,int areaid) {
        initComponents();
        monitor_id=monitorid;
        area_id=areaid;
        load_req();
    }
    
    private void load_req()
    {
        try {
            Connection c=null;
            MyConnection mo= new MyConnection();
            c=mo.getMyConnection();
            
            String query="SELECT req_id FROM team_join_req WHERE area_id=? "
                    + " AND status_flag=0 AND role='donor';";
            
            PreparedStatement pst=c.prepareStatement(query);
            pst.setInt(1, area_id);
           
            
            ResultSet rs=pst.executeQuery();
            records_panel.removeAll();
            int count=0;
            while(rs.next()){
                
                records_panel.add(new Donor_join_RecordPanel(rs.getInt("req_id"),this));
                records_panel.revalidate();
                records_panel.repaint();
                count+=1;
            }
            join_count.setText(""+count);
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
        jPanel3.setBackground(c);
        tfSearch.setBackground(c);
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
        jScrollPane2 = new javax.swing.JScrollPane();
        records_panel = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        tfSearch = new javax.swing.JTextField();
        btnSearch = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        total_req_count = new javax.swing.JLabel();
        join_count = new javax.swing.JLabel();

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

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        jLabel1.setText("Donor Team Join Request");

        jScrollPane2.setMaximumSize(new java.awt.Dimension(790, 32767));
        jScrollPane2.setMinimumSize(new java.awt.Dimension(790, 300));

        records_panel.setBackground(new java.awt.Color(255, 255, 255));
        records_panel.setMaximumSize(new java.awt.Dimension(800, 32767));
        records_panel.setLayout(new javax.swing.BoxLayout(records_panel, javax.swing.BoxLayout.Y_AXIS));
        jScrollPane2.setViewportView(records_panel);

        jPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jPanel3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jPanel3MouseExited(evt);
            }
        });

        tfSearch.setBackground(new java.awt.Color(240, 240, 240));
        tfSearch.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        tfSearch.setForeground(new java.awt.Color(153, 153, 153));
        tfSearch.setText("Search");
        tfSearch.setBorder(null);
        tfSearch.setSelectionColor(new java.awt.Color(102, 102, 102));
        tfSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                tfSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                tfSearchMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                tfSearchMousePressed(evt);
            }
        });
        tfSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfSearchActionPerformed(evt);
            }
        });
        tfSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tfSearchKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tfSearchKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                tfSearchKeyTyped(evt);
            }
        });

        btnSearch.setBackground(new java.awt.Color(255, 255, 255));
        btnSearch.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/search1.png"))); // NOI18N
        btnSearch.setContentAreaFilled(false);
        btnSearch.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSearch.setFocusable(false);
        btnSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSearchMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSearchMouseExited(evt);
            }
        });
        btnSearch.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSearchActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(0, 51, 255));
        jLabel3.setMaximumSize(new java.awt.Dimension(0, 2));
        jLabel3.setOpaque(true);
        jLabel3.setPreferredSize(new java.awt.Dimension(0, 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 301, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tfSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, 0)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        total_req_count.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        total_req_count.setText("Total Join Request(s) : ");

        join_count.setFont(new java.awt.Font("Verdana", 0, 18)); // NOI18N
        join_count.setText("count");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(511, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(total_req_count)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(join_count)
                        .addGap(55, 55, 55))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(total_req_count)
                        .addComponent(join_count)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
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

    private void btnSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSearchActionPerformed

    private void tfSearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyReleased
        // TODO add your handling code here:
        if(tfSearch.getText().isEmpty()==true)
        {
            tfSearch.setText("Search");
            tfSearch.setCaretPosition(0);
            tfSearch.setForeground(new java.awt.Color(153,153,153));
        }
    }//GEN-LAST:event_tfSearchKeyReleased

    private void tfSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyPressed
        // TODO add your handling code here:
        if(tfSearch.getForeground()!=Color.BLACK)
        {
            if(tfSearch.getText().equals("Search"))
            { tfSearch.setText("");
            }

        }
        tfSearch.setForeground(Color.BLACK);

    }//GEN-LAST:event_tfSearchKeyPressed

    private void tfSearchMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMousePressed
        // TODO add your handling code here:
        tfSearch.setCaretPosition(0);
    }//GEN-LAST:event_tfSearchMousePressed

    private void tfSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfSearchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfSearchActionPerformed

    private void jPanel3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseEntered
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseEnterColor);
    }//GEN-LAST:event_jPanel3MouseEntered

    private void jPanel3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel3MouseExited
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseExitColor);
    }//GEN-LAST:event_jPanel3MouseExited

    private void tfSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseEntered
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseEnterColor);
    }//GEN-LAST:event_tfSearchMouseEntered

    private void tfSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tfSearchMouseExited
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseExitColor);
    }//GEN-LAST:event_tfSearchMouseExited

    private void btnSearchMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseEntered
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseEnterColor);
    }//GEN-LAST:event_btnSearchMouseEntered

    private void btnSearchMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSearchMouseExited
        // TODO add your handling code here:
        setColorToAllSearchEle(searchMouseExitColor);
    }//GEN-LAST:event_btnSearchMouseExited

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formComponentShown

    private void jPanel1ComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_jPanel1ComponentShown
        // TODO add your handling code here:
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.add(new Donor_join_RecordPanel());
        records_panel.revalidate();
        records_panel.repaint();
    }//GEN-LAST:event_jPanel1ComponentShown

    private void tfSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tfSearchKeyTyped
        try {
            // TODO add your handling code here:
            String search_key=tfSearch.getText();
            search_key=search_key+evt.getKeyChar();
            Connection c=null;
            MyConnection mo= new MyConnection();
            c=mo.getMyConnection();
            
            //tring query="{(CALL getMemberByReqID(?)};";
            String query="";
            //CallableStatement call=(CallableStatement) c.prepareCall(query);
            PreparedStatement call=c.prepareStatement(query);
            //call.setInt(1, );
            ResultSet rs=call.executeQuery();
        } catch (SQLException ex) {
            Logger.getLogger(Donor_join_req_view.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_tfSearchKeyTyped

public void decrementReqCount(){
    int count=Integer.parseInt(join_count.getText());
    count=count-1;
    join_count.setText(""+count);
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSearch;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel join_count;
    private javax.swing.JPanel records_panel;
    private javax.swing.JTextField tfSearch;
    private javax.swing.JLabel total_req_count;
    // End of variables declaration//GEN-END:variables
}
