<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Jurusan Detail</title>
</head>
<body>
<div class=main-content>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Data Jurusan
				</h3>
			</div>
			<div class="panel-body">
				<h3>Jurusan</h3>
				<form>
		        	<div class="form-group">
				    <label for="Jurusan">Kode</label>
				    <p>${ j.noJur }</p>
				  </div>
				  <div class="form-group">
				    <label for="Jurusan">Nama</label>
				    <p>${ j.nama }</p>
				  </div>
				</form>
				
				<hr>
				<h3>Mahasiswa</h3>
				<table class="table table-striped">
					<thead>
						<tr>
							<td>NIM</td>
							<td>Nama</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${j.mahasiswas}" var="m">
						<tr>
							<td>${m.nim}</td>
							<td>${m.nama}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
				
				<h3>Mahasiswa menggunakan implement</h3>
				<table class="table table-striped">
					<thead>
						<tr>
							<td>NIM</td>
							<td>Nama</td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${mhs}" var="m">
						<tr>
							<td>${m.nim}</td>
							<td>${m.nama}</td>
						</tr>
						</c:forEach>
					</tbody>
				</table>
			</div>
		</div>
	</div>
</body>
</html>