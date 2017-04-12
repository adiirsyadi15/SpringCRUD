<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
<title>Data Jurusan</title>
<meta name="basic-theme" content="sitemesh" />
</head>
<body>
	<div class=main-content>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Data Jurusan
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary btn-sm " data-toggle="modal" data-target="#mdladd">
				  add
				</button>
				</h3>
			</div>
			<div class="panel-body">
				<table class="table table-striped">
					<thead>
						<tr>
							<td>No</td>
							<td>ID</td>
							<td>Nama</td>
							<td>action</td>
						</tr>
					</thead>
					<tbody class="link">
						<c:forEach items="${listJur}" var="j" >
		                <tr>
		                    <td>${j.id}</td>
		                    <td><a href="jurusan/${j.id}/show"> ${j.noJur}</a> </td>
		                    <td>${j.nama}</td>
		                    <td>
		                    	<a href="jurusan/${j.id}">edit</a>
		                    	<button type="button" class="btn btn-primary btn-sm " data-toggle="modal" data-target="#mdldelete${j.id}">delete</button>
		                    </td>
		                </tr>
		                <%@include file="mdl_delete.jsp" %>

		                
		                
		                </c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
	<%@include file="mdl_add.jsp" %>
</body>
</html>