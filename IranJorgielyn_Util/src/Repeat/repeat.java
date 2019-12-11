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
public class repeat {

    public static void main(String[] args) throws Exception {
        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));
        for (int i = 1; i < 201; i++) {
            try {

                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bigdata", "root", "");
                stmt = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
                String sql = "INSERT INTO repeat1000(`id`, `col1`, `col2`, `col3`, `col4`, `col5`) VALUES ('" + i + "','" + i + "','" + (i + 1) + "','" + (i + 2) + "','" + (i + 3) + "'," + (i + 4) + ")";

                stmt.executeUpdate(sql);
                con.close();

            } catch (ClassNotFoundException | SQLException e) {

            }
        }
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));

    }

}
