/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vegy.bolt;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author steyza
 */
public class MYSQL_conn {
    Connection conn=null;
    public static Connection ConnectDB()
    {
        String host= "jdbc:mysql://linsql.verebely.dc:3306/diak59";
        String user="diak59";
        String password="5O1M6R";
        try
        {
            Class.forName("com.mysql.jdbc.Driver"); //com.mysql.cj.jdbc.Driver
            Connection conn=DriverManager.getConnection(host, user, password);
            return conn;
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null, e);
            return null;
        }
    }
}
