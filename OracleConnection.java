/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oracleconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.lang.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author Admin
 */
public class OracleConnection {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Connection conn = null;
 try{
  String driverName = "oracle.jdbc.driver.OracleDriver";
  Class.forName(driverName);
  String serverName = "LAPTOP-9GA03MGL";
  String serverPort = "1521";
  String sid = "XE";
  String url = "jdbc:oracle:thin:@" + serverName + ":" + serverPort + ":"+sid;
  String username = "system"; 
  String password = "cmkn1999$"; 
  conn = DriverManager.getConnection(url,username,password);
  System.out.println("Success");
 } catch (ClassNotFoundException e){
  System.out.println("Cant find db server" + e.getMessage());
 } catch (SQLException e) {
  System.out.println("Cant connect" + e.getMessage());
 }
   try{
       Statement st=conn.createStatement();
       ResultSet rs=st.executeQuery("Select * from Applicant");
       while(rs.next()){
           
           String username1=rs.getString(2).toString();
           System.out.println(username1);
       }
       rs.close();
   }catch(Exception e)
   {
       e.printStackTrace();
   }
    }
    
}
