<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Bem vindo ao site de Cartorios.</h1>
	<input type="submit" value="Novo Cartorio"
    onclick="window.location='cadastra';" />
    <p>
    <input type="submit" value="Listar todos os cartorios"
    onclick="window.location='lista';" />
    
    <div id="teste"><c:out value="${falha}"></c:out></div>
</body>
</html>