<%@page import="java.util.ArrayList"%>
<%@ page import="mms.resources.*"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<%!private ArrayList<String> states = LocationData.states;
	private ArrayList<String> districts = LocationData.districts;
	private ArrayList<String> colleges = EducationData.colleges;
	private ArrayList<String> degreeNames = EducationData.degreeNames;
	private ArrayList<String> degrees = EducationData.degrees;
	private ArrayList<String> graduationAreas = EducationData.graduationAreas;
	private ArrayList<String> postGraduations = EducationData.postGraduations;
	private ArrayList<String> fields = JobData.fields;
	private ArrayList<String> jobLocations = JobData.jobLocations;
	private ArrayList<String> salaries = JobData.salaries;
	private ArrayList<String> complexions = AppearanceData.complexions;
	private ArrayList<String> religions = AccountInformationData.religions;
	private ArrayList<String> diets = MoreDetails.diets;
	private ArrayList<String> smokings = MoreDetails.smokings;
	private ArrayList<String> drinkings = MoreDetails.drinkings;
	%>
<body>
	<h2 align="center">Matrimonial Matchmaking System</h2>
	<form action="TestDatabase" method="post">
		<h3>Account Information</h3>
		Name:<input type="text" name="name" /> <br> UserName:<input
			type="text" name="userName" /> <br> Password:<input
			type="password" name="password" /> <br> Religion:<select name="religion">
			<%
				for (String religion : religions) {
			%>
			<option value="<%=religion%>"><%=religion%></option>
			<%
				}
			%>

		</select><br> About:<input type="text"
			name="about" /> <br>

		<h3>Location</h3>
		Current City:<select name="currentCity">
			<%
				for (String district : districts) {
			%>
			<option value="<%=district%>"><%=district%></option>
			<%
				}
			%>

		</select><br> Current State:<select name="currentState">
			<%
				for (String state : states) {
			%>
			<option value="<%=state%>"><%=state%></option>
			<%
				}
			%>
		</select><br> Native City:<select name="nativeCity">
			<%
				for (String district : districts) {
			%>
			<option value="<%=district%>"><%=district%></option>
			<%
				}
			%>
		</select> <br> Native State:<select name="nativeState">
			<%
				for (String state : states) {
			%>
			<option value="<%=state%>"><%=state%></option>
			<%
				}
			%>
		</select><br>

		<h3>Education</h3>
		Degree:<select name="degree">
			<%
				for (String degree : degrees) {
			%>
			<option value="<%=degree%>"><%=degree%></option>
			<%
				}
			%>
		</select><br>
		 Graduation Area:<select name="graduationArea">
			<%
				for (String graduationArea: graduationAreas) {
			%>
			<option value="<%=graduationArea%>"><%=graduationArea%></option>
			<%
				}
			%>
		</select><br>
		 Degree Name:<select name="degreeName">
			<%
				for (String degreeName: degreeNames) {
			%>
			<option value="<%=degreeName%>"><%=degreeName%></option>
			<%
				}
			%>
		</select><br>
		College:<select name="college">
			<%
				for (String college: colleges) {
			%>
			<option value="<%=college%>"><%=college%></option>
			<%
				}
			%>
		</select><br>
		Post Graduation:<select name="postGraduation">
			<%
				for (String postGraduation: postGraduations) {
			%>
			<option value="<%=postGraduation%>"><%=postGraduation%></option>
			<%
				}
			%>
		</select><br>

		<h3>Job</h3>
		Job Title:<input type="text" name="jobTitle" /> <br> Field:<select name="field">
			<%
				for (String field: fields) {
			%>
			<option value="<%=field%>"><%=field%></option>
			<%
				}
			%>
		</select><br>
		 Company:<input type="text"
			name="companyName" /> <br> Salary:<select name="salary">
			<%
			int i=1;
				for (String salary: salaries) {
			%>
			<option value="<%=i%>"><%=salary%></option>
			<%
				i++;
				}
			%>
		</select><br> Job Location:<select name="jobLocation">
			<%
				for (String jobLocation: jobLocations) {
			%>
			<option value="<%=jobLocation%>"><%=jobLocation%></option>
			<%
				}
			%>
		</select><br>

		<h3>Appearance</h3>
		Height:<input type="text" name="height" /> <br> Weight:<input
			type="text" name="weight" /> <br> Complexion:<select name="complexion">
			<%
				for (String complexion: complexions) {
			%>
			<option value="<%=complexion%>"><%=complexion%></option>
			<%
				}
			%>
		</select><br> <br> Additional Details:<input type="text"
			name="additionalDetails" /> <br>

		<h3>Preferences</h3>
		Preferred Location:<select name="preferredLocation">
			<%
				for (String district : districts) {
			%>
			<option value="<%=district%>"><%=district%></option>
			<%
				}
			%>
			<option value="0">COOL</option>
		</select><br>
		Preferred Religion:<select name="preferredReligion">
			<%
				for (String religion : religions) {
			%>
			<option value="<%=religion%>"><%=religion%></option>
			<%
				}
			%>
				<option value="0">COOL</option>
		</select><br>
		Preferred Education:Degree:<select name="preferredDegree">
			<%
				for (String degree : degrees) {
			%>
			<option value="<%=degree%>"><%=degree%></option>
			<%
				}
			%>
			<option value="0">COOL</option>
		</select><br>
		Preferred Complexion:<select name="preferredComplexion">
			<%
				for (String complexion: complexions) {
			%>
			<option value="<%=complexion%>"><%=complexion%></option>
			<%
				}
			%>
			<option value="0">COOL</option>
		</select><br>
		Preferred Diet:<select name="preferredDiet">
			<%
				for (String diet:diets) {
			%>
			<option value="<%=diet%>"><%=diet%></option>
			<%
				}
			%>
			<option value="0">COOL</option>
		</select><br> Preferred Income:<select name="preferredIncome">
			<%
			i=1;
				for (String salary: salaries) {
			%>
			<option value="<%=i%>"><%=salary%></option>
			<%
				i++;
				}
			%>
			<option value="0">COOL</option>
		</select><br>

		<h3>More Details</h3>
		Diet:<select name="diet">
			<%
				for (String diet:diets) {
			%>
			<option value="<%=diet%>"><%=diet%></option>
			<%
				}
			%>
		</select><br> Drinking:<select name="smoking">
			<%
				for (String drinking:drinkings) {
			%>
			<option value="<%=drinking%>"><%=drinking%></option>
			<%
				}
			%>
		</select><br> Smoking:<select name="drinking">
			<%
				for (String smoking:smokings) {
			%>
			<option value="<%=smoking%>"><%=smoking%></option>
			<%
				}
			%>
		</select><br> 
		<br> Date Of Birth:<br>Day:<input type="text" name="dobDay" />
		<br> Month:<input type="text" name="dobMonth" /> <br> Year:<input
			type="text" name="dobYear" /> <br>

		<h3>Profile Picture</h3>
		Upload:<input type="file" name="file" /> <br> <input
			type="submit" name="submit" /> <br>
	</form>
</body>
</html>