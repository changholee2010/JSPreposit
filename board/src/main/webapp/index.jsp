<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <h3>첫페이지입니다...(index.jsp)</h3>
  <a href="info/resume.html">resume 페이지로 이동.</a>
  <form action="MainServlet" method="post">
    <table border='1'>
      <tr>
        <th>제목</th><td><input type="text" name="title"></td>
      </tr>
      <tr>
        <th>작성자</th><td><input type="text" name="writer"></td>
      </tr>
      <tr>
        <th>내용</th><td><textarea cols="25" rows="3" name="content"></textarea></td>
      </tr>
      <tr>
        <td colspan="2" align="center"><button type="submit">등록</button></td>
      </tr>
    </table>
  </form>
</body>
</html>