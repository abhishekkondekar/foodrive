/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project.foodrive.Admin;

import java.awt.BorderLayout;
import java.awt.Color;

/**
 *
 * @author INTEL COREi3
 */
public class Donor_dashbord extends javax.swing.JFrame {

    /**
     * Creates new form Volunteer_dashboard
     */
    public Donor_dashbord() {
        initComponents();
    }
     private Color mouseExitedColor = new Color(21, 95, 48);
    private Color mouseEnteredColor = new Color(0,23,0);
    private Color mouseClickedColor = new Color(21,143,21);
    private Color passiveFontColor = new Color(204,204,204);
    private Color activeFontColor = new Color(255,255,255);
    private int selected_option_from_left=0;
    
    private void setAllOptionAsNonSelected(){
        volunteer_pan.setBackground(mouseExitedColor);
        volunteer_label.setForeground(passiveFontColor);
        donor_pan.setBackground(mouseExitedColor);
        donor_label.setForeground(passiveFontColor);
        chapter_pan.setBackground(mouseExitedColor);
        chapter_label.setForeground(passiveFontColor);
        monitor_pan.setBackground(mouseExitedColor);
        monitor_label.setForeground(passiveFontColor);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        headerPanel_voldash = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        leftPanel_voldash = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        volunteer_pan = new javax.swing.JPanel();
        volunteer_label = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        donor_pan = new javax.swing.JPanel();
        donor_label = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        chapter_pan = new javax.swing.JPanel();
        chapter_label = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        monitor_pan = new javax.swing.JPanel();
        monitor_label = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        main_load_Panel_voldash = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(1100, 600));
        setResizable(false);
        setType(java.awt.Window.Type.POPUP);

        headerPanel_voldash.setBackground(new java.awt.Color(21, 95, 48));

        jButton1.setText("Slide");
        jButton1.setAlignmentX(0.5F);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout headerPanel_voldashLayout = new javax.swing.GroupLayout(headerPanel_voldash);
        headerPanel_voldash.setLayout(headerPanel_voldashLayout);
        headerPanel_voldashLayout.setHorizontalGroup(
            headerPanel_voldashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(headerPanel_voldashLayout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        headerPanel_voldashLayout.setVerticalGroup(
            headerPanel_voldashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, headerPanel_voldashLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(11, 11, 11))
        );

        leftPanel_voldash.setBackground(new java.awt.Color(21, 95, 48));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_gr_bg_medium.PNG"))); // NOI18N

        volunteer_pan.setBackground(new java.awt.Color(21, 95, 48));
        volunteer_pan.setMaximumSize(new java.awt.Dimension(250, 45));
        volunteer_pan.setMinimumSize(new java.awt.Dimension(250, 45));
        volunteer_pan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                volunteer_panMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                volunteer_panMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                volunteer_panMouseExited(evt);
            }
        });

        volunteer_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        volunteer_label.setForeground(new java.awt.Color(204, 204, 204));
        volunteer_label.setText("Volunteer");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/volunteer_icon.png"))); // NOI18N

        javax.swing.GroupLayout volunteer_panLayout = new javax.swing.GroupLayout(volunteer_pan);
        volunteer_pan.setLayout(volunteer_panLayout);
        volunteer_panLayout.setHorizontalGroup(
            volunteer_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(volunteer_panLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(volunteer_label)
                .addContainerGap(105, Short.MAX_VALUE))
        );
        volunteer_panLayout.setVerticalGroup(
            volunteer_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, volunteer_panLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(volunteer_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2)
                    .addComponent(volunteer_label, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        donor_pan.setBackground(new java.awt.Color(21, 95, 48));
        donor_pan.setMaximumSize(new java.awt.Dimension(250, 45));
        donor_pan.setMinimumSize(new java.awt.Dimension(250, 45));
        donor_pan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                donor_panMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                donor_panMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                donor_panMouseExited(evt);
            }
        });

        donor_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        donor_label.setForeground(new java.awt.Color(204, 204, 204));
        donor_label.setText("Donor");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/donate_icon.png"))); // NOI18N

        javax.swing.GroupLayout donor_panLayout = new javax.swing.GroupLayout(donor_pan);
        donor_pan.setLayout(donor_panLayout);
        donor_panLayout.setHorizontalGroup(
            donor_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donor_panLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(donor_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        donor_panLayout.setVerticalGroup(
            donor_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donor_panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(donor_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(donor_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        chapter_pan.setBackground(new java.awt.Color(21, 95, 48));
        chapter_pan.setMaximumSize(new java.awt.Dimension(250, 45));
        chapter_pan.setMinimumSize(new java.awt.Dimension(250, 45));
        chapter_pan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                chapter_panMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                chapter_panMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                chapter_panMouseExited(evt);
            }
        });

        chapter_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        chapter_label.setForeground(new java.awt.Color(204, 204, 204));
        chapter_label.setText("Chapter");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/location_icon.png"))); // NOI18N

        javax.swing.GroupLayout chapter_panLayout = new javax.swing.GroupLayout(chapter_pan);
        chapter_pan.setLayout(chapter_panLayout);
        chapter_panLayout.setHorizontalGroup(
            chapter_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chapter_panLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addComponent(chapter_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        chapter_panLayout.setVerticalGroup(
            chapter_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(chapter_panLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(chapter_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(chapter_label))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        monitor_pan.setBackground(new java.awt.Color(21, 95, 48));
        monitor_pan.setMaximumSize(new java.awt.Dimension(250, 45));
        monitor_pan.setMinimumSize(new java.awt.Dimension(250, 45));
        monitor_pan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                monitor_panMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                monitor_panMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                monitor_panMouseExited(evt);
            }
        });

        monitor_label.setBackground(new java.awt.Color(204, 204, 204));
        monitor_label.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        monitor_label.setForeground(new java.awt.Color(204, 204, 204));
        monitor_label.setText("Monitor");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/monitor_icon.png"))); // NOI18N

        javax.swing.GroupLayout monitor_panLayout = new javax.swing.GroupLayout(monitor_pan);
        monitor_pan.setLayout(monitor_panLayout);
        monitor_panLayout.setHorizontalGroup(
            monitor_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(monitor_panLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(monitor_label)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        monitor_panLayout.setVerticalGroup(
            monitor_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, monitor_panLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(monitor_panLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(monitor_label))
                .addContainerGap())
        );

        javax.swing.GroupLayout leftPanel_voldashLayout = new javax.swing.GroupLayout(leftPanel_voldash);
        leftPanel_voldash.setLayout(leftPanel_voldashLayout);
        leftPanel_voldashLayout.setHorizontalGroup(
            leftPanel_voldashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanel_voldashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(leftPanel_voldashLayout.createSequentialGroup()
                .addGroup(leftPanel_voldashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(chapter_pan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(monitor_pan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(donor_pan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(volunteer_pan, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        leftPanel_voldashLayout.setVerticalGroup(
            leftPanel_voldashLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(leftPanel_voldashLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(49, 49, 49)
                .addComponent(volunteer_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(donor_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(chapter_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(monitor_pan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        main_load_Panel_voldash.setToolTipText("");
        main_load_Panel_voldash.setMaximumSize(new java.awt.Dimension(850, 550));
        main_load_Panel_voldash.setMinimumSize(new java.awt.Dimension(850, 550));
        main_load_Panel_voldash.setPreferredSize(new java.awt.Dimension(850, 550));
        main_load_Panel_voldash.setLayout(new java.awt.BorderLayout());

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(leftPanel_voldash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(headerPanel_voldash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(main_load_Panel_voldash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(headerPanel_voldash, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(main_load_Panel_voldash, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addComponent(leftPanel_voldash, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setSize(new java.awt.Dimension(1126, 639));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void monitor_panMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monitor_panMouseExited
        // TODO add your handling code here:
        
        if(selected_option_from_left!=4)
        {
            monitor_pan.setBackground(mouseExitedColor);
            monitor_label.setForeground(passiveFontColor);
        }
    }//GEN-LAST:event_monitor_panMouseExited

    private void monitor_panMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monitor_panMouseEntered
           // TODO add your handling code here:
            
        if(selected_option_from_left!=4)
        {
            monitor_pan.setBackground(mouseEnteredColor);
            monitor_label.setForeground(activeFontColor);
        }
    }//GEN-LAST:event_monitor_panMouseEntered

    private void monitor_panMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_monitor_panMouseClicked
        // TODO add your handling code here:
         
        setAllOptionAsNonSelected();
        monitor_pan.setBackground(mouseClickedColor);
        monitor_label.setForeground(activeFontColor);
        selected_option_from_left=4;
    }//GEN-LAST:event_monitor_panMouseClicked

    private void chapter_panMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chapter_panMouseExited
        // TODO add your handling code here:
        if(selected_option_from_left!=3)
        {
            chapter_pan.setBackground(mouseExitedColor);
            chapter_label.setForeground(passiveFontColor);
        }
    }//GEN-LAST:event_chapter_panMouseExited

    private void chapter_panMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chapter_panMouseEntered
        // TODO add your handling code here:
        if(selected_option_from_left!=3)
        {
            chapter_pan.setBackground(mouseEnteredColor);
            chapter_label.setForeground(activeFontColor);
        }
    }//GEN-LAST:event_chapter_panMouseEntered

    private void chapter_panMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_chapter_panMouseClicked
        // TODO add your handling code here:
        setAllOptionAsNonSelected();
        chapter_pan.setBackground(mouseClickedColor);
        chapter_label.setForeground(activeFontColor);
        selected_option_from_left=3;
    }//GEN-LAST:event_chapter_panMouseClicked

    private void donor_panMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donor_panMouseExited
        // TODO add your handling code here:
        if(selected_option_from_left!=2)
        {
            donor_pan.setBackground(mouseExitedColor);
            donor_label.setForeground(passiveFontColor);
        }
    }//GEN-LAST:event_donor_panMouseExited

    private void donor_panMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donor_panMouseEntered
        // TODO add your handling code here:
        if(selected_option_from_left!=2)
        {
            donor_pan.setBackground(mouseEnteredColor);
            donor_label.setForeground(activeFontColor);
        }
    }//GEN-LAST:event_donor_panMouseEntered

    private void donor_panMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_donor_panMouseClicked
        // TODO add your handling code here:
        setAllOptionAsNonSelected();
        donor_pan.setBackground(mouseClickedColor);
        donor_label.setForeground(activeFontColor);
        selected_option_from_left=2;

        main_load_Panel_voldash.removeAll();
        main_load_Panel_voldash.add(new Admin_donor_view(),BorderLayout.CENTER);
        main_load_Panel_voldash.revalidate();
        main_load_Panel_voldash.repaint();
    }//GEN-LAST:event_donor_panMouseClicked

    private void volunteer_panMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volunteer_panMouseExited
        // TODO add your handling code here:
        
        if(selected_option_from_left!=1)
        {
            volunteer_pan.setBackground(mouseExitedColor);
            volunteer_label.setForeground(passiveFontColor);
        }
    }//GEN-LAST:event_volunteer_panMouseExited

    private void volunteer_panMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volunteer_panMouseEntered
        // TODO add your handling code here:
        

        if(selected_option_from_left!=1)
        {
            volunteer_pan.setBackground(mouseEnteredColor);
            volunteer_label.setForeground(activeFontColor);
        }
    }//GEN-LAST:event_volunteer_panMouseEntered

    private void volunteer_panMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_volunteer_panMouseClicked
        setAllOptionAsNonSelected();
        volunteer_pan.setBackground(mouseClickedColor);
        volunteer_label.setForeground(activeFontColor);
        selected_option_from_left=1;

        main_load_Panel_voldash.removeAll();
        main_load_Panel_voldash.add(new Admin_volunteer_view(),BorderLayout.CENTER);
        main_load_Panel_voldash.revalidate();
        main_load_Panel_voldash.repaint();
    }//GEN-LAST:event_volunteer_panMouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      /*  int posicion = jButton1.getX();
        if(posicion > 16){
            Animacion.Animacion.mover_izquierda(240, 16, 2, 2, jButton1);
            Animacion.Animacion.mover_izquierda(5, -250, 2, 2, leftPanel_voldash);
        }else{
            Animacion.Animacion.mover_derecha(16, 240, 2, 2, jButton1);
            Animacion.Animacion.mover_derecha(-250, 16, 2, 2, leftPanel_voldash);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(Donor_dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donor_dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donor_dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donor_dashbord.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donor_dashbord().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel chapter_label;
    private javax.swing.JPanel chapter_pan;
    private javax.swing.JLabel donor_label;
    private javax.swing.JPanel donor_pan;
    private javax.swing.JPanel headerPanel_voldash;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel leftPanel_voldash;
    private javax.swing.JPanel main_load_Panel_voldash;
    private javax.swing.JLabel monitor_label;
    private javax.swing.JPanel monitor_pan;
    private javax.swing.JLabel volunteer_label;
    private javax.swing.JPanel volunteer_pan;
    // End of variables declaration//GEN-END:variables
}
