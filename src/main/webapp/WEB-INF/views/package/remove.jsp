<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
	<div class="box-header with-border">
		<h3 class="box-title">PACKAGE</h3>
	</div>
	<div class="box-body">
		<div class="table-responsive">
          <div class="panel panel-danger">
				<div class="panel-heading">
					Remove Package
				</div>
				<div class="panel-body">
					<div class="form-horizontal">
						<!-- View ID -->
						<div class="form-group">
							<label class="control-label col-md-2">ID</label>
							<label class="control-label com-md-10">${data.id }</label>
						</div>
						
						<!-- View Code -->
						<div class="form-group">
							<label class="control-label col-md-2">CODE</label>
							<label class="control-label com-md-10">${data.code }</label>
						</div>
						<!-- View Code -->
						<div class="form-group">
							<label class="control-label col-md-2">NAME</label>
							<label class="control-label com-md-10">${data.name }</label>
						</div>
		          	</div>
				</div>
				<div class="panel-footer">
        			<a href="${contextName}/package" class="btn btn-success"><i class="fa fa-reply"></i></a>
    			</div>
			</div>
	</div>
</div>