<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
          <form action="${contextName}/category/remove" method="post" class="form-horizontal">
		          		<div class="form-group">
		          			<label class="control-label col-md-2">ID</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="id" readonly="readonly" value="${dataItem3.id}"/>
		          			</div>
		          		</div>
		          		
		          		<div class="form-group">
		          			<label class="control-label col-md-2">Code</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="code" readonly="readonly" value="${dataItem3.code}"/>
		          			</div>
		          		</div>
		          		
		          		<div class="form-group">
		          			<label class="control-label col-md-2">Name</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="name" readonly="readonly" value="${dataItem3.name}"/>
		          			</div>
	          			</div>
          			<div class="panel-footer">
          				<button class="btn btn-danger"><i class="fa fa-eraser"></i></button>
          				<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>
          			</div>
          	</form>