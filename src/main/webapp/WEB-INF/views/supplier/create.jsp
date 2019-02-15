 <% request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
          	<form action="${contextName}/supplier/insert" method="post" class="form-horizontal">
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
          			<div class="panel-footer">
          				<button class="btn btn-primary"><i class="fa fa-save"></i></button>
          				<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>
          			</div>
          	</form>