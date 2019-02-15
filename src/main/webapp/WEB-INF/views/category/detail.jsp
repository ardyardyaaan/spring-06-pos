<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>		
						<div class="form-group">
							<label class="control-label col-md-2">ID</label>
							<label class="control-label com-md-10">${dataItem.id}</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">Kode</label>
							<label class="control-label com-md-10">${dataItem.code}</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">Job Title</label>
							<label class="control-label com-md-10">${dataItem.name}</label>
						</div>
		          	<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>