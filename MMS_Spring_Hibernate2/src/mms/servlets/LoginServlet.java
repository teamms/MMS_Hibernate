package mms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mms.models.Person;
import mms.processing.LoginManager;

import org.apache.catalina.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
     protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		request.getSession().setAttribute("sessionFactory",sessionFactory);
		LoginManager loginmanager=new LoginManager(sessionFactory);
		Person person=loginmanager.checkLogin(userName,password);
		PrintWriter out=response.getWriter();
		if(person!=null){
			request.getSession().setAttribute("user", person);
//TO SEARCH
			//out.println("HAHA "+person.getName());
			//response.sendRedirect("home.jsp");

			//out.println("Welcome "+person.getName());
//TO INBOX
			//response.sendRedirect("profileServlet");
			//request.setAttribute("person",person);
			//request.getRequestDispatcher("/inbox.jsp").forward(request, response);
//TO SUGGESTIONS
			response.sendRedirect("Suggestions.jsp");
		}
		else{
			out.println("Credentials Not Correct");
		}
	}

}
