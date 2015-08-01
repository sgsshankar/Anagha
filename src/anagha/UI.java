/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package anagha;

import anagha.plugins.*;
/**
 *
 * @author shanky
 */
public class UI extends javax.swing.JFrame {

    /**
     * Creates new form UI
     */
    public UI() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        back = new javax.swing.JButton();
        ecode = new javax.swing.JTextField();
        about = new javax.swing.JButton();
        execute = new javax.swing.JButton();
        status = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Anaga");
        setUndecorated(true);
        setResizable(false);

        back.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/close.png"))); // NOI18N
        back.setToolTipText("Close");
        back.setBorder(null);
        back.setBorderPainted(false);
        back.setContentAreaFilled(false);
        back.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        back.setFocusPainted(false);
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });

        ecode.setText("ecode");
        ecode.setToolTipText("Ecode");
        ecode.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ecodeMouseClicked(evt);
            }
        });
        ecode.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                ecodeKeyPressed(evt);
            }
        });

        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/about.png"))); // NOI18N
        about.setToolTipText("About");
        about.setBorder(null);
        about.setBorderPainted(false);
        about.setContentAreaFilled(false);
        about.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        about.setFocusPainted(false);
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });

        execute.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/execute.png"))); // NOI18N
        execute.setToolTipText("Execute");
        execute.setBorder(null);
        execute.setBorderPainted(false);
        execute.setContentAreaFilled(false);
        execute.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        execute.setFocusPainted(false);
        execute.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                executeActionPerformed(evt);
            }
        });

        status.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(ecode, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(execute, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(about)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(back, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(14, 14, 14))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ecode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(status, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(back, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(execute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(about, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(255, 255, 255))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        System.exit(0);
    }//GEN-LAST:event_backActionPerformed

    private void ecodeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ecodeMouseClicked
          
        if (ecode.getText().equals("ecode"))
        {
            ecode.setText("");
        }
    }//GEN-LAST:event_ecodeMouseClicked

    private void ecodeKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_ecodeKeyPressed

        if (ecode.getText().equals("ecode"))
        {
            ecode.setText("");
        }
    }//GEN-LAST:event_ecodeKeyPressed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_aboutActionPerformed

    private void executeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_executeActionPerformed
        
        String execcode=ecode.getText();
        switch(execcode)
        {
            case "dsearch":
                dsearch dsearch = new dsearch();
                dsearch.setVisible(true);
                this.dispose();
                break;
            case "redirect":
                redirect redirect = new redirect();
                redirect.setVisible(true);
                this.dispose();
                break;
            case "sitevalue":
                sitevalue sitevalue = new sitevalue();
                sitevalue.setVisible(true);
                this.dispose();
                break;
            case "geoip":
                geoip geoip = new geoip();
                geoip.setVisible(true);
                this.dispose();
                break;
            case "searchvalue":
                searchvalue searchvalue = new searchvalue();
                searchvalue.setVisible(true);
                this.dispose();
                break;
            case "ipinfo":
                ipinfo ipinfo = new ipinfo();
                ipinfo.setVisible(true);
                this.dispose();
                break;
            case "feedcheck":
                feedcheck feedcheck = new feedcheck();
                feedcheck.setVisible(true);
                this.dispose();
                break;
            case "similarsearch":
                similarsearch similarsearch = new similarsearch();
                similarsearch.setVisible(true);
                this.dispose();
                break;
            case "default":
                status.setText("Ecode not valid");
                break;
        }
    }//GEN-LAST:event_executeActionPerformed

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
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UI().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton about;
    private javax.swing.JButton back;
    private javax.swing.JTextField ecode;
    private javax.swing.JButton execute;
    private javax.swing.JLabel status;
    // End of variables declaration//GEN-END:variables
}
