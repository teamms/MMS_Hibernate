package mms.servlets;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import mms.models.Person;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.google.gson.Gson;

/**
 * Servlet implementation class ChatServlet
 */
@WebServlet("/ChatServlet")
public class ChatServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ChatServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		Map<String,Object> map=new HashMap<String,Object>();
		boolean isValid=false;
		String username=((Person) request.getSession().getAttribute("user")).getUserName();
		System.out.println("new name is"+username);
		String otherPerson=request.getParameter("otherPerson");
		System.out.println("username is "+username);
		System.out.println("otherPerson is "+otherPerson);	
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
		
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		Query query = session.createQuery("from Message where (userName2 = :username and userName1 = :otherPerson) or (userName1 = :username and userName2 = :otherPerson)");
		query.setParameter("username", username);
		query.setParameter("otherPerson", otherPerson);
		List list = (List) query.list();
		if(username!=null&&username.trim().length()!=0){
			isValid=true;
			map.put("messages", list);
		}
		map.put("isValid", isValid);
		session.getTransaction().commit();
		session.close();
		write(response, map);
		
	}
	
	private void write(HttpServletResponse response,Map<String,Object> map) throws IOException{
		response.setContentType("application/json");
		response.setCharacterEncoding("UTF-8");
		Gson x=new Gson();
		
		response.getWriter().write(x.toJson(map));
		
		
	}

}
