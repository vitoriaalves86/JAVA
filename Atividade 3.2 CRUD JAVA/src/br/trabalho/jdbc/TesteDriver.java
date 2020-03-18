package br.trabalho.jdbc;

import java.util.ArrayList;

import com.mysql.fabric.xmlrpc.base.Array;

import br.trabalho.model.Aluno;
import br.trabalho.model.AlunoDao;

public class TesteDriver {

	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Joao");
		aluno.setIdade(20);
		aluno.setSexo('M');
		aluno.setCurso("ES");
		aluno.setRg("2296222");
		aluno.setRa(3);
		
		AlunoDao.atualizarAluno(aluno);
		//AlunoDao.cadastrarAluno(aluno);
		


		//AlunoDao.deletarAluno(1);
		
		//Aluno aluno2 = AlunoDao.mostrarPorCodigo(2);
		
		/*System.out.println("RA: "+ aluno2.getRa());
		System.out.println("Nome: "+ aluno2.getNome());
		System.out.println("Idade: "+aluno2.getIdade());
		System.out.println("Sexo: "+aluno2.getSexo());
		System.out.println("Curso: "+aluno2.getCurso());
		System.out.println("RG: "+aluno2.getRg());*/
		
	/*	ArrayList<Aluno> aluno2 = AlunoDao.mostrarTodos();
		for(int i=0; i<aluno2.size();i++) {		
			System.out.println("========================================");
			System.out.println("RA: "+ aluno2.get(i).getRa());
			System.out.println("Nome: "+ aluno2.get(i).getNome());
			System.out.println("Idade: "+aluno2.get(i).getIdade());
			System.out.println("Sexo: "+aluno2.get(i).getSexo());
			System.out.println("Curso: "+aluno2.get(i).getCurso());
			System.out.println("RG: "+aluno2.get(i).getRg());
		}
		*/
		
		
	}

}
