package br.com.meuprojeto;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class produto {
	
	
	PreparedStatement instrucao = null;
    ResultSet rs = null;

    
    
    
	public void cadastrar(String nome, String desc, String marca) {
	        try {

	            instrucao = Conexao.getConexao().prepareStatement("INSERT INTO produto (nome, descricao, marca) values (?,?,?)");

	            instrucao.setString(1, nome);
	            instrucao.setString(2, desc);
	            instrucao.setString(3, marca);
	            instrucao.executeUpdate();
	            instrucao.close();
	            
	        } catch (SQLException e) {
	           e.printStackTrace();
	        }
	}
	
	
	
	public void buscar() {
		try {

		PreparedStatement resultado = Conexao.getConexao().prepareStatement("SELECT * FROM produto");
		rs = resultado.executeQuery();
		
		while(rs.next()){

		    String nome = rs.getString("nome");
		    String descricao = rs.getString("descricao");
		    String marca = rs.getString("marca");

		    System.out.print(" |" + nome + marca + descricao);
		}
		
		} catch (SQLException e) {
	           e.printStackTrace();
	        }
	}
}
