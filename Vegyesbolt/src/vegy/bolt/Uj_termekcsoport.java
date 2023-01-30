/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegy.bolt;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class Uj_termekcsoport extends javax.swing.JFrame {
static Integer Allapot = null;
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs =  null;
String Nevellenorzes = null;    

    public Uj_termekcsoport() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Termekcsnev = new javax.swing.JLabel();
        jTextField_Termekcsnev = new javax.swing.JTextField();
        jLabel_Termekcs1 = new javax.swing.JLabel();
        jTextField_Termekcs = new javax.swing.JTextField();
        jButton_felvetel = new javax.swing.JButton();
        jButton_vissza = new javax.swing.JButton();
        jLabel_info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Termekcsnev.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Termekcsnev.setText("Termékcsoport név:");

        jTextField_Termekcsnev.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Termekcsnev.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TermekcsnevKeyTyped(evt);
            }
        });

        jLabel_Termekcs1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Termekcs1.setText("Termékcsoport kód:");

        jTextField_Termekcs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Termekcs.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_TermekcsKeyTyped(evt);
            }
        });

        jButton_felvetel.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_felvetel.setText("Felvétel");
        jButton_felvetel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_felvetelActionPerformed(evt);
            }
        });

        jButton_vissza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_vissza.setText("Vissza");
        jButton_vissza.setToolTipText("");
        jButton_vissza.setActionCommand("");
        jButton_vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_visszaActionPerformed(evt);
            }
        });

        jLabel_info.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_info.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel_info.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(67, 67, 67)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Termekcs1)
                    .addComponent(jLabel_Termekcsnev))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 120, Short.MAX_VALUE)
                .addComponent(jTextField_Termekcsnev, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(layout.createSequentialGroup()
                .addGap(179, 179, 179)
                .addComponent(jButton_felvetel)
                .addGap(77, 77, 77)
                .addComponent(jButton_vissza)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_info, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(400, Short.MAX_VALUE)
                    .addComponent(jTextField_Termekcs, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(44, 44, 44)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jLabel_Termekcs1)
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel_Termekcsnev)
                    .addComponent(jTextField_Termekcsnev, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(39, 39, 39)
                .addComponent(jLabel_info, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_felvetel)
                    .addComponent(jButton_vissza))
                .addGap(44, 44, 44))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(81, 81, 81)
                    .addComponent(jTextField_Termekcs, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(277, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_visszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_visszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_visszaActionPerformed

    private void jTextField_TermekcsKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TermekcsKeyTyped
        char c = evt.getKeyChar();
        if (jTextField_Termekcs.getText().equals(""))
        {
            if(((c < '1') || (c > '9')) && (c !=KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if(((c < '0') || (c > '9')) && (c !=KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }  
        }
    }//GEN-LAST:event_jTextField_TermekcsKeyTyped

    private void jTextField_TermekcsnevKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_TermekcsnevKeyTyped
        char c = evt.getKeyChar();
        if ((c == ' ') && (c != KeyEvent.VK_BACK_SPACE))
        {
            evt.consume();      
        }
    }//GEN-LAST:event_jTextField_TermekcsnevKeyTyped

    private void jButton_felvetelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_felvetelActionPerformed
        jLabel_info.setText("");
        boolean ok = true;
        if (ok)
        {
            if(jTextField_Termekcs.getText().equals("") || jTextField_Termekcsnev.getText().equals(""))
            {
                jLabel_info.setText("Ne hagyjon üres mezőket");
                ok = false;
            }
            else
            {
                conn = MYSQL_conn.ConnectDB();
                String sql = "Select * from termekcsoport where Tcs_kod = '"+jTextField_Termekcs.getText()+"'";
                try
                {
                    Statement sta = conn.createStatement();
                    ResultSet rs = sta.executeQuery(sql);
                    if (rs.next())
                    {
                        Nevellenorzes = rs.getString("Tcs_kod");
                        jLabel_info.setText("Ez a kód már szerepel");
                        ok = false;
                    }
                    sta.close();
                    conn.close();
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
                conn=MYSQL_conn.ConnectDB();
                sql = "Select * from termekcsoport where Tcs_nev = '"+jTextField_Termekcsnev.getText()+"'";
                try
                {
                    Statement sta = conn.createStatement();
                    ResultSet rs = sta.executeQuery(sql);
                    if (rs.next())
                    {
                        Nevellenorzes = rs.getString("Tcs_nev");
                        jLabel_info.setText("Ez a termékcsoport már létezik");
                        ok = false;
                    }
                    rs.close();
                    conn.close();
                }
                catch (Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ok)
        {
            try
            {
                conn = MYSQL_conn.ConnectDB();
                String sqlin = "INSERT INTO termekcsoport (Tcs_kod, Tcs_nev) Values"
                        + "("+jTextField_Termekcs.getText()+","
                        + "'"+jTextField_Termekcsnev.getText()+"')";
                Statement st = conn.createStatement();
                st.executeUpdate(sqlin);
                JOptionPane.showMessageDialog(null, "Insert megtörtént!");
                st.close();
                conn.close();
                this.dispose();
            
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
        }
    }//GEN-LAST:event_jButton_felvetelActionPerformed

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
            java.util.logging.Logger.getLogger(Uj_termekcsoport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uj_termekcsoport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uj_termekcsoport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uj_termekcsoport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uj_termekcsoport().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_felvetel;
    private javax.swing.JButton jButton_vissza;
    private javax.swing.JLabel jLabel_Termekcs1;
    private javax.swing.JLabel jLabel_Termekcsnev;
    private javax.swing.JLabel jLabel_info;
    private javax.swing.JTextField jTextField_Termekcs;
    private javax.swing.JTextField jTextField_Termekcsnev;
    // End of variables declaration//GEN-END:variables
}
