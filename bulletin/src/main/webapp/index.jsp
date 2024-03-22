<%@page import="java.text.SimpleDateFormat"%>
<%@page import="co.yedam.board.vo.BoardVO"%>
<%@page import="java.util.List"%>
<%@page import="co.yedam.board.service.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>

<head>
  <meta charset="UTF-8">
  <title>Insert title here</title>
</head>

<body>
	<%
	BoardService svc = new BoardServiceImpl();
	List<BoardVO> list = svc.boardList();
	%>
  <table border="1">
    <thead>
      <tr><th>글번호</th><th>제목</th><th>작성자</th><th>작성일시</th></tr>
    </thead>
    <tbody>
	<%
	for (BoardVO vo : list) {
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	%>
		  <tr><td><%=vo.getBoardNo() %></td><td><%=vo.getTitle() %></td><td><%=vo.getWriter() %></td><td><%=sdf.format(vo.getCreateDate()) %></td></tr>
	<%
	}
	%>
    </tbody>
  </table>
  
  <a href="board/addBoardForm.jsp">게시글 등록 화면</a>
  
</body>

</html>
