<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
          <form action="${contextName}/category/update" method="post" class="form-horizontal">
		          		<div class="form-group">
		          			<label class="control-label col-md-2">ID</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="id" readonly="readonly" value="${dataItem2.id}" />	
		          			</div>
		          		</div>
		          		
		          		<div class="form-group">
		          			<label class="control-label col-md-2">Code</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="code" value="${dataItem2.code}"/>
		          			</div>
		          		</div>
		          		
		          		<div class="form-group">
		          			<label class="control-label col-md-2">Name</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="name" value="${dataItem2.name}"/>
		          			</div>
	          			</div>
          			<div class="panel-footer">
          				<button class="btn btn-warning"><i class="fa fa-save"></i></button>
          				<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>
          			</div>
          	</form>