<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<!-- tag for spring -->
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<html>
<head>
	<title>
		<decorator:title default = "Spring MVC" />
	</title>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/bootstrap.css"/>"/>
	<link rel="stylesheet" type="text/css" href="<c:url value="/resources/css/style.css"/>"/>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	
</head>
<body>
	<header>
		<div class="row">
			<%@include file="header.jsp" %>
		</div>
		
	</header>
	<div class="content">
		<div class="container">
			<div class="row">
				<decorator:body />
			</div>
		</div>
	</div>
	<div>
	
		<script src="<c:url value="/resources/js/jquery.js" />" ></script>
		<script src="<c:url value="/resources/js/bootstrap.js" />" ></script>
	</div>	
</body>
</html>
