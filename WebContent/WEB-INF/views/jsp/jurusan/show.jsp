<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				<h3 class="panel-title">Data Jurusan
				</h3>
			</div>
			<div class="panel-body">
				<form>
				  <div class="form-group">
				    <label for="Jurusan">ID</label>
				    <p>${ j.id }</p>
				  </div>
		        	<div class="form-group">
				    <label for="Jurusan">Kode</label>
				    <p>${ j.noJur }</p>
				  </div>
				  <div class="form-group">
				    <label for="Jurusan">Nama</label>
				    <p>${ j.nama }</p>
				  </div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>