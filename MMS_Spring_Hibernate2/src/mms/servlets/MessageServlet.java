package mms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mms.models.Person;
import mms.processing.LoginManager;
import mms.processing.MessageManager;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Servlet implementation class MessageServlet
 */
@WebServlet("/MessageServlet")
public class MessageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userName1=request.getParameter("userName1");
		String userName2=request.getParameter("userName2");
		String toInboxMessage=request.getParameter("toInboxMessage");
		System.out.println("message is "+toInboxMessage);
		//SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		SessionFactory sessionFactory = null;
		HttpSession sessionStore=request.getSession(true);
		
		if(sessionStore.getAttribute("sessionFactory")!=null){
			System.out.println("Taking from session by older servlet :D");
			//sessionFactory=(SessionFactory)request.getSession().getAttribute("sessionFactory");
			sessionFactory=(SessionFactory) sessionStore.getAttribute("sessionFactory");
		}else {
			System.out.println("First time so creating factory :/");
			sessionFactory=new Configuration().configure().buildSessionFactory();
			sessionStore.setAttribute("sessionFactory",sessionFactory);
			
		}
				
		//sessionFactory=new Configuration().configure().buildSessionFactory();
		MessageManager messageManager=new MessageManager(sessionFactory);
		//Person person=loginmanager.checkLogin(userName,password);
		String message=messageManager.sendMessage(userName1, userName2, toInboxMessage);
		
		PrintWriter out=response.getWriter();
		if(message!=null){
			//request.getSession().setAttribute("user", person);
			//out.println("Message sent from : <u>"+userName1+"<u> to "+userName2);
			//out.println("Content: "+toInboxMessage);
			//response.sendRedirect("profileServlet");
		}
		else
		{
			//out.println("The specified username(s) doesn't exist");
		}
		
	}

	

}
