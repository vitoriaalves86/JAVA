<%@page import="br.trabalho.model.Aluno"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
		<meta charset="UTF-8">
		<title>ALTERAR ALUNOS</title>
		
		</style>
	</head>
	<body>
<%Aluno aluno1= (Aluno)request.getAttribute("alunoRecebido"); %>
		<H1>ALTERAR ALUNOS</H1>
		<FORM method="post" >
			<table>
				<tr>
					<td>
						<label>RA: </label>
					</td> 
					<td>
						<input readonly="readonly" type = "text" name = "txtRa" value="<%=aluno1.getRa()%>"><br>
					</td>
				</tr>
				<tr>
					<td>
						<label>Nome: </label>
					</td>
					<td>
						<input type = "text" name = "txtNome" value="<%=aluno1.getNome()%>"><br>
					</td>
				</tr>
				<tr>
					<td>
						<label>Idade: </label>
					</td>
					<td>
						<input type = "text" name = "txtIdade" value="<%=aluno1.getIdade()%>"><br>
					</td>
				</tr>
				<tr>
					<td>
						<label>Sexo: </label>
					</td>
					<td>
						<input type = "text" name = "txtSexo" value="<%=aluno1.getSexo()%>"><br>
					</td>
				</tr>
				<tr>
					<td>
						<label>Curso: </label>
					</td>
					<td>
						<input type = "text" name = "txtCurso" value="<%=aluno1.getCurso()%>" ><br>
					</td>
				</tr>
				
				<tr>
					<td>
						<label>Rg: </label>
					</td>
					<td>
						<input type = "text" name = "txtRg" value="<%=aluno1.getRg()%>"><br>
					</td>
				</tr>
				<tr>
				<td></td>
				<td>
					<input type="submit" value = "Salvar">
				</td>
				</tr>
			</table>
		</FORM>
		</body>
</html>