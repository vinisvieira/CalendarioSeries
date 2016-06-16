<%@page import="postIt.entity.Tarefa"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/css/font-awesome.min.css">
<link rel="stylesheet" href="css/estilo.css" type="text/css">
<title>Insert title here</title>
</head>
<body>

<nav>
	<ul>
		<li><a href="index.jsp"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
		<li><a href="cadastrar-tarefa.jsp"><i class="fa fa-film" aria-hidden="true"></i> Nova Serie</a></li><br>
		<li><a href="listar-tarefa.jsp"><i class="fa fa-list-alt" aria-hidden="true"></i> Minhas Series</a></li>
	</ul>
	</nav>

	<h3>Atualize os Dados da Serie</h3>

	<%
		Tarefa tarefa = (Tarefa)request.getAttribute("tarefa");
		Integer i = (Integer)request.getAttribute("i");
	%>

	<div>
		<form action ="tarefa-servler-edit" method = 'post'>
		
			<input type= hidden name="i" value=<%=i%>>
						
			<label for="lname">Nome da Tarefa</label> 
			<input type="text" value="<%=tarefa.getTituloTarefa()%>" required="required" id="lname" name="tituloTarefa">
			
			<label for="lname">Descrição da Tarefa</label> 
			<input type="text" value="<%=tarefa.getDescricaoTarefa()%>" required="required" id="lname" name="descricaoTarefa">
			
			
		 	<input type="submit" value="Editar">
		</form>
	</div>
</body>
</html>