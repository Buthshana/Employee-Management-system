package HrSystem;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Operation {
    
    public static void main(String[] args){
     
        try{
            String url="jdbc:mysql://localhost:3306/hr management sis";
            String user="root";
            String pass="";
            
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("Connected");
        }catch(Exception ex){
           System.out.println("Error : " + ex.getMessage());  
        }
        
    }
    
}
