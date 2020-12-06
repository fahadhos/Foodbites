/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package foodforhomies;

import java.awt.Image;
import java.io.File;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JLabel;
/**
 *
 * @author ifty
 */
public class restaurantslist extends javax.swing.JFrame {

    /**
     * Creates new form restaurantslist
     */
    public restaurantslist() {
        initComponents();  this.setLocationRelativeTo(null);// ui show in center
       
    }
   
   
 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        slidepanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        favpanel = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        profilepanel2 = new javax.swing.JPanel();
        jLabel17 = new javax.swing.JLabel();
        profilepanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        usershow = new javax.swing.JLabel();
        closemenu = new javax.swing.JLabel();
        addresspanel = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        body = new javax.swing.JPanel();
        previous = new javax.swing.JLabel();
        label6 = new javax.swing.JLabel();
        next = new javax.swing.JLabel();
        manuebutton = new javax.swing.JLabel();
        title = new javax.swing.JPanel();
        displayname = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        slidepanel.setBackground(new java.awt.Color(255, 255, 255));
        slidepanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(jLabel6.getFont());
        jLabel9.setText("  Settings");
        slidepanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 280, 20));

        jLabel11.setFont(jLabel6.getFont());
        jLabel11.setText("  Terms&Conditions/Privacy");
        slidepanel.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 490, 280, 20));

        jLabel7.setFont(jLabel6.getFont());
        jLabel7.setText("   Log out");
        jLabel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel7MouseClicked(evt);
            }
        });
        slidepanel.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 520, 280, 20));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/orders.png"))); // NOI18N
        jLabel10.setText("       Orders");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        slidepanel.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 268, 290, 70));

        favpanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/favourites.png"))); // NOI18N
        jLabel6.setText("      Favourites");

        javax.swing.GroupLayout favpanelLayout = new javax.swing.GroupLayout(favpanel);
        favpanel.setLayout(favpanelLayout);
        favpanelLayout.setHorizontalGroup(
            favpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        favpanelLayout.setVerticalGroup(
            favpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(favpanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        slidepanel.add(favpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 330, 290, 70));

        profilepanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel17.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/help.png"))); // NOI18N
        jLabel17.setText("   Help center");

        javax.swing.GroupLayout profilepanel2Layout = new javax.swing.GroupLayout(profilepanel2);
        profilepanel2.setLayout(profilepanel2Layout);
        profilepanel2Layout.setHorizontalGroup(
            profilepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        profilepanel2Layout.setVerticalGroup(
            profilepanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        slidepanel.add(profilepanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 392, 290, 70));

        profilepanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/profilelogo.png"))); // NOI18N
        jLabel5.setText("    Profile");

        javax.swing.GroupLayout profilepanelLayout = new javax.swing.GroupLayout(profilepanel);
        profilepanel.setLayout(profilepanelLayout);
        profilepanelLayout.setHorizontalGroup(
            profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 272, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );
        profilepanelLayout.setVerticalGroup(
            profilepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(profilepanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(19, Short.MAX_VALUE))
        );

        slidepanel.add(profilepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 290, 70));

        jPanel3.setBackground(new java.awt.Color(255, 51, 153));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        usershow.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        usershow.setForeground(new java.awt.Color(255, 255, 255));
        usershow.setText("User display");
        jPanel3.add(usershow, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 110, -1, -1));

        closemenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/menu (1).png"))); // NOI18N
        closemenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closemenuMouseClicked(evt);
            }
        });
        jPanel3.add(closemenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 40, 60, 40));

        slidepanel.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 140));
        jPanel3.getAccessibleContext().setAccessibleParent(slidepanel);

        addresspanel.setBackground(new java.awt.Color(255, 255, 255));

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/address.png"))); // NOI18N
        jLabel8.setText("   Addresses");

        javax.swing.GroupLayout addresspanelLayout = new javax.swing.GroupLayout(addresspanel);
        addresspanel.setLayout(addresspanelLayout);
        addresspanelLayout.setHorizontalGroup(
            addresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, 280, Short.MAX_VALUE))
        );
        addresspanelLayout.setVerticalGroup(
            addresspanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addresspanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        slidepanel.add(addresspanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 202, 290, 67));

        getContentPane().add(slidepanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 290, 550));

        body.setBackground(new java.awt.Color(255, 255, 255));
        body.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        previous.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/left.png"))); // NOI18N
        previous.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                previousMousePressed(evt);
            }
        });
        body.add(previous, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 190, -1, -1));

        label6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/burgerita res banner.png"))); // NOI18N
        body.add(label6, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 50, 720, 340));

        next.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/right.png"))); // NOI18N
        next.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                nextMousePressed(evt);
            }
        });
        body.add(next, new org.netbeans.lib.awtextra.AbsoluteConstraints(830, 190, -1, -1));

        getContentPane().add(body, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 70, 930, 480));

        manuebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/foodforhomies/menu.png"))); // NOI18N
        manuebutton.setToolTipText("");
        manuebutton.setVerifyInputWhenFocusTarget(false);
        manuebutton.setVerticalTextPosition(javax.swing.SwingConstants.TOP);
        manuebutton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                manuebuttonMouseClicked(evt);
            }
        });
        getContentPane().add(manuebutton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 60, 50));

        title.setBackground(new java.awt.Color(255, 255, 255));

        displayname.setText("Show the location ");

        jLabel2.setFont(new java.awt.Font("Lucida Bright", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 51, 0));
        jLabel2.setText("Current Location ");

        javax.swing.GroupLayout titleLayout = new javax.swing.GroupLayout(title);
        title.setLayout(titleLayout);
        titleLayout.setHorizontalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addGap(82, 82, 82)
                .addGroup(titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(displayname, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(684, Short.MAX_VALUE))
        );
        titleLayout.setVerticalGroup(
            titleLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(titleLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(displayname, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(title, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 930, 70));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_nextMousePressed
       
        
 
        
    }//GEN-LAST:event_nextMousePressed

    private void previousMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_previousMousePressed
 
    }//GEN-LAST:event_previousMousePressed
  int x=290;
  
    private void closemenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closemenuMouseClicked
      if(x==290)
      {   //290x550  agerta 210 552
         slidepanel.setSize(290,550);
          Thread th;
          th = new Thread()
          {
              
              // @Override
              @Override
              @SuppressWarnings("SleepWhileInLoop")
              public void run()
              {
                  try
                  {
                      for(int i=290;i>=0;i--)
                          // for(int i=0;i<=x;i++)
                      {
                          Thread.sleep(0);
                          slidepanel.setSize(i,550);
                      }
                  }
                  catch(InterruptedException e){
                      JOptionPane.showMessageDialog(null,e);
                  }
              }
          };
th.start(); //
          x=0;
      }
    }//GEN-LAST:event_closemenuMouseClicked
///first manu click slide bar dekhabe
    
    private void manuebuttonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_manuebuttonMouseClicked
        if(x==0){
            
             slidepanel.show();
             slidepanel.setSize(x,550);//this.slidepanel.setVisible(false);
            Thread th = new Thread()  {
             //   @Override
                  @Override
              @SuppressWarnings("SleepWhileInLoop")
              public void run()  {
                  try{
                      
                   for(int i=0;i<=x;i++)
                      {
                          Thread.sleep(0);
                          slidepanel.setSize(i,550);
                       }
//                      catch (Exception e){
//                             
//                              
//                    }
                 } catch (InterruptedException ex) {      
                      JOptionPane.showMessageDialog(null,ex);//   Logger.getLogger(restaurantslist.class.getName()).log(Level.SEVERE, null, ex);
                    }      
              } 
        };th.start();
            x =290; 
               
            }
    }//GEN-LAST:event_manuebuttonMouseClicked
//logout button jlabel7 nicher code***************
    private void jLabel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel7MouseClicked
       signin S=new signin();
       this.setVisible(false);
        S.setVisible(true);
    }//GEN-LAST:event_jLabel7MouseClicked

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
               //eikhane  Nimbus chilo
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(restaurantslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(restaurantslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(restaurantslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(restaurantslist.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new restaurantslist().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel addresspanel;
    private javax.swing.JPanel body;
    private javax.swing.JLabel closemenu;
    private javax.swing.JLabel displayname;
    private javax.swing.JPanel favpanel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JLabel label6;
    private javax.swing.JLabel manuebutton;
    private javax.swing.JLabel next;
    private javax.swing.JLabel previous;
    private javax.swing.JPanel profilepanel;
    private javax.swing.JPanel profilepanel2;
    private javax.swing.JPanel slidepanel;
    private javax.swing.JPanel title;
    private javax.swing.JLabel usershow;
    // End of variables declaration//GEN-END:variables
}
