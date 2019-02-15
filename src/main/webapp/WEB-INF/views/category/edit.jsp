<!-- form mulai -->
<form id="form-edit" class="form-horizontal">
	<!-- id -->
	<input type="hidden" name="id" id="id" />
	<!-- code -->
	<div class="form-group">
		<label class="control-label col-md-2">CODE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="code" id="code" />
		</div>
	</div>
	<!-- name -->
	<div class="form-group">
		<label class="control-label col-md-2">NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="name" id="name"/>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" onClick="editData($('#form-edit'))"><i class="fa fa-save"></i></button>
		<button type="button" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></button>
	</div>
</form>
<!-- Form Selesai -->