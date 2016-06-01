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
		<li><a href="cadastrar-series.jsp"><i class="fa fa-film" aria-hidden="true"></i> Nova Serie</a></li><br>
		<li><a href="listar-series.jsp"><i class="fa fa-list-alt" aria-hidden="true"></i> Minhas Series</a></li>
	</ul>
	</nav>

	<h3>Cadastre uma nova Serie no seu calend�rio</h3>

	<div>
		<form action ="series-servlet" method = 'post'>
		
			<label for="lname">Nome Da Serie</label> 
			<input type="text" required="required" id="lname" name="name">
			
			<label for="lname">Temporada</label> 
			<input type="number" required="required" id="lname" name="temporada">
			
			<label for="lname">Episodio</label>
			 <input type="number" required="required" id="lname" name="episodio">
			 
			<label for="lname">Dia Para Assistir</label>
			 <input type="text" required="required" id="lname" name="dia">
			 
			<label for="lname">Complemento</label> 
			<input type="text" required="required" id="lname" name="complemento">
			
		 	<input type="submit" value="Cadastrar">
		</form>
	</div>
</body>
</html>