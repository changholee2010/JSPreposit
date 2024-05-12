<%@ tag body-content="empty" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ attribute name="pageInfo" type="com.yedam.common.Page"
	required="true"%>

<c:forEach var="p" begin="${pageInfo.start }" end="${pageInfo.end }">
	<c:if test="${pageInfo.prev }">
		<a href="${p }">&laquo;</a>
	</c:if>
	<c:choose>
		<c:when test="${pageInfo.page eq p }">
			<a href="${p }">${p } page</a>
		</c:when>
		<c:otherwise>
			<a href="${p }">${p } 페이지</a>
		</c:otherwise>
	</c:choose>
	<c:if test="${pageInfo.next }">
		<a href="${p }">&raquo;</a>
	</c:if>
</c:forEach>