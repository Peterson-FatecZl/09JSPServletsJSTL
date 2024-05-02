<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>C�lculo de Imposto S�o Paulo</title>
	</head>
	<body>
		<div align="center">
				<form action="calculoSaoPaulo" method="post">
					<div>
						<table >
							<thead >
								<tr >
									<th><h2>Insira as informa��es do Im�vel</h2></th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td> �rea Total: </td>
									<td><input id="areaTotal" name="areaTotal" type="number" min="1" step="0.1" required="required" placeholder="�rea total do Im�vel"></td>
								</tr>
								<tr >
									<td > N�mero de Comodos: </td>
									<td ><input id="numComodos" name="numComodos" type="number" min="1" required="required" placeholder="N�mero de C�modos"></td>
								</tr>
							</tbody>
						</table>
					</div>
					<br/>
					<div>
						<input id="calcular" name="calcular" type="submit" value="Calcular" />
					</div>
				</form>
		</div>
		
		<br/>
		<br/>
		
		<div align="center">
			<c:if test="${not empty imposto }">
				<c:out value="O Valor do Imposto a ser Pago � de: ${imposto }" />
			</c:if>
		</div>
		
	</body>
</html>