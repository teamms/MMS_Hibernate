package mms.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import mms.models.MMSPoint;
import mms.models.Person;
import mms.processing.PersonManager;
import mms.processing.PointManager;

/**
 * Servlet implementation class pointtest
 */
@WebServlet("/PointTest")
public class PointTest extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PointTest() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String user1=request.getParameter("user1");
		String user2=request.getParameter("user2");
		SessionFactory sessionFactory=new Configuration().configure().buildSessionFactory();
		PersonManager pm=new PersonManager(sessionFactory);
		Person p1=pm.GetPersonFromDatabase(user1);
		Person p2=pm.GetPersonFromDatabase(user1);
		PointManager pointM=new PointManager();
		PrintWriter out=response.getWriter();
		MMSPoint mmsPoint=pointM.getPoint(p1, p2);
		out.println(mmsPoint.getPoint());
		Session session=sessionFactory.openSession();
		session.beginTransaction();
	
		session.save(mmsPoint);
		session.getTransaction().commit();
		session.close();
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
