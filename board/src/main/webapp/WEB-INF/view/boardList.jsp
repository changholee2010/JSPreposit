<%@page import="co.yedam.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../includes/menu.jsp" %>
<%@ include file="../includes/header.jsp" %>
<h3>게시글 목록</h3>
<%
    List<BoardVO> list = (List<BoardVO>) request.getAttribute("blist");
%>
<table class="table table-striped">
  <thead>
    <tr>
      <th>글번호</th>
      <th>제목</th>
      <th>작성자</th>
      <th>작성일시</th>
    </tr>
  </thead>
  <tbody>
    <% for(BoardVO vo : list) {%>
    <tr>
      <td align="center"><a href="getboard.do?bno=<%=vo.getBoardNo() %>"><%=vo.getBoardNo() %></a></td>
      <td><%=vo.getTitle() %></td>
      <td><%=vo.getWriter() %></td>
      <td><%=vo.getCreateDate() %></td>
    </tr>
    <%} %>
  </tbody>
</table>
<%@ include file="../includes/footer.jsp" %>