<!-- form mulai -->
<form id="form-delete" class="form-horizontal">
	<!-- id -->
	<input type="hidden" name="id" id="id" />
	<!-- name -->
	<div class="form-group">
		<label class="control-label col-md-2">NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="name" id="name" readonly="readonly" />
		</div>
	</div>
	<!-- address -->
	<div class="form-group">
		<label class="control-label col-md-2">ADDRESS</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="address" id="address" readonly="readonly"/>
		</div>
	</div>
	<!-- contact name -->
	<div class="form-group">
		<label class="control-label col-md-2">CONTACT NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="cname" id="cname" readonly="readonly"/>
		</div>
	</div>
	<!-- phone -->
	<div class="form-group">
		<label class="control-label col-md-2">PHONE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="phone" id="phone" readonly="readonly"/>
		</div>
	</div>
	<!-- email -->
	<div class="form-group">
		<label class="control-label col-md-2">EMAIL</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="email" id="email" readonly="readonly"/>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-danger" onClick="deleteData($('#form-delete'))"><i class="fa fa-eraser"></i></button>
		<button type="button" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></button>
	</div>
</form>
<!-- Form Selesai -->