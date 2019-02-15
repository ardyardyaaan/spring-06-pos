<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>		
						<div class="form-horizontal">
						<div class="form-group">
							<label class="control-label col-md-2">ID</label>
							<label class="control-label com-md-10">${dataItem.id }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">CODE</label>
							<label class="control-label com-md-10">${dataItem.code }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">NAME</label>
							<label class="control-label com-md-10">${dataItem.name }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">PACKAGE ID</label>
							<label class="control-label com-md-10">${dataItem.packageId }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">CATEGORY ID</label>
							<label class="control-label com-md-10">${dataItem.categoryId }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">PRICE</label>
							<label class="control-label com-md-10">${dataItem.price }</label>
						</div>
						</div>
		          	<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>