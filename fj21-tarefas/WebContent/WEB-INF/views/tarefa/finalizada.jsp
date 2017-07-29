<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

	<td>$</td>
	<td>$</td>
	<td>Finalizada</td>
	<td><fmt:formatDate value="${tarefa.dataFinalizacao.time}" 
			pattern= "dd/MM/yyyy" /></td>
	<td><a href="removeTarefa?id=${tarefa.id}">Remove</a></td>
	<td><a href="mostraTarefa?id=${tarefa.id}">Alterar</a></td>