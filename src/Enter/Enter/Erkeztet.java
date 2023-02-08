/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enter.Enter;

import java.io.File;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Scanner;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author user08
 */


public class Erkeztet extends javax.swing.JFrame {
Connection conn=null;
    /**
     * Creates new form Erkeztet
     */
    public Erkeztet() {
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

        jB_Read = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jT_Be = new javax.swing.JTable();
        jB_Felt = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jB_Read.setText("Beolvasás");
        jB_Read.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_ReadActionPerformed(evt);
            }
        });

        jT_Be.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cikkszám", "Darabszám"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jT_Be);
        if (jT_Be.getColumnModel().getColumnCount() > 0) {
            jT_Be.getColumnModel().getColumn(0).setResizable(false);
            jT_Be.getColumnModel().getColumn(1).setResizable(false);
        }

        jB_Felt.setText("Feltöltés");
        jB_Felt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jB_FeltActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(160, 160, 160)
                        .addComponent(jB_Read))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(163, 163, 163)
                        .addComponent(jB_Felt)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jB_Read)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jB_Felt)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jB_ReadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_ReadActionPerformed
      ((DefaultTableModel)jT_Be.getModel()).setNumRows(0);
        try {
      File myObj = new File("C:\\Users\\user09.VEREBELY\\Documents\\NetBeansProjects\\Enter\\Bevetel\\Bevetel.txt");
      Scanner myReader = new Scanner(myObj);
      int Count = 0;
      String data = null;
      DefaultTableModel model=(DefaultTableModel)jT_Be.getModel();
      while (myReader.hasNextLine()) {
          if (Count == 0) {
              myReader.nextLine();
              Count = 1;
          }
          else{
              data = myReader.nextLine();
          }
          if (data != null) {
              // Adatok kiírása
              String[] parts = data.toString().split(";");
              model.addRow(new Object[]{parts[0], parts[1]});
              
          }
      }
      myReader.close();
    } catch (FileNotFoundException e) {
      System.out.println("Olvasási hiba");
      e.printStackTrace();
    }
    }//GEN-LAST:event_jB_ReadActionPerformed

    private void jB_FeltActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jB_FeltActionPerformed
        conn=MYSQL_kapcs.ConnectDB();
        
        for (int count = 0; count < jT_Be.getRowCount(); count++){
            try{
            conn=MYSQL_kapcs.ConnectDB();
                if (Integer.parseInt(jT_Be.getValueAt(count, 1).toString()) >= 0) {
                    String sqlup="UPDATE Termek SET Termek.Keszlet="+jT_Be.getValueAt(count, 1)+ " + Termek.Keszlet Where Termek.T_cikkszam="+jT_Be.getValueAt(count, 0);
                    Statement stup=conn.createStatement();
                    stup.executeUpdate(sqlup);         
                    //JOptionPane.showMessageDialog(null, "Update megtörtént!");
                    stup.close();
                }
                else{
                    JOptionPane.showMessageDialog(null, "Nem jó");
                    ((DefaultTableModel)jT_Be.getModel()).setNumRows(0);
                }
            conn.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(null, "Sikertelen Frissítés! "+e);
                
            }
        }
        
    }//GEN-LAST:event_jB_FeltActionPerformed

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
            java.util.logging.Logger.getLogger(Erkeztet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Erkeztet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Erkeztet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Erkeztet.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Erkeztet().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jB_Felt;
    private javax.swing.JButton jB_Read;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jT_Be;
    // End of variables declaration//GEN-END:variables
}