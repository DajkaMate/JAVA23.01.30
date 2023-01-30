/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enter.Enter;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author steyza
 */
public class MYSQL_kapcs {
    Connection conn=null;
    public static Connection ConnectDB()
    {
        String host= "jdbc:mysql://linsql.verebely.dc:3306/steyerz";
        String user="steyerz";
        String password="MM2UAW";
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
