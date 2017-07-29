<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib tagdir="/WEB-INF/tags" prefix="caelum" %>
<html>
<link href="css/jquery.css" rel="stylesheet">
<script src="js/jquery.js""></script>
<script src="js/jquery-ui.js"></script>
<body>
	<h1>Adiciona Contatos</h1>
	<hr />
	<form action="/fj21-agenda/adicionaContato">
		Nome:  <input type="text" name="nome" /> <br/>
		Email: <input type="text" name="email" /> <br/>
		Endereco: <input type="text" name="endereco" /> <br/>
		Data Nascimento: <caelum:campoData id="dataNascimento"/> <br/>
		
		<input type="submit" value="Gravar" /> <br/>
	</form>
<c:import url="rodape.jsp"></c:import>
</body>
</html>