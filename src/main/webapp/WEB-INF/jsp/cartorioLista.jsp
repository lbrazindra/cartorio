<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html lang="en">
<head>

<link rel="stylesheet" type="text/css"
	href="webjars/bootstrap/3.3.7/css/bootstrap.min.css" />
<link href="${jstlCss}" rel="stylesheet" />

</head>
<body>
	<div class="container">
		<header>
			<h2>Cartorios</h2>
		</header>

		<p> <input type="submit" value="Home"
			onclick="window.location='home';" /> 
		<p>
		<p>
		
		<div class="starter-template">
			<h2>Listagem de cartórios</h2>
			<table
				class="table table-striped table-hover table-condensed table-bordered">
				<tr>
					<th></th>	
					<th>Nome do cartório</th>
				</tr>
				<form:form method="DELETE" action="deletar">
					<c:forEach var="cartorio" items="${cartorios}">
						<tr>
							<td><a href="visualizarCartorio/${cartorio.id}">[Visualizar]</td>
							<td>${cartorio.name}</td>
							<td><a href="editarCartorio/${cartorio.id}">[Editar]</a></td>
							<td><a href="deletarCartorio/${cartorio.id}">[Excluir]</a></td>
						</tr>
					</c:forEach>
				</form:form>
			</table>
		</div>
		
		<c:out value="${message}"></c:out>

	</div>

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>