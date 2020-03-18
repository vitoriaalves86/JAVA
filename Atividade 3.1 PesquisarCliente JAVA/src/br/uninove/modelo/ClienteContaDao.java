package br.uninove.modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import br.uninove.jdbc.Conexao;
import br.uninove.modelo.Cliente;

public class ClienteContaDao {
	
	public ArrayList<Cliente> buscarPorNome(String nome){
			
			Connection con = Conexao.receberConexao();
			ArrayList<Cliente> clientes = new ArrayList<Cliente>();

			
			String sql = "SELECT cli.nome, cc.numero, cc.saldo from cliente cli, conta_corrente where cli.codigo = cc.codigo_cliente && cli.nome = ?";
			
			try {
				PreparedStatement preparador = con.prepareStatement(sql);
				preparador.setString(1, nome);
				
				ResultSet resultado = preparador.executeQuery();
				
				if(resultado.next()){
					Cliente cliente = new Cliente ();
					cliente.setCodigo(resultado.getInt("codigo"));
					cliente.setNome(resultado.getString("nome"));
					cliente.setIdade(resultado.getInt("idade"));
					cliente.setSexo(resultado.getString("sexo").charAt(0));
					cliente.setProfissao(resultado.getString("profissao"));
					clientes.add(cliente);
				}
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
			
			return clientes;
		}

}
