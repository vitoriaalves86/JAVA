package br.trabalho.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.trabalho.model.Aluno;
import br.trabalho.model.AlunoDao;


@WebServlet("/servletalterar")
public class ServletAlterar extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int codigoRa = Integer.parseInt(request.getParameter("codigo"));
		Aluno aluno1 = AlunoDao.mostrarPorCodigo(codigoRa);
		
		request.setAttribute("alunoRecebido", aluno1);
		request.getRequestDispatcher("Alterar.jsp").forward(request, response);
		
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("txtNome");
		int idade = Integer.parseInt(request.getParameter("txtIdade"));
		char sexo = request.getParameter("txtSexo").charAt(0);
		String curso = request.getParameter("txtCurso");
		String rg = request.getParameter("txtRg");
		int ra = Integer.parseInt( request.getParameter("txtRa"));
		
		Aluno aluno = new Aluno ();
		aluno.setNome(nome);
		aluno.setCurso(curso);
		aluno.setIdade(idade);
		aluno.setRg(rg);
		aluno.setSexo(sexo);
		aluno.setRa(ra);
		
		AlunoDao.atualizarAluno(aluno);
		response.sendRedirect("http://localhost:8080/Universidade3/servletmostrartodos");
		
	}

}
