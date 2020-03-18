package br.trabalho.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.trabalho.model.Aluno;
import br.trabalho.model.AlunoDao;


@WebServlet("/servletCadastro")
public class ServletCadastro extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String nome = request.getParameter("txtNome");
		int idade = Integer.parseInt(request.getParameter("txtIdade"));
		char sexo = request.getParameter("txtSexo").charAt(0);
		String curso = request.getParameter("txtCurso");
		String rg = request.getParameter("txtRg");
	
		Aluno aluno = new Aluno ();
		aluno.setNome(nome);
		aluno.setCurso(curso);
		aluno.setIdade(idade);
		aluno.setRg(rg);
		aluno.setSexo(sexo);
		
		AlunoDao.cadastrarAluno(aluno);
		
		response.sendRedirect("http://localhost:8080/Universidade3/servletmostrartodos");
	
	}

}
