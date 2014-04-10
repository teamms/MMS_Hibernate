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
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String userName=request.getParameter("userName");
		String password=request.getParameter("password");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		LoginManager loginmanager=new LoginManager(sessionFactory);
		Person person=loginmanager.checkLogin(userName,password);
		PrintWriter out=response.getWriter();
		if(person!=null){
			request.getSession().setAttribute("user", person);
			out.println("HAHA "+person.getName());
		}
		else
		{
			out.println("Sorry");
		}
	}

}
