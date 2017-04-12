<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>

<!-- Modal -->
<div class="modal fade" id="mdladd" tabindex="-1" role="dialog" aria-labelledby="mdl_add">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="mdlmhs">Tambah Mahasiswa</h4>
      </div>
      <div class="modal-body">
        <form:form method="POST" action="mahasiswa" modelAttribute="Mahasiswa">
		  <div class="form-group">
		    <label for="Jurusan">NIM</label>
		    <form:input path="nim" class="form-control"/>
		  </div>
		  <div class="form-group">
		    <label for="Jurusan">Nama</label>
		    <form:input path="nama" class="form-control"/>
		  </div>
		  <div class="form-group">
		    <label for="Jurusan">Jurusan</label>
		    <form:select path="jurusan" class="form-control">
		    	<form:option value="none" label="---- Select ----"></form:option>
		    		<form:options items="${jurusanList}" itemValue="id" itemLabel="nama"/>
		    </form:select>
		  	
		  </div>
		  
        <button type="submit" class="btn btn-primary">Save</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        
		</form:form>
      </div>
      <div class="modal-footer">

      </div>
    </div>
  </div>
</div>