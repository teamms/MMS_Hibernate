
<%@page import="java.util.ArrayList"%>
<%@page import="mms.processing.PersonManager"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@ page import="mms.models.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="body.css" rel='stylesheet' type='text/css'>
<link href="header.css" rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Marriage Matrimonial System</title>
<style>
.suggestion_box{
background-color: yellow;
width: 300px;
}
.photo{
width:50px;
height:60px;
float:left;
}
.suggestion_details{
padding:5px;
}
h1{
position: relative;
}
a{
display: inline-block;
}
</style>
</head>
<body><center><h1>Marriage Matrimonial System</h1></center>

<%!
private Person user;
private ArrayList<String> suggestions;
%>
<%
user=(Person)request.getSession().getAttribute("user");
%>
<%@include file="header.jsp" %>
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
	<a href="ProfileServlet?searchUserName=<%=personName %>">
	<div class="suggestion_box">
	<div class="photo"><img src="Lnly boy.jpg" style="width:100%;height:100%;"/></div>
	<div class="suggestion_details">
	name:<%=personName %><br>
	location:mavelikara<br>
	job:developer<br>
	</div>
	</div>
	</a><br>
<%	
}
%>
<%-- <c:set var="person" value="${ person.name }" />
<h1>${persson}</h1> --%>
</body>
</html>