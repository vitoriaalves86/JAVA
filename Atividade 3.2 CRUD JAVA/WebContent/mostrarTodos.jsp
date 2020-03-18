<%@page import="java.util.ArrayList"%>
<%@page import="br.trabalho.model.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%ArrayList<Aluno> alunos = (ArrayList)request.getAttribute("listaAlunosRecebidos");%>

	<h1 style="color:pink" >Mostrar Todos os Alunos</h1>
	
	<table width="80%" border="10" cellspacing="5">
	
		<thead>	
			<tr bgcolor="black" style="color:pink">
				<th>RA</th><th>Nome</th><th>Idade</th><th>Sexo</th><th>Curso</th><th>RG</th>
				<th colspan="2">Ações</th>
			</tr>
		</thead>
		
		<tbody>
			<%for(Aluno aluno:alunos){ %>
				<tr>
					<td><%=aluno.getRa() %></td>
					<td><%=aluno.getNome() %></td>
					<td><%=aluno.getIdade() %></td>
					<td><%=aluno.getSexo() %></td>
					<td><%=aluno.getCurso() %></td>
					<td><%=aluno.getRg() %></td>
					<td><a href = "servletexcluir?codigo=<%=aluno.getRa()%>">Excluir</a></td>
					<td><a href = "servletalterar?codigo=<%=aluno.getRa()%>">Alterar</a></td>
					
				</tr>
			<%} %>
		</tbody>
	</table>


</body>
</html>