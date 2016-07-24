//for connections

import java.io.IOException;
import java.io.DataInputStream;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JDialog;
import java.io.*;
import java.util.*;
import java.net.*;


public class  MyConn
{
	
       public static void main(String args[] )
               {
                        Connection  conn;
                     try
                   {
                          Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");

                      conn = DriverManager.getConnection("jdbc:odbc:mdu");
                        System.out.println("obtained");
         
                  }catch(SQLException e)
		{
			System.err.println("SQl Exception");
			e.printStackTrace();
			
		}
                   catch( ClassNotFoundException e ) {  e.printStackTrace() ;  }
    
  
              }
    }

       
