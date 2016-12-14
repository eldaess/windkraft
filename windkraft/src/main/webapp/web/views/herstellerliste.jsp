<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.List"%>
<!DOCTYPE html PUBLIC "-//IETF//DTD HTML 2.0//EN">
<html lang="en"
      xmlns="http://www.w3.org/1999/xhtml"
      xmlns:th="http://www.thymeleaf.org">
      <head>
    <title>Herstellerliste</title>
</head>
<body>

	<div class="row">
			
			<h1>Herstellerliste</h1>

			<ul>
				<c:forEach items="${herstellerliste}" var="produzent">
					<li><a href="herstellerliste?hersteller_id=${hersteller.hersteller_id}">${hersteller.hersteller}</a></li>
				</c:forEach>
			</ul>
					
		</div>
		
	</div>
	
	</body>
	</html>