<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>
<html>
<head>
	<title>Data Mahasiswa</title>

	<meta name="basic-theme" content="sitemesh" /></head>
<body>
<div class=main-content>
	<div class="col-sm-6 col-md-4">
    <div class="thumbnail">
  
	<img alt="jurusan" src="<c:url value='/resources/images/jurusan.jpg'/>" />
      <div class="caption">
      	<a href="jurusan">
        	<h3 class="btn btn-info">Jurusan</h3>
        </a>
      </div>
    </div>
  </div>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
	<img alt="mahasiswa" src="<c:url value='/resources/images/mahasiswa.jpg'/>" />
      <div class="caption">
        <a href="mahasiswa">
      	  <h3 class="btn btn-info">Mahasiswa</h3>  
        </a>
      </div>
    </div>
  </div>
  <div class="col-sm-6 col-md-4">
    <div class="thumbnail">
	<img alt="mahasiswa" src="<c:url value='/resources/images/skil.jpg'/>" />
      <div class="caption">
      	<a href="keahlian">
        	<h3 class="btn btn-info">Keahlian</h3>
        </a>
      </div>
    </div>
  </div>
</div>
</body>
</html>