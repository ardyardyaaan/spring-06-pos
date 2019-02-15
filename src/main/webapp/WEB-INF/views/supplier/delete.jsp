<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
          <form action="${contextName}/supplier/remove" method="post" class="form-horizontal">
		          		<div class="form-group">
		          			<label class="control-label col-md-2">ID</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="id" readonly="readonly" value="${dataItem3.id}"/>
		          			</div>
		          		</div>
		          		<div class="form-group">
		          			<label class="control-label col-md-2">NAME</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="name" readonly="readonly" value="${dataItem3.name}"/>
		          			</div>
		          		</div>
		          		<div class="form-group">
		          			<label class="control-label col-md-2">ADDRESS</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="address" readonly="readonly" value="${dataItem3.address}"/>
		          			</div>
	          			</div>
	          			<div class="form-group">
		          			<label class="control-label col-md-2">CONTACT NAME</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="cname" readonly="readonly" value="${dataItem3.cname}"/>
		          			</div>
	          			</div>
	          			<div class="form-group">
		          			<label class="control-label col-md-2">PHONE</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="phone" readonly="readonly" value="${dataItem3.phone}"/>
		          			</div>
	          			</div>
	          			<div class="form-group">
		          			<label class="control-label col-md-2">EMAIL</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="email" readonly="readonly" value="${dataItem3.email}"/>
		          			</div>
	          			</div>
          			<div class="panel-footer">
          				<button class="btn btn-danger"><i class="fa fa-eraser"></i></button>
          				<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>
          			</div>
          	</form>