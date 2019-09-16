<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../inc/header.jsp" %>

<!-- 메인 -->
<section class="content">
	<div class="row">
		<div class="col-md-12">
			<div class="box box-primary">
				<div class="box-header">
					<h3 class="box-title">게시판 읽기</h3>									
				</div>
				
				<!-- 박스-헤더 -->
<form role="form" method="post">
<!-- 추후에 수정 및 삭제작업에 번호값이 사용되기 때문에 hidden으로 처리. -->
	<input type='hidden' name='bno' value="${ boardVO.bno}">

</form>

<div class="box-body">
	<div class="form-group">
		<label for="exampleInputEmail1">제목</label>
		<input type="text" name='title' class="form-control" value="${boardVO.title }"
		readonly="readonly">
	</div>
	<div class="form-group">
		<label for="exampleInputPassword1">내용</label>
		<textarea class="form-control" name="content" rows="3" readonly="readonly">
		</textarea>
	</div>
	<div class="form-group">
	<label for="exampleInputEmail1">작성자</label>
		<input type="text" name="writer" class="form-control" value="${boardVO.writer }"
		readonly="readonly">
	</div>
</div>

<div class="box-footer">
	<button type="submit" class="btn btn-warning">수정하기</button>
	
	<button type="submit" class="btn btn-danger">삭제하기</button>
	
	<button type="submit" class="btn btn-primary">목록 불러오기</button>

</div>

<script>
	$(document).ready(function(){
		var formObj= $("form[role='form']");
		
		console.log(formObj);
		
		$(".btn-warning").on("click",function(){
			
			formObj.attr("action","/springPjt/board/modify");
			formOnj.attr("method","get");
			formObj.submit();			
		});
		$(".btn-danger").on("click",function(){
			
			formObj.attr("action","/springPjt/board/remove");
			formObj.submit();			
		});
		$(".btn-primary").on("click",function(){
	
			self.location="/springPjt/board/list";
				
		});
		
	});


</script>
			
			
			</div> <!-- /box -->
		
		</div><!-- /col -->
	
	
	
	</div><!-- /row -->


</section> <!-- /content -->




<%@ include file="../inc/footer.jsp" %>