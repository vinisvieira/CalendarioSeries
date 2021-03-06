<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="postIt.entity.Tarefa"%>
<%@ page import="postIt.repository.impl.TarefaRepositorio"%>
<%@ page import="java.util.ArrayList"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/css/font-awesome.min.css">
<link rel="stylesheet" href="css/estilo.css" type="text/css">
<title>Minhas Series</title>
</head>
<body>
	<nav>
	<ul>
		<li><a href="index.jsp"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
		<li><a href="cadastrar-tarefa.jsp"><i class="fa fa-film" aria-hidden="true"></i> Nova Serie</a></li><br>
		<li><a href="listar-tarefa.jsp"><i class="fa fa-list-alt" aria-hidden="true"></i> Minhas Series</a></li>
	</ul>
	</nav>

	<h2>Minhas Series</h2>


	<div>
		<table>
			<tr>
				<th>Nome</th>
				<th>Temporada</th>
				<th>Episodio</th>
				<th>Dia</th>
				<th>Complemento</th>
				<th>#</th>
				<th>#</th>
			</tr>
			<tr>
				<%
					ArrayList<Tarefa> tarefas = (ArrayList<Tarefa>) TarefaRepositorio.getInstance()
												.listar();
										int i = 1;

										for (Tarefa tarefa : tarefas) {
				%>
				<td><%=tarefa.getTituloTarefa()%></td>
				<td><%=tarefa.getDescricaoTarefa()%></td>
				
				<td><a href="tarefa-servler-edit?i=<%=tarefa.getId()%>" >Editar</a></td>
				<td><a href="tarefa-servlet-delete?id=<%=tarefa.getId()%>" >Excluir</a></td>
			</tr>
			<%
			i++;
				}
				
			%>
		</table>
	</div>
</body>
</html>