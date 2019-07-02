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
			<h1>Cartorio</h1>
		</header>
		<div class="starter-template">
			<h1>Listagem de cartórios</h1>
			<table
				class="table table-striped table-hover table-condensed table-bordered">
				<tr>
					<th>Id</th>
					<th>Name</th>
				</tr>
				<form:form method="DELETE" action="deletar">
					<c:forEach var="cartorio" items="${cartorios}">
						<tr>
							<td>${cartorio.id}</td>
							<td>${cartorio.name}</td>
							<td><a href="editarCartorio/${cartorio.id}">Edit</a></td>
							<td><a href="deletarCartorio/${cartorio.id}">Delete</a></td>
						</tr>
					</c:forEach>
				</form:form>
			</table>
		</div>

	</div>

	<script type="text/javascript"
		src="webjars/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</body>

</html>