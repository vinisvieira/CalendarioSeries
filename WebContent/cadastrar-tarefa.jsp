<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/css/font-awesome.min.css">
<link rel="stylesheet" href="css/estilo.css" type="text/css">
<title>Nova Serie</title>
</head>
<body>

<nav>
	<ul>
		<li><a href="index.jsp"><i class="fa fa-home" aria-hidden="true"></i> Home</a></li>
		<li><a href="cadastrar-tarefa.jsp"><i class="fa fa-film" aria-hidden="true"></i> Nova Serie</a></li><br>
		<li><a href="listar-tarefa.jsp"><i class="fa fa-list-alt" aria-hidden="true"></i> Minhas Series</a></li>
	</ul>
	</nav>

	<h3>Cadastre uma nova Serie no seu calendário</h3>

	<div>
		<form action ="series-servlet" method = 'post'>
		
			<label for="lname">Tritulo da Tarefa</label> 
			<input type="text" required="required" id="lname" name="tituloTarefa">
			
			<label for="lname">Descrição Tarefa</label> 
			<input type="text" required="required" id="lname" name="descricaoTarefa">
			
		 	<input type="submit" value="Cadastrar">
		</form>
	</div>
</body>
</html>