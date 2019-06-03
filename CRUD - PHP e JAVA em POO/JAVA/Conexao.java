package br.com.meuprojeto;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class Conexao {
	
	static String host = "localhost";  
    static String username = "root";        
    static String password = "";  
    static String database ="sistema"; 
    
    static String url = "jdbc:mysql://" + host + "/" + database;

    //static String url = "jdbc:mysql://localhost/sistema;
	
    
    //String url = "jdbc:firebirdsql:localhost/3050:C:/SMALL.FDB";

   public static Connection getConexao(){
		
	   	try {
			return DriverManager.getConnection(url, username, password);
			
		 }         
		 catch(SQLException excecao) {
		
			 throw new RuntimeException(excecao);
		
		 }
	   
    }
}
