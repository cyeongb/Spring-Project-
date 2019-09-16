<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ page session="false"%>
    <%@ include file="../inc/header.jsp" %>
<section class="content">
	<div class="row">
		<div class="col-md-12">
		  <div class="box">
		  	<div class="box-header with-border">
		  		<h3 class="box-title">글 목록</h3>
		  	</div>
		  	<div class="box-body">
  <table class="table table-bordered">
  	<tr>
  		<th style="width:10px">글 번호</th>
  		<th>제목</th>
  		<th>작성자</th>
  		<th>작성 날짜</th>
  		<th style="width:40px">조회수</th>
  	</tr>
  	
<c:forEach items="${list}" var="boardVO">

	<tr>
		<td>${boardVO.bno }</td>
		<td><a href='/views/board/read?bno=${boardVO.bno }'>${boardVO.title }</a></td>
		<td>${boardVO.writer }</td>
		<td><fmt:formatDate pattern="yyyy-MM-DD HH:mm" value="${boardVO.regdate }" /></td>
		<td><span class="badge bg-red">${boardVO.viewcnt}</span></td>	
	</tr>

</c:forEach>
  
  </table>
		  	
		  	
		  	</div>
		  	
		  	<div class="box-footer">푸터</div>
		  
		  </div>		 		
		
		</div>
	
	</div>


</section>
<script>
	var result='${msg}';
	if(result=='SUCCESS'){
		alert("처리 성공")
	}

</script>

<%@ include file="../inc/footer.jsp" %>