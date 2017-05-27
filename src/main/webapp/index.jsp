<%@ page pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<c:set var="language"
	value="${not empty param.language ? param.language : not empty language ? language : pageContext.request.locale}"
	scope="session" />
<fmt:setLocale value="${language}" />
<fmt:setBundle basename="indexpage" />
<!DOCTYPE html>
<html>
<head>
<title>Uber Test</title>
</head>
<body style="margin-top: 20px; margin-left: 20px; margin-right: 20px;">
	<ul>
		<li><p>
				<a href="ping">Call Ping Servlet</a>:
				<fmt:message key="function.ping" />
			</p></li>
	</ul>
</body>
</html>
