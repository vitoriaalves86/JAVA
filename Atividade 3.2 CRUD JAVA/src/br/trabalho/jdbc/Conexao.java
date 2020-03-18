package br.trabalho.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
	
	public static Connection receberConexao(){
		Connection conexao = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conexao = DriverManager.getConnection("jdbc:mysql://localhost:3306/cadastro_aluno", "root", "");
			System.out.println("Conectado com sucesso");
		}catch(SQLException | ClassNotFoundException e) {
			e.printStackTrace();
			System.err.println("Não conectado");
		}
		return conexao;
	}

}
