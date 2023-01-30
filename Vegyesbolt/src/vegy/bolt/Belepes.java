package vegy.bolt;
import java.sql.*;
import javax.swing.*;

public class Belepes extends javax.swing.JFrame {
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;

static String Nev=null;
static String Jelsz=null;
static String F_id=null;

    public Belepes() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_Felhasznalo = new javax.swing.JLabel();
        jLabel_Jelszo = new javax.swing.JLabel();
        jTextField_Felhasznalo = new javax.swing.JTextField();
        jButton_Belepes = new javax.swing.JButton();
        jPasswordField_Jelszo = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel_Felhasznalo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Felhasznalo.setText("Felhasználó:");

        jLabel_Jelszo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel_Jelszo.setText("Jelszó:");

        jTextField_Felhasznalo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        jButton_Belepes.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jButton_Belepes.setText("Belépés");
        jButton_Belepes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_BelepesActionPerformed(evt);
            }
        });

        jPasswordField_Jelszo.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel_Jelszo)
                            .addComponent(jLabel_Felhasznalo))
                        .addGap(125, 125, 125)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField_Felhasznalo)
                            .addComponent(jPasswordField_Jelszo, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(jButton_Belepes, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(80, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_Felhasznalo)
                    .addComponent(jTextField_Felhasznalo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(137, 137, 137)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel_Jelszo)
                    .addComponent(jPasswordField_Jelszo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 104, Short.MAX_VALUE)
                .addComponent(jButton_Belepes, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(102, 102, 102))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton_BelepesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_BelepesActionPerformed
        Boolean ok=true;
        conn=MYSQL_conn.ConnectDB();
        String sql="Select * from felh where F_nev=? and F_jelsz=?";
        try
        {
            pst=conn.prepareStatement(sql);
            pst.setString(1,jTextField_Felhasznalo.getText());
            pst.setString(2,jPasswordField_Jelszo.getText());
            rs=pst.executeQuery();
            
            if (rs.next())
            {
                JOptionPane.showMessageDialog(null,"Üdvözlöm!");
                Nev=jTextField_Felhasznalo.getText();
                Jelsz=jPasswordField_Jelszo.getText();
                //Fomenu el kell indítanui;
                fomenu f = new fomenu();
                f.setVisible(true);
                setVisible(false);
            }
            else
            {
                JOptionPane.showMessageDialog(null,"Hibás felhasználó vagy jelszó!");
                ok = false;
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
        if (ok)
        {
            try
            {
                conn=MYSQL_conn.ConnectDB();
                Statement sta=conn.createStatement();
                String sqltcs = "Select F_tip from felh where F_nev='"+Nev+"' and F_jelsz='"+Jelsz+"'";
                ResultSet rs=sta.executeQuery(sqltcs);
                if(rs.next())
                {
                    F_id=rs.getString("F_tip");
                }
                sta.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"F_tip sikertelen!" + e);
            }
        }
    }//GEN-LAST:event_jButton_BelepesActionPerformed

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
            java.util.logging.Logger.getLogger(Belepes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Belepes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Belepes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Belepes.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Belepes().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Belepes;
    private javax.swing.JLabel jLabel_Felhasznalo;
    private javax.swing.JLabel jLabel_Jelszo;
    private javax.swing.JPasswordField jPasswordField_Jelszo;
    private javax.swing.JTextField jTextField_Felhasznalo;
    // End of variables declaration//GEN-END:variables
}
