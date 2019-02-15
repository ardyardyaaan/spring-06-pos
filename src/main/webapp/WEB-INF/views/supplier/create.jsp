<!-- form mulai -->
<form id="form-create" class="form-horizontal">
	<div class="form-group">
		<label class="control-label col-md-2">NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="name" />
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-md-2">ADDRESS</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="address" />
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-md-2">CONTACT NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="cname" />
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-md-2">PHONE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="phone" />
		</div>
	</div>
	<div class="form-group">
		<label class="control-label col-md-2">EMAIL</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="email" />
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" onClick="addData($('#form-create'))" class="btn btn-primary"><i class="fa fa-save"></i></button>
		<button type="button" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></button>
	</div>
</form>
<!-- Form Selesai -->