/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package misclientclienturl;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author user
 */
public class MISCLIENTclienturl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
         BufferedReader obj=new BufferedReader(new InputStreamReader(System.in));
       String name; 
       int ch=0;
        do{
           System.out.println("Enter choice\n \t1:NoOfPeople\n\t2:Count\n\t0:EXIT");
           ch=Integer.parseInt(obj.readLine());
           switch (ch){
               case 1:{
                   name=obj.readLine();
                   System.out.println(noOfPeople(name));
                   break;
               }
               case 2:{
                   System.out.println(count());break;
               }
               
           }
       }while(ch!=0);
    }

    private static int noOfPeople(java.lang.String name) {
        client.ClientSide_Service service = new client.ClientSide_Service();
        client.ClientSide port = service.getClientSidePort();
        return port.noOfPeople(name);
    }

    private static int count() {
        client.ClientSide_Service service = new client.ClientSide_Service();
        client.ClientSide port = service.getClientSidePort();
        return port.count();
    }
    
}
