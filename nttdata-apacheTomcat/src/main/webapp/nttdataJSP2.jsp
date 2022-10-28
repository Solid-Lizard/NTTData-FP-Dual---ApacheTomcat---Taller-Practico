<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Mi segundo JSP</title>
	</head>
	
	<body>
		<h1 align = "center">Bienvenidos a NTTData</h1>
		
		<p>
		 	<%
			 	for (int i = 10; i>=1; i--) {
			 		out.println("EMPEZAMOS EN: " + i);
			 		
			 	}
		 	%>
	 	</p>
	
		<form method="post" action="NTTDataServlet2">						
			<a>Introduce tu nombre:</a>
			
			<input type = "text" name="nombreUsuario">
			
			<br>
			
			<input type = "submit" value="enviar peticion">
		</form>
		
	</body>

</html>