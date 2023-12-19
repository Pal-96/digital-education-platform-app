/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkArea.ThirdPartyRole;

import Business.Profiles.ThirdPartyApproval;
import Business.Profiles.ThirdPartyProfile;
import UserInterface.WorkAreas.ThirdPartyRole.ThirdPartyRoleWorkResp.ApproveGradJPanel;
import UserInterface.WorkAreas.ThirdPartyRole.ThirdPartyRoleWorkResp.StudentDetailsJPanel;
import javax.swing.JSplitPane;

/**
 *
 * @author tanvi
 */
public class ThirdPartyWorkAreaJPanel extends javax.swing.JPanel {

    /**
     * Creates new form ThirdPartyWorkAreaJPanel
     */
    JSplitPane jsplitPane;
    ThirdPartyProfile tpp;
    ThirdPartyApproval tpa;
    public ThirdPartyWorkAreaJPanel(JSplitPane jsplitPane, ThirdPartyProfile tpp, ThirdPartyApproval tpa) {
        initComponents();
        this.jsplitPane=jsplitPane;
        this.tpa=tpa;
        this.tpp=tpp;
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        btnApproveGrad = new javax.swing.JButton();

        jLabel2.setText("jLabel1");

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Third Party Authority");

        btnApproveGrad.setBackground(new java.awt.Color(102, 153, 255));
        btnApproveGrad.setForeground(new java.awt.Color(255, 255, 255));
        btnApproveGrad.setText("Approve Grad Status");
        btnApproveGrad.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnApproveGrad.setMaximumSize(new java.awt.Dimension(200, 40));
        btnApproveGrad.setMinimumSize(new java.awt.Dimension(20, 23));
        btnApproveGrad.setPreferredSize(new java.awt.Dimension(240, 30));
        btnApproveGrad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveGradIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 403, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(114, 114, 114)
                        .addComponent(btnApproveGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel1)
                .addGap(77, 77, 77)
                .addComponent(btnApproveGrad, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(131, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnApproveGradIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveGradIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        StudentDetailsJPanel studdetails=new StudentDetailsJPanel(jsplitPane,tpa,tpp);
        jsplitPane.setRightComponent(studdetails);
        //ApproveGradJPanel approveGrad=new ApproveGradJPanel();
        
        
      
    }//GEN-LAST:event_btnApproveGradIdentifyResourceAssetsActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApproveGrad;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}