<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Cálculo de Imposto Curitiba</title>
	</head>
	<body>
		<div align="center">
				<form action="calculoCuritiba" method="post">
					<div>
						<table >
							<thead >
								<tr >
									<th><h2>Insira as informações do Imóvel</h2></th>
								</tr>
							</thead>
							<tbody>
								<tr>
									<td> Área Total: </td>
									<td><input id="areaTotal" name="areaTotal" type="number" min="1" step="0.1" required="required" placeholder="Área total do Imóvel"></td>
								</tr>
								<tr >
									<td > Idade do Imóvel em Anos: </td>
									<td ><input id="idadeImovel" name="idadeImovel" type="number" min="1" required="required" placeholder="Idade do Imóvel"></td>
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
				<c:out value="O Valor do Imposto a ser Pago é de: ${imposto}"/>
			</c:if>
		</div>
		
	</body>
</html>