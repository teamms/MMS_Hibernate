
<%@page import="java.util.ArrayList"%>
<%@page import="mms.processing.PersonManager"%>
<%@page import="org.hibernate.SessionFactory"%>
<%@page import="java.util.List"%>
<%@page import="mms.processing.*"%>
<%@ page import="mms.models.*" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" href="fontfile.css">
<link href="body.css" rel='stylesheet' type='text/css'>
<link href="header.css" rel='stylesheet' type='text/css'>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Marriage Matrimonial System</title>
<script type="text/javascript" src="chat-javascript/jquery.js"></script>
<script type="text/javascript" src="chat-javascript/basic.js"></script>
<style>

.currentlyChosenPerson{
width: 95%;
font-size: 18px;
padding:5px;
/* border: black 2px solid; */
cursor:pointer;


}
.currentlyChosenPerson:hover{
background-color: grey !important;


}

#displayMessages{
overflow: auto;
height:200px;


}

.chatContainer{
position: fixed;
right: 13px;
border: black 2px solid;
overflow: auto;
height: 89%;
width: 230px;
background-color: rgba(12,34,56,.5);
top: 55px;

}

.suggestion_box{
background-color: rgba(12,34,56,.5);
width: 300px;
margin-top:2px;
-webkit-transition:all .2s ease-in-out;
}
.suggestion_box:hover{
margin-left:10px;
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
text-decoration: none;
}
a, a:visited, a:hover, a:active {
  color: inherit;
}

#heading{
position:fixed;
margin-top:60px;
font-size: 40px;
}
#greeting{
font-size: 40px;
color:rgba(256,256,256,.05);
}
#margin-corrector-div{
height:50px;
}
#chatBox{

border: brown 3px solid;
background-color: rgba(256,0,0,.5);
width: 25%;
position: fixed;
right: 19%;
bottom:2%;
padding:4px;

}

</style>
</head>
<body>
<div id="bgcontainer"></div>
<%@include file="header.jsp" %>

<div id="margin-corrector-div"></div>


<%
ChatManager manager=new ChatManager(null);
List<Person> persons=manager.getAllPersons();

%>
<div class="chatContainer">
<%int i=1; %>
<% for(Person person:persons){%>
	<%if(!((Person)request.getSession().getAttribute("user")).getUserName().equals(person.getUserName())){ %>
	<div class="currentlyChosenPerson" id="<%=person.getUserName()%>"><%=person.getName() %></div>
<%}}%>
</div>

<%Person person=(Person)request.getSession().getAttribute("user");%>

<div id="chatBox">
<div id="displayMessages"></div>
<div id="displayMessagesHidden" style="visibility:hidden"></div>
<form id="sendMessage" >
<label for="message">Message:</label>
<input type="text" id="toInboxMessage" name="toInboxMessage"/>
<%-- <input type="text" id="userName1" name="userName1" value="<%=person.getUserName() %>" style="visibility: hidden"/>
<input type="text" id="userName2" name="userName2" value="" style="visibility: hidden"/><br> --%>
<!-- <input id="send_submit" type="submit" value="Send" /> -->
<!-- <input id="send_jquery" type="button" value="Send" /> -->
</form>

</div>





<%!
private Person user;
private ArrayList<String> suggestions;
%>
<%
user=(Person)request.getSession().getAttribute("user");
%>

<div id="greeting">Welcome <%=user.getName() %></div>

<h2>Suggestions</h2>
<%
System.out.println(user.getName());
SessionFactory sessionFactory=(SessionFactory)request.getSession().getAttribute("sessionFactory");
PersonManager personManager=new PersonManager(sessionFactory);
suggestions=personManager.GetSuggestion(user.getUserName(), 10);
if(suggestions!=null)
for(String personName:suggestions){
	%>
	<%Person currentPerson=personManager.getPersonFromUserName(personName); %>
	<a href="ProfileServlet?searchUserName=<%=personName %>">
	<div class="suggestion_box">
	<div class="photo"><img src="images/notavailable.jpg" style="width:100%;height:100%;"/></div>
	<div class="suggestion_details">
	Name:<%=currentPerson.getName() %><br><!-- personName is actually username(Blame mandi :/) -->
	Location:<%=currentPerson.getLocation().getCurrentCity() %><br>
	Profession:<%=currentPerson.getJob().getJobTitle() %><br>
	Company:<%=currentPerson.getJob().getCompanyName() %><br>
	</div>
	</div>
	</a><br>
<% 
}else{%>
	<div class="suggestion_box">
	<div class="photo"></div>
	<div class="suggestion_details">
	
	No Suggestions Found<br>
	</div>
	</div>
	
<%} %>

<%-- <c:set var="person" value="${ person.name }" />
<h1>${persson}</h1> --%>
</body>
</html>