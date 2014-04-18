
<%@page import="java.util.ArrayList"%>
<%@page import="mms.processing.PersonManager"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page import="mms.models.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Marriage Matrimonial System</title>
</head>
<body><center><h1>Marriage Matrimonial System</h1></center>

<%!
private Person user;
private ArrayList<String> suggestions;
%>
<%
user=(Person)request.getSession().getAttribute("user");
%>
<h1>Welcome <%=user.getName() %></h1>
<form action="ProfileServlet">
Search:<input type="text" name="searchUserName"/>
<input type="submit"/>
</form>
<h2>Suggestions</h2>
<%
System.out.println(user.getName());
SessionFactory sessionFactory=(SessionFactory)request.getSession().getAttribute("sessionFactory");
PersonManager personManager=new PersonManager(sessionFactory);
suggestions=personManager.GetSuggestion(user.getUserName(), 10);
for(String personName:suggestions){
	%>
	<a href="ProfileServlet?searchUserName=<%=personName %>"><%=personName %></a><br>
<%	
}
%>
<%-- <c:set var="person" value="${ person.name }" />
<h1>${persson}</h1> --%>
</body>
</html>