<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%	request.setAttribute("contextName", request.getServletContext().getContextPath()); %>
<div class="box box-info">
	<div class="box-header with-border">
		<h3 class="box-title">PRODUCT</h3>
		<div class="box-tools">
			<button type="button" class="btn btn-primary btn-sm" id="btn-add">
				<i class="fa fa-plus"></i>
			</button>
		</div>
	</div>
	<div class="box-body">
		<table class="table">
			<thead>
				<tr>
					<th>ID</th>
					<th>CODE</th>
					<th>NAME</th>
					<th>PACKAGE ID</th>
					<th>CATEGORY ID</th>
					<th>PRICE</th>
					<th class="col-md-1">OPSI</th>
				</tr>
			</thead>
			<tbody>
			<c:forEach var="data" items="${dataList}">
				<tr>
					<td>${data.id}</td>
					<td>${data.code}</td>
					<td>${data.name}</td>
					<td>${data.packageId}</td>
					<td>${data.categoryId}</td>
					<td>${data.price}</td>
					<td>
						<button value="${data.id }" class="btn btn-edit btn-warning btn-sm">
							<i class="fa fa-edit"></i>
						</button>
						<button value="${data.id }" class="btn btn-detail btn-success btn-sm">
							<i class="fa fa-info"></i>
						</button>
						<button value="${data.id }" class="btn btn-delete btn-danger btn-sm">
							<i class="fa fa-trash"></i>
						</button>
					</td>
				</tr>
			</c:forEach>
			</tbody>
		</table>
	</div>
</div>

<div class="modal" id="modal-dagang">
	<div class="modal-dialog">
		<div class="box box-success">
			<div class="box-header">
				<h3 class="box-title">Form Input</h3>
			</div>
			<div class="box-body" id="modal-data">
				
			</div>
		</div>
	</div>
</div>

<script>
$('#btn-add').click(function(){
	$.ajax({
		url:'${contextName}/product/create',
		type:'get',
		dataType:'html',
		success:function(result){
			//mencari element yang ada di modal-nikah
			$('#modal-data').html(result);
			$("#modal-dagang").modal('show');
		}
	});
});

$('.btn-edit').click(function(){
	var vid = $(this).val();
	$.ajax({
		url:'${contextName}/product/edit',
		type:'get',
		dataType:'html',
		data:{'id':vid},
		success:function(hasil){
			$('#modal-data').html(hasil);
			$('#modal-dagang').modal('show');
		}
	});
	
});

$('.btn-delete').click(function(){
	var vid = $(this).val();
	$.ajax({
		url:'${contextName}/product/delete',
		type:'get',
		dataType:'html',
		data:{'id':vid},
		success:function(hasil){
			$('#modal-data').html(hasil);
			$('#modal-dagang').modal('show');
		}
	});
	
});

$('.btn-detail').click(function(){
	var vid = $(this).val();
	$.ajax({
		url:'${contextName}/product/detail',
		type:'get',
		dataType:'html',
		data:{'id':vid},
		success:function(hasil){
			$('#modal-data').html(hasil);
			$('#modal-dagang').modal('show');
		}
	});
	
});
</script>