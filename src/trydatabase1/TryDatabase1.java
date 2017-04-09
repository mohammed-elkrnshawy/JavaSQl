/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trydatabase1;
import java.sql.*;

/**
 *
 * @author Mohammed
 */
public class TryDatabase1 {

//    private static final String username="root";
//    private static final String password="NO";
//    private static final String conn_string="jdbc:mysql://localhost:8080/try1";
    
    static String user="dbezzat";
    static String pass="dbezzat";
    static String con_string="jdbc:mysql://localhost/java";
    
    static Connection con;
    
    public static void main(String[] args) {

        
        
        try{
            int id=4;
            String name="3ZT";
            int age=22;
            con=DriverManager.getConnection(con_string, user, pass);
            System.out.println("connected");
            
            //Insert
            Statement sm=con.createStatement();
            String Query="INSERT INTO `trytable`(`id`, `name`, `age`) VALUES ('"+id+"','"+name+"','"+age+"')";
            sm.executeUpdate(Query);   
            
            //Select 
            String Query2="SELECT * FROM `trytable`";
            ResultSet rs=sm.executeQuery(Query2);
            
            while(rs.next())
            {
                System.out.println(rs.getString("id"));
            }
            
            
            
        }
        catch(SQLException ex)
        {
            System.err.println(ex);   
        }
    }
    
}
