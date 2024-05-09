<%@ tag body-content="empty" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@ attribute name="page" required="true"%>

<c:forEach var="p" begin="${page.start }" end="${page.end }">
	<p>
		<c:out value="${p }" />
	</p>
</c:forEach>
