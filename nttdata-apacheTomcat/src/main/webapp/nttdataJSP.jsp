<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"    
    %>
   
<%@ page import="com.nttdata.tomcat.*" %> 

<!DOCTYPE html>

<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>NTTDATA primer JSP</title>
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
	 	
	 	<p>
	 		<%=NTTDataJSP.helloNTTData("Santiago")%>
	 	</p>
	 
	</body>
</html>