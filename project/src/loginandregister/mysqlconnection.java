/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginandregister;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author ADMIN
 */
public class mysqlconnection {
    
    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ADMIN
 */



        


 

   public static String regDriver(){
        try {
            Class.forName("com.mysql.hdbc.Driver");
            return "Driver class found";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(mysqlconnection.class.getName()).log(Level.SEVERE, null, ex);
        }
        return "Driver CLass not found";
   }

    public static Connection getconnection(){
        Connection con = null;
        try {
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/register","root","root");
        } catch (java.sql.SQLException ex) {
             JOptionPane.showMessageDialog(null,ex);
        }
        return (con);
    }
    }




    

