<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<html>
<head>
<link href="body.css" rel='stylesheet' type='text/css'>
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
.header{
background-color: #603311;
color:#FEE8D6	;
font-family:cursive;
font-style:;

opacity:.8;

}


</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<div id="bgcontainer"></div>
<center><h1 class="header">Matrimonial Matchmaking System</h1></center>
<div id="container">
<form method="post" action="LoginServlet">
Username:<input type="text" required name="userName" aria-describedby="name-format" required aria-required=”true”/><br>
Password:<input type="password" required name="password"/><br>
<!-- <input id="name" name="name" value="" aria-describedby="name-format" required aria-required=”true”/> -->
<input type="submit" name="submit" value="Login"/>
</form>
<form action="signup.jsp">
<input type="submit" value="Sign Up">
</form>
</div>
</body>
</html>