/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Admin;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author user
 */
@WebService(serviceName = "AdminSide")
public class AdminSide {

    
     String host,url,password,port,username;
  Connection conn = null;
    boolean connect() {
        try {
         // host="127.0.0.1";
         //  password="";
         //  username="root";
         //  url="jdbc:mysql://127.0.0.1/tab";
            host=System.getenv("OPENSHIFT_MYSQL_DB_HOST");
            password=System.getenv("OPENSHIFT_MYSQL_DB_PASSWORD");
            username=System.getenv("OPENSHIFT_MYSQL_DB_USERNAME");
            port=System.getenv("OPENSHIFT_MYSQL_DB_PORT");
            url = String.format("jdbc:mysql://%s:%s/tab", host, port);
           //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");
            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(url,username,password);  
        } catch (ClassNotFoundException ex) {
            ex.printStackTrace();
            Logger.getLogger(AdminSide.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SQLException ex) {
         Logger.getLogger(AdminSide.class.getName()).log(Level.SEVERE, null, ex);
           ex.printStackTrace();
         return false;
     }
        return true;
    }
        
    int checktable(String name){
        char ch=name.charAt(0);
        if(ch>=65&&ch<72)
            return 0;
        else if(ch>=72&&ch<79)
            return 1;
        else if(ch>=79&&ch<86)
            return 2;
        else {
            return 3;
        }
    }
 
    
    
    /**
     * Web service operation
     */
    @WebMethod(operationName = "insertion")
    public boolean insertion(@WebParam(name = "name") String name, @WebParam(name = "age") int age) {
          int id = -1;
        
   Statement stmt = null;
   
   if(connect()){
   try{
       String[] Tables=new String[4];
      Tables[0]="table0";
      Tables[1]="table1";Tables[2]="table2";
      Tables[3]="table3";
      
      int tab=checktable(name);
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "INSERT INTO tab."+Tables[tab]+" values ('"+name+"',"+age+")";
      System.out.println("Query is    " +sql);
     stmt.executeUpdate(sql);
      stmt.close();
      conn.close();
   }catch(SQLException se){
       se.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!"+id);
        return true;
    }   
        
        return false;
    }

    /**
     * Web service operation
     * @param name
     * @return 
     */
    @WebMethod(operationName = "deletion")
    public boolean deletion(@WebParam(name = "name") String name) {
        
      
   Statement stmt = null;
   
   if(connect()){
   try{
       String[] Tables=new String[4];
      Tables[0]="table0";
      Tables[1]="table1";Tables[2]="table2";
      Tables[3]="table3";
      
      int tab=checktable(name);
      //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      sql = "DELETE FROM tab."+Tables[tab]+" where Names= ('"+name+"')";
      System.out.println("Query is    " +sql);
     stmt.executeUpdate(sql);
      stmt.close();
      conn.close();
   }catch(SQLException se){
       se.printStackTrace();
   }finally{
      //finally block used to close resources
      try{
         if(stmt!=null)
            stmt.close();
      }catch(SQLException se2){
      }// nothing we can do
      try{
         if(conn!=null)
            conn.close();
      }catch(SQLException se){
         se.printStackTrace();
      }//end finally try
   }//end try
   System.out.println("Goodbye!");
        return true;
    }   
        
        return false;
       
    }
}
