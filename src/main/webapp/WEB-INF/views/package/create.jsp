 <% request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
          	<form action="${contextName}/package/insert" method="post" class="form-horizontal">
		          		<div class="form-group">
		          			<label class="control-label col-md-2">CODE</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="code" />
		          			</div>
		          		</div>
		          		<div class="form-group">
		          			<label class="control-label col-md-2">NAME</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="name" />
		          			</div>
	          			</div>
          			<div class="panel-footer">
          				<button class="btn btn-primary"><i class="fa fa-save"></i></button>
          				<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>
          			</div>
          	</form>