<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>		
						<div class="form-horizontal">
						<div class="form-group">
							<label class="control-label col-md-2">ID</label>
							<label class="control-label com-md-10">${dataItem.id }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">NAME</label>
							<label class="control-label com-md-10">${dataItem.name }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">ADDRESS</label>
							<label class="control-label com-md-10">${dataItem.address }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">CONTACT NAME</label>
							<label class="control-label com-md-10">${dataItem.cname }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">PHONE</label>
							<label class="control-label com-md-10">${dataItem.phone }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">EMAIL</label>
							<label class="control-label com-md-10">${dataItem.email }</label>
						</div>
						</div>
		          	<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>