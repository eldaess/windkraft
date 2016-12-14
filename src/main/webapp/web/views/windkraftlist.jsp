<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<?xml version="1.0" encoding="UTF-8" ?>
<!DOCTYPE html 
     PUBLIC "-//W3C//DTD XHTML 1.0 Strict//EN"
     "http://www.w3.org/TR/xhtml1/DTD/xhtml1-strict.dtd">

<html xmlns="http://www.w3.org/1999/xhtml" xml:lang="en" lang="en">

<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
	<link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/bootstrap/3.3.5/css/bootstrap-theme.min.css" />" />
    <link rel="stylesheet" href="<c:url value="resources/styles/pivotal.css" />" />
    	<title>Windkraftliste</title>
</head>
<body>
    	<c:forEach var="listitem" items="${herstellerliste}">
		 ${hersteller.hersteller_id} 
		${hersteller.hersteller} 
			
</c:forEach>

<ul>
				<c:forEach items="${herstellerliste}" var="hersteller">
					<li><a href="windkraftdetails?id=${hersteller.hersteller_id}">${hersteller.hersteller}</a></li>
				</c:forEach>
</ul>




</body>
</html>