<!-- Modal delete-->
<div class="modal fade" id="mdldelete${j.id}" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Delete Mahasiswa</h4>
      </div>
      <div class="modal-body">
        <form action="<c:url value="jurusan/${j.id}/delete" /> " method="post">
		  
		 <input type="hidden" value="${j.id}" />
		  <div class="form-group">
		   	<p>apakah anda yakin akan menghapus data ${j.nama} ?</p> 
		   </div>
		  
        <button type="submit" class="btn btn-primary">Ya</button>
        <button type="button" class="btn btn-default" data-dismiss="modal">Tidak</button>
        
		</form>
      </div>
      <div class="modal-footer">

      </div>
    </div>
  </div>
</div>