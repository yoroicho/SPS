/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sps;

import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.ActionMap;
import javax.swing.InputMap;
import javax.swing.JComponent;
import javax.swing.KeyStroke;

/**
 *
 * @author tokyo
 */
public class ConfigOkCancelDialog extends javax.swing.JDialog {

    /**
     * @param sendJDialog the sendJDialog to set
     */
    public void setSendJDialog(SendJDialog sendJDialog) {
        this.sendJDialog = sendJDialog;
    }

    /**
     * @param fileXML the fileXML to set
     */
    public void setFileXML(File fileXML) {
        this.fileXML = fileXML;
    }

    /**
     * A return status code - returned if Cancel button has been pressed
     */
    public static final int RET_CANCEL = 0;
    /**
     * A return status code - returned if OK button has been pressed
     */
    public static final int RET_OK = 1;

    private SendJDialog sendJDialog;

    private String mainTitle;
    private String subTitle;
    private String url;
    private String userName;
    private String passCode;
    private String comment;

    private File fileXML;

    Properties prop = new Properties();

    public void setFilelocText(File fileName) {
        this.jLabelFile.setText(fileName.getPath());
    }

    ;
    
    
    /**
     * Write to XML file on Encryption.
     */
    private void readFile() throws FileNotFoundException, IOException, Exception {

        InputStream is = new FileInputStream(fileXML);
        prop.loadFromXML(is); // is はこのメソッドが終了すると close される

        System.out.println("DecTG:" + CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("tg")));
        System.out.println("DecMT:" + CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("mt")));//prop.setProperty("mt", CipherAES128.encrypteCipherAES128(this.jTextFieldPreKey.getText(), mainTitle));
        System.out.println("DecST:" + CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("st")));//prop.setProperty("st", CipherAES128.encrypteCipherAES128(this.jTextFieldPreKey.getText(), subTitle));
        //System.out.println("DecUP:" + CipherAES128.DecodeAES128(this.jTextFieldPreKey.getText(), prop.getProperty("up")));//prop.setProperty("up", CipherAES128.encrypteCipherAES128(this.jTextFieldPreKey.getText(), url));
        //System.out.println("DecUN:" + CipherAES128.DecodeAES128(this.jTextFieldPreKey.getText(), prop.getProperty("un")));//prop.setProperty("un", CipherAES128.encrypteCipherAES128(this.jTextFieldPreKey.getText(), userName));
        //System.out.println("DecPC:" + CipherAES128.DecodeAES128(this.jTextFieldPreKey.getText(), prop.getProperty("pc")));//prop.setProperty("pc", CipherAES128.encrypteCipherAES128(this.jTextFieldPreKey.getText(), passCodeA + passCodeB));
        //System.out.println("DecCT:" + CipherAES128.DecodeAES128(this.jTextFieldPreKey.getText(), prop.getProperty("ct")));//prop.setProperty("ct", CipherAES128.encrypteCipherAES128(this.jTextFieldPreKey.getText(), comment));
        //System.out.println("DecTM:" + CipherAES128.DecodeAES128(this.jTextFieldPreKey.getText(), prop.getProperty("tm")));//prop.setProperty("tm", CipherAES128.encrypteCipherAES128(this.jTextFieldPreKey.getText(), strDate));

    }

    /**
     * Creates new form ConfigOkCancelDialog
     */
    public ConfigOkCancelDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();
        this.jPasswordFieldPrePass.setText(null);
        okButton.setEnabled(false);

        // Close the dialog when Esc is pressed
        String cancelName = "cancel";
        InputMap inputMap = getRootPane().getInputMap(JComponent.WHEN_ANCESTOR_OF_FOCUSED_COMPONENT);
        inputMap.put(KeyStroke.getKeyStroke(KeyEvent.VK_ESCAPE, 0), cancelName);
        ActionMap actionMap = getRootPane().getActionMap();
        actionMap.put(cancelName, new AbstractAction() {
            public void actionPerformed(ActionEvent e) {
                doClose(RET_CANCEL);
            }
        });
    }

    /**
     * @return the return status of this dialog - one of RET_OK or RET_CANCEL
     */
    public int getReturnStatus() {
        return returnStatus;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        okButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        jLabelFile = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jButtonPassSet = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jPasswordFieldPrePass = new javax.swing.JPasswordField();

        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closeDialog(evt);
            }
        });

        okButton.setText("OK");
        okButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        jLabelFile.setText("jLabel1");

        jLabel2.setText("jLabel2");

        jButtonPassSet.setText("COM");
        jButtonPassSet.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonPassSetActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 378, Short.MAX_VALUE)
                    .addComponent(jLabelFile, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(okButton, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cancelButton))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jPasswordFieldPrePass)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonPassSet)))
                .addContainerGap())
        );

        layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {cancelButton, okButton});

        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelFile)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonPassSet)
                    .addComponent(jPasswordFieldPrePass, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 170, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton)
                    .addComponent(okButton))
                .addContainerGap())
        );

        getRootPane().setDefaultButton(okButton);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void okButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okButtonActionPerformed
        PassItem passItem = new PassItem();
        try {
            passItem.setTag(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("tg")));
            passItem.setMainTitle(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("mt")));
            passItem.setSubTitle(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("st")));
            passItem.setUrl(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("up")));
            passItem.setUserName(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("un")));
            passItem.setPassCode(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("pc")));
            passItem.setComment(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("ct")));
            passItem.setTime(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("tm")));
            sendJDialog.setPassMap(CipherAES128.DecodeAES128(String.valueOf(jPasswordFieldPrePass.getPassword()), prop.getProperty("tg")), passItem);
        } catch (Exception ex) {
            Logger.getLogger(ConfigOkCancelDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
        jPasswordFieldPrePass.setText(null);
        okButton.setEnabled(false);
        jButtonPassSet.setEnabled(true);
        doClose(RET_OK);
    }//GEN-LAST:event_okButtonActionPerformed

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        jPasswordFieldPrePass.setText(null);
        okButton.setEnabled(false);
        jButtonPassSet.setEnabled(true);
        doClose(RET_CANCEL);
    }//GEN-LAST:event_cancelButtonActionPerformed

    /**
     * Closes the dialog
     */
    private void closeDialog(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closeDialog
        doClose(RET_CANCEL);
    }//GEN-LAST:event_closeDialog

    private void jButtonPassSetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonPassSetActionPerformed
        try {
            readFile();
            okButton.setEnabled(true);
            jButtonPassSet.setEnabled(false);
        } catch (Exception ex) {
            Logger.getLogger(ConfigOkCancelDialog.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_jButtonPassSetActionPerformed

    private void doClose(int retStatus) {
        returnStatus = retStatus;
        setVisible(false);
        dispose();
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
            java.util.logging.Logger.getLogger(ConfigOkCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConfigOkCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConfigOkCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConfigOkCancelDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                ConfigOkCancelDialog dialog = new ConfigOkCancelDialog(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cancelButton;
    private javax.swing.JButton jButtonPassSet;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabelFile;
    private javax.swing.JPasswordField jPasswordFieldPrePass;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JButton okButton;
    // End of variables declaration//GEN-END:variables

    private int returnStatus = RET_CANCEL;
}
