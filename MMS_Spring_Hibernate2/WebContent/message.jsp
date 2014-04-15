<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Message</title>
</head>
<body>
<h1>Send Message</h1>
<form action="MessageServlet">
UserName(From):<input type="text" name="userName1"/>
UserName(To):<input type="text" name="userName2"/><br>
Message:<br><textarea name="toInboxMessage" rows="4" cols="50">

</textarea><br>
<input type="submit" value="send"/>
</form>
</body>
</html>