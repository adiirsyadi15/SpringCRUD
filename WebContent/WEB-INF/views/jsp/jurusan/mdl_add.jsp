<!-- Modal -->
<div class="modal fade" id="mdladd" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h4 class="modal-title" id="myModalLabel">Tambah Mahasiswa</h4>
      </div>
      <div class="modal-body">
        <form action="jurusan" method="post">
		  <div class="form-group">
		    <label for="Jurusan">Kode</label>
		    <input type="text" name="nomerjurusan" class="form-control" id="kdjurusan" placeholder="Example: J5555">
		  </div>
		  <div class="form-group">
		    <label for="Jurusan">Nama</label>
		    <input type="text" name="jurusan" class="form-control" id="nmjurusan" placeholder="Example: Teknik Informatika">
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