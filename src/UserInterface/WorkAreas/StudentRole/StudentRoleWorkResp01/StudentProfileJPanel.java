/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.StudentRole.StudentRoleWorkResp01;
import Business.Business;
import Business.Course.CourseLoadDirectory;
import Business.Course.CourseOfferDirectory;
import Business.Profiles.StudentProfile;
import Business.Profiles.ThirdPartyApproval;
import UserInterface.WorkAreas.StudentRole.StudentWorkAreaJPanel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
/**
 *
 * @author palsa
 */
public class StudentProfileJPanel extends javax.swing.JPanel {

    /**
     * Creates new form StudentProfileJPanel
     */
    Business business;
    StudentProfile student;
    CourseOfferDirectory courseofferdirectory;
    JSplitPane jSplitPane;
    StudentProfile studentprofile;
    CourseLoadDirectory courseloaddirectory;
    ThirdPartyApproval tpa;
    public StudentProfileJPanel(Business b, StudentProfile studentprofile, JPanel clp, CourseOfferDirectory courseofferdirectory, JSplitPane jSplitPane, CourseLoadDirectory courseloaddirectory, ThirdPartyApproval tpa) {
        initComponents();
        business = b;
        this.courseofferdirectory=courseofferdirectory;
        this.studentprofile = studentprofile;
        this.jSplitPane=jSplitPane;
        this.studentprofile=studentprofile;
        this.courseloaddirectory=courseloaddirectory;
        this.tpa=tpa;
        displayPanel();
    }

    public void displayPanel()
    {
        txtID.setEditable(false);
        txtIntakeYr.setEditable(false);
        txtAddr.setEditable(false);
        txtAge.setEditable(false);
        txtCountry.setEditable(false);
        txtDevice.setEditable(false);
        txtEmail.setEditable(false);
        txtGender.setEditable(false);
        txtLang.setEditable(false);
        txtName.setEditable(false);
        
        txtDevice.setText(studentprofile.getPerson().getDevice());
        txtName.setText(studentprofile.getPerson().getName());
        txtID.setText(String.valueOf(studentprofile.getStudentId()));
        txtEmail.setText(studentprofile.getPerson().getEmailId());
        txtAge.setText(String.valueOf(studentprofile.getPerson().getAge()));
        txtCountry.setText(studentprofile.getPerson().getCountry());
        txtGender.setText(studentprofile.getPerson().getGender());
        txtIntakeYr.setText(String.valueOf(studentprofile.getIntakeYear()));
        txtLang.setText(studentprofile.getPerson().getLanguage());
        txtAddr.setText(studentprofile.getPerson().getAddress());
        btnSave.setEnabled(false);
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        lbID = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        lbEmail = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        lbAge = new javax.swing.JLabel();
        txtEmail = new javax.swing.JTextField();
        lbGender = new javax.swing.JLabel();
        txtGender = new javax.swing.JTextField();
        lbLang = new javax.swing.JLabel();
        txtAge = new javax.swing.JTextField();
        lbIntakeYr = new javax.swing.JLabel();
        txtLang = new javax.swing.JTextField();
        lbAddr = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtDevice = new javax.swing.JTextField();
        txtIntakeYr = new javax.swing.JTextField();
        lbCountry = new javax.swing.JLabel();
        txtCountry = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddr = new javax.swing.JTextArea();
        btnSave = new javax.swing.JButton();
        btnBack = new javax.swing.JButton();
        btnUpdate = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Hi,");

        lbID.setText("ID#:");

        txtID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIDActionPerformed(evt);
            }
        });

        lbEmail.setText("Email ID:");

        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });

        lbAge.setText("Age:");

        txtEmail.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtEmailActionPerformed(evt);
            }
        });

        lbGender.setText("Gender:");

        lbLang.setText("Language:");

        txtAge.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtAgeActionPerformed(evt);
            }
        });

        lbIntakeYr.setText("Intake Year:");

        txtLang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLangActionPerformed(evt);
            }
        });

        lbAddr.setText("Address:");

        jLabel9.setText("Connected with:");

        txtIntakeYr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtIntakeYrActionPerformed(evt);
            }
        });

        lbCountry.setText("Country:");

        txtAddr.setColumns(20);
        txtAddr.setRows(5);
        jScrollPane1.setViewportView(txtAddr);

        btnSave.setBackground(new java.awt.Color(102, 153, 255));
        btnSave.setForeground(new java.awt.Color(255, 255, 255));
        btnSave.setText("Save");
        btnSave.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSave.setMaximumSize(new java.awt.Dimension(200, 40));
        btnSave.setMinimumSize(new java.awt.Dimension(20, 23));
        btnSave.setPreferredSize(new java.awt.Dimension(240, 30));
        btnSave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnBack.setBackground(new java.awt.Color(102, 153, 255));
        btnBack.setForeground(new java.awt.Color(255, 255, 255));
        btnBack.setText("Back");
        btnBack.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnBack.setMaximumSize(new java.awt.Dimension(200, 40));
        btnBack.setMinimumSize(new java.awt.Dimension(20, 23));
        btnBack.setPreferredSize(new java.awt.Dimension(240, 30));
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        btnUpdate.setBackground(new java.awt.Color(102, 153, 255));
        btnUpdate.setForeground(new java.awt.Color(255, 255, 255));
        btnUpdate.setText("Update");
        btnUpdate.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnUpdate.setMaximumSize(new java.awt.Dimension(200, 40));
        btnUpdate.setMinimumSize(new java.awt.Dimension(20, 23));
        btnUpdate.setPreferredSize(new java.awt.Dimension(240, 30));
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateIdentifyResourceAssetsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(21, 21, 21))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(293, 293, 293))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbID)
                            .addComponent(lbAge))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtID)
                            .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lbEmail, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbGender, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbIntakeYr, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lbAddr)
                            .addComponent(lbLang))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLang)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(32, 32, 32)
                        .addComponent(lbCountry)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtIntakeYr)
                    .addComponent(txtGender)
                    .addComponent(txtEmail)
                    .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(219, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtDevice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel1)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbID)
                    .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbEmail)
                    .addComponent(txtEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbAge)
                    .addComponent(lbGender)
                    .addComponent(txtGender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lbLang)
                    .addComponent(lbIntakeYr)
                    .addComponent(txtLang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtIntakeYr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbCountry)
                        .addComponent(txtCountry, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(lbAddr)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(52, 52, 52)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUpdate, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSave, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIDActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void txtEmailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtEmailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtEmailActionPerformed

    private void txtLangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLangActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLangActionPerformed

    private void txtIntakeYrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtIntakeYrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtIntakeYrActionPerformed

    private void btnSaveIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveIdentifyResourceAssetsActionPerformed

        studentprofile.getPerson().setDevice(txtDevice.getText());
        studentprofile.getPerson().setName(txtName.getText());
        studentprofile.getPerson().setEmailId(txtEmail.getText());
        studentprofile.getPerson().setAge(Integer.parseInt(txtAge.getText()));
        studentprofile.getPerson().setCountry(txtCountry.getText());
        studentprofile.getPerson().setGender(txtGender.getText());
        studentprofile.getPerson().setLanguage(txtLang.getText());
        studentprofile.getPerson().setAddress(txtAddr.getText());
        
        JOptionPane.showMessageDialog(this, "Profile details updated successfully", "Information", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnSaveIdentifyResourceAssetsActionPerformed

    private void btnBackIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:

        StudentWorkAreaJPanel studentworkarea = new StudentWorkAreaJPanel(business, studentprofile, this, courseofferdirectory, jSplitPane, courseloaddirectory,tpa);
        jSplitPane.setRightComponent(studentworkarea);

    }//GEN-LAST:event_btnBackIdentifyResourceAssetsActionPerformed

    private void btnUpdateIdentifyResourceAssetsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateIdentifyResourceAssetsActionPerformed
        // TODO add your handling code here:
        JOptionPane.showMessageDialog(this, "Update the details now!", "Information", JOptionPane.INFORMATION_MESSAGE);
        
        txtAddr.setEditable(true);
        txtAge.setEditable(true);
        txtCountry.setEditable(true);
        txtDevice.setEditable(true);
        txtEmail.setEditable(true);
        txtGender.setEditable(true);
        txtLang.setEditable(true);
        txtName.setEditable(true);
        btnSave.setEnabled(true);
        
        
        btnSave.setEnabled(true);
                
    }//GEN-LAST:event_btnUpdateIdentifyResourceAssetsActionPerformed

    private void txtAgeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtAgeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtAgeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnSave;
    private javax.swing.JButton btnUpdate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbAddr;
    private javax.swing.JLabel lbAge;
    private javax.swing.JLabel lbCountry;
    private javax.swing.JLabel lbEmail;
    private javax.swing.JLabel lbGender;
    private javax.swing.JLabel lbID;
    private javax.swing.JLabel lbIntakeYr;
    private javax.swing.JLabel lbLang;
    private javax.swing.JTextArea txtAddr;
    private javax.swing.JTextField txtAge;
    private javax.swing.JTextField txtCountry;
    private javax.swing.JTextField txtDevice;
    private javax.swing.JTextField txtEmail;
    private javax.swing.JTextField txtGender;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtIntakeYr;
    private javax.swing.JTextField txtLang;
    private javax.swing.JTextField txtName;
    // End of variables declaration//GEN-END:variables
}
