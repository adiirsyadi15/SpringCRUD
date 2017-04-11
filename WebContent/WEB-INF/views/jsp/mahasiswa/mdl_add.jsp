<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!-- Modal -->
<div class="modal fade" id="mdladd" tabindex="-1" role="dialog" aria-labelledby="mdl_add">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="mdlmhs">Tambah Mahasiswa</h4>
      </div>
      <div class="modal-body">
        <form action="mahasiswa" method="post">
		  <div class="form-group">
		    <label for="Jurusan">NIM</label>
		    <input type="text" name="nim" class="form-control" id="nim" placeholder="Example: 13117348">
		  </div>
		  <div class="form-group">
		    <label for="Jurusan">Nama</label>
		    <input type="text" name="nama" class="form-control" id="nmmhs" placeholder="Example: Mukhlis Adi Irsyadi">
		  </div>
		  <div class="form-group">
		    <label for="Jurusan">Jurusan</label>
		   <!--  <input type="text" name="jurusanBean" class="form-control" id="nmjurusan" placeholder="Example: Teknik Informatika"> -->
		  	
		  	<select class="form-control">
			  	<c:forEach items="${ jurusan }" var="jrs">
				  	<option value="${ jrs.id }">${jrs.jurusan }</option>
			  	</c:forEach>
		  	</select>
		  </div>
		  
        <button type="submit" class="btn btn-primary">Save</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
        
		</form>
      </div>
      <div class="modal-footer">

      </div>
    </div>
  </div>
</div>