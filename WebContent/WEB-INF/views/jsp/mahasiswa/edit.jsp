<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class=main-content>
		<div class="panel panel-default">
			<div class="panel-heading">
				<h3 class="panel-title">Data Jurusan</h3>
			</div>
			<div class="panel-body">
        		<form action="<c:url value="/mahasiswa/${mhs.id}" /> " method="post">
        			<input value="${mhs.id}" name="id" type="hidden"/>
        			<div class="form-group">
		    			<label for="Jurusan">NIM</label>
					    <input name="nim" class="form-control" value="${mhs.nim}"/>
					</div>
					  <div class="form-group">
					    <label for="Jurusan">Nama</label>
					    <input name="nama" class="form-control" value="${mhs.nama}"/>
					</div>
					<div class="form-group">
					    <label for="Jurusan">Jurusan</label>
					    <select name="jurusan.id" class="form-control">
					    	<option value="none" label="---- Select ----" />
					    	<c:forEach items="${jurusanList}" var="j">
					    		<!-- selected value in combobox -->
					    		<option value="${ j.id}" label="${j.nama }"
					    			<c:if test="${ j.id == mhs.jurusan.id}">
					    				selected
					    			</c:if>
					    		/>
					    	</c:forEach>
						</select>
					  </div>
			        <button type="submit" class="btn btn-primary">Update</button>
			        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
			        
				</form>
			</div>
		</div>
	</div>
</body>
</html>