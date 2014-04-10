<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h2 align="center">Matrimonial Matchmaking System</h2>
	<form action="TestDatabase" method="post" enctype="multipart/form-data">
		<h3>Account Information</h3>
		Name:<input type="text" name="name"/> <br>
		UserName:<input type="text" name="userName"/> <br>
		Password:<input type="password" name="password"/> <br>
		Religion:<input type="text" name="religion"/> <br>
		About:<input type="text" name="about"/> <br>
		
		<h3>Location</h3>
		Current City:<input type="text" name="currentCity"/> <br>
		Current State:<input type="text" name="currentState"/> <br>
		Native City:<input type="text" name="nativeCity"/> <br>
		Native State:<input type="text" name="nativeState"/> <br>
		
		<h3>Education</h3>
		Degree:<input type="text" name="degree"/> <br>
		Graduation Area:<input type="text" name="graduationArea"/> <br>
		Degree Name:<input type="text" name="degreeName"/> <br>
		College:<input type="text" name="collegeName"/> <br>
		Post Graduation:<input type="text" name="postGraduation"/> <br>
		
		<h3>Job</h3>
		Job Title:<input type="text" name="jobTitle"/> <br>
		Field:<input type="text" name="field"/> <br>
		Company:<input type="text" name="companyName"/> <br>
		Salary:<input type="text" name="salary"/> <br>
		Job Location:<input type="text" name="jobLocation"/> <br>
		
		<h3>Appearance</h3>
		Height:<input type="text" name="height"/> <br>
		Weight:<input type="text" name="weight"/> <br>
		Complexion:<input type="text" name="complexion"/> <br>
		Additional Details:<input type="text" name="additionalDetails"/> <br>
		
		<h3>Preferences</h3>
		Preferred Location:<input type="text" name="preferredLocation"/> <br>
		Preferred Religion:<input type="text" name="preferredReligion"/> <br>
		Preferred Education:<input type="text" name="preferredEducation"/> <br>
		Preferred Complexion:<input type="text" name="preferredComplexion"/> <br>
		Preferred Income:<input type="text" name="preferredIncome"/> <br>
		
		<h3>More Details</h3>
		Diet:<input type="text" name="diet"/> <br>
		Drinking:<input type="text" name="drinking"/> <br>
		Smoking:<input type="text" name="smoking"/> <br><br>
		Date Of Birth:<br>Day:<input type="text" name="dobDay"/> <br>
		Month:<input type="text" name="dobMonth"/> <br>
		Year:<input type="text" name="dobYear"/> <br>
		
		<h3>Profile Picture</h3>
		Upload:<input type="file" name="file" /> <br>
		
		<input type="submit" name="submit"/> <br>
	</form>
</body>
</html>