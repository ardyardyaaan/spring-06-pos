<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
	<div class="box-header with-border">
		<h3 class="box-title">PRODUCT</h3>
	</div>
	<div class="box-body">
		<div class="table-responsive">
          <div class="panel panel-success">
				<div class="panel-heading">
					Insert Product
				</div>
				<div class="panel-body">
					<div class="form-horizontal">
						<div class="form-group">
							<label class="control-label col-md-2">ID</label>
							<label class="control-label com-md-10">${data.id }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">CODE</label>
							<label class="control-label com-md-10">${data.code }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">NAME</label>
							<label class="control-label com-md-10">${data.name }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">PACKAGE ID</label>
							<label class="control-label com-md-10">${data.packageId }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">CATEGORY ID</label>
							<label class="control-label com-md-10">${data.categoryId }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">PRICE</label>
							<label class="control-label com-md-10">${data.price }</label>
						</div>
		          	</div>
				</div>
				<div class="panel-footer">
        			<a href="${contextName}/product" class="btn btn-success"><i class="fa fa-reply"></i></a>
    			</div>
			</div>
	</div>
</div>