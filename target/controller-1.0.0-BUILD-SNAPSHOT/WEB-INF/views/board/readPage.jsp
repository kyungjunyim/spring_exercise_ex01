<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@include file="../include/header.jsp"%>

<!-- Main content -->
<section class="content">
	<div class="row">
		<!-- left column -->
		<div class="col-md-12">
			<!-- general form elements -->
			<form role="form" method="post">
				<input type="hidden" name="bno" value="${boardVO.bno }">
			</form>

			<div class="box-body">
				<div class="form-group">
					<label for="exampleInputEmail1">Title</label> <input type="text"
						name="title" class="form-control" value="${boardVO.title }"
						readonly="readonly">
				</div>
				<div class="form-group">
					<label for="exampleInputPassword1">Content</label>
					<textarea class="form-control" name="content" rows="3"
						readonly="readonly">${boardVO.content }</textarea>
				</div>
				<div class="form-group">
					<label for="exampleInputEmail1">Writer</label> <input type="text"
						name="writer" class="form-control" value="${boardVO.writer }"
						readonly="readonly">
				</div>
			</div>
			<div class="box-footer">
				<button type="submit" class="btn btn-warning modifyBtn">MODIFY</button>
				<button type="submit" class="btn btn-danger removeBtn">REMOVE</button>
				<button type="submit" class="btn btn-primary goListBtn">GO LIST</button>
			</div>
			
			<form role="form" action="modifyPage" method="post">
				<input type="hidden" name="bno" value="${boardVO.bno }">
				<input type="hidden" name="page" value="${cri.page }">
				<input type="hidden" name="perPageNum" value="${cri.perPageNum }">
				
			</form>
			<!-- /.box -->
		</div>
		<!--/.col (left) -->

	</div>
	<!-- /.row -->
</section>
<!-- /.content -->
</div>
<!-- /.content-wrapper -->
<script>
	$(document).ready(function(e) {
		var formObj = $("form[role='form']");
		
		console.log(formObj);
		
		$(".modifyBtn").on("click", function(e) {
			formObj.attr("action", "/board/modifyPage");
			formObj.attr("method", "get");
			formObj.submit();
		});
		
		$(".removeBtn").on("click", function(e) {
			formObj.attr("action", "/board/removePage");
			formObj.submit();
		});
		
		$(".goListBtn").on("click", function(e) {
			formObj.attr("action", "/board/listPage");
			formObj.attr("method", "get");
			formObj.submit();
		});
		
	});
	
</script>
<%@include file="../include/footer.jsp"%>
