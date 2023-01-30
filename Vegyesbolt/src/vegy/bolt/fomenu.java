
package vegy.bolt;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;

public class fomenu extends javax.swing.JFrame {
static Integer Allapot = null;
Connection conn = null;
PreparedStatement pst = null;
ResultSet rs = null;

    public fomenu() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu_Karbantartas = new javax.swing.JMenu();
        jMenuItem_Ujfelhasznalo = new javax.swing.JMenuItem();
        jMenuItem_Ujtermek = new javax.swing.JMenuItem();
        jMenuItem_Ujtermekcsoport = new javax.swing.JMenuItem();
        jMenu_Ugyvitel = new javax.swing.JMenu();
        jMenuItem_Eladas = new javax.swing.JMenuItem();
        jMenuItem_Kimutatas = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 51));
        jPanel1.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 444, Short.MAX_VALUE)
        );

        jMenu_Karbantartas.setText("Karbantartás");

        jMenuItem_Ujfelhasznalo.setText("Új Felhasználó");
        jMenuItem_Ujfelhasznalo.setToolTipText("");
        jMenuItem_Ujfelhasznalo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_UjfelhasznaloActionPerformed(evt);
            }
        });
        jMenu_Karbantartas.add(jMenuItem_Ujfelhasznalo);

        jMenuItem_Ujtermek.setText("Új Termék / Módosítás");
        jMenuItem_Ujtermek.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_UjtermekActionPerformed(evt);
            }
        });
        jMenu_Karbantartas.add(jMenuItem_Ujtermek);

        jMenuItem_Ujtermekcsoport.setText("Új Termékcsoport");
        jMenuItem_Ujtermekcsoport.setToolTipText("");
        jMenuItem_Ujtermekcsoport.setActionCommand("");
        jMenuItem_Ujtermekcsoport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem_UjtermekcsoportActionPerformed(evt);
            }
        });
        jMenu_Karbantartas.add(jMenuItem_Ujtermekcsoport);

        jMenuBar1.add(jMenu_Karbantartas);

        jMenu_Ugyvitel.setText("Ügyvitel");

        jMenuItem_Eladas.setText("Eladás");
        jMenu_Ugyvitel.add(jMenuItem_Eladas);

        jMenuItem_Kimutatas.setText("Kimutatas");
        jMenuItem_Kimutatas.setToolTipText("");
        jMenu_Ugyvitel.add(jMenuItem_Kimutatas);

        jMenuBar1.add(jMenu_Ugyvitel);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        conn = MYSQL_conn.ConnectDB();
        String sql=" Select * from felh where F_nev = '"+Belepes.Nev+"' and F_jelsz = '"+Belepes.Jelsz+"' ";
        
        try
        {
            Statement sta=conn.createStatement();
            ResultSet rs = sta.executeQuery(sql);
            rs.next();
            Allapot=(Integer.parseInt(rs.getString("F_tip")));
            if (Allapot == 1)
            {
                jMenu_Karbantartas.setEnabled(true);
                jMenuItem_Ujfelhasznalo.setEnabled(true);
                jMenuItem_Ujtermek.setEnabled(true);
                jMenuItem_Ujtermekcsoport.setEnabled(true);
                jMenu_Ugyvitel.setEnabled(true);
                jMenuItem_Eladas.setEnabled(true);
                jMenuItem_Kimutatas.setEnabled(true);
            }
            else
            {
                jMenu_Karbantartas.setEnabled(true);
                jMenuItem_Ujfelhasznalo.setEnabled(false);
                jMenuItem_Ujtermek.setEnabled(true);
                jMenuItem_Ujtermekcsoport.setEnabled(true);
                jMenu_Ugyvitel.setEnabled(true);
                jMenuItem_Eladas.setEnabled(true);
                jMenuItem_Kimutatas.setEnabled(false);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formWindowActivated

    private void jMenuItem_UjfelhasznaloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_UjfelhasznaloActionPerformed
        Uj_felhasznalo uf = new Uj_felhasznalo();
        uf.setVisible(true);
    }//GEN-LAST:event_jMenuItem_UjfelhasznaloActionPerformed

    private void jMenuItem_UjtermekcsoportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_UjtermekcsoportActionPerformed
        Uj_termekcsoport utcs = new Uj_termekcsoport();
        utcs.setVisible(true);
    }//GEN-LAST:event_jMenuItem_UjtermekcsoportActionPerformed

    private void jMenuItem_UjtermekActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem_UjtermekActionPerformed
        Uj_temek ut = new Uj_temek();
        ut.setVisible(true);
    }//GEN-LAST:event_jMenuItem_UjtermekActionPerformed

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
            java.util.logging.Logger.getLogger(fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fomenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fomenu().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem_Eladas;
    private javax.swing.JMenuItem jMenuItem_Kimutatas;
    private javax.swing.JMenuItem jMenuItem_Ujfelhasznalo;
    private javax.swing.JMenuItem jMenuItem_Ujtermek;
    private javax.swing.JMenuItem jMenuItem_Ujtermekcsoport;
    private javax.swing.JMenu jMenu_Karbantartas;
    private javax.swing.JMenu jMenu_Ugyvitel;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
