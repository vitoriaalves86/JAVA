package br.uninove.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.uninove.modelo.ClienteContaDao;
import br.uninove.modelo.Cliente;

/**
 * Servlet implementation class PesquisarClienteServlet
 */
@WebServlet("/pesquisarclienteservlet.do")
public class PesquisarClienteServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nome = request.getParameter("txtpesquisar");
		ClienteContaDao clienteDao = new ClienteContaDao();
		ArrayList<Cliente> clientesRecebidos = clienteDao.buscarPorNome(nome);
		
		request.setAttribute("listaClientesRecebidos", clientesRecebidos);
		request.getRequestDispatcher("pesquisar.jsp").forward(request, response);// TODO Auto-generated method stub
		
	}

}
