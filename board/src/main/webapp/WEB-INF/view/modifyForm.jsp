<%@page import="co.yedam.vo.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!-- modifyForm.jsp -->
<%@ include file="../includes/menu.jsp" %>
<%@ include file="../includes/header.jsp" %>

<%
    BoardVO vo = (BoardVO) request.getAttribute("bvo");
%>
<form action="modifyBoard.do">
  <input type="hidden" name="boardNo" value="<%=vo.getBoardNo() %>">
  <table class="table">
    <tr>
      <th>글번호</th>
      <td><%=vo.getBoardNo() %></td>
      <th>글제목</th>
      <td><input class="form-control" type="text" name="title" value="<%=vo.getTitle() %>"></td>
    </tr>
    <tr>
      <th>글내용</th>
      <td colspan="3"><textarea class="form-control" name="content"><%=vo.getContent() %></textarea></td>
    </tr>
    <tr>
      <th>작성자</th>
      <td><%=vo.getWriter() %></td>
      <th>작성일시</th>
      <td><%=vo.getCreateDate() %></td>
    </tr>
    <tr>
      <td colspan="4" align="center">
        <button type="submit" class="btn btn-primary">저장</button>
      </td>
    </tr>
  </table>
</form>
<%@ include file="../includes/footer.jsp" %>