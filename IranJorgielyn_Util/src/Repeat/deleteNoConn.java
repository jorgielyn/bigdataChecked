/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Repeat;

import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author iranjo_sd2082
 */
public class deleteNoConn {
    public static void main(String[] args) throws Exception {

        try {
            Date timeStart = new Date();
            SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
            System.out.println("Time Started: " + dateFormat.format(timeStart));
            Statement stmt = null;
            Class.forName("com.mysql.jdbc.Driver");
            java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bigdata", "root", "");
            stmt = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
            for (int i = 1; i < 1001; i++) {
                 stmt.executeUpdate(String.format("DELETE FROM repeat1000 WHERE id='%s'", i));

                
           
            }
           
                 Date timeFinish = new Date();
            SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
            System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));
            con.close();
        } catch (ClassNotFoundException | SQLException e) {

            

        }

    }
}
