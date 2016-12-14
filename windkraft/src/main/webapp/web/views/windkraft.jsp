<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html lang="en"
      xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">

<head>
    <title>Hersteller</title>
</head>
<body>

<c:if test="${not empty lists}">

		<ul>
			<c:forEach var="listValue" items="${lists}">
				<li>${listValue}</li>
			</c:forEach>
			<c:forEach items="${herstellerliste}" var="produzent">
					<li><a href="windkraft?id=${hersteller.hersteller_id}">${hersteller.hersteller}</a></li>
				</c:forEach>
			
			
		</ul>

	</c:if>

<!--  --><table style="width: 39%;" border="5">
<caption>Herstellerliste</caption>
                <thead>
                <tr>	
                    <th>ID</th>
                    <th>Hersteller</th>
                </tr>
                </thead>
                <tbody>
		<c:forEach var="listValue" items="${hersteller_id}">
		<tr>
<td><li>${hersteller_id}</li></td>
<td>&nbsp;</td>
</tr>
</c:forEach>
<tr>

<td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
<tr>
<td>&nbsp;</td>
<td>&nbsp;</td>
</tr>
                </tbody>
</table> -->

Hersteller-Id: ${hersteller.hersteller_id}

</body>
</html>