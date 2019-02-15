<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
          <form action="${contextName}/supplier/update" method="post" class="form-horizontal">
		          		<div class="form-group">
		          			<label class="control-label col-md-2">ID</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="id" readonly="readonly" value="${dataItem2.id}" />	
		          			</div>
		          		</div>
		          		
		          		<div class="form-group">
		          			<label class="control-label col-md-2">NAME</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="name" value="${dataItem2.name}"/>
		          			</div>
		          		</div>
		          		
		          		<div class="form-group">
		          			<label class="control-label col-md-2">ADDRESS</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="address" value="${dataItem2.address}"/>
		          			</div>
	          			</div>
	          			
	          			<div class="form-group">
		          			<label class="control-label col-md-2">CONTACT NAME</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="cname" value="${dataItem2.cname}"/>
		          			</div>
	          			</div>
	          			
	          			<div class="form-group">
		          			<label class="control-label col-md-2">PHONE</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="phone" value="${dataItem2.phone}"/>
		          			</div>
	          			</div>
	          			
	          			<div class="form-group">
		          			<label class="control-label col-md-2">EMAIL</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="email" value="${dataItem2.email}"/>
		          			</div>
	          			</div>
          			<div class="panel-footer">
          				<button class="btn btn-warning"><i class="fa fa-save"></i></button>
          				<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>
          			</div>
          	</form>