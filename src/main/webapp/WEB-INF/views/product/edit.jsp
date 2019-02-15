<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
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
			<input type="text" class="form-control" name="price" id="price"/>
		</div>
	</div>
	
	<div class="modal-footer">
		<button type="button" class="btn btn-primary" onClick="editData($('#form-edit'))"><i class="fa fa-save"></i></button>
		<button type="button" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></button>
	</div>
</form>
<!-- Form Selesai -->