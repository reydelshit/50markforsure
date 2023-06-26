/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pmhcprms;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author Jed
 */
public class Ge { 
    public static Connection getConnection(){
        try{
            String dbRoot = "jdbc:mysql://";
            String hostName = "localhost:3306/";
            String dbName = "pmhcprms";
            String dbUrl = dbRoot + hostName + dbName;
            
            String hostUsername = "root";
            String hostPassword = "";
            
            Class.forName("com.mysql.jdbc.Driver");
            Connection myConn = DriverManager.getConnection(dbUrl, hostUsername, hostPassword);
            
           
            
            return myConn;
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e); 
            JOptionPane.showMessageDialog(null,"Connection Error!");
            return null;
        }
    }

    /**
     */
    public static Connection conns() {
         throw new UnsupportedOperationException("Not supported yet.");
    }
    
}
