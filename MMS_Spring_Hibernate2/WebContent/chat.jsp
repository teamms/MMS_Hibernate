<%@page import="java.util.List"%>
<%@page import="mms.models.*"%>
<%@page import="mms.processing.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="chat-javascript/jquery.js"></script>
<script type="text/javascript" src="chat-javascript/basic.js"></script>
<title>Inbox</title>
</head>
<body>
<%-- <%Person person=(Person)request.getAttribute("person"); %>
<h2>Welcome , <%=person.getName() %></h2> --%>
<%
ChatManager manager=new ChatManager(null);
List<Person> persons=manager.getAllPersons();

%>
<%int i=1; %>
<% for(Person person:persons){%>
	<h3 id="<%=person.getUserName()%>"><u><%=person.getUserName() %></u></h3>
<%i++;}%>
<h2>Chat:</h2><br>
<form id="updateMessages" >
<label for="message">Message:</label>
<input type="text" id="messsage" name="message"/>
<input type="submit"/>
</form>
<p id="displayMessages"/>



</body>
</html>