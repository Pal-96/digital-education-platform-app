/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package UserInterface.WorkAreas.AdminRole.AdministerUserAccountsWorkResp;

import Business.Business;
import Business.Person.Person;
import Business.Person.PersonDirectory;
import Business.Profiles.EmployerDirectory;
import Business.Profiles.FacultyDirectory;
import Business.Profiles.StudentDirectory;
import Business.Profiles.ThirdPartyDirectory;
import Business.UserAccounts.UserAccount;
import Business.UserAccounts.UserAccountDirectory;
import UserInterface.WorkAreas.AdminRole.AdminRoleWorkAreaJPanel;
import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import java.io.FileOutputStream;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JSplitPane;
import javax.swing.table.DefaultTableModel;
//import javax.swing.text.Document;

import com.lowagie.text.pdf.PdfPTable;
import com.lowagie.text.pdf.PdfWriter;
import com.lowagie.text.Document;
import com.lowagie.text.DocumentException;
import com.lowagie.text.Paragraph;

/**
 *
 * @author anupb
 */
public class UserAccount2JPanel extends javax.swing.JPanel {

    
    JSplitPane splitPane;
    int selectedRow;
    
    PersonDirectory personDirectory;
    
    javax.swing.JPanel CardSequencePanel;
    Business business;
    UserAccountDirectory useraccountdirectory;
    StudentDirectory studentdirectory;
    FacultyDirectory facultydirectory;
    Person prsn;
    UserAccount userAcc;
    ThirdPartyDirectory thirdpartydirectory;
    EmployerDirectory employerdirectory;

    public UserAccount2JPanel( JSplitPane splitPane, PersonDirectory personDirectory,Person prsn ,UserAccountDirectory useraccountdirectory, FacultyDirectory facultydirectory, StudentDirectory studentdirectory, UserAccount userAcc, ThirdPartyDirectory thirdpartydirectory, EmployerDirectory employerdirectory) {
        //throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
        initComponents();
        this.splitPane = splitPane;
        this.personDirectory = personDirectory;
        this.useraccountdirectory=useraccountdirectory;
        this.facultydirectory=facultydirectory;
        this.studentdirectory=studentdirectory;
        this.thirdpartydirectory=thirdpartydirectory;
        this.prsn=prsn;
        this.employerdirectory=employerdirectory;
        this.userAcc = userAcc;
        
        
        viewdisplay();
    }
    
    /**
     * Creates new form UserAccount2JPanel
     */
//    public UserAccount2JPanel(Business business, JPanel CardSequencePanel, JSplitPane splitPane, PersonDirectory personDirectory) {
//        initComponents();
//        
//        this.splitPane = splitPane;
//        this.personDirectory = personDirectory;
//        this.business = business;
//        this.CardSequencePanel = CardSequencePanel;
//        
//        viewdisplay();
//        
//        
//    }

    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitle = new javax.swing.JLabel();
        btnCreate = new javax.swing.JButton();
        btnView = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblView1 = new javax.swing.JTable();
        btnBack = new javax.swing.JButton();
        btnPdf = new javax.swing.JButton();

        lblTitle.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblTitle.setText("PERSON TABLE");

        btnCreate.setText("Create User Account");
        btnCreate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateActionPerformed(evt);
            }
        });

        btnView.setText("View User Account");
        btnView.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewActionPerformed(evt);
            }
        });

        tblView1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID", "Name", "Region", "Country", "Email"
            }
        ));
        jScrollPane2.setViewportView(tblView1);

        btnBack.setText("Back");
        btnBack.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackActionPerformed(evt);
            }
        });

        btnPdf.setText("Generate PDF");
        btnPdf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPdfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(275, 275, 275)
                        .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCreate)
                                .addGap(40, 40, 40)
                                .addComponent(btnBack, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(35, 35, 35)
                                .addComponent(btnView)
                                .addGap(41, 41, 41)
                                .addComponent(btnPdf))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 662, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(375, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {btnBack, btnCreate, btnPdf, btnView});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(lblTitle, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreate)
                    .addComponent(btnBack)
                    .addComponent(btnView)
                    .addComponent(btnPdf))
                .addContainerGap(93, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnViewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewActionPerformed
        // TODO add your handling code here:
        UserAccount4JPanel uajpl4 = new UserAccount4JPanel(splitPane, personDirectory,prsn, useraccountdirectory, facultydirectory, studentdirectory,userAcc, thirdpartydirectory, employerdirectory);
        splitPane.setRightComponent(uajpl4);
        
        
    }//GEN-LAST:event_btnViewActionPerformed

    private void btnBackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackActionPerformed
        // TODO add your handling code here:
        
        AdminRoleWorkAreaJPanel arjpl = new AdminRoleWorkAreaJPanel( business, CardSequencePanel, splitPane, personDirectory, useraccountdirectory, facultydirectory, studentdirectory, thirdpartydirectory,employerdirectory);
        splitPane.setRightComponent(arjpl);

        
    }//GEN-LAST:event_btnBackActionPerformed

    private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
            // TODO add your handling code here:
        selectedRow=tblView1.getSelectedRow();
        if (selectedRow<0)
        JOptionPane.showMessageDialog(this, "Please select a row", "Warning", JOptionPane.WARNING_MESSAGE);       
        DefaultTableModel searchModel=(DefaultTableModel)tblView1.getModel();
        prsn=(Person) searchModel.getValueAt(selectedRow, 0);
        //System.out.println("Create acc buttob:"+useraccountdirectory);
        UserAccount3JPanel createUser=new UserAccount3JPanel(splitPane,personDirectory, prsn, useraccountdirectory, facultydirectory, studentdirectory,userAcc, thirdpartydirectory, employerdirectory);
        splitPane.setRightComponent(createUser);
        
    }//GEN-LAST:event_btnCreateActionPerformed

    private void btnPdfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPdfActionPerformed
        // TODO add your handling code here:
        
        String path="";
        JFileChooser j = new JFileChooser();
        j.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
        int x = j.showSaveDialog(this);
        if(x==JFileChooser.APPROVE_OPTION){
        
        path=j.getSelectedFile().getPath();
        
        }
        Document doc = new Document();
        
        try
        {
            PdfWriter.getInstance(doc, new FileOutputStream(path+"/abc.pdf"));
            doc.open();
            PdfPTable tbl=new PdfPTable(5);
            tbl.addCell("ID");
            tbl.addCell("Name");
            tbl.addCell("Region");
            tbl.addCell("Country");
            tbl.addCell("Email");
            
             for(int i=0; i< tblView1.getRowCount(); i++){
             
             String id = tblView1.getValueAt(i, 0).toString();
             String name = tblView1.getValueAt(i, 1).toString();
             String region = tblView1.getValueAt(i, 2).toString();
             String country = tblView1.getValueAt(i, 3).toString();
             String email = tblView1.getValueAt(i, 4).toString();
             
             tbl.addCell(id);
             tbl.addCell(name);
             tbl.addCell(region);
             tbl.addCell(country);
             tbl.addCell(email);
             
             
             }
             
             doc.add(tbl);
            
             JOptionPane.showMessageDialog(null, "PDF generated");
        
        }
        
        catch(Exception e){
        
        
        JOptionPane.showMessageDialog(null, "something wrong");
        }
        
        doc.close(); 
    }//GEN-LAST:event_btnPdfActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBack;
    private javax.swing.JButton btnCreate;
    private javax.swing.JButton btnPdf;
    private javax.swing.JButton btnView;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblTitle;
    private javax.swing.JTable tblView1;
    // End of variables declaration//GEN-END:variables

    private void viewdisplay() {
        
            DefaultTableModel model = (DefaultTableModel) tblView1.getModel();
            model.setRowCount(0);
        
            for(Person per: personDirectory.getPersonlist()){
            
            Object[] info = new Object[5];
            info[0] = per;
            info[1] = per.getName();
            info[2] = per.getRegion();
            info[3] = per.getCountry();
            info[4] = per.getEmailId();
            
            
            model.addRow(info);
            
        }
        
        
    }
}