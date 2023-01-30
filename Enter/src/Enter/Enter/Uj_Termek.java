/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enter.Enter;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableColumnModel;
import javax.swing.table.DefaultTableModel;

public class Uj_Termek extends javax.swing.JFrame {
static Integer Allapot=null;
Connection conn=null;
PreparedStatement pst=null;
ResultSet rs=null;
String Nevellenorzes=null;
static String cikkszam=null;
static String termeknev=null;
static String csoportnev=null;
static String ar=null;
static String egyseg=null;
static String keszlet=null;

    public Uj_Termek() {
        initComponents();
        jTable_termek.getTableHeader().setFont(new Font("Arial",Font.BOLD, 18));
        jTable_termek.setFont(new Font("Arial",Font.ITALIC, 14));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel_termek = new javax.swing.JLabel();
        jButton_Alaph = new javax.swing.JButton();
        jButton_Felv = new javax.swing.JButton();
        jButton_Modos = new javax.swing.JButton();
        jButton_Vissza = new javax.swing.JButton();
        jLabel_cikkszam = new javax.swing.JLabel();
        jLabel_termek_nev = new javax.swing.JLabel();
        jLabel_tcs = new javax.swing.JLabel();
        jLabel_Ar = new javax.swing.JLabel();
        jLabel_Egyseg = new javax.swing.JLabel();
        jLabel_Keszlet = new javax.swing.JLabel();
        jTextField_Cikkszam = new javax.swing.JTextField();
        jTextField_Termek = new javax.swing.JTextField();
        jComboBox_Tcs = new javax.swing.JComboBox<>();
        jTextField_Ar = new javax.swing.JTextField();
        jTextField_Egyseg = new javax.swing.JTextField();
        jTextField_Keszlet = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable_termek = new javax.swing.JTable();
        jLabel_Info = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel_termek.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_termek.setText("Termékek:");

        jButton_Alaph.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Alaph.setText("Alaphelyzet");
        jButton_Alaph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_AlaphActionPerformed(evt);
            }
        });

        jButton_Felv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Felv.setText("Felvitel");
        jButton_Felv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_FelvActionPerformed(evt);
            }
        });

        jButton_Modos.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Modos.setText("Módosít");
        jButton_Modos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_ModosActionPerformed(evt);
            }
        });

        jButton_Vissza.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jButton_Vissza.setText("Vissza");
        jButton_Vissza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton_VisszaActionPerformed(evt);
            }
        });

        jLabel_cikkszam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_cikkszam.setText("Cikkszam:");

        jLabel_termek_nev.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_termek_nev.setText("Termék név:");

        jLabel_tcs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_tcs.setText("Termekcsoport:");

        jLabel_Ar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Ar.setText("Ár:");

        jLabel_Egyseg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Egyseg.setText("Egység:");

        jLabel_Keszlet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel_Keszlet.setText("Készlet");

        jTextField_Cikkszam.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Cikkszam.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_CikkszamKeyTyped(evt);
            }
        });

        jTextField_Termek.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jComboBox_Tcs.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jComboBox_Tcs.setToolTipText("");

        jTextField_Ar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Ar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_ArKeyTyped(evt);
            }
        });

        jTextField_Egyseg.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N

        jTextField_Keszlet.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jTextField_Keszlet.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jTextField_KeszletKeyTyped(evt);
            }
        });

        jTable_termek.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jTable_termek.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "T_cikkszam", "T_nev", "Tcs_kod", "Tcs_nev", "T_ar", "T_egyseg", "Keszlet"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable_termek.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable_termekMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable_termek);

        jLabel_Info.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel_Info.setText("Info:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel_termek)
                    .addComponent(jButton_Alaph, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(88, 88, 88)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_cikkszam, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Cikkszam, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel_Keszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 255, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField_Keszlet, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(jLabel_Egyseg, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE)
                                .addComponent(jLabel_Ar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton_Felv)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton_Modos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton_Vissza))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 820, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jLabel_termek_nev, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel_tcs, javax.swing.GroupLayout.DEFAULT_SIZE, 255, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTextField_Termek)
                                    .addComponent(jTextField_Ar)
                                    .addComponent(jComboBox_Tcs, 0, 400, Short.MAX_VALUE)
                                    .addComponent(jTextField_Egyseg))
                                .addGap(161, 161, 161)))
                        .addGap(0, 0, Short.MAX_VALUE))))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 1263, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel_termek)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton_Alaph, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel_cikkszam)
                            .addComponent(jTextField_Cikkszam, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(122, 122, 122)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_tcs, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jComboBox_Tcs))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_Ar)
                                    .addComponent(jTextField_Ar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_Egyseg)
                                    .addComponent(jTextField_Egyseg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_Keszlet)
                                    .addComponent(jTextField_Keszlet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(40, 40, 40)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel_termek_nev, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField_Termek, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton_Felv)
                    .addComponent(jButton_Modos)
                    .addComponent(jButton_Vissza))
                .addGap(80, 80, 80)
                .addComponent(jLabel_Info, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void combofresh()
    {
  
        jComboBox_Tcs.removeAllItems();
        try
        {
            conn=MYSQL_kapcs.ConnectDB();
            String sql="SELECT * FROM Termekcsoport";
            Statement sta=conn.createStatement();
            rs=sta.executeQuery(sql);
            while (rs.next())
            {
                jComboBox_Tcs.addItem(rs.getString("Tcs_nev"));
            }
            sta.close();
            rs.close();
            conn.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! "+e);
        }
    }
    
    private void tablefresh()
    {
        DefaultTableModel model=(DefaultTableModel)jTable_termek.getModel();
        int sorokszama=model.getRowCount(); 
        for (int i=sorokszama-1; i>=0; i--)
        {
            model.removeRow(i);
        }
        try
        {
            conn=MYSQL_kapcs.ConnectDB();
            String sql="Select Termek.T_cikkszam, Termek.T_nev, Termek.Tcs_kod, "
                    +"Termekcsoport.Tcs_nev, Termek.T_ar, Termek.T_egyseg, Termek.Keszlet "
                    +"FROM Termek INNER JOIN Termekcsoport ON Termek.Tcs_kod=Termekcsoport.TCS_kod";
            Statement sta=conn.createStatement();
            rs=sta.executeQuery(sql);
            // lekérdezés eredményéből töltjük fel a jTable-t
            while (rs.next())
            {
                model.addRow(new Object[]{rs.getInt("Termek.T_cikkszam"),rs.getString("Termek.T_nev"),rs.getInt("Termek.Tcs_kod"),
                    rs.getString("Termekcsoport.Tcs_nev"),rs.getInt("Termek.T_ar"),rs.getString("Termek.T_egyseg"),rs.getInt("Termek.Keszlet")});    
            }
            rs.close();
            sta.close();
            conn.close();
        }
        catch (SQLException e)
        {
            JOptionPane.showMessageDialog(null, "Hiba a lekérdezésben! "+e);
        }
    }
    
    private void jButton_VisszaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_VisszaActionPerformed
        dispose();
    }//GEN-LAST:event_jButton_VisszaActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        tablefresh();
        combofresh();
        jButton_Alaph.setEnabled(true);
        jButton_Modos.setEnabled(false);
        jButton_Felv.setEnabled(true);
        jButton_Vissza.setEnabled(true);
        jTextField_Cikkszam.enable(true);
    }//GEN-LAST:event_formWindowOpened

    private void jButton_FelvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_FelvActionPerformed
        jLabel_Info.setText("");    
        boolean ok=true;
        String kivalasztott_tcs_kod=null;
        if (ok)
        {
            if (jTextField_Cikkszam.getText().equals("") || jTextField_Termek.getText().equals("") //minden ki van töltve
                    || jTextField_Ar.getText().equals("") || jTextField_Egyseg.getText().equals("")
                    || jTextField_Keszlet.getText().equals("") || jComboBox_Tcs.getSelectedItem().equals(""))
            {
                jLabel_Info.setText("Ne hagyjon üres mezőket!");
                ok=false;
            }
            else
            {
                //minden ki van töltve
                //további ellenőrzés: nem foglalt-e a cikkszám, stb
                conn=MYSQL_kapcs.ConnectDB();
                String sql="Select * from Termek where T_cikkszam="+jTextField_Cikkszam.getText()+"";
                try
                {
                    Statement sta=conn.createStatement();
                    ResultSet rs=sta.executeQuery(sql);
                    if (rs.next())
                    {
                        Nevellenorzes=rs.getString("T_cikkszam");
                        jLabel_Info.setText("Ez a kód már szerepel!");
                        ok=false;
                    }
                    sta.close();
                    conn.close();
                }
                catch(Exception e)
                {
                    JOptionPane.showMessageDialog(null, e);
                }
            }
        }
        if (ok)
        {
            try
            {
                conn=MYSQL_kapcs.ConnectDB();
                Statement sta=conn.createStatement();
                String sqlin="Select Tcs_kod from Termekcsoport Where Tcs_nev='"+jComboBox_Tcs.getSelectedItem()+"'";
                ResultSet rs=sta.executeQuery(sqlin);
                if (rs.next())
                {
                    kivalasztott_tcs_kod=rs.getString("Tcs_kod");
                }
                sta.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, e);
            }
            try
            {
                //insertálás
                conn=MYSQL_kapcs.ConnectDB();
                String sqlins="Insert into Termek Values "
                        +"("+jTextField_Cikkszam.getText()+","
                        +"'"+jTextField_Termek.getText()+"',"
                        +""+kivalasztott_tcs_kod+","
                        +""+jTextField_Ar.getText()+","
                        +"'"+jTextField_Egyseg.getText()+"',"
                        +""+jTextField_Keszlet.getText()+")";
                Statement sta=conn.createStatement();
                sta.executeUpdate(sqlins);
                JOptionPane.showMessageDialog(null, "Új termék beszúrás megtörtént!");
                sta.close();
                conn.close();
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null, "Sikertelen felvétel! "+e);
            }
            tablefresh();
            jTextField_Cikkszam.setText("");
            jTextField_Termek.setText("");
            kivalasztott_tcs_kod=null;
            jTextField_Ar.setText("");
            jTextField_Egyseg.setText("");
            jTextField_Egyseg.setText("");
            jTextField_Keszlet.setText("");
            jButton_Alaph.setEnabled(true);
            jButton_Modos.setEnabled(false);
            jButton_Felv.setEnabled(true);
            jButton_Vissza.setEnabled(true);            
        }
    }//GEN-LAST:event_jButton_FelvActionPerformed

    private void jTextField_CikkszamKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_CikkszamKeyTyped
        char c = evt.getKeyChar();
        if (jTextField_Cikkszam.getText().equals(""))
        {
            if (((c < '1') || (c > '9')) && (c !=KeyEvent.VK_BACK_SPACE))
            {
                evt.consume(); // ha nem szám akkor ignoráljuk
            }
        }

    }//GEN-LAST:event_jTextField_CikkszamKeyTyped

    private void jButton_AlaphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_AlaphActionPerformed
        tablefresh();
        combofresh();
        jTextField_Cikkszam.setText("");
        jTextField_Cikkszam.enable(true);
        jTextField_Termek.setText("");
        jTextField_Ar.setText("");
        jTextField_Egyseg.setText("");
        jTextField_Keszlet.setText("");
        jButton_Alaph.setEnabled(true);
        jButton_Modos.setEnabled(false);
        jButton_Felv.setEnabled(true);
        jButton_Vissza.setEnabled(true);
    }//GEN-LAST:event_jButton_AlaphActionPerformed

    private void jTable_termekMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable_termekMouseClicked
        int sor=jTable_termek.getSelectedRow();
        cikkszam=jTable_termek.getModel().getValueAt(sor, 0).toString();
        termeknev=jTable_termek.getModel().getValueAt(sor, 1).toString();
        csoportnev=jTable_termek.getModel().getValueAt(sor, 3).toString();
        ar=jTable_termek.getModel().getValueAt(sor, 4).toString();
        egyseg=jTable_termek.getModel().getValueAt(sor, 5).toString();
        keszlet=jTable_termek.getModel().getValueAt(sor, 6).toString();
        jTextField_Cikkszam.setText(jTable_termek.getModel().getValueAt(sor, 0).toString());
        jTextField_Termek.setText(jTable_termek.getModel().getValueAt(sor, 1).toString());
        jComboBox_Tcs.setSelectedItem(jTable_termek.getModel().getValueAt(sor, 3).toString());
        jTextField_Ar.setText(jTable_termek.getModel().getValueAt(sor, 4).toString());
        jTextField_Egyseg.setText(jTable_termek.getModel().getValueAt(sor, 5).toString());
        jTextField_Keszlet.setText(jTable_termek.getModel().getValueAt(sor, 6).toString());
        jButton_Alaph.setEnabled(true);
        jButton_Modos.setEnabled(true);
        jButton_Felv.setEnabled(false);
        jButton_Vissza.setEnabled(true);
        jTextField_Cikkszam.enable(false);
    }//GEN-LAST:event_jTable_termekMouseClicked

    private void jButton_ModosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton_ModosActionPerformed
        jLabel_Info.setText("");
        String kivalasztott_tcs_kod=null;
        boolean ok=true;
        if (ok)
        {
            if (cikkszam.equals(jTextField_Cikkszam.getText()) &&
                    termeknev.equals(jTextField_Termek.getText()) &&
                    csoportnev.equals(jComboBox_Tcs.getSelectedItem()) &&
                    ar.equals(jTextField_Ar.getText()) &&
                    egyseg.equals(jTextField_Egyseg.getText()) &&
                    keszlet.equals(jTextField_Keszlet.getText()))
            {
                ok=false;
                jLabel_Info.setText("Nincs változás!");
            }
            
            
        }
        if (ok)
        {
            try
                {
                    conn=MYSQL_kapcs.ConnectDB();
                    Statement sta=conn.createStatement();
                    String sqltcs="Select Tcs_kod from Termekcsoport where Tcs_nev='"+jComboBox_Tcs.getSelectedItem()+"'";
                    ResultSet rs=sta.executeQuery(sqltcs);
                    if (rs.next())
                    {
                        kivalasztott_tcs_kod=rs.getString("TCs_kod");
                    }
                    sta.close();
                    conn.close();
                }
            catch(Exception e)
            {
                jLabel_Info.setText("Hiba: "+e);
                JOptionPane.showMessageDialog(null, "Frissítés sikertelen");
            }
            try
            {
                conn=MYSQL_kapcs.ConnectDB();
                Statement sta=conn.createStatement();
                String sqlup="UPDATE Termek Set T_nev='"+jTextField_Termek.getText()+"',"
                        + " Tcs_kod = "+kivalasztott_tcs_kod+","
                        + " T_ar ="+jTextField_Ar.getText()+","
                        + " T_egyseg ='"+jTextField_Egyseg.getText()+"',"
                        + " Keszlet ='"+jTextField_Keszlet.getText()+"'"
                        + " WHERE T_cikkszam ="+jTextField_Cikkszam.getText();
                sta.executeUpdate(sqlup);
                sta.close();
                conn.close();
                JOptionPane.showMessageDialog(null, "Frissítés sikeres!");
                tablefresh();
                combofresh();
                jTextField_Cikkszam.setText("");
                jTextField_Cikkszam.enable(true);
                jTextField_Termek.setText("");
                jTextField_Ar.setText("");
                jTextField_Egyseg.setText("");
                jTextField_Keszlet.setText("");
                jButton_Alaph.setEnabled(true);
                jButton_Modos.setEnabled(false);
                jButton_Felv.setEnabled(true);
                jButton_Vissza.setEnabled(true);
            }
            catch(Exception e)
            {
                jLabel_Info.setText("Hiba: "+ e);
                JOptionPane.showMessageDialog(null, "Frissítés sikertelen!");
            }
        }
    }//GEN-LAST:event_jButton_ModosActionPerformed

    private void jTextField_ArKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_ArKeyTyped
        char c=evt.getKeyChar();
        if (jTextField_Ar.getText().equals(""))
        {
            if (((c < '1')||(c > '9')) && (c != KeyEvent.VK_BACK_SPACE))
            {
                evt.consume();
            }
        }
        else
        {
            if (((c < '0')||(c > '9'))&& (c != KeyEvent.VK_BACK_SPACE) || (jTextField_Keszlet.getText().length()>=3)) 
            {
                evt.consume();
            }
        }
    }//GEN-LAST:event_jTextField_ArKeyTyped

    private void jTextField_KeszletKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField_KeszletKeyTyped
        // ? esetleg beépíteni azt, hogy vagy 1000-nél nem lehet nagyobb az érték, avagy 3 karakternyit engedek
    }//GEN-LAST:event_jTextField_KeszletKeyTyped

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
            java.util.logging.Logger.getLogger(Uj_Termek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Uj_Termek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Uj_Termek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Uj_Termek.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Uj_Termek().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton_Alaph;
    private javax.swing.JButton jButton_Felv;
    private javax.swing.JButton jButton_Modos;
    private javax.swing.JButton jButton_Vissza;
    private javax.swing.JComboBox<String> jComboBox_Tcs;
    private javax.swing.JLabel jLabel_Ar;
    private javax.swing.JLabel jLabel_Egyseg;
    private javax.swing.JLabel jLabel_Info;
    private javax.swing.JLabel jLabel_Keszlet;
    private javax.swing.JLabel jLabel_cikkszam;
    private javax.swing.JLabel jLabel_tcs;
    private javax.swing.JLabel jLabel_termek;
    private javax.swing.JLabel jLabel_termek_nev;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable_termek;
    private javax.swing.JTextField jTextField_Ar;
    private javax.swing.JTextField jTextField_Cikkszam;
    private javax.swing.JTextField jTextField_Egyseg;
    private javax.swing.JTextField jTextField_Keszlet;
    private javax.swing.JTextField jTextField_Termek;
    // End of variables declaration//GEN-END:variables
}
