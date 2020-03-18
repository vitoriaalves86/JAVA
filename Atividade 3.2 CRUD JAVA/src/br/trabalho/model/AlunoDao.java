package br.trabalho.model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.trabalho.jdbc.Conexao;

public class AlunoDao {
	
	
	public static void cadastrarAluno(Aluno aluno) {
		//abri a conexao e definri o comando sql
		Connection conexao = Conexao.receberConexao();
		//comando sql para inserir
		String sql = "Insert into alunos ( nome, idade, sexo, rg, curso) values (?,?,?,?,?)";
		//excessão
		try {
			//para preparar as linhas de comando do sql
		PreparedStatement preparadorPreparado = conexao.prepareStatement(sql);
		//chamando o preparado para preparar as linhas sql
		// 1 é a posição do atributo
		//o x é o valor que sera colocado na interrogação
		//o get precisa de um obj
		preparadorPreparado.setString(1, aluno.getNome());
		preparadorPreparado.setInt(2, aluno.getIdade());
		preparadorPreparado.setString(3, ""+aluno.getSexo());
		preparadorPreparado.setString(4, aluno.getRg());
		preparadorPreparado.setString(5, aluno.getCurso());
		preparadorPreparado.execute();
		preparadorPreparado.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		
	}
		
	public static  void deletarAluno (int ra) {
		//comeca sempre com a conexao
		//dps string sql
		//preparetd statment
		Connection conexao = Conexao.receberConexao();
		String sql = "Delete from alunos where ra = ?";
		try {
			PreparedStatement preparadorPreparado = conexao.prepareStatement(sql);
			preparadorPreparado.setInt(1, ra);
			preparadorPreparado.execute();
			preparadorPreparado.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	
	}

	public static Aluno mostrarPorCodigo (int ra) {
		Connection conexao = Conexao.receberConexao();
		Aluno aluno = null;
		String sql = "Select * from alunos where ra = ?";
		try {
			PreparedStatement preparadorPreparado = conexao.prepareStatement(sql);
			preparadorPreparado.setInt(1, ra);
			//para receber resultado do banco
			ResultSet result = preparadorPreparado.executeQuery();
			if(result.next()) {
				aluno= new Aluno();
				aluno.setRa(result.getInt("ra"));
				aluno.setSexo(result.getString("sexo").charAt(0));
				aluno.setCurso(result.getString("curso"));
				aluno.setIdade(result.getInt("idade"));
				aluno.setNome(result.getString("nome"));
				aluno.setRg(result.getString("rg"));	
			}
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		return aluno;
		
		
		
	}
	
	public static ArrayList<Aluno> mostrarTodos (){
		Connection conexao = Conexao.receberConexao();
		ArrayList<Aluno> mostrar = new ArrayList<Aluno>();
		String sql = "Select * from alunos ";
		try {
			PreparedStatement preparadorPreparado = conexao.prepareStatement(sql);
			ResultSet result = preparadorPreparado.executeQuery();
			while(result.next()) {
				Aluno aluno = new Aluno();
				aluno.setRa(result.getInt("ra"));
				aluno.setSexo(result.getString("sexo").charAt(0));
				aluno.setCurso(result.getString("curso"));
				aluno.setIdade(result.getInt("idade"));
				aluno.setNome(result.getString("nome"));
				aluno.setRg(result.getString("rg"));
				
				mostrar.add(aluno);
				
			}
			
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return mostrar;

	}
	
	public static void atualizarAluno (Aluno aluno){
		Connection conexao = Conexao.receberConexao();
		String sql = "Update alunos set nome=?, idade=?, sexo=?, curso=?, rg=? where ra=?";
		try {
			PreparedStatement preparadorPreparado = conexao.prepareStatement(sql);
			
			preparadorPreparado.setInt(6, aluno.getRa());
			preparadorPreparado.setString(1, aluno.getNome());
			preparadorPreparado.setInt(2, aluno.getIdade());
			preparadorPreparado.setString(3, ""+aluno.getSexo());
			preparadorPreparado.setString(4, aluno.getCurso());
			preparadorPreparado.setString(5, aluno.getRg());
			preparadorPreparado.execute();
			preparadorPreparado.close();
		}catch(SQLException e) {
			e.printStackTrace();
			
		}
		
	}
}
