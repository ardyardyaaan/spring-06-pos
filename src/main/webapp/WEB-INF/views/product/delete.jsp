<!-- form mulai -->
<form id="form-delete" class="form-horizontal">
	<!-- id -->
	<input type="hidden" name="id" id="id" />
	
	<!-- code -->
	<div class="form-group">
		<label class="control-label col-md-2">CODE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="code" id="code" readonly="readonly" />
		</div>
	</div>
	
	<!-- name -->
	<div class="form-group">
		<label class="control-label col-md-2">NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="name" id="name" readonly="readonly"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="control-label col-md-2">PACKAGE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="packageId" id="packageId" readonly="readonly"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="control-label col-md-2">CATEGORY</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="categoryId" id="categoryId" readonly="readonly"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="control-label col-md-2">PRICE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="price" id="price" readonly="readonly"/>
		</div>
	</div>
	<div class="modal-footer">
		<button type="button" class="btn btn-danger" onClick="deleteData($('#form-delete'))"><i class="fa fa-eraser"></i></button>
		<button type="button" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></button>
	</div>
</form>
<!-- Form Selesai -->