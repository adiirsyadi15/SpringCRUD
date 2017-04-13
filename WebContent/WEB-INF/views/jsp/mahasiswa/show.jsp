<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				</h3>
			</div>
			<div class="panel-body">
				<form>
				  <div class="form-group">
				    <label for="Jurusan">NIM</label>
				    <p>${ mhs.nim }</p>
				  </div>
		        	<div class="form-group">
				    <label for="Jurusan">Jurusan</label>
				    <p>${ mhs.jurusan.nama }</p>
				  </div>
				  <div class="form-group">
				    <label for="Jurusan">Nama</label>
				    <p>${ mhs.nama }</p>
				  </div>
				</form>
			</div>
		</div>
	</div>
</body>
</html>