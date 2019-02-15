<!-- form mulai -->
<form id="form-edit" class="form-horizontal">
	<!-- id -->
	<input type="hidden" name="id" id="id" />
	<!-- name -->
	<div class="form-group">
		<label class="control-label col-md-2">NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="name" id="name" />
		</div>
	</div>
	<!-- address -->
	<div class="form-group">
		<label class="control-label col-md-2">ADDRESS</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="address" id="address"/>
		</div>
	</div>
	<!-- contact name -->
	<div class="form-group">
		<label class="control-label col-md-2">CONTACT NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="cname" id="cname"/>
		</div>
	</div>
	<!-- phone -->
	<div class="form-group">
		<label class="control-label col-md-2">PHONE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="phone" id="phone"/>
		</div>
	</div>
	<!-- email -->
	<div class="form-group">
		<label class="control-label col-md-2">EMAIL</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="email" id="email"/>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" onClick="editData($('#form-edit'))"><i class="fa fa-save"></i></button>
		<button type="button" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></button>
	</div>
</form>
<!-- Form Selesai -->