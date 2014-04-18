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
<title>Chat</title>
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
<%Person person=(Person)request.getAttribute("person");%>
<h2>Chat:</h2><br>
<form id="sendMessage" >
<label for="message">Message:</label>
<input type="text" id="toInboxMessage" name="toInboxMessage"/>
<input type="text" id="userName1" name="userName1" value="<%=person.getUserName() %>" style="visibility: hidden"/>
<input type="text" id="userName2" name="userName2" value="" style="visibility: hidden"/><br>
<input id="send_submit" type="submit" value="send" />
<!-- <input id="send_jquery" type="button" value="Send" /> -->
</form>
<p id="displayMessages"/>



</body>
</html>