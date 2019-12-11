/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Repeat;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author iranjo_sd2082
 */
public class retriveNoConn {

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

                ResultSet rs = stmt.executeQuery("select sum(Col1) from repeat1000");
                while (rs.next()) {
                    float avg = rs.getFloat(1) / 1000;
                    System.out.println("column one average is " + avg);
                }

                ResultSet rs2 = stmt.executeQuery("select sum(Col2) from repeat1000");
                while (rs2.next()) {
                    float avg = rs2.getFloat(1) / 1000;
                    System.out.println("column two average is " + avg);
                }

                ResultSet rs3 = stmt.executeQuery("select sum(Col3) from repeat1000");
                while (rs3.next()) {
                    float avg = rs3.getFloat(1) / 1000;
                    System.out.println("column three average is " + avg);
                }

                ResultSet rs4 = stmt.executeQuery("select sum(Col4) from repeat1000");
                while (rs4.next()) {
                    float avg = rs4.getFloat(1) / 1000;
                    System.out.println("column four average is " + avg);
                }

                ResultSet rs5 = stmt.executeQuery("select sum(Col5) from repeat1000");
                while (rs5.next()) {
                    float avg = rs5.getFloat(1) / 1000;
                    System.out.println("column four average is " + avg);
                }
               con.close();
               break;
            }

        } catch (ClassNotFoundException | SQLException e) {

        }
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));

    }

}
