<%@page import="java.util.List"%>
<%@page import="mms.models.*"%>
<%@page import="mms.processing.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<style>

 #container{
position: absolute;
top:40%;
left:40%;
background-color: rgba(1,1,9,.2);
padding:10px;
} 
input{
padding:5px;
margin:10px;
}

</style>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script type="text/javascript" src="chat-javascript/jquery.js"></script>
<script type="text/javascript" src="chat-javascript/basic.js"></script>
<title>Chat</title>

<style>
#chatBox{
align:right;



}
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

.chatContainer{
position:fixed;
right:13px;
border: black 2px solid;
overflow: auto;
height: 93%;
width:200px;

}


</style>


</head>
<body>
<div id="bgcontainer"></div>
<%-- <%Person person=(Person)request.getAttribute("person"); %>
<h2>Welcome , <%=person.getName() %></h2> --%>
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
<h2>Chat:</h2>
<div id="chatBox">
<form id="sendMessage" >
<label for="message">Message:</label>
<input type="text" id="toInboxMessage" name="toInboxMessage"/>
<input type="text" id="userName1" name="userName1" value="<%=person.getUserName() %>" style="visibility: hidden"/>
<input type="text" id="userName2" name="userName2" value="" style="visibility: hidden"/><br>
<input id="send_submit" type="submit" value="Send" />
<!-- <input id="send_jquery" type="button" value="Send" /> -->
</form>
<p id="displayMessages"/>
<p id="displayMessagesHidden" style="visibility:hidden"></p>
</div>


</body>
</html>