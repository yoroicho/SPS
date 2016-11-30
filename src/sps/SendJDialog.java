/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sps;

import java.awt.AWTException;
import java.awt.Frame;
import java.awt.Robot;
import java.awt.event.InputEvent;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import preCon.*;

/**
 *
 * @author AnyUser
 */
public class SendJDialog extends javax.swing.JDialog {

    private ConfigOkCancelDialog configOkCancelDialog;
    HashMap<String, PassItem> passMap = new HashMap<String, PassItem>();

    /**
     * Creates new form SendJDialog
     */
    public SendJDialog(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        this.buttonGroupMode.add(jRadioButton1);
        this.buttonGroupMode.add(jRadioButton2);
        this.buttonGroupMode.add(jRadioButton3);

        this.setModal(false);  // Must!

        configOkCancelDialog = new ConfigOkCancelDialog(parent, true);
        configOkCancelDialog.setSendJDialog(this);
    }

    public boolean CodeCheck(char[] code) {

//
        Calendar c = Calendar.getInstance();

        //
        SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmm");
        //System.out.println(sdf.format(c.getTime()));
        char[] sdfChar = sdf.format(c.getTime()).toCharArray();
        for (char k : sdfChar) {
            System.out.println(k);
        }
        int j = 8;
        boolean flag = true;
        for (char codePiece : code) {
            System.out.println(Character.getNumericValue(codePiece));
            if (Character.getNumericValue(codePiece)
                    != 9 - Character.getNumericValue(sdfChar[j])) {
                System.out.println("false Piece");
                flag = false;
                break;
            } else {
                System.out.println("true Piece");
                j++;
            }
        }

        System.out.println("Anser" + flag);
        return flag;
        //
        //sdf.applyPattern("a hh:mm:ss SSS");
        //System.out.println(sdf.format(c.getTime()));

    }

    public String parentTest() {
        return "parentTest is OK.";
    }

    public void setPassMap(String tag, PassItem passItem) {
        passMap.put(tag, passItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroupMode = new javax.swing.ButtonGroup();
        jComboBoxItem = new javax.swing.JComboBox();
        jPasswordField1 = new javax.swing.JPasswordField();
        jRadioButton1 = new javax.swing.JRadioButton();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        setModalExclusionType(java.awt.Dialog.ModalExclusionType.TOOLKIT_EXCLUDE);
        setResizable(false);
        addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                formFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                formFocusLost(evt);
            }
        });
        addWindowFocusListener(new java.awt.event.WindowFocusListener() {
            public void windowGainedFocus(java.awt.event.WindowEvent evt) {
                formWindowGainedFocus(evt);
            }
            public void windowLostFocus(java.awt.event.WindowEvent evt) {
                formWindowLostFocus(evt);
            }
        });

        jComboBoxItem.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-----", "-NFR-" }));
        jComboBoxItem.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBoxItemItemStateChanged(evt);
            }
        });
        jComboBoxItem.addHierarchyListener(new java.awt.event.HierarchyListener() {
            public void hierarchyChanged(java.awt.event.HierarchyEvent evt) {
                jComboBoxItemHierarchyChanged(evt);
            }
        });
        jComboBoxItem.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jComboBoxItemFocusGained(evt);
            }
        });
        jComboBoxItem.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                jComboBoxItemInputMethodTextChanged(evt);
            }
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
        });

        jPasswordField1.setText("jPasswordField1");

        jRadioButton1.setText("jRadioButton1");

        jRadioButton2.setText("jRadioButton1");

        jRadioButton3.setText("jRadioButton1");

        jButton1.setText("jButton1");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jComboBoxItem, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jRadioButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jRadioButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jComboBoxItem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jRadioButton1)
                            .addComponent(jButton1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPasswordField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jRadioButton2)
                    .addComponent(jRadioButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusGained
        //this.setSize(100, 100);
    }//GEN-LAST:event_formFocusGained

    private void formFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_formFocusLost
    }//GEN-LAST:event_formFocusLost

    private void formWindowGainedFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowGainedFocus
        this.setSize(100, 120); // Windows OS => (100,100)
    }//GEN-LAST:event_formWindowGainedFocus

    private void formWindowLostFocus(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowLostFocus
        System.out.println(evt.toString());
        if (CodeCheck(this.jPasswordField1.getPassword())) {
            try {
                Robot robot = new Robot();

                Keyboard keyboard = new Keyboard(robot);

                switch (buttonGroupMode.getButtonCount()) {
                    case 0:
                        keyboard.doTyping(passMap.get(this.jComboBoxItem.getSelectedItem()).getUrl());
                        break;
                    case 1:
                        keyboard.doTyping(passMap.get(this.jComboBoxItem.getSelectedItem()).getUserName());
                        break;
                    case 2:
                        keyboard.doTyping(passMap.get(this.jComboBoxItem.getSelectedItem()).getPassCode());
                        break;
                    default:
                        System.out.append("Select Error!");
                }
            } catch (AWTException ex) {
                Logger.getLogger(SendJDialog.class.getName()).log(Level.SEVERE, null, ex);
            } catch (Exception ex) {
                Logger.getLogger(SendJDialog.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        this.setSize(100, 0);
    }//GEN-LAST:event_formWindowLostFocus

    private void jComboBoxItemInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_jComboBoxItemInputMethodTextChanged

    }//GEN-LAST:event_jComboBoxItemInputMethodTextChanged

    private void jComboBoxItemHierarchyChanged(java.awt.event.HierarchyEvent evt) {//GEN-FIRST:event_jComboBoxItemHierarchyChanged

    }//GEN-LAST:event_jComboBoxItemHierarchyChanged

    private void jComboBoxItemItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBoxItemItemStateChanged

    }//GEN-LAST:event_jComboBoxItemItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        JFileChooser filechooser = new JFileChooser();

        int selected = filechooser.showOpenDialog(this);
        if (selected == JFileChooser.APPROVE_OPTION) {
            File file = filechooser.getSelectedFile();
            System.out.println(file.getName());
            configOkCancelDialog.setFileXML(file);
            configOkCancelDialog.setFilelocText(file);
            configOkCancelDialog.setVisible(true);
            jComboBoxItem.removeAllItems();
            for (String tag : passMap.keySet()) {
                jComboBoxItem.addItem(tag);
            }

        } else if (selected == JFileChooser.CANCEL_OPTION) {
            System.out.println("キャンセルされました");
        } else if (selected == JFileChooser.ERROR_OPTION) {
            System.out.println("エラー又は取消しがありました");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jComboBoxItemFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jComboBoxItemFocusGained

    }//GEN-LAST:event_jComboBoxItemFocusGained

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
            java.util.logging.Logger.getLogger(SendJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SendJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SendJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SendJDialog.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SendJDialog dialog = new SendJDialog(new javax.swing.JFrame(), true);
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
    private javax.swing.ButtonGroup buttonGroupMode;
    private javax.swing.JButton jButton1;
    private javax.swing.JComboBox jComboBoxItem;
    private javax.swing.JPasswordField jPasswordField1;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    // End of variables declaration//GEN-END:variables
}
