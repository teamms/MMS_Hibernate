<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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

</style>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login</title>
</head>
<body>
<center><h1>Mariage Matrimonial System</h1></center>
<div id="container">
<form method="post" action="LoginServlet">
Username:<input type="text" name="userName"/><br>
Password:<input type="password" name="password"/><br>
<input type="submit" name="submit" value="Login"/>
</form>
<button ></button>
<form action="signup.jsp">
<input type="submit" value="Sign Up">
</form>
</div>
</body>
</html>