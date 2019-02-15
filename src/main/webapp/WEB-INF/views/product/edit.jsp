<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
          <form action="${contextName}/product/update" method="post" class="form-horizontal">
          				<div class="form-group">
		          			<label class="control-label col-md-2">ID</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="id" readonly="readonly" value="${dataItem2.id}" />	
		          			</div>
		          		</div>
		          		<div class="form-group">
		          			<label class="control-label col-md-2">CODE</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="code" value="${dataItem2.code}"/>
		          			</div>
		          		</div>
		          		<div class="form-group">
		          			<label class="control-label col-md-2">NAME</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="name" value="${dataItem2.name}"/>
		          			</div>
	          			</div>
	          			<div class="form-group">
	          				<label class="control-label col-md-2">Packages ID</label>
	          				<div class="col-md-10">
	          					<select name="packageId" class="form-control" id="packageId">
		          					<option value="">--Pilih Package--</option>
		          					<c:forEach var="pack" items="${dataPackage}">
		          						<option value="${pack.id}" ${pack.id==dataItem2.packageId ? "selected='selected'":""}>${pack.name}</option>
		          					</c:forEach>
		          				</select>
	          				</div>
	          			</div>
	          			<div class="form-group">
	          				<label class="control-label col-md-2">Category ID</label>
	          				<div class="col-md-10">
	          					<select name="categoryId" class="form-control" id="categoryId">
		          					<option value="">--Pilih Category--</option>
		          					<c:forEach var="cate" items="${dataCategory}">
		          						<option value="${cate.id}" ${cate.id==dataItem2.categoryId ? "selected='selected'":""}>${cate.name}</option>
		          					</c:forEach>
		          				</select>
	          				</div>
	          			</div>
	          			<div class="form-group">
		          			<label class="control-label col-md-2">PRICE</label>
		          			<div class="col-md-10">
		          				<input type="text" class="form-control" name="price" value="${dataItem2.price}"/>
		          			</div>
	          			</div>
          			<div class="panel-footer">
          				<button class="btn btn-warning"><i class="fa fa-save"></i></button>
          				<a href="#" class="btn btn-success" data-dismiss="modal"><i class="fa fa-reply"></i></a>
          			</div>
          	</form>