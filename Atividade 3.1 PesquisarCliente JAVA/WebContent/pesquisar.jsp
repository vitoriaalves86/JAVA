<%@page import="br.uninove.modelo.Cliente"%>
<%@page import="java.util.ArrayList"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title>Cadastro de Clientes</title>
	<link rel="stylesheet" href="css/estilo.css">
</head>
<body>

<%
	ArrayList<Cliente> clientes = (ArrayList)request.getAttribute("listaClientesRecebidos");
%>

	<header class = "cabecalho">
		<div class = "container">
			<div class="titulo titulo-cabecalho">Sistema de Gerenciamento de Clientes</div>
		</div>
	</header>


	<table class='tabela'>
		<form method="get" action='/pesquisarclienteservlet.do'>
			<tr class='titulo-tabela'>
				<td width='18%'>Digite o Nome do Cliente:</td>
				<td><input type='text' name='txtpesquisar' placeholder='Digite aqui o cliente...' class='campo'></td>
				<td><input type='submit' value='Pesquisar' class='botao'></td>
			</tr>		 
		</form>
	</table>




	<footer class="rodape">
		<div class="container">
			<div class="titulo titulo-rodape">UNINOVE JAVA - &copy Todos os direitos reservados</div>
		</div>
	</footer>

</body>
</html>