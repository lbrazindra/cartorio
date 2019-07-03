<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Cartorio selecionado</h2>
<form:form method="GET" action="/lista"
	modelAttribute="cartorio">

	<p>
		<input type="submit" value="Voltar para listagem de cartórios" onclick="window.location='lista';" />
	<p>
	
	<table>
		<tr>
			<td>Id: </td>
			<td><form:input path="id" disabled="true"/></td>
		</tr>
		<tr>
			<td>Nome: </td>
			<td><form:input path="name" disabled="true"/></td>
		</tr>
	</table>
</form:form>
