
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.swing.JOptionPane;



        
public class myconnection {

 

   public static String regDriver(){
        try {
            Class.forName("com.mysql.hdbc.Driver");
            return "Driver class found";
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(myconnection.class.getName()).log(Level.SEVERE, null, ex);
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



