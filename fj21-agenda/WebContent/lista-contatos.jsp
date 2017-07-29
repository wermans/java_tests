<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<html>
<body>
<c:import url="cabecalho.jsp"></c:import>
	
	<table>
			<c:forEach var="contato" items="${contatos}">
				<tr>
					<td>${contato.nome}</td>
					<td>
						<c:if test="${not empty contato.email}">
							<a href="mailto:${contato.email}">${contato.email}</a>
						</c:if>
						<c:if test="${empty contato.email}">
							E-mail nao informado
						</c:if>
					</td>
					<td>${contato.endereco}</td>
					<td><fmt:formatDate value="${contato.dataNascimento.time}" pattern="dd/MM/yyyy"/></td>
					
					<td>
						<a href="mvc?logica=RemoveContatoLogic&id=${contato.id}">Remover</a>
					</td>
					</tr>
			</c:forEach>
	</table>
	<c:import url="rodape.jsp"></c:import>
</body>
</html>