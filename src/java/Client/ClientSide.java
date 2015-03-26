/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Client;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
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
@WebService(serviceName = "ClientSide")
public class ClientSide {
 String host,url,password,port,username;
  Connection conn = null;
    
    boolean connect() {
        try {
          //host="127.0.0.1";
          // password="";
          // username="root";
          // url="jdbc:mysql://127.0.0.1/tab";
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
            Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        } catch (SQLException ex) {
         Logger.getLogger(ClientSide.class.getName()).log(Level.SEVERE, null, ex);
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
 
    @WebMethod(operationName = "count")
    public int count() {
         int id = -1;
       
   Statement stmt = null;
   int totalcount=0;
   if(connect()){
   try{
       
       String[] Tables=new String[4];
      Tables[0]="table0";
      Tables[1]="table1";Tables[2]="table2";
      Tables[3]="table3";
            //STEP 4: Execute a query
      System.out.println("Creating statement...");
      stmt = conn.createStatement();
      String sql;
      ResultSet rs = null;
      for(int i=0;i<4;i++){
      sql = "SELECT count(*) FROM "+Tables[i] ;
      System.out.println(sql);
        rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         id= rs.getInt(1);
        
      }
        
      totalcount+=id;
      System.out.println(totalcount);
      }
      //STEP 6: Clean-up environment
      rs.close();
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
        
        
       
   }
    return totalcount;
    }

    /**
     * Web service operation
     * @param name
     * @return 
     */
    @WebMethod(operationName = "NoOfPeople")
    public int NoOfPeople(@WebParam(name = "name") String name) {
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
      sql = "SELECT count(*) FROM tab."+Tables[tab]+" where Names='"+name+"'";
      System.out.println("Query is    " +sql);
      ResultSet rs = stmt.executeQuery(sql);

      //STEP 5: Extract data from result set
      while(rs.next()){
         //Retrieve by column name
         id  = rs.getInt(1);
        
      }
      //STEP 6: Clean-up environment
      rs.close();
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
        
    }   
        return id;
        
    }

    /**
     * This is a sample web service operation
     */
   
}
