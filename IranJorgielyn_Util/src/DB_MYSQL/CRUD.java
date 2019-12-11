/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DB_MYSQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Calendar;
import java.util.Collection;
import java.util.Collections;

/**
 *
 * @author iranjo_sd2082
 */
public class CRUD {
    private static String s;
    private static Collection<?> wordcount;

    public static void main(String args[]) {
        
        try
            {
              // create a mysql database connection
              String myDriver ="com.mysql.jdbc.Driver";
              String myUrl = "jdbc:mysql://localhost/bigdata";
              Class.forName(myDriver);
              Connection conn = DriverManager.getConnection(myUrl, "root", "");

              // create a sql date object so we can use it in our INSERT statement
              Calendar calendar = Calendar.getInstance();
              java.sql.Date startDate = new java.sql.Date(calendar.getTime().getTime());

              // the mysql insert statement
              String query = " insert into bigdata(words,count,school)"
                + " values (?,?,'USC')";
              
              // create the mysql insert preparedstatement
              PreparedStatement preparedStmt = conn.prepareStatement(query);
              preparedStmt.setString (1,s);
              preparedStmt.setInt(2,Collections.frequency(wordcount,s));

              // execute the preparedstatement
              preparedStmt.execute();

              conn.close();
            }
            catch (Exception e)
            {
              System.err.println(e);
              
            }            
   
         }
}
