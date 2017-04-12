<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Data Jurusan</title>
</head>
<body>
	<div class=main-content>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Data Jurusan</h3>
			</div>
			<div class="panel-body">
        		<form action="<c:url value="/jurusan/${j.id}" /> " method="post">
        			<input type="hidden" value="${j.id}"/>
					 <div class="form-group">
					    <label for="Jurusan">Kode</label>
					    <input type="text" name="noJur" class="form-control" id="kdjurusan" value="${j.noJur }">
					  </div>
					  <div class="form-group">
					    <label for="Jurusan">Nama</label>
					    <input type="text" name="nama" class="form-control" id="nmjurusan" value="${j.nama }">
					  </div>
					<button type="submit" class="btn btn-primary">Save</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
				</form>
			</div>
		</div>
	</div>
</body>
</html>