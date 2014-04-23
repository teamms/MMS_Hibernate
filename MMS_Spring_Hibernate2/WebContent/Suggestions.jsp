<%@page import="org.hibernate.cfg.Configuration"%>
<%@page import="java.util.ArrayList"%>
<%@page import="mms.models.MMSPoint"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="mms.processing.PersonManager"%>
<%@page import="java.util.List"%>
<%@page import="org.apache.catalina.connector.Request"%>
<%@page import="mms.models.Person"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Suggestions</title>
<%!
private Person user;
private ArrayList<String> suggestions;
%>
<%
user=(Person)request.getSession().getAttribute("user");
System.out.println(user.getName());
SessionFactory sessionFactory=(SessionFactory)request.getSession().getAttribute("sessionFactory");
//sessionFactory=new Configuration().configure().buildSessionFactory();
PersonManager personManager=new PersonManager(sessionFactory);
//suggestions=personManager.GetSuggestion(user.getUserName(), 10);
if(suggestions!=null){
for(String personName:suggestions){
	%>
	<a href="ProfileServlet?searchUserName=<%=personName %>"><%=personName %></a><br>
<%	
}
}
%>
</head>
<body>

</body>
</html>
