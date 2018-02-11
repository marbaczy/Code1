/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package warhammerplayersheet;

import java.util.ArrayList;
import javax.swing.ComboBoxModel;

/**
 *
 * @author Rivs
 */
public class PlayerCreation extends javax.swing.JFrame {

    /**
     * Creates new form PlayerCreation
     */
    PlayerSheet playersheet;
    public PlayerCreation(PlayerSheet playersheet) {
        initComponents();
        
        raceList.setModel(new javax.swing.DefaultComboBoxModel<>(playersheet.races.getList()));        
        //System.out.println(playersheet.professions.get(1).getName());
        
        for(Profession item : playersheet.professions)
        {
            professionList.addItem(item.getName());            
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

        characterName = new javax.swing.JTextField();
        raceList = new javax.swing.JComboBox<>();
        professionList = new javax.swing.JComboBox<>();
        previousProfessionList = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        statOgdPo = new javax.swing.JTextField();
        statSwPo = new javax.swing.JTextField();
        statIntPo = new javax.swing.JTextField();
        statKPo = new javax.swing.JTextField();
        statOdpPo = new javax.swing.JTextField();
        statZrPo = new javax.swing.JTextField();
        statWwPo = new javax.swing.JTextField();
        statSsPo = new javax.swing.JTextField();
        statSsA = new javax.swing.JTextField();
        statWwA = new javax.swing.JTextField();
        statKA = new javax.swing.JTextField();
        statOdpA = new javax.swing.JTextField();
        statZrA = new javax.swing.JTextField();
        statIntA = new javax.swing.JTextField();
        statSwA = new javax.swing.JTextField();
        statOgdA = new javax.swing.JTextField();
        statSsR = new javax.swing.JTextField();
        statWwR = new javax.swing.JTextField();
        statKR = new javax.swing.JTextField();
        statOdpR = new javax.swing.JTextField();
        statZrR = new javax.swing.JTextField();
        statIntR = new javax.swing.JTextField();
        statSwR = new javax.swing.JTextField();
        statOgdR = new javax.swing.JTextField();
        statLabels = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        confirm = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        characterName.setText("Name");

        jLabel1.setText("Rasa");

        jLabel2.setText("Profesja");

        jLabel3.setText("Poprz. profesja");

        statOgdPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statOgdPo.setPreferredSize(new java.awt.Dimension(24, 24));
        statOgdPo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statOgdPoActionPerformed(evt);
            }
        });

        statSwPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statSwPo.setPreferredSize(new java.awt.Dimension(24, 24));

        statIntPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statIntPo.setPreferredSize(new java.awt.Dimension(24, 24));

        statKPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statKPo.setPreferredSize(new java.awt.Dimension(24, 24));

        statOdpPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statOdpPo.setPreferredSize(new java.awt.Dimension(24, 24));

        statZrPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statZrPo.setPreferredSize(new java.awt.Dimension(24, 24));

        statWwPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statWwPo.setPreferredSize(new java.awt.Dimension(24, 24));
        statWwPo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                statWwPoActionPerformed(evt);
            }
        });

        statSsPo.setMinimumSize(new java.awt.Dimension(24, 24));
        statSsPo.setPreferredSize(new java.awt.Dimension(24, 24));

        statSsA.setFocusable(false);
        statSsA.setMinimumSize(new java.awt.Dimension(24, 24));
        statSsA.setPreferredSize(new java.awt.Dimension(24, 24));

        statWwA.setFocusable(false);
        statWwA.setMinimumSize(new java.awt.Dimension(24, 24));
        statWwA.setPreferredSize(new java.awt.Dimension(24, 24));

        statKA.setFocusable(false);
        statKA.setMinimumSize(new java.awt.Dimension(24, 24));
        statKA.setPreferredSize(new java.awt.Dimension(24, 24));

        statOdpA.setFocusable(false);
        statOdpA.setMinimumSize(new java.awt.Dimension(24, 24));
        statOdpA.setPreferredSize(new java.awt.Dimension(24, 24));

        statZrA.setFocusable(false);
        statZrA.setMinimumSize(new java.awt.Dimension(24, 24));
        statZrA.setPreferredSize(new java.awt.Dimension(24, 24));

        statIntA.setFocusable(false);
        statIntA.setMinimumSize(new java.awt.Dimension(24, 24));
        statIntA.setPreferredSize(new java.awt.Dimension(24, 24));

        statSwA.setFocusable(false);
        statSwA.setMinimumSize(new java.awt.Dimension(24, 24));
        statSwA.setPreferredSize(new java.awt.Dimension(24, 24));

        statOgdA.setFocusable(false);
        statOgdA.setMinimumSize(new java.awt.Dimension(24, 24));
        statOgdA.setPreferredSize(new java.awt.Dimension(24, 24));

        statSsR.setFocusable(false);
        statSsR.setMinimumSize(new java.awt.Dimension(24, 24));
        statSsR.setPreferredSize(new java.awt.Dimension(24, 24));

        statWwR.setFocusable(false);
        statWwR.setMinimumSize(new java.awt.Dimension(24, 24));
        statWwR.setPreferredSize(new java.awt.Dimension(24, 24));

        statKR.setFocusable(false);
        statKR.setMinimumSize(new java.awt.Dimension(24, 24));
        statKR.setPreferredSize(new java.awt.Dimension(24, 24));

        statOdpR.setFocusable(false);
        statOdpR.setMinimumSize(new java.awt.Dimension(24, 24));
        statOdpR.setPreferredSize(new java.awt.Dimension(24, 24));

        statZrR.setFocusable(false);
        statZrR.setMinimumSize(new java.awt.Dimension(24, 24));
        statZrR.setPreferredSize(new java.awt.Dimension(24, 24));

        statIntR.setFocusable(false);
        statIntR.setMinimumSize(new java.awt.Dimension(24, 24));
        statIntR.setPreferredSize(new java.awt.Dimension(24, 24));

        statSwR.setFocusable(false);
        statSwR.setMinimumSize(new java.awt.Dimension(24, 24));
        statSwR.setPreferredSize(new java.awt.Dimension(24, 24));

        statOgdR.setFocusable(false);
        statOgdR.setMinimumSize(new java.awt.Dimension(24, 24));
        statOgdR.setPreferredSize(new java.awt.Dimension(24, 24));

        statLabels.setText("WW   SS      K     ODP   ZR     INT   SW   OGD");

        jLabel4.setText("Rzuty");

        jLabel5.setText("Aktualna");

        jLabel6.setText("Rozwój");

        confirm.setText("Zatwierdź");
        confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(characterName, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(raceList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(professionList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(previousProfessionList, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 161, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statWwA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statSsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statKA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statOdpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statZrA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statIntA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statSwA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statOgdA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statWwR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statSsR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statKR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statOdpR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statZrR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statIntR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statSwR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statOgdR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statWwPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statSsPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statKPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statOdpPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statZrPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statIntPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statSwPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(statOgdPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(statLabels, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(confirm)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(characterName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statLabels, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(raceList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(statOgdPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSwPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statIntPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statZrPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statOdpPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statKPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSsPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statWwPo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(professionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(statOgdR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSwR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statIntR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statZrR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statOdpR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statKR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSsR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statWwR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(previousProfessionList, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(statOgdA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSwA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statIntA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statZrA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statOdpA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statKA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statSsA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(statWwA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(136, 136, 136)
                .addComponent(confirm)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void statWwPoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statWwPoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statWwPoActionPerformed

    private void statOgdPoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_statOgdPoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_statOgdPoActionPerformed

    private void confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmActionPerformed
    void clearStatsAll()
    {
        statWwPo.setText("");statWwR.setText("");statWwA.setText("");
        statSsPo.setText("");statSsR.setText("");statSsA.setText("");
        statKPo.setText("");statKR.setText("");statKA.setText("");
        statOdpPo.setText("");statOdpR.setText("");statOdpA.setText("");
        statZrPo.setText("");statZrR.setText("");statZrA.setText("");
        statIntPo.setText("");statIntR.setText("");statIntA.setText("");
        statSwPo.setText("");statSwR.setText("");statSwA.setText("");
        statOgdPo.setText("");statOgdR.setText("");statOgdA.setText("");
    }
    
    
    
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
            java.util.logging.Logger.getLogger(PlayerCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PlayerCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PlayerCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PlayerCreation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                //new PlayerCreation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField characterName;
    private javax.swing.JButton confirm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JComboBox<String> previousProfessionList;
    private javax.swing.JComboBox<String> professionList;
    private javax.swing.JComboBox<String> raceList;
    private javax.swing.JTextField statIntA;
    private javax.swing.JTextField statIntPo;
    private javax.swing.JTextField statIntR;
    private javax.swing.JTextField statKA;
    private javax.swing.JTextField statKPo;
    private javax.swing.JTextField statKR;
    private javax.swing.JLabel statLabels;
    private javax.swing.JTextField statOdpA;
    private javax.swing.JTextField statOdpPo;
    private javax.swing.JTextField statOdpR;
    private javax.swing.JTextField statOgdA;
    private javax.swing.JTextField statOgdPo;
    private javax.swing.JTextField statOgdR;
    private javax.swing.JTextField statSsA;
    private javax.swing.JTextField statSsPo;
    private javax.swing.JTextField statSsR;
    private javax.swing.JTextField statSwA;
    private javax.swing.JTextField statSwPo;
    private javax.swing.JTextField statSwR;
    private javax.swing.JTextField statWwA;
    private javax.swing.JTextField statWwPo;
    private javax.swing.JTextField statWwR;
    private javax.swing.JTextField statZrA;
    private javax.swing.JTextField statZrPo;
    private javax.swing.JTextField statZrR;
    // End of variables declaration//GEN-END:variables
}