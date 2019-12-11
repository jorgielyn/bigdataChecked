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
public class retriveConn {

    public static void main(String[] args) throws Exception {
        Date timeStart = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Started: " + dateFormat.format(timeStart));
        for (int i = 1; i < 1001; i++) {
            try {

                Statement stmt = null;
                Class.forName("com.mysql.jdbc.Driver");
                java.sql.Connection con = DriverManager.getConnection("jdbc:mysql://localhost/bigdata", "root", "");
                stmt = (Statement) con.createStatement();
//                ResultSet rs = stmt.executeQuery(null);
                ResultSet rs = stmt.executeQuery("select avg(col1) from repeat1000");
                while(rs.next()) {
                    System.out.println("avg temp is " + rs.getFloat(1));
                }
                  ResultSet rs1 = stmt.executeQuery("select avg(col2) from repeat1000");
                while(rs1.next()) {
                    System.out.println("avg temp is " + rs1.getFloat(1));
                }
                 ResultSet rs2 = stmt.executeQuery("select avg(col3) from repeat1000");
                while(rs2.next()) {
                    System.out.println("avg temp is " + rs2.getFloat(1));
                }
                 ResultSet rs3 = stmt.executeQuery("select avg(col4) from repeat1000");
                while(rs3.next()) {
                    System.out.println("avg temp is " + rs3.getFloat(1));
                }
                 ResultSet rs4 = stmt.executeQuery("select avg(col5) from repeat1000");
                while(rs4.next()) {
                    System.out.println("avg temp is " + rs4.getFloat(1));
                }
                
                

                con.close();
                break;

            } catch (ClassNotFoundException | SQLException e) {

            }
        }
        Date timeFinish = new Date();
        SimpleDateFormat dateFormatFinish = new SimpleDateFormat("yyyy-MM-dd  hh:mm:ss");
        System.out.println("Time Finish: " + dateFormatFinish.format(timeFinish));

    }
}
