<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h2>Novo Cartorio</h2>
<form:form method="POST" action="cadastra" modelAttribute="cartorio">

	<table>
		<tr>
			<td>Nome:</td>
			<td><form:input path="name" /></td>
		</tr>
		<tr>
			<td></td>
			<td><input type="submit" value="Cadastrar" /></td>
		</tr>
	</table>
</form:form>
