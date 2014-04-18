<%@page import="mms.models.Person"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Person person=(Person)request.getSession().getAttribute("searchUserName");
out.println(person.getName());
%>
<form name="submitForm" action="ConnectionServlet">
<input type="hidden" name="person" value=<%=person.getUserName()%>>
<a href="javascript:document.submitForm.submit()">connect</a>
</form>
</body>
</html>