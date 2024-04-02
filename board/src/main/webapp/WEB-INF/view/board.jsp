<%@page import="co.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    

<%@ include file="../includes/menu.jsp" %>
<%@ include file="../includes/header.jsp" %>

<h3>상세페이지</h3>
<form name="notUse"></form>
<form action="modifyForm.do">
  <input type="hidden" name="bno" value="${bvo.boardNo }">
  <table class="table">
    <tr>
      <th>글번호</th>
      <td><c:out value="${bvo.boardNo }" /></td>
      <th>조회수</th>
      <td><c:out value="${bvo.viewCnt }" /></td>
    </tr>
    <tr>
      <th>글내용</th>
      <td colspan="3"><c:out value="${bvo.content }" /></td>
    </tr>
    <tr>
      <th>작성자</th>
      <td><c:out value="${bvo.writer }" /></td>
      <th>작성일시</th>
      <td><c:out value="${bvo.createDate }" /></td>
    </tr>
    <tr>
      <td colspan="4" align="center">
        <button type="submit" class="btn btn-primary">수정</button>
        <button type="button" class="btn btn-warning" onclick="deleteFormFunc()">삭제</button>
      </td>
    </tr>
  </table>
</form>
<script>
  function deleteFormFunc() {
	document.forms[1].action = "removeForm.do";
	document.forms[1].submit();
	document.forms[1].action = "modifyForm.do";
  }
</script>
<%@ include file="../includes/footer.jsp" %>