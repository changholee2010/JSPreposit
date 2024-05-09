<%@tag import="java.util.Calendar"%>
<%@ tag body-content="empty" pageEncoding="utf-8"%>

<% Calendar date = Calendar.getInstance(); %>

<%=date.get(Calendar.YEAR) %> -
<%=date.get(Calendar.MONTH) %>