/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misadminclienturl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class MISADMINclienturl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       String name;
       int age;
       int ch=0;
        do{
           System.out.println("Enter choice\n \t1:Insert\n\t2:Delete\n\t0:EXIT");
           ch=Integer.parseInt(obj.readLine());
           switch (ch){
               case 1:{
                   name=obj.readLine();
                   age=Integer.parseInt(obj.readLine());
                   System.out.println(insertion(name,age));
                   break;
               }
               case 2:{
                   name=obj.readLine();
                   System.out.println(deletion(name));break;
               }
               
           }
       }while(ch!=0);
    }

    private static boolean deletion(java.lang.String name) {
        admin.AdminSide_Service service = new admin.AdminSide_Service();
        admin.AdminSide port = service.getAdminSidePort();
        return port.deletion(name);
    }

    private static boolean insertion(java.lang.String name, int age) {
        admin.AdminSide_Service service = new admin.AdminSide_Service();
        admin.AdminSide port = service.getAdminSidePort();
        return port.insertion(name, age);
    }
    
}
