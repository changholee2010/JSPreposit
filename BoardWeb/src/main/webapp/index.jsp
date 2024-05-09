<%@page import="com.yedam.common.Page"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib tagdir="/WEB-INF/tags" prefix="my" %>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
  <%
    Page paging = new Page();
    paging.setStart(1);
    paging.setEnd(3);
    request.setAttribute("att", paging);
  %>
  <my:time/>
  <my:sum num2="10" num1="5"/>
  <p>result: ${result }</p>
  <my:chart color="blue" title="서 적">
    소설<br>
    역사<br>
    인문<br>
  </my:chart>
  
  <c:set var="page" value="${att }" />
  <c:out value="${page }" />
  <my:paging page="${page }"/>
  
</body>
</html>