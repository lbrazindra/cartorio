<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Editar Cartorio</h2>
<form:form method="POST" action="/cartorioEditado"
	modelAttribute="cartorio">

	<table>
		<tr>
			<td></td>
			<td><form:hidden path="id" /></td>
		</tr>
		<tr>
			<td>Nome:</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Salvar edição" /></td>
		</tr>
	</table>
</form:form>
