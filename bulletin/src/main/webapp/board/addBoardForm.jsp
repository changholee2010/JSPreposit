<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <form action="../BoardServlet" method="post">
    <table border="1">
      <tr>
        <th>제목</th><td><input type="text" name="title"></td>
      </tr>
      <tr>
        <th>내용</th><td><input type="text" name="content"></td>
      </tr>
      <tr>
        <th>작성자</th><td><input type="text" name="writer"></td>
      </tr>
      <tr>
        <td colspan="2"><button type="submit">저장</button>
      </tr>
    </table>
  </form>
</body>
</html>