package mms.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Example;


import mms.models.*;

@WebServlet("/TestDatabase")
public class TestDatabase extends HttpServlet {
	private static final long serialVersionUID = 1L;
   

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Person person=new Person();
		Job job=new Job();
		Appearance appearance=new Appearance();
		Location location=new Location();
		Preferences preferences=new Preferences();
		Misc misc=new Misc();
		Education education=new Education();
		
		
		
		
		String name=request.getParameter("name");
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		String religion=request.getParameter("religion");
		String about=request.getParameter("about");
		String currentCity=request.getParameter("currentCity");
		String currentState=request.getParameter("currentState");
		String nativeCity=request.getParameter("nativeCity");
		String nativeState=request.getParameter("nativeState");
		String degree=request.getParameter("degree");
		String graduationArea=request.getParameter("graduationArea");
		String degreeName=request.getParameter("degreeName");
		String collegeName=request.getParameter("collegeName");
		String postGraduation=request.getParameter("postGraduation");
		String jobTitle=request.getParameter("jobTitle");
		String field=request.getParameter("field");
		String companyName=request.getParameter("companyName");
		String salary=request.getParameter("salary");
		String jobLocation=request.getParameter("jobLocation");
		String height=request.getParameter("height");
		String weight=request.getParameter("weight");
		String complexion=request.getParameter("complexion");
		String additionalDetails=request.getParameter("additionalDetails");
		String preferredLocation=request.getParameter("preferredLocation");
		String preferredReligion=request.getParameter("preferredReligion");
		String preferredEducation=request.getParameter("preferredEducation");
		String preferredComplexion=request.getParameter("preferredComplexion");
		String preferredIncome=request.getParameter("preferredIncome");
		String diet=request.getParameter("diet");
		String smoking=request.getParameter("smoking");
		String drinking=request.getParameter("drinking");
		String dobDay=request.getParameter("dobDay");
		String dobMonth=request.getParameter("dobMonth");
		String dobYear=request.getParameter("dobYear");
		
		System.out.println("****");
		System.out.println(collegeName);
		System.out.println(companyName);
		System.out.println(drinking);
		System.out.println(jobLocation);
		
		System.out.println("****");
		//System.out.println(companyName);
		
		job.setCompanyName(companyName);
		job.setField(field);
		job.setJobTitle(jobTitle);
		job.setSalary(Integer.parseInt(salary));
		job.setJobLocation(jobLocation);
		
		misc.setDay(Integer.parseInt(dobDay));
		misc.setMonth(Integer.parseInt(dobMonth));
		misc.setYear(Integer.parseInt(dobYear));
		misc.setDrinking(drinking);
		misc.setSmoking(smoking);
		misc.setDiet(diet);
		
		appearance.setAdditionalDetails(additionalDetails);
		appearance.setComplexion(preferredComplexion);
		appearance.setHeight(Integer.parseInt(height));
		appearance.setWeight(Integer.parseInt(weight));
		
		education.setCollegeName(collegeName);
		education.setDegree(degree);
		education.setDegreeName(degreeName);
		education.setGraduationArea(graduationArea);
		education.setPostGraduation(postGraduation);
		
		preferences.setPreferredComplexion(preferredComplexion);
		preferences.setPreferredEducation(preferredEducation);
		preferences.setPreferredIncome(Integer.parseInt(preferredIncome));
		preferences.setPreferredLocation(preferredLocation);
		preferences.setPreferredReligion(preferredReligion);
		
		location.setCurrentCity(currentCity);
		location.setCurrentState(currentState);
		location.setNativeCity(nativeCity);
		location.setNativeState(nativeState);
		
		person.setAbout(about);
		person.setEducation(education);
		person.setJob(job);
		person.setLocation(location);
		person.setMoreDetails(misc);
		person.setName(name);
		person.setPassword(password);
		person.setPreferences(preferences);
		person.setReligion(religion);
		person.setUserName(userName);
		person.setAppearance(appearance);
		
		
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		session.save(person);
		session.getTransaction().commit();
		session.close();
		
		PrintWriter out=response.getWriter();
		out.println("Job Saved");
		
		request.setAttribute("person",person);
		request.getRequestDispatcher("/home.jsp").forward(request, response);
	}

}
