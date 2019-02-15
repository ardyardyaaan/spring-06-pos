<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
	<div class="box-header with-border">
		<h3 class="box-title">SUPPLIER</h3>
	</div>
	<div class="box-body">
		<div class="table-responsive">
<div class="panel panel-warning">
				<div class="panel-heading">
					Update Supplier
				</div>
				<div class="panel-body">
					<div class="form-horizontal">
						<div class="form-group">
							<label class="control-label col-md-2">ID</label>
							<label class="control-label com-md-10">${data.id }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">NAME</label>
							<label class="control-label com-md-10">${data.name }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">ADDRESS</label>
							<label class="control-label com-md-10">${data.address }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">CONTACT NAME</label>
							<label class="control-label com-md-10">${data.cname }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">PHONE</label>
							<label class="control-label com-md-10">${data.phone }</label>
						</div>
						<div class="form-group">
							<label class="control-label col-md-2">EMAIL</label>
							<label class="control-label com-md-10">${data.email }</label>
						</div>
		          	</div>
				</div>
				<div class="panel-footer">
        			<a href="${contextName}/supplier" class="btn btn-success"><i class="fa fa-reply"></i></a>
    			</div>
			</div>
	</div>
</div>