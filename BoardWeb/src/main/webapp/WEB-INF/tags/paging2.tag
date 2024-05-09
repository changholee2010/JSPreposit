<%@ tag body-content="empty" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ attribute name="start" required="true"%>
<%@ attribute name="end" required="true"%>
<%@ attribute name="page" required="true"%>
<%@ attribute name="prev" required="true"%>
<%@ attribute name="next" required="true"%>

<c:forEach var="p" begin="${start }" end="${end }">
	<c:if test="${prev }">
		<a href="${p }">&laquo;</a>
	</c:if>
	<c:choose>
		<c:when test="${page eq p }">
			<a href="${p }">${p } page</a>
		</c:when>
		<c:otherwise>
			<a href="${p }">${p } 페이지</a>
		</c:otherwise>
	</c:choose>
	<c:if test="${next }">
		<a href="${p }">&raquo;</a>
	</c:if>
</c:forEach>