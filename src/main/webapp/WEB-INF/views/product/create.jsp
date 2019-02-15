<!-- form mulai -->
<form id="form-create" class="form-horizontal">
	<div class="form-group">
		<label class="control-label col-md-2">CODE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="code" id="code" />
		</div>
	</div>

	<div class="form-group">
		<label class="control-label col-md-2">NAME</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="name" id="name"/>
		</div>
	</div>
	
	<div class="form-group">
		<label class="control-label col-md-2">PACKAGE</label>
		<div class="col-md-10">
			<select name="packageId" class="form-control" id="packageId">
				<option value="">--Select Package--</option>
			</select>
		</div>
	</div>
	
	<div class="form-group">
		<label class="control-label col-md-2">CATEGORY</label>
		<div class="col-md-10">
			<select name="categoryId" class="form-control" id="categoryId">
				<option value="">--Select Category--</option>
			</select>
		</div>
	</div>
	
	<div class="form-group">
		<label class="control-label col-md-2">PRICE</label>
		<div class="col-md-10">
			<input type="text" class="form-control" name="price" />
		</div>
	</div>
	
	<div class="modal-footer">
		<button type="button" onClick="addData($('#form-create'))" class="btn btn-primary"><i class="fa fa-save"></i></button>
		<button type="button" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></button>
	</div>
</form>
<!-- Form Selesai -->