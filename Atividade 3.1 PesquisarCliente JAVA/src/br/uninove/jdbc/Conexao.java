package br.uninove.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection receberConexao(){
		
		Connection con = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro_cliente","root","");
			System.out.println("Banco de Dados Conectado com Sucesso!");
			
		} catch (SQLException | ClassNotFoundException e) {
			System.err.println("Erro ao Conectar ao Banco de Dados!");
			e.printStackTrace();
		}
		
		return con;
		
	}
}





