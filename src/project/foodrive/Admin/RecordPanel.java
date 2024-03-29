/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive.Admin;

import Testing.*;
import java.awt.Color;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import javax.swing.border.EtchedBorder;

/**
 *
 * @author abcd
 */
public class RecordPanel extends javax.swing.JPanel {

    /**
     * Creates new form recordPanel
     */
    public RecordPanel() {
        initComponents();
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

        Id = new javax.swing.JLabel();
        Id1 = new javax.swing.JLabel();
        Id2 = new javax.swing.JLabel();
        Id3 = new javax.swing.JLabel();
        Id4 = new javax.swing.JLabel();
        updateIcon = new javax.swing.JLabel();
        removeIcon = new javax.swing.JLabel();
        Id5 = new javax.swing.JLabel();
        viewDetailsIcon = new javax.swing.JLabel();

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

        Id.setBackground(new java.awt.Color(255, 255, 255));
        Id.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Id.setText("<id>");

        Id1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Id1.setText("FirstName");

        Id2.setBackground(new java.awt.Color(204, 204, 204));
        Id2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Id2.setText("LastName");

        Id3.setBackground(new java.awt.Color(204, 204, 204));
        Id3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Id3.setText("Chapter_Area");

        Id4.setBackground(new java.awt.Color(204, 204, 204));
        Id4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Id4.setText("Chapter_City");

        updateIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        updateIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/pencil-edit-button-small.png"))); // NOI18N
        updateIcon.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        updateIcon.setMaximumSize(new java.awt.Dimension(40, 40));
        updateIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        updateIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        updateIcon.setRequestFocusEnabled(false);
        updateIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                updateIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                updateIconMouseExited(evt);
            }
        });

        removeIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        removeIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/removebtn-small.png"))); // NOI18N
        removeIcon.setMaximumSize(new java.awt.Dimension(40, 40));
        removeIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        removeIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        removeIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                removeIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                removeIconMouseExited(evt);
            }
        });

        Id5.setBackground(new java.awt.Color(204, 204, 204));
        Id5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        Id5.setText("Email@some.com");

        viewDetailsIcon.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        viewDetailsIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/details-small.png"))); // NOI18N
        viewDetailsIcon.setAlignmentY(1.0F);
        viewDetailsIcon.setMaximumSize(new java.awt.Dimension(40, 40));
        viewDetailsIcon.setMinimumSize(new java.awt.Dimension(40, 40));
        viewDetailsIcon.setPreferredSize(new java.awt.Dimension(40, 40));
        viewDetailsIcon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                viewDetailsIconMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                viewDetailsIconMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Id1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Id2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Id3)
                .addGap(18, 18, 18)
                .addComponent(Id4)
                .addGap(18, 18, 18)
                .addComponent(Id5, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
                .addComponent(viewDetailsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(updateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(removeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Id, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Id1)
                    .addComponent(Id2)
                    .addComponent(Id3)
                    .addComponent(Id4)
                    .addComponent(Id5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(viewDetailsIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(removeIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(updateIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
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

    private void viewDetailsIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsIconMouseEntered
        // TODO add your handling code here:
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.viewDetailsIcon.setBorder(raisedBevelBorder); 
        formMouseEntered(evt);
    }//GEN-LAST:event_viewDetailsIconMouseEntered

    private void viewDetailsIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_viewDetailsIconMouseExited
        // TODO add your handling code here:
        this.viewDetailsIcon.setBorder(BorderFactory.createEmptyBorder());
        formMouseExited(evt);
    }//GEN-LAST:event_viewDetailsIconMouseExited

    private void updateIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateIconMouseEntered
        // TODO add your handling code here:
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.updateIcon.setBorder(raisedBevelBorder); 
        formMouseEntered(evt);
    }//GEN-LAST:event_updateIconMouseEntered

    private void updateIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_updateIconMouseExited
        // TODO add your handling code here:
        this.updateIcon.setBorder(BorderFactory.createEmptyBorder());
        formMouseExited(evt);
    }//GEN-LAST:event_updateIconMouseExited

    private void removeIconMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIconMouseEntered
        // TODO add your handling code here:
        Border raisedBevelBorder = BorderFactory.createRaisedBevelBorder();
        this.removeIcon.setBorder(raisedBevelBorder); 
        formMouseEntered(evt);
    }//GEN-LAST:event_removeIconMouseEntered

    private void removeIconMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_removeIconMouseExited
        // TODO add your handling code here:
        this.removeIcon.setBorder(BorderFactory.createEmptyBorder());
        formMouseExited(evt);
    }//GEN-LAST:event_removeIconMouseExited


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Id;
    private javax.swing.JLabel Id1;
    private javax.swing.JLabel Id2;
    private javax.swing.JLabel Id3;
    private javax.swing.JLabel Id4;
    private javax.swing.JLabel Id5;
    private javax.swing.JLabel removeIcon;
    private javax.swing.JLabel updateIcon;
    private javax.swing.JLabel viewDetailsIcon;
    // End of variables declaration//GEN-END:variables
}
