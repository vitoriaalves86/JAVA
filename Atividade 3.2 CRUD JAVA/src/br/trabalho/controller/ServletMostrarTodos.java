package br.trabalho.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.trabalho.model.Aluno;
import br.trabalho.model.AlunoDao;


@WebServlet("/servletmostrartodos")
public class ServletMostrarTodos extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		ArrayList <Aluno> aluno = AlunoDao.mostrarTodos();
		request.setAttribute("listaAlunosRecebidos", aluno);
		request.getRequestDispatcher("mostrarTodos.jsp").forward(request, response);

	}

}
