package vegy.bolt;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;

public class Uj_felhasznalo extends javax.swing.JFrame {
static Integer Allapot = null;
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;
String Nevellenorzes = null; 

    public Uj_felhasznalo() {
        initComponents();
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jTextField_Nev = new javax.swing.JTextField();
        jLabel_info = new javax.swing.JLabel();
        jPasswordField_jelszo = new javax.swing.JPasswordField();
        jPasswordField_jelszoIsm = new javax.swing.JPasswordField();
        jCheckBox_Rendszergazda = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Jelszó");

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton1.setText("Vissza");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setText("Név");

        jButton2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton2.setText("Felvétel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel3.setText("Jelszó ismétlés");

        jTextField_Nev.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel_info.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel_info.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel_info.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jPasswordField_jelszo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jPasswordField_jelszoIsm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jCheckBox_Rendszergazda.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jCheckBox_Rendszergazda.setText("Rendszergazda");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(92, 92, 92)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jCheckBox_Rendszergazda))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jTextField_Nev, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_jelszo, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPasswordField_jelszoIsm, javax.swing.GroupLayout.PREFERRED_SIZE, 239, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(95, 95, 95))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(18, 18, 18)
                        .addComponent(jButton1)
                        .addGap(56, 56, 56))))
            .addGroup(layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(jLabel_info, javax.swing.GroupLayout.PREFERRED_SIZE, 647, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 56, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(107, 107, 107)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField_Nev, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jPasswordField_jelszo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jPasswordField_jelszoIsm, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox_Rendszergazda)
                .addGap(35, 35, 35)
                .addComponent(jLabel_info, javax.swing.GroupLayout.DEFAULT_SIZE, 73, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(33, 33, 33))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        jLabel_info.setText("");
        boolean ok = true;
        for (int i = 0; i < jPasswordField_jelszo.getText().length(); i++) 
        {
            char ellenorzes = jTextField_Nev.getText().charAt(i);
            if (ellenorzes == ' ')
            {
                jLabel_info.setText("Ne hagyjon space karaktert");
                ok = false;
            }
        }
        if(ok)
        {
            if(jTextField_Nev.getText().equals("") || jPasswordField_jelszo.getText().equals(""))
            {
                jLabel_info.setText("Ne hagyjon üres mezőket");
                ok = false;
            }
            else if (!(jPasswordField_jelszo.getText().equals(jPasswordField_jelszoIsm.getText())))
            {
                jLabel_info.setText("Jelszó megerősítés nem megfelelő");
                ok = false;
            }
            else
            {
               conn = MYSQL_conn.ConnectDB();
               String sql = "Select F_nev from felh where F_nev = '"+jTextField_Nev.getText()+"'";
               try
               {
                   Statement sta = conn.createStatement();
                   ResultSet rs = sta.executeQuery(sql);
                   if(rs.next())
                   {
                       Nevellenorzes=rs.getString("F_nev");
                       jLabel_info.setText("Ez a név már foglalt");
                       ok = false;
                   }
                   sta.close();
                   conn.close();
               }
               catch(Exception e)
               {
                    JOptionPane.showMessageDialog(null, sql + " " + e);
               }
            }
        }
        if(ok)
        {
            try
            {
                int jog = 0;
                if(jCheckBox_Rendszergazda.isSelected())
                {
                    jog = 1;
                }
                conn = MYSQL_conn.ConnectDB();
                String sqlin="INSERT INTO felh (F_nev, F_jelsz, F_tip) VALUES"
                        +"('"+jTextField_Nev.getText()+"',"
                        +"'"+jPasswordField_jelszo.getText()+"',"
                        +jog+")";
                Statement sta = conn.createStatement();
                sta.executeUpdate(sqlin);
                JOptionPane.showMessageDialog(null, "Insert megtörtént");
                sta.close();
                conn.close();
                this.dispose();
            }
            catch(Exception e)
            {   
                JOptionPane.showMessageDialog(null, "insert" + e);
            }
        }
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Uj_felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uj_felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uj_felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uj_felhasznalo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uj_felhasznalo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JCheckBox jCheckBox_Rendszergazda;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel_info;
    private javax.swing.JPasswordField jPasswordField_jelszo;
    private javax.swing.JPasswordField jPasswordField_jelszoIsm;
    private javax.swing.JTextField jTextField_Nev;
    // End of variables declaration//GEN-END:variables
}
