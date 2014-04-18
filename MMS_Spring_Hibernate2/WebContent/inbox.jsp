<%@page import="java.util.List"%>
<%@page import="mms.models.*"%>
<%@page import="mms.processing.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Inbox</title>
</head>
<body>
<%Person user=(Person)request.getSession().getAttribute("user"); %>
<h2>Welcome , <%=user.getName() %></h2>
<h3>Inbox:</h3><br>
<%
MessageManager manager=new MessageManager(null);
List<Message> messages=manager.getInboxList(user.getUserName());
%>

<% for(Message message:messages){%>
	<h3><u>From:<%=message.getUserName1() %></u></h3>
	<h4><%=message.getMessage() %></h4>
<%}%>




</body>
</html>