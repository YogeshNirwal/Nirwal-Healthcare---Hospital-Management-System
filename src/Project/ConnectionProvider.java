/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.*;
/**
 *
 * @author Yogesh Nirwal
 */
public class ConnectionProvider {
    
    public static Connection getcon(){
    
     try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/Hospital","root", "rockyMental@123");
//        s = c.createStatement();
return con;
}

    catch(Exception e){
        e.printStackTrace();
}
        return null;
}   
}
