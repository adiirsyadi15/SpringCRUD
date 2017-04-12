<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Mahasiswa</title>
</head>
<body>
	<div class=main-content>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Data Mahasiswa
				<!-- Button trigger modal -->
				<button type="button" class="btn btn-primary btn-sm" data-toggle="modal" data-target="#mdladd">
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
						<c:forEach items="${listmhs}" var="mhs" >
		                <tr>
		                	<td>${mhs.id}</td>
		                    <td>${mhs.nim}</td>
		                    <td><a href="mahasiswa/${mhs.id}/show"> ${mhs.nama}</a> </td>
		                    <td>${mhs.jurusan.nama}</td>
		                    <td>
		                    	<a>edit</a>
		                    	<button>delete</button>
		                    </td>
		                </tr>
		                </c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
	
	<%@include file="mdl_add.jsp" %>
</body>
</html>