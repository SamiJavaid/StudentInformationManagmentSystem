/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package project_prac;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 *
 * @author Dc 6000
 */
public class Ex_con {
    
    static Connection con;
    
    public static void call(){
     
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            con= DriverManager.getConnection("jdbc:odbc:project_prac","sa","123");
            System.out.println("connected");
        } catch (Exception e) {
        }
    }
    
}
