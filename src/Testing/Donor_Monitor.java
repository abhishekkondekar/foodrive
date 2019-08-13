/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Testing;

import java.awt.Color;
import java.awt.Component;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;

/**
 *
 * @author INTEL COREi3
 */
public class Donor_Monitor extends javax.swing.JFrame {
    
    private int validate_all=5;
    public Donor_Monitor() {
        initComponents();
        
    }
    
    private boolean check_regex(String regex,String inpuString){
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(inpuString);
        if(matcher.matches()){
            return true;
        }
        else{
            return false;
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        dname_label = new javax.swing.JLabel();
        dname_text = new javax.swing.JTextField();
        dtype_label = new javax.swing.JLabel();
        daddress_label = new javax.swing.JLabel();
        daddress_text = new javax.swing.JTextField();
        dphone_label = new javax.swing.JLabel();
        d_phone_text = new javax.swing.JTextField();
        dalt_phone_label = new javax.swing.JLabel();
        dalt_phone_text = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        Title_label = new javax.swing.JLabel();
        add_donor = new javax.swing.JButton();
        cancel_donor = new javax.swing.JButton();
        dtype_combobox = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        demail_text = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(850, 550));
        setResizable(false);

        jScrollPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jScrollPane1.setViewportBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));
        jScrollPane1.setMaximumSize(new java.awt.Dimension(850, 550));
        jScrollPane1.setMinimumSize(new java.awt.Dimension(850, 550));
        jScrollPane1.setPreferredSize(new java.awt.Dimension(850, 550));
        jScrollPane1.setWheelScrollingEnabled(false);

        jPanel1.setInheritsPopupMenu(true);
        jPanel1.setMaximumSize(new java.awt.Dimension(845, 32767));
        jPanel1.setMinimumSize(new java.awt.Dimension(845, 547));
        jPanel1.setPreferredSize(new java.awt.Dimension(845, 547));
        jPanel1.setLayout(null);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        dname_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dname_label.setText("Donor Name:");

        dname_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dname_text.setMinimumSize(new java.awt.Dimension(250, 24));
        dname_text.setPreferredSize(new java.awt.Dimension(250, 24));
        dname_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dname_textFocusLost(evt);
            }
        });
        dname_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dname_textActionPerformed(evt);
            }
        });

        dtype_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dtype_label.setText("Type ");

        daddress_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        daddress_label.setText("Address");

        daddress_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        daddress_text.setMinimumSize(new java.awt.Dimension(250, 24));
        daddress_text.setPreferredSize(new java.awt.Dimension(250, 24));
        daddress_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                daddress_textFocusLost(evt);
            }
        });
        daddress_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daddress_textActionPerformed(evt);
            }
        });

        dphone_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dphone_label.setText("Phone ");

        d_phone_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        d_phone_text.setMinimumSize(new java.awt.Dimension(250, 24));
        d_phone_text.setPreferredSize(new java.awt.Dimension(250, 24));
        d_phone_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                d_phone_textFocusLost(evt);
            }
        });

        dalt_phone_label.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dalt_phone_label.setText("Alternate Phone");

        dalt_phone_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dalt_phone_text.setMinimumSize(new java.awt.Dimension(250, 24));
        dalt_phone_text.setPreferredSize(new java.awt.Dimension(250, 24));
        dalt_phone_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                dalt_phone_textFocusLost(evt);
            }
        });
        dalt_phone_text.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dalt_phone_textActionPerformed(evt);
            }
        });

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/logo_wht_bg_small.PNG"))); // NOI18N

        Title_label.setFont(new java.awt.Font("Verdana", 0, 24)); // NOI18N
        Title_label.setText("Add New Donor");

        add_donor.setBackground(new java.awt.Color(67, 134, 250));
        add_donor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        add_donor.setForeground(new java.awt.Color(255, 255, 255));
        add_donor.setText("Add");
        add_donor.setContentAreaFilled(false);
        add_donor.setMaximumSize(new java.awt.Dimension(51, 30));
        add_donor.setMinimumSize(new java.awt.Dimension(51, 30));
        add_donor.setOpaque(true);
        add_donor.setPreferredSize(new java.awt.Dimension(51, 30));
        add_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                add_donorActionPerformed(evt);
            }
        });

        cancel_donor.setBackground(new java.awt.Color(67, 134, 250));
        cancel_donor.setFont(new java.awt.Font("Verdana", 1, 12)); // NOI18N
        cancel_donor.setForeground(new java.awt.Color(255, 255, 255));
        cancel_donor.setText("Cancel");
        cancel_donor.setToolTipText("");
        cancel_donor.setBorder(null);
        cancel_donor.setBorderPainted(false);
        cancel_donor.setContentAreaFilled(false);
        cancel_donor.setMaximumSize(new java.awt.Dimension(51, 25));
        cancel_donor.setMinimumSize(new java.awt.Dimension(51, 25));
        cancel_donor.setOpaque(true);
        cancel_donor.setPreferredSize(new java.awt.Dimension(51, 30));
        cancel_donor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancel_donorActionPerformed(evt);
            }
        });

        dtype_combobox.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        dtype_combobox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Individual", "Restaurant", "FoodBank" }));
        dtype_combobox.setMinimumSize(new java.awt.Dimension(250, 24));
        dtype_combobox.setPreferredSize(new java.awt.Dimension(250, 24));
        dtype_combobox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtype_comboboxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        jLabel1.setText("Email");

        demail_text.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        demail_text.setMinimumSize(new java.awt.Dimension(250, 24));
        demail_text.setPreferredSize(new java.awt.Dimension(250, 24));
        demail_text.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                demail_textFocusLost(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel9)
                .addGap(0, 329, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(Title_label)
                        .addContainerGap(259, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dtype_label)
                            .addComponent(dphone_label)
                            .addComponent(daddress_label)
                            .addComponent(dalt_phone_label)
                            .addComponent(jLabel1)
                            .addComponent(dname_label))
                        .addGap(21, 21, 21)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(daddress_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(d_phone_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dalt_phone_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                    .addComponent(add_donor, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cancel_donor, javax.swing.GroupLayout.PREFERRED_SIZE, 71, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(demail_text, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(dtype_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(Title_label)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dname_label)
                    .addComponent(dname_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(demail_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dtype_label)
                    .addComponent(dtype_combobox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(daddress_label)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addComponent(daddress_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(dphone_label)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(d_phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(dalt_phone_text, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(dalt_phone_label))))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(add_donor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancel_donor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(76, 76, 76))
        );

        jPanel1.add(jPanel2);
        jPanel2.setBounds(174, 54, 500, 436);

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/bg.png"))); // NOI18N
        jLabel2.setText("kj");
        jLabel2.setMaximumSize(new java.awt.Dimension(850, 550));
        jLabel2.setMinimumSize(new java.awt.Dimension(850, 550));
        jLabel2.setPreferredSize(new java.awt.Dimension(850, 550));
        jPanel1.add(jLabel2);
        jLabel2.setBounds(0, 0, 850, 550);

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        setSize(new java.awt.Dimension(866, 589));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents
    
    private void dname_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dname_textFocusLost
        // TODO add your handling code here:
        String regex = "[a-zA-Z]+";

        boolean isValid=check_regex(regex, dname_text.getText());

        if(isValid)
        {
            
            if(dname_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
             dname_text.setBackground(new Color(170, 253, 197));
        }
        else{
           
           
            if(dname_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
             dname_text.setBackground(new Color(255, 186, 187));
        }
    }//GEN-LAST:event_dname_textFocusLost

    private void dname_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dname_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dname_textActionPerformed

    private void daddress_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_daddress_textFocusLost
        // TODO add your handling code here:
        String regex = "[a-zA-Z]+";

        boolean isValid=check_regex(regex, daddress_text.getText());

        if(isValid)
        {
           
            if(daddress_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
             daddress_text.setBackground(new Color(170, 253, 197));
        }
        else{
           
            if(daddress_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
             daddress_text.setBackground(new Color(255, 186, 187));
        }
    }//GEN-LAST:event_daddress_textFocusLost

    private void daddress_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daddress_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_daddress_textActionPerformed

    private void d_phone_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_d_phone_textFocusLost
        // TODO add your handling code here:

        String regex = "\\d{10}";

        boolean isValid=check_regex(regex, d_phone_text.getText());

        if(isValid)
        {
            
            if(d_phone_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
            d_phone_text.setBackground(new Color(170, 253, 197));
        }
        else{
          
            if(d_phone_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
              d_phone_text.setBackground(new Color(255, 186, 187));
        }
    }//GEN-LAST:event_d_phone_textFocusLost

    private void dalt_phone_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_dalt_phone_textFocusLost
        // TODO add your handling code here:
        String regex = "\\d{10}";

        boolean isValid=check_regex(regex, dalt_phone_text.getText());
        if(dalt_phone_text.getText().length()==0)
        {
            isValid=true;
        }
        if(isValid)
        {
           
            if(dalt_phone_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
             dalt_phone_text.setBackground(new Color(170, 253, 197));
        }
        else{
           
            if(dalt_phone_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
             dalt_phone_text.setBackground(new Color(255, 186, 187));
        }
        
    }//GEN-LAST:event_dalt_phone_textFocusLost

    private void add_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_add_donorActionPerformed
        
         
        try
        {
            if(validate_all==0)
            {    
            String alt_phone="NULL";
            if(dalt_phone_text.getText().length()!=0)
            alt_phone="'"+dalt_phone_text.getText()+"'";
            //Data to be inserted
            int Points=0;
            
            //Connect Database Block
            Class.forName("com.mysql.jdbc.Driver");
            Connection c = DriverManager.getConnection("jdbc:mysql://localhost/foodrive","root","nimda");
            System.out.println("Connected");
            //Connect Database Block
            
            Statement st = c.createStatement();
            //Query for insert into member
            String query="INSERT INTO donor(donor_id,donor_name,email,address,type,phone,alternate_phone) " +
            "VALUES(NULL,'"+dname_text.getText()+"','"+daddress_text.getText()+"','"+demail_text.getText()+"','"+dtype_combobox.getSelectedItem().toString()+"',"+
            "'"+d_phone_text.getText()+"','"+dalt_phone_text.getText()+"');";
            System.out.println("Runnung Query");
            //Execute query
            st.executeUpdate(query);
            System.out.println("Done");
            Component j = null;
            JOptionPane.showMessageDialog(j, "Donor Added Successfully..!");
            }
            else{
                if(validate_all!=0){
                    JOptionPane.showMessageDialog(null,"Enterered data is not correct!..");
                }
                System.out.println(""+validate_all);
            }
       }

        catch (Exception e)
        {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error while Adding Volunteer..!");
        }
        
    }//GEN-LAST:event_add_donorActionPerformed

    private void cancel_donorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancel_donorActionPerformed
         dispose();
    }//GEN-LAST:event_cancel_donorActionPerformed

    private void dtype_comboboxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtype_comboboxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dtype_comboboxActionPerformed

    private void dalt_phone_textActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dalt_phone_textActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dalt_phone_textActionPerformed

    private void demail_textFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_demail_textFocusLost
       String regex = "^(.+)@(.+)[.](.+)";

        boolean isValid=check_regex(regex, demail_text.getText());

        if(isValid)
        {
           
            if(demail_text.getBackground().getGreen()!=253)
            {
                validate_all--;
            }
             demail_text.setBackground(new Color(170, 253, 197));
        }
        else{
           
            if(demail_text.getBackground().getGreen()==253)
            {
                validate_all++;
            }
             demail_text.setBackground(new Color(255, 186, 187));
        }
    }//GEN-LAST:event_demail_textFocusLost

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Donor_Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Donor_Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Donor_Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Donor_Monitor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Donor_Monitor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Title_label;
    private javax.swing.JButton add_donor;
    private javax.swing.JButton cancel_donor;
    private javax.swing.JTextField d_phone_text;
    private javax.swing.JLabel daddress_label;
    private javax.swing.JTextField daddress_text;
    private javax.swing.JLabel dalt_phone_label;
    private javax.swing.JTextField dalt_phone_text;
    private javax.swing.JTextField demail_text;
    private javax.swing.JLabel dname_label;
    private javax.swing.JTextField dname_text;
    private javax.swing.JLabel dphone_label;
    private javax.swing.JComboBox<String> dtype_combobox;
    private javax.swing.JLabel dtype_label;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
