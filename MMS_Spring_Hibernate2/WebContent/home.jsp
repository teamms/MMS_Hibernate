
<%@ page import="mms.models.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Redirected</h1>
<%
Person person=(Person)request.getSession().getAttribute("user");
%>
<h1><%=person.getName() %></h1>
<form action="ProfileServlet">
Search:<input type="text" name="searchUserName"/>
<input type="submit"/>
</form>
<%-- <c:set var="person" value="${ person.name }" />
<h1>${persson}</h1> --%>
</body>
</html>