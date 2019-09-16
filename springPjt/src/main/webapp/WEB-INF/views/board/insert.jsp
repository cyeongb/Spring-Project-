<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ include file="../inc/header.jsp" %>

<!--  =============메인============== -->
<section class="content">
	<div class="row">
		<div class="col-md-12">
		  <div class="box box-primary">
		    <div class="box-header">
		      <h3 class="box-title">글 등록하기</h3>
		    </div>
		    
<form role="form" method="post">
	<div class="box-body">
	  <div class="form-group">
	  	<label for="exampleInputEmail">제목</label>
	  	<input type="text" name='title' class="form-control" placeholder="제목을 입력하세요">
	  </div>
	  <div class="form-group">
	  	<label for="exampleInputPassword1">내용</label>
	  	<textarea rows="form-control" name="content" rows="3" placeholder="입력하세요"></textarea>
	  </div>
	  <div class="form-group">
	  	<label for="exampleInputPassword1">내용</label>
	  	<textarea class="form-control" name="content" rows="3" placeholder="입력하세요"></textarea>
	  </div>
	  <div class="form-group">
	  	<label for="exampleInputEmail1">작성자</label>
	  	<input type="text" name="writer" class="form-control" placeholder="Enter Writer">
	  </div>	  
	</div>

    <div class="box-footer">
    	<button type="submit" class="btn btn-primary">글 저장</button>
    </div>

</form>
		  
		  
		  
		  
		  </div>
		
		
		
		
		</div>
	
	
	
	</div>


</section>
<%@ include file="../inc/footer.jsp" %>